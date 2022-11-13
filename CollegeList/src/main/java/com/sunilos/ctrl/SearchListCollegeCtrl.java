package com.sunilos.ctrl;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.sunilos.bean.CollegeBean;
import com.sunilos.model.CollegeModel;

@WebServlet (urlPatterns = {"/SearchListCollegeCtrl"})
public class SearchListCollegeCtrl extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		
		response.sendRedirect("searchTest.jsp");
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		
		CollegeModel model = new CollegeModel();
		
		try {
			List<CollegeBean> list = model.search();
			
			RequestDispatcher rd = request.getRequestDispatcher("SearchCollege.jsp");
			
			request.setAttribute("list", list);
			
			rd.forward(request, response);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
