<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
       <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Contribuyentes</title>
</head>
<body>
<h1>Pagina Inicial</h1>

 <form action="${pageContext.request.contextPath}/ver" method="POST">
	 <select name="idUsuario" id="idUsuario">
 	   	   <c:forEach items="${c}" var="c">
 	   	   		<option value="${c.cCliente }" >${c.sNombre }</option> 
 	   	   </c:forEach>                
               
</select><BR>

	<input type="submit" value="Ver Compras de Cliente" />
	
	</form>
	<br>
	
	<form action="${pageContext.request.contextPath}/compra" method="POST">
		<input type="submit" value="Crear Compra" />
	
	</form>
	
  


</body>
</html>