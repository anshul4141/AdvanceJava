package com.rays.ctrl;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.rays.bean.MarksheetBean;
import com.rays.model.MarksheetModel;

@WebServlet(urlPatterns = "/Marksheetctl")
public class MarksheetCtrl extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) {

		MarksheetBean bean = new MarksheetBean();

		MarksheetModel model = new MarksheetModel();

		List<MarksheetBean> list = new ArrayList<>();

		try {
			list = model.search();

			RequestDispatcher rd = request.getRequestDispatcher("GetMeritList.jsp");

			request.setAttribute("search", list);

			rd.forward(request, response);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) {

		MarksheetBean bean = new MarksheetBean();

		MarksheetModel model = new MarksheetModel();

		List<MarksheetBean> list = new ArrayList<>();

		try {
			list = model.search();

			RequestDispatcher rd = request.getRequestDispatcher("GetMeritList.jsp");

			request.setAttribute("search", list);

			rd.forward(request, response);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
