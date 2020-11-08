package com.strutsP02ActionAndActionSupport.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.strutsP02ActionAndActionSupport.comman.Database;
import com.strutsP02ActionAndActionSupport.model.User;

public class UserDao {
	
	public static boolean checkUser(long mobileno, String email) {
		boolean result = false;
		Connection conn = Database.getDBConnection();
		try {
			PreparedStatement ps = conn.prepareStatement("SELECT mobileno, email FROM users WHERE email = ? OR mobileno = ?");
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
			PreparedStatement ps = conn.prepareStatement("INSERT INTO users(username, mobileno, email, age, gender) VALUES(?,?,?,?,?)");
			ps.setString(1, user.getUsername());
			ps.setLong(2,  user.getMobileno());
			ps.setString(3, user.getEmailid());
			ps.setInt(4, user.getAge());
			ps.setString(5, user.getGender());
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
