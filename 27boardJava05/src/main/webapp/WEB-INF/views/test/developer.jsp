<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:set var="root" value="${pageContext.request.contextPath }/" />
<!DOCTYPE html>
<html>
<head>
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<meta charset="UTF-8">
<title>developer</title>
</head>
<body>
  <h1>developer.jsp</h1>
  <h2>개발자 정보 목록</h2>
  <p>${devList}</p>
  <hr>
  
  <ul class="navbar-nav">
    <c:forEach var="developer" items="${devList }">
      <li class="nav-item">
        ${developer.empno } - ${developer.ename } - ${developer.height } - ${developer.weight }
      </li>
    </c:forEach>
  </ul>
  
</body>
</html>