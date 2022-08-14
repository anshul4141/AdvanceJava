package com.rays.ctrl;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.rays.bean.UserBean;
import com.rays.model.UserModel;

public class RegistrationCtrl extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		response.setContentType("text/html");

		String fname = request.getParameter("fname");
		String lname = request.getParameter("lname");
		String userid = request.getParameter("userid");
		String pwd = request.getParameter("pwd");
		String gender = request.getParameter("gender");
		String number = request.getParameter("number");
		String dob = request.getParameter("dob");

		String fnamereg = "^[a-zA-Z]+(([',. -][a-zA-Z ])?[a-zA-Z]*)*$";
		String lnamereg = "^[a-zA-Z]+(([',. -][a-zA-Z ])?[a-zA-Z]*)*$";
		String emailreg = "^[_A-Za-z0-9-]+(\\.[_A-Za-z0-9-]+)*@[A-Za-z0-9]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";
		String pwdreg = "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&-+=()])(?=\\S+$).{8,20}$";
		String numberreg = "^(\\+\\d{1,3}[- ]?)?\\d{10}$";

		UserBean bean = new UserBean();

		UserModel model = new UserModel();

		bean.setFname(fname);
		bean.setLname(lname);
		bean.setUserid(userid);
		bean.setPwd(pwd);
		bean.setGender(gender);
		bean.setNumber(number);
		bean.setDob(dob);

		if (fname.matches(fnamereg) && lname.matches(lnamereg) && userid.matches(emailreg)
				&& number.matches(numberreg)) {
			try {
				model.add(bean);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

			RequestDispatcher rd = request.getRequestDispatcher("UserLogin.jsp");

			rd.forward(request, response);

		} else if (fname.equals("") && lname.equals("") && userid.equals("") && pwd.equals("") && number.equals("")
				&& dob.equals("")) {
			RequestDispatcher rd = request.getRequestDispatcher("UserRegistration.jsp");

			request.setAttribute("fname", "Please enter your First Name");
			request.setAttribute("lname", "Please enter your Lname Name");
			request.setAttribute("userid", "Please enter your emailid Name");
			request.setAttribute("pwd", "Please enter your Password");
			request.setAttribute("number", "Please enter your MobileNo.");
			request.setAttribute("dob", "Dob is required");

			rd.forward(request, response);
		} else if (fname.equals("")) {
			RequestDispatcher rd = request.getRequestDispatcher("UserRegistration.jsp");

			request.setAttribute("fname", "Please enter your First Name");

			rd.forward(request, response);
		} else if (lname.equals("")) {
			RequestDispatcher rd = request.getRequestDispatcher("UserRegistration.jsp");

			request.setAttribute("lname", "Please enter your Last Name");

			rd.forward(request, response);
		} else if (userid.equals("")) {
			RequestDispatcher rd = request.getRequestDispatcher("UserRegistration.jsp");

			request.setAttribute("userid", "Please enter your emailId");

			rd.forward(request, response);
		} else if (pwd.equals("")) {
			RequestDispatcher rd = request.getRequestDispatcher("UserRegistration.jsp");

			request.setAttribute("pwd", "Please enter your Password");

			rd.forward(request, response);
		} else if (number.equals("")) {
			RequestDispatcher rd = request.getRequestDispatcher("UserRegistration.jsp");

			request.setAttribute("number", "Please enter your number");

			rd.forward(request, response);

		}

	}

}
