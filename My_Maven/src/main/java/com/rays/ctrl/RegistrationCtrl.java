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

		if (fname.equals("") && lname.equals("") && userid.equals("") && pwd.equals("") && number.equals("")
				&& dob.equals("")) {

			RequestDispatcher rd = request.getRequestDispatcher("UserRegistration.jsp");

			request.setAttribute("fname", "Enter your First Name");
			request.setAttribute("lname", "Enter your Last Name ");
			request.setAttribute("userid", "Enter EmailId");
			request.setAttribute("pwd", "Enter Password");
			request.setAttribute("gender", "Select your Gender");
			request.setAttribute("number", "Enter your Mobile Number ");
			request.setAttribute("dob", "Enter your dob");

			rd.forward(request, response);

		} else if (fname.equals("")) {

			RequestDispatcher rd = request.getRequestDispatcher("UserRegistration.jsp");

			request.setAttribute("fname", "Please enter your First Name");

			rd.forward(request, response);
		} else if (!fname.matches(fnamereg)) {

			RequestDispatcher rd = request.getRequestDispatcher("UserRegistration.jsp");

			request.setAttribute("fname", "Please enter name in correct format");

			rd.forward(request, response);
		} else if (lname.equals("")) {

			RequestDispatcher rd = request.getRequestDispatcher("UserRegistration.jsp");

			request.setAttribute("lname", "Please enter your Last Name");

			rd.forward(request, response);
		} else if (!lname.matches(lnamereg)) {

			RequestDispatcher rd = request.getRequestDispatcher("UserRegistration.jsp");

			request.setAttribute("lname", "Please enter your last name in correct format");

			rd.forward(request, response);
		} else if (userid.equals("")) {

			RequestDispatcher rd = request.getRequestDispatcher("UserRegistration.jsp");

			request.setAttribute("userid", "Please Enter Your EmailId");

			rd.forward(request, response);
		} else if (!userid.matches(emailreg)) {

			RequestDispatcher rd = request.getRequestDispatcher("UserRegistration.jsp");

			request.setAttribute("userid", "Please enter your Email in correct format");

			rd.forward(request, response);
		} else if (pwd.equals("")) {

			RequestDispatcher rd = request.getRequestDispatcher("UserRegistration.jsp");

			request.setAttribute("pwd", "Please enter your Password");

			rd.forward(request, response);
		} else if (!pwd.matches(pwdreg)) {

			RequestDispatcher rd = request.getRequestDispatcher("UserRegistration.jsp");

			request.setAttribute("pwd", "Please enter your Password in correct format");

			rd.forward(request, response);

		} else if (number.equals("")) {

			RequestDispatcher rd = request.getRequestDispatcher("UserRegistration.jsp");

			request.setAttribute("number", "Please enter your Mobile Number");

			rd.forward(request, response);
		} else if (!number.matches(numberreg)) {

			RequestDispatcher rd = request.getRequestDispatcher("UserRegistration.jsp");

			request.setAttribute("number", "Please enter your Mobile Number in correct format");

			rd.forward(request, response);
		} else if (dob.equals("")) {

			RequestDispatcher rd = request.getRequestDispatcher("UserRegistration.jsp");

			request.setAttribute("dob", "Enter Your dob");

			rd.forward(request, response);

		} else {

			try {
				model.add(bean);

			} catch (Exception e1) {

				e1.printStackTrace();
			}
			RequestDispatcher rd = request.getRequestDispatcher("UserLogin.jsp");

			request.setAttribute("sMsg", "Registered Successfully! Please login");

			rd.forward(request, response);
		}
	}

}
