package com.strutsP11FileUploadInterceptor.comman;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class UserImage
 */
@WebServlet(value = "/userimage") 
public class UserImage extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UserImage() {
        super();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		doPost(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		//doGet(request, response);
		response.setContentType("text/html");
		String id = request.getParameter("id");
		//String imageName ="";
		//String imageType ="";
		byte[] userimage = null  ;
		System.out.println(" UserImage\n id :"+id);
		try {
			Connection conn = Database.getDBConnection();
			PreparedStatement ps = conn.prepareStatement("SELECT userimage, imageName, imageType FROM user_img WHERE id = ?");
			ps.setString(1, id);
			ResultSet rs = ps.executeQuery();
			if (rs.next()) {
				userimage = rs.getBytes("userimage");
				//imageName = rs.getString("imageName");
				//imageType = rs.getString("imageType");
			}
			else {  System.out.println("Image not Found");  }
			
			if( userimage.length != 0 ) {
			response.setContentType("image/*");
			//response.setHeader("Content-Disposition", "attachment; filename =  \" "+imageName+" \"  ");
			response.setHeader("Pragma", "no-store, no-cache, revalidate");
			response.setHeader("Cache-Control", "public");
			response.setDateHeader("Expire", 0);
			//response.setContentLength(userimage.length);
			response.getOutputStream().write(userimage);
			response.getOutputStream().flush();
			}
			
			rs.close();
			ps.close();
			conn.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
