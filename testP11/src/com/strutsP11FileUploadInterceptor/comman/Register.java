package com.strutsP11FileUploadInterceptor.comman;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;

import org.apache.tomcat.util.codec.binary.Base64;

import com.strutsP11FileUploadInterceptor.dao.UserDao;
import com.strutsP11FileUploadInterceptor.model.User;

/**
 * Servlet implementation class Register
 */
@WebServlet("/register")
@MultipartConfig
public class Register extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Register() {
        super();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//doGet(request, response);
		System.out.println("Register");
		response.setContentType("text/html");
		String username = request.getParameter("username");
		long mobileno = Long.parseLong( request.getParameter("mobileno").trim() );
		String emailid = request.getParameter("emailid");
		int age = Integer.parseInt( request.getParameter("age").trim() );
		String gender = request.getParameter("gender");
		Part userimage = request.getPart("userimage") ;
		String userimageFileName=userimage.getSubmittedFileName(),userimageContentType=userimage.getContentType();
		String filePath = "", id = "";
		String imageByte = "";
		
		System.out.print(" "+toString());
		if( UserDao.checkUser(mobileno, emailid) ) {
			System.out.println("input");
			response.sendRedirect("register.jsp");
		}
		else{
			User user = new User(username, emailid, gender, age, mobileno, userimage, userimageFileName, userimageContentType);
			List<Object> listObject =  UserDao.addUser(user,request);
			if( ( (Integer) listObject.get(0) ) > 0 ) {
				id = listObject.get(1).toString();
				filePath = listObject.get(2).toString(); 
				imageByte =  Base64.encodeBase64String( (byte[]) listObject.get(3) ); 
				System.out.print("success");
				request.setAttribute("username",username); 
				request.setAttribute("mobileno",mobileno) ;
				request.setAttribute("emailid",emailid);
				request.setAttribute("age",age);
				request.setAttribute("gender",gender);
				request.setAttribute("userimageFileName",userimageFileName);
				request.setAttribute("userimageContentType",userimageContentType);
				request.setAttribute("filePath",filePath);
				request.setAttribute("userimageFileName",userimageFileName); 
				request.setAttribute("id",id);
				request.setAttribute("imageByte",imageByte);  
				RequestDispatcher rd = request.getRequestDispatcher("success.jsp");
				rd.forward(request, response);
			}
			else {
				System.out.println("error");
				response.sendRedirect("error.jsp");
			}
			
		}
		
		
	}

}
