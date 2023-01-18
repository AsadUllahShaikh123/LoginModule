package com.login;

import java.io.IOException;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
@WebServlet("/login")
public class Login extends HttpServlet {
	public void doGet(HttpServletRequest request , HttpServletResponse response) throws IOException {
		String username = request.getParameter("username");
		String password  = request.getParameter("password");
		System.out.println("Username : " + username);
		if(username.equalsIgnoreCase("Asadullah") && password.equalsIgnoreCase("Asadullah")){
			
			HttpSession session = request.getSession();
			session.setAttribute("username", username);
			response.sendRedirect("welcome.jsp");
		}
		else {
			response.sendRedirect("login.jsp");
		}
	}
}
