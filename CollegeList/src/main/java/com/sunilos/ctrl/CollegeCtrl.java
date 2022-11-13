package com.sunilos.ctrl;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.sunilos.bean.CollegeBean;
import com.sunilos.model.CollegeModel;

@WebServlet (urlPatterns ={"/CollegeCtrl"})
public class CollegeCtrl extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		
		response.sendRedirect("College.jsp");

	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		
		
		response.setContentType("text/html");
		
		CollegeBean bean = new CollegeBean();
		CollegeModel model = new CollegeModel();
		
		bean.setCollegeName(request.getParameter("collegeName"));
		bean.setCollegeMob(request.getParameter("collegeMob"));
		bean.setCollegeAddress(request.getParameter("collegeAddress"));
		
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
			} catch (Throwable e) {
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
