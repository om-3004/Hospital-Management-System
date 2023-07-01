package com.user.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.dao.UserDAO;
import com.db.DBConnect;
import com.entity.User;

@WebServlet("/user_register")
public class UserRegister extends HttpServlet{

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
//		for session handling
		try {
			
			String fullName = req.getParameter("fullname");
			String email = req.getParameter("email");
			String password = req.getParameter("password");
			
			User u = new User(fullName, email, password);
			
			UserDAO dao = new UserDAO(DBConnect.getConn());
			
			HttpSession session = req.getSession();
			
			boolean f = dao.register(u);
			
			if(f) {
				
				session.setAttribute("successMsg", "Registered successfully");
				resp.sendRedirect("signup.jsp");
				
//				System.out.println("Register successful");
			}
			else {
				
				session.setAttribute("errorMsg", "Something wrong on server");
				resp.sendRedirect("signup.jsp");
				
//				System.out.println("Something wrong on server");
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
	
	
}
