package com.rays.ctrl;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.rays.bean.StudentBean;
import com.rays.model.StudentModel;

public class GetStudentCtrl extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		//String s = request.getParameter("operation");

		StudentBean bean = new StudentBean();

		StudentModel model = new StudentModel();

		bean.setRollNo(request.getParameter("rollNo"));

		List<StudentBean> list = new ArrayList<StudentBean>();

		try {
			list = model.get(bean);

			RequestDispatcher rd = request.getRequestDispatcher("GetStudent.jsp");

			request.setAttribute("ok", list);

			rd.forward(request, response);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		//String s = request.getParameter("operation");

		StudentBean bean = new StudentBean();

		StudentModel model = new StudentModel();

		bean.setRollNo(request.getParameter("rollNo"));

		List<StudentBean> list = new ArrayList<StudentBean>();

		try {
			list = model.get(bean);

			RequestDispatcher rd = request.getRequestDispatcher("GetStudent.jsp");

			request.setAttribute("ok", list);

			rd.forward(request, response);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
