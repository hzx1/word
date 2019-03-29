<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<c:set  value="${pageContext.request.contextPath}" scope="page" var="ctx"></c:set>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head></head>
  <script type="text/javascript">
  	top.location.href="${ctx}/indexController/toindex.do";
  </script>
  <body>
  </body>
</html>
