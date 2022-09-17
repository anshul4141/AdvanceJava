package com.rays.ctrl;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.rays.bean.StudentBean;
import com.rays.model.StudentModel;

public class StudentCtrl extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		response.sendRedirect("Student.jsp");

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		response.setContentType("text/html");

		StudentBean bean = new StudentBean();
		StudentModel model = new StudentModel();

		bean.setRollNo(request.getParameter("rollNo"));
		bean.setFname(request.getParameter("fname"));
		bean.setLname(request.getParameter("lname"));
		bean.setSession(request.getParameter("session"));

		String op = request.getParameter("operation");

		if (op.equals("add")) {

			try {
				model.add(bean);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();

				
			}

		} else if (op.equals("modify")) {

			try {
				model.update(bean);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();

				
			}

		} else if (op.equals("delete")) {

			try {
				model.delete(bean);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();

				
			}

		}

	}

}
