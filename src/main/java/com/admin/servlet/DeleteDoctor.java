package com.admin.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.dao.DoctorDAO;
import com.db.DBConnect;

@WebServlet("/deleteDoctor")
public class DeleteDoctor extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		int id = Integer.parseInt(req.getParameter("id"));
		
		DoctorDAO dao = new DoctorDAO(DBConnect.getConn());
		
		HttpSession session = req.getSession();
		
		if(dao.deleteDoctor(id)) {
			session.setAttribute("successMsg", "Doctor Details Deleted Successfully");
			resp.sendRedirect("admin/view_doctor.jsp");
		} else {
			session.setAttribute("errorMsg", "Something is wrong in server");
			resp.sendRedirect("admin/view_doctor.jsp");
		}
		
	}
	
}
