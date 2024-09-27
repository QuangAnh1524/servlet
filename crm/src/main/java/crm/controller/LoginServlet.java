package crm.controller;

import java.io.IOException;

import crm.service.LoginService;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet(name = "loginServlet", urlPatterns = {"/login"})
public class LoginServlet extends HttpServlet {
	
	private LoginService loginService= new LoginService();
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.getRequestDispatcher("/login.html").forward(req, resp);
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		String fullname = req.getParameter("fullname");
		String password = req.getParameter("password");
		
		boolean isLogin = loginService.checkLogin(fullname, password);
		System.out.println(isLogin);
		req.getRequestDispatcher("/login.html").forward(req, resp);
}
}
