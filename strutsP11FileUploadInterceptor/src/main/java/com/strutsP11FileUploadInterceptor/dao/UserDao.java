package com.strutsP11FileUploadInterceptor.dao;

import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.io.FileUtils;

import com.strutsP11FileUploadInterceptor.comman.CustomPath;
import com.strutsP11FileUploadInterceptor.comman.Database;
import com.strutsP11FileUploadInterceptor.model.User;


public class UserDao {
	
	public static boolean checkUser(long mobileno, String email) {
		boolean result = false;
		Connection conn = Database.getDBConnection();
		try {
			PreparedStatement ps = conn.prepareStatement("SELECT mobileno, email FROM user_img WHERE email = ? OR mobileno = ?");
			ps.setString(1, email);
			ps.setLong(2, mobileno);
			ResultSet rs = ps.executeQuery();
			if(rs.next()) {
				result = true;
			}
			rs.close();
			ps.close();
			conn.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return result;
	}
	
	public static List<Object> addUser(User user) {
		List<Object> listObject = new ArrayList<Object>();
		int result = 0, id = 0 ;
		Connection conn = Database.getDBConnection();
		try {
			byte[] imageByte = FileUtils.readFileToByteArray(user.getUserimage());
			InputStream is = new ByteArrayInputStream(imageByte);
			String filePath = CustomPath.getPath("user_image");
			System.out.println(" "+filePath);
			String userimageFileName = user.getUserimageFileName();
			String userimageContentType =  user.getUserimageContentType();
			PreparedStatement ps = conn.prepareStatement("INSERT INTO user_img(username, mobileno, email, age, gender, userimage, imagePath, imageName, imageType ) VALUES(?,?,?,?,?,?,?,?,?)" 
					, Statement.RETURN_GENERATED_KEYS);
			ps.setString(1, user.getUsername());
			ps.setLong(2,  user.getMobileno());
			ps.setString(3, user.getEmailid());
			ps.setInt(4, user.getAge());
			ps.setString(5, user.getGender());
			ps.setBinaryStream(6, is);
			ps.setString(7, filePath);
			ps.setString(8, userimageFileName );
			ps.setString(9,  userimageContentType);
			int row = ps.executeUpdate();
			result = row;
			ResultSet rs = ps.getGeneratedKeys();
			if( rs.next() ) {
				id = rs.getInt(1);
			}
			File file = new File(filePath, userimageFileName);
			filePath=file.getCanonicalPath();
			System.out.println("\n"+filePath);
			FileOutputStream fs = new FileOutputStream(file);
			fs.write(imageByte);
			fs.flush();
			fs.close();
			listObject.add(result);
			listObject.add(id);
			listObject.add(filePath);
			listObject.add(imageByte);
			ps.close();
			conn.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return listObject;
	}
}
