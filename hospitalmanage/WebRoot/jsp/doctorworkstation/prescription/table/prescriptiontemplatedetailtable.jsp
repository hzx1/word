<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib  prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>

<c:forEach var="item" items="${details}">
	<tr>
		<td>${item.drugcode}</td>
		<td>${item.drugName}</td>
		<td>${item.eachDosage}</td>
		<td>${item.medicineformName}</td>
		<td>${item.medicinefrequencyName}</td>
		<td>${item.dosageQuantity}</td>
		<td>${item.medicineAmount}</td>
		<td>${item.note}</td>
	
	</tr>
</c:forEach>
