<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
      <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>  
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<form action="demoServlet" method="post">
		请输入姓名：<input type="Text" name="name"> ${requestScope.msg}<br>
		请输入密码：<input 	type="Password" name="pw" maxlength="9"><br>
		<input type="Submit" value="确定 ">
	</form>

</body>
</html>