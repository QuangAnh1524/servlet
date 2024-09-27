package crm.controller;

import java.io.IOException;

import crm.service.RoleService;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet(name="roleServlet", urlPatterns = "/role")
public class RoleServlet extends HttpServlet {
	private RoleService roleService = new RoleService();

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.setAttribute("role", roleService.getRole());
		req.getRequestDispatcher("role-ex.jsp").forward(req, resp);
	}
}
