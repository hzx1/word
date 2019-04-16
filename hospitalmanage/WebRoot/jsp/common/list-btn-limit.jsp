<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>


<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<c:set  value="${pageContext.request.contextPath}" scope="page" var="ctx"></c:set>
<script type="text/javascript">
	$(function(){
		<c:forEach var="item" items="${pfuserinfo}">
			if("${item.resource.resourceUrl}".indexOf(controller + "/toadd.do") >= 0 ||
			"${item.resource.resourceUrl}".indexOf(controller + "/add.do") >= 0 ||
			"${item.resource.resourceUrl}".indexOf("/patientController/add.do") >= 0 ||
			"${item.resource.resourceUrl}".indexOf(controller + "/dispensing.do") >= 0 ||
			"${item.resource.resourceUrl}".indexOf(controller + "/addChild.do") >= 0){
				$(".btn-add").css("display", "inline-block");
			}
			if("${item.resource.resourceUrl}".indexOf("/patientController/add.do") >= 0){
				$(".btn-add-p").css("display", "inline-block");
			}
			if("${item.resource.resourceUrl}".indexOf(controller + "/toedit.do") >= 0 ||
			"${item.resource.resourceUrl}".indexOf(controller + "/edit.do") >= 0){
				$(".btn-edit").css("display", "inline-block");
			}
			if("${item.resource.resourceUrl}".indexOf(controller + "/delete.do") >= 0 ||
			"${item.resource.resourceUrl}".indexOf(controller + "/dispensingout.do") >= 0){
				$(".btn-delete").css("display", "inline-block");
				$(".btn-deleteone").css("display", "inline-block");
			}
			if("${item.resource.resourceUrl}".indexOf(controller + "/deletemore.do") >= 0){
				$(".btn-deletemore").css("display", "inline-block");
			}			
			if("${item.resource.resourceUrl}".indexOf(controller + "/tohistory.do")){
				$(".btn-history").css("display", "inline-block");
			}
		</c:forEach>
	});
</script>
