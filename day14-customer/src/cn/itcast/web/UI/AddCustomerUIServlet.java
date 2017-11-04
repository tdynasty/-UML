package cn.itcast.web.UI;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import cn.itcast.utils.Globals;

public class AddCustomerUIServlet extends HttpServlet {
	
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		this.doPost(request, response);
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		response.setContentType("text/html;gb18030");
		request.setCharacterEncoding("gb18030");
		request.setAttribute("preferences",Globals.preferences );
		request.setAttribute("types",Globals.types);
		request.getRequestDispatcher("/WEB-INF/JSP/addcustomer.jsp").forward(request, response);
		
	}

}
