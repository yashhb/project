<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page isELIgnored="false" %>
<%@ include file="header.jsp" %>
<html>
<head>

<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<div class="container-wrapper">
<div class="container">
<c:url value="/admin/product/addProduct" var="url"></c:url>
<form:form action="${url}"  commandName="product">

<div class="form-group">
<label for="pId"></label>
<form:hidden  path=""/>
</div>

<div class="form-group">
<label for="pName">Product Name</label>
<form:input path="pName" class="form-control"/>
</div>

<div class="form-group">
<label for="pDescription">Description</label>
<form:input path="pDescription" class="form-control"/>
</div>

<div class="form-group">
<label for="pPrice">Price</label>
<form:input path="pPrice" class="form-control" />
</div>

<div class="form-group">
<label for="pQuantity">Quantity</label>
<form:input path="pQuantity" class="form-control"/>
</div>

<div class="form-group">
<label for="pMfg">Mfg Date</label>
<form:input  path="pMfg" class="form-control"/>
</div>

<input type="submit" value="Add Product" class="btn btn-default">
</form:form>

</div>


</div>
</body>
</html>