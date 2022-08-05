<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"  %>
<%@ taglib prefix="security" uri="http://www.springframework.org/security/tags"  %>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"  %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1 style="text-align:center">Error de ingreso. No tienes perfil para esta pagina.</h1>
</br>
</br>
<form:form action="${pageContext.request.contextPath }/logout" method="POST">
				
<input type="submit" value="Logout"/>
</form:form>
</body>
</html>