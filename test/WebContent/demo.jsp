<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
  <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>  
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
   <%--   <c:forEach items="${requestScope.cities }" var="city">
      ${city }<br>
      </c:forEach>
      
      <% 
      int i;
      for(i=0;i<100;i++)
      {
    	 System.out.println(i); 
      }
      %>
      <%=i %> --%>
      ${requestScope.msg}
      
</body>
</html>