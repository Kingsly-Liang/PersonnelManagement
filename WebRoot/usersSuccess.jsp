<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib prefix = "s" uri = "/struts-tags" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <title>操作信息</title>
    <link rel="stylesheet" type="text/css" href="./stylesheet.css"></link>
  </head>
  
  <body>
    <img alt="" src="./images/LuRight.jpg">
    <font color = "green">操作成功！</font>
    <s:action name = "usersList" executeResult = "true" ignoreContextParams = "false"></s:action>
  </body>
</html>
