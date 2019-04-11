<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib  prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>

<c:forEach var="item" items="${patients}">
	<tr class="rowTr" ondblclick="selectpatient('${item.cardCode}','${item.patientName}','${item.id}',
					'${item.sex}','${item.age}','${item.maritalstatusId}','${item.job}','${item.viptypeId}',
					'${item.medicareCode}','${item.insuretypeId}','${item.patienttypeId}','${item.tel}','${item.address}',
					'${item.drugallergyHistory}','${item.vipTypeName}')" >
		<td>${item.cardCode}</td>
		<td>${item.patientName}</td>
		<td>${item.sex == 1 ? "男" : "女"}</td>
		<td>${item.age}</td>
		<td>${item.insureTypeName}</td>
		<td>${item.patientTypeName}</td>
		<td>${item.tel}</td>
		<td>${item.drugallergyHistory}</td>
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
