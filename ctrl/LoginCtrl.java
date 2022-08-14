package com.rays.ctrl;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.rays.bean.UserBean;
import com.rays.model.UserModel;

public class LoginCtrl extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String userid = request.getParameter("userid");
		String pwd = request.getParameter("pwd");
		String emailreg = "^[_A-Za-z0-9-]+(\\.[_A-Za-z0-9-]+)*@[A-Za-z0-9]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";

//		if (userid.matches(emailreg) && pwd.equals("anshul")) {
//
//			RequestDispatcher rd = request.getRequestDispatcher("WelcomePage.jsp");
//
//			rd.forward(request, response);
//
//		} else if (userid.equals("") && pwd.equals("")) {
//
//			RequestDispatcher rd = request.getRequestDispatcher("UserLogin.jsp");
//
//			request.setAttribute("userid", "Entern Your Email id");
//
//			request.setAttribute("Pwd", "Enter Your password ");
//
//			rd.forward(request, response);
//
//		} else if (userid.equals("")) {
//
//			RequestDispatcher rd = request.getRequestDispatcher("UserLogin.jsp");
//
//			request.setAttribute("userid", "Enter Your Email Id");
//
//			rd.forward(request, response);
//		} else if (pwd.equals("")) {
//
//			RequestDispatcher rd = request.getRequestDispatcher("UserLogin.jsp");
//
//			request.setAttribute("pwd", "Enter Your Password");
//
//			rd.forward(request, response);
//
//		} else {
//			RequestDispatcher rd = request.getRequestDispatcher("UserLogin.jsp");
//
//			request.setAttribute("error", "Email or Password is invalid");
//
//			rd.forward(request, response);
//		}

//
//			RequestDispatcher rd = request.getRequestDispatcher("WelcomePage.jsp");
//
//			rd.forward(request, response);

	boolean pass=true;
		
		
		if (userid.equals("")) {
			request.setAttribute("userid", "Enter Your Email id");
			pass=false;
		}else if(!userid.matches(emailreg)) {
			request.setAttribute("userid", "Enter correct EmailId");
			pass=false;
		}
		if(pwd.equals("")){
			request.setAttribute("pwd", "Enter Your password ");
			pass=false;
		}
			
		
		
		
		 if (pass) {
				
				UserModel model=new UserModel();
				UserBean bean=new UserBean();
				try {
					bean=model.Authenticate(userid, pwd);
					
			
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				if(bean.getFname()!=null) {
					response.sendRedirect("WelcomePage.jsp");
				}
				else {
					request.setAttribute("msg", "Data is incorrect");
					RequestDispatcher rd = request.getRequestDispatcher("UserLogin.jsp");
					 
					 
		 			rd.forward(request, response);
				}
				
			}
		 else {
			 
			 RequestDispatcher rd = request.getRequestDispatcher("UserLogin.jsp");
			 
			 
			 			rd.forward(request, response);
		 }

		}
	}
