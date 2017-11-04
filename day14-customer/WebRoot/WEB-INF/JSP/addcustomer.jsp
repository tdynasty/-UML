<%@ page language="java" import="java.util.*" pageEncoding="GB18030"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'addcustomer.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">

  </head>
  <script type="text/javascript" src="${pageContext.request.contextPath }/js/customer.js"></script>
   <body style="text-align: center;" onload="pageInit()">
    
    <form action="${pageContext.request.contextPath }/AddCustomerServlet" method="post" onsubmit="return dosubmit()" id="customer">
    <table width="55%" border="1">
    	<tr>
    		<td>�ͻ�����</td>
    		<td>
    			<input type="text" name="name">
    		</td>
    	</tr>
    	
    	<tr>
    		<td>�Ա�</td>
    		<td>
    			<input type="radio" name="gender" value="��">��
    			<input type="radio" name="gender" value="Ů">Ů
    		</td>
    	</tr>
    	
    	<tr>
    		<td>����</td>
    		<td>
    			<select id="year">
    				<option value="1900">1900</option>
    			</select>��
    			
    			<select id="month">
    				<option value="01">01</option>
    			</select>��
    			
    			<select id="day">
    				<option value="01">01</option>
    			</select>��
    		</td>
    	</tr>

    	<tr>
    		<td>�ֻ�</td>
    		<td>
    			<input type="text" name="cellphone">
    		</td>
    	</tr>
    	
    	<tr>
    		<td>����</td>
    		<td>
    			<input type="text" name="email">
    		</td>
    	</tr>
    
    	<tr>
    		<td>����</td>
    		<td>
    			<c:forEach var="pre" items="${preferences}">
    				<input type="checkbox" name="pre" value="${pre}">${pre}
    			</c:forEach>
    		</td>
    	</tr>
    	
    	<tr>
    		<td>�ͻ�����</td>
    		<td>
    			<c:forEach var="type" items="${types}">
    				<input type="radio" name="type" value="${type }">${type }
    			</c:forEach>
    		</td>
    	</tr>
    	
    	<tr>
    		<td>�ͻ���ע</td>
    		<td>
    			<textarea rows="5" cols="50" name="description"></textarea>
    		</td>
    	</tr>
    	
    	<tr>
    		<td>
    			<input type="reset" value="���">
    		</td>
    		<td>
    			<input type="submit" value="��ӿͻ�">
    		</td>
    	</tr>
    
    </table>
    </form>
    
  </body>
</html>
