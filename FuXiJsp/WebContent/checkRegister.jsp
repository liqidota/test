<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="com.liqi.bdqn.eneity.MyUser" %>
<%@ page import="com.liqi.bdqn.service.*" %>
<%@ page import="com.liqi.bdqn.service.impl.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>登陆页面</title>

</head>
<body>
			<%
			request.setCharacterEncoding("utf-8");
			String myname=	request.getParameter("myname");
			String mypwd=request.getParameter("mypwd");
			MyUser user =new MyUser(myname,mypwd);
			UserService usersevice =new UserServiceImpl();
			int jieguo=usersevice.insertUser(user);			
			if(jieguo>0){	
				request.getRequestDispatcher("login.jsp").forward(request, response);
			}
			%>			
			<script src="js/jquery-1.12.4.js"></script>
			<script src="js/checkre.js"></script>
			
</body>
</html>