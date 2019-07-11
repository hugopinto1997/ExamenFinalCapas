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
<h1>Crear Compra</h1>

<form action="${pageContext.request.contextPath}/compra2" method="POST">
<label>Seleccione usuario:   </label>
	 <select name="idUsuario" id="idUsuario">
 	   	   <c:forEach items="${c}" var="c">
 	   	   		<option value="${c.cCliente }" >${c.sNombre }</option> 
 	   	   </c:forEach>                
               
</select><br><br>

<label>Seleccione Producto:   </label>
	 <select name="idProducto" id="idProducto">
 	   	   <c:forEach items="${p}" var="p">
 	   	   		<option value="${p.cProducto }" >${p.nombre }</option> 
 	   	   </c:forEach>                
               
</select><br><br>
<label>Cantidad:   </label>
<input type="number" required id="cantidad" name="cantidad" placeholder="Cantidad"><br><br>

<button type="submit">Realizar Compra</button>

	
	</form>


</body>
</html>