<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib  prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>

<c:forEach var="item" items="${registers}">
	<tr class="rowTr">
		<td>${item.registerCode}</td>
		<td>${item.cardCode}</td>
		<td>${item.patientName}</td>
		<td><fmt:formatDate pattern="yyyy-MM-dd HH:mm:ss" value="${item.registerTime}"/></td>
		<td>${item.doctorName}</td>
		<td>${item.departmentName}</td>
		<td>${item.registerSum}</td>
		<td>${item.registerStatus}</td>
		<td>
			<a class="" href="javascript:;" onclick="deleterigster('${item.id}')">作废单据</a>
		</td>
	</tr>
</c:forEach>

<%@include file="../../common/table-btn-limit.jsp" %>
<script type="text/javascript">
	$(function(){
		$(".rowTr").click(function(){
			$(".rowTr").removeClass("xz");
			$(".rowTr").css("color","#000");
			$(this).addClass("xz");
			$(this).css("color","#fff");
		});
		
		//赋值总行数和当前页，应用在custom_pageload.js，js文件不可用el表达式
		sumrow = ${pagingVo.sumrow};
		currentpage = ${pagingVo.currentpage};
		//调用加载分页信息的方法，方法体在custom_pageload.js里
		loadfunction();
	});
</script>
