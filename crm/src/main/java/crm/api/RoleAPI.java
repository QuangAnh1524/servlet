package crm.api;

import java.io.IOException;
import java.io.PrintWriter;

import com.google.gson.Gson;

import crm.common.Constant;
import crm.payload.ResponseData;
import crm.service.RoleService;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet(name="roleApi", urlPatterns = {Constant.URL_ROLE_DELETE, Constant.URL_ROLE_ADD}) 
public class RoleAPI extends HttpServlet {

		private RoleService roleService = new RoleService();
		private Gson gson = new Gson();
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

	    String urlPath = req.getServletPath();
	    switch(urlPath) {
	    case Constant.URL_ROLE_DELETE:
	    	deleteRole(req, resp);
	    	break;
	    case  Constant.URL_ROLE_ADD: 
	    	addRole(req, resp);
	    	break; 
	    } 
} 
	private void deleteRole(HttpServletRequest req, HttpServletResponse resp) throws IOException  {
    	int id = Integer.parseInt(req.getParameter("id"));
   
		boolean isSuccess = roleService.deleteByRoleId(id);
		
		ResponseData data = new ResponseData();
		data.setSuccess(isSuccess); 
		data.setDescription("");
		data.setData("");
		
		String json = gson.toJson(data); 
		
		PrintWriter printWriter = resp.getWriter();
		resp.setContentType("application/json");
		printWriter.print(json); 
		printWriter.flush();
    } 
	
	private void addRole(HttpServletRequest req, HttpServletResponse resp) throws IOException {
		int id = Integer.parseInt(req.getParameter("id"));
		String name = req.getParameter("name"); 
		String desc = req.getParameter("description");
		   
		boolean isSuccess = roleService.inseartRole(id, name, desc);
		
		ResponseData data = new ResponseData();
		data.setSuccess(isSuccess); 
		data.setDescription("");
		data.setData("");
		
		String json = gson.toJson(data); 
		
		PrintWriter printWriter = resp.getWriter();
		resp.setContentType("application/json");
		printWriter.print(json);
		printWriter.flush();
	}
	
}