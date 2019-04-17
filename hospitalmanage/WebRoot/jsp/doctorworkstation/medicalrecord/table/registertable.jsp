<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib  prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>

<c:forEach var="item" items="${registers}">
	<tr class="rowTr" ondblclick="selectregister('${item.id}','${item.registerCode}','${item.patientName}','${item.sex}',
					'${item.age}','${item.typeName}','${item.insureTypeName}','${item.drugallergyhistory}','${item.note}')">
		<td>${item.registerCode}</td>
		<td>${item.cardCode}</td>
		<td>${item.patientName}</td>
		<td>${item.sex == 1 ? "男" : "女"}</td>
		<td>${item.age}</td>
		<td>${item.insureTypeName}</td>
		<td><fmt:formatDate pattern="yyyy-MM-dd HH:mm:ss" value="${item.registerTime}"/></td>
		<td>${item.tel}</td>
	</tr>
</c:forEach>

<script type="text/javascript">
	$(function(){
		$(".rowTr").click(function(){
			$(".rowTr").removeClass("xz");
			$(".rowTr").css("color","#000");
			$(this).addClass("xz");
			$(this).css("color","#fff");
		});
	});
</script>
