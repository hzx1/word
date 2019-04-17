<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib  prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>

<c:forEach var="item" items="${templates}">
	<tr class="rowTr" ondblclick="selecttemplate('${item.templateName}','${item.doctorId}','${item.departmentName}',
					'${item.diseaseId}','${item.note}','${item.fitstatus}','${item.patientappeal}','${item.medicalhistory}',
					'${item.physicalstatus}','${item.primaryDiagnosis}','${item.opinion}')">
		<td>${item.templateCode}</td>
		<td>${item.templateName}</td>
		<td>${item.diseaseName}</td>
		<td>${item.employeeName}</td>
		<td>${item.departmentName}</td>
		<td>${item.fitstatus}</td>
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
