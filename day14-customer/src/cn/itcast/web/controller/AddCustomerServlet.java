package cn.itcast.web.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import cn.itcast.domain.Customer;
import cn.itcast.service.impl.BusinessService;
import cn.itcast.utils.WebUtils;

public class AddCustomerServlet extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		this.doPost(request, response);
	}
	
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		response.setContentType("text/html;charset=gb18030");
		request.setCharacterEncoding("gb18030");
		//调用工具类把数据放到数据库中
		try{
			Customer c=WebUtils.request2Bean(request, Customer.class);
			c.setId(WebUtils.makeId());
			BusinessService service=new BusinessService();
			service.addCustomer(c);
			request.setAttribute("message", "数据添加成功");
		}catch(Exception e){
			e.printStackTrace();
			request.setAttribute("message", "数据添加失败");
		}
		request.getRequestDispatcher("/message.jsp").forward(request, response);
		
	}

}
