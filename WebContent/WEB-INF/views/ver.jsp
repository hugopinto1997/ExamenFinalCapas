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
<h1>Lista de Compras</h1>
<h2>Cliente: ${c.sNombre } ${c.sApellido }</h2>
	<table>
       <tr>
           <th>Producto</th>
           <th>Cantidad</th>
           <th>Fecha de compra</th>
           <th>Total</th>
           
          
           
       </tr>
       
    
       <c:forEach items="${com}" var="s">
         <tr>
           <th>${s.cProducto.nombre}</th>
           <th>${s.nCantidad}</th>
           <th>${s.fci}</th>
           <th>${s.nTotal}</th>
           
       </tr>
       </c:forEach>
       
  </table>

</body>
</html>