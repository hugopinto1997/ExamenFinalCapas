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
<h1>Datos preliminares</h1>

  <form:form action="${pageContext.request.contextPath}/comprafinal" method="POST" modelAttribute="compra">
  
 <form:input type="hidden" name="fsf" value="${p.cProducto}"  path="cProducto" />
  <form:input type="hidden" name="fsfs" value="${c.cCliente}"  path="cCliente" />
  <form:input type="hidden" name="fsfs2" value="${cantidad * p.nPrecio}"  path="nTotal" />
  <form:input type="hidden" name="fsfs3" value="${cantidad}"  path="nCantidad" />
  
  
  
  <label>Nombre completo: ${c.sNombre } ${c.sApellido }</label><br>
  <label>Nombre de Producto: ${p.nombre }</label><br>
  <label>Precio de Producto: $${p.nPrecio }</label><br>
  <label>Cantidad: ${cantidad}</label><br>
  <label>Total a pagar: $${cantidad * p.nPrecio}</label><br>
  
  <button type="submit">Finalizar Compra</button>
  
  
  
  
  
  </form:form>

	
  


</body>
</html>