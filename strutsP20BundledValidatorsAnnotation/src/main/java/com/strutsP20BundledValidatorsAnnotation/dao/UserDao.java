package com.strutsP20BundledValidatorsAnnotation.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.util.Date;

import com.strutsP20BundledValidatorsAnnotation.comman.Database;
import com.strutsP20BundledValidatorsAnnotation.model.User;

public class UserDao {
	
	public static boolean checkUser(long mobileno, String email) {
		boolean result = false;
		Connection conn = Database.getDBConnection();
		try {
			PreparedStatement ps = conn.prepareStatement("SELECT MobileNo, Email FROM users_val WHERE Email = ? OR Mobileno = ?");
			ps.setString(1, email);
			ps.setLong(2, mobileno);
			ResultSet rs = ps.executeQuery();
			if(rs.next()) {
				result = true;
			}
			ps.close();
			conn.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return result;
	}
	
	public static boolean addUser(User user) {
		boolean result = false;
		Connection conn = Database.getDBConnection();
		try {
			PreparedStatement ps = conn.prepareStatement("INSERT INTO users_val(Username, MobileNo, Email, Age, Gender, Height, Dob, Url, Password) VALUES(?,?,?,?,?,?,?,?,?)");
			ps.setString(1, user.getUsername());
			ps.setLong(2,  user.getMobileno());
			ps.setString(3, user.getEmailid());
			ps.setInt(4, user.getAge());
			ps.setString(5, user.getGender());
			ps.setDouble(6,  user.getHeight());
			Date date = user.getDob();
			SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
			ps.setString(7, format.format(date));
			ps.setString(8, user.getUrl());
			ps.setString(9, user.getPassword());
			int row = ps.executeUpdate();
			if( row > 0 ) {
				result = true;
			}
			ps.close();
			conn.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return result;
	}
}
