package cn.itcast.web.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import cn.itcast.service.impl.BusinessService;

public class ListCustomerServlet extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		this.doPost(request, response);
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		response.setContentType("text/html");
		request.setCharacterEncoding("gb18030");
		try{
			BusinessService service=new BusinessService();
			List list=service.getAllCustomer();
			request.setAttribute("list", list);
			request.getRequestDispatcher("/WEB-INF/JSP/listcustomer.jsp").forward(request, response);
			
		}catch(Exception e){
			e.printStackTrace();
			request.setAttribute("message", "≤È—Ø ß∞‹");
			request.getRequestDispatcher("/message.jsp").forward(request, response);
		}
	}

}
