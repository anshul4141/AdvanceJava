package com.rays.ctrl;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class VisitorCount extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		response.setIntHeader("refresh", 1);

		ServletContext ctx = getServletContext();

		Integer count = (Integer) ctx.getAttribute("VisitorCount");

		if (count == null) {

			count = 1;

		} else {
			count++;
		}
		ctx.setAttribute("VisitorCount", count);

		PrintWriter out = response.getWriter();

		out.println(count);

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

	}

}
