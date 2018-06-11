<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib prefix = "s" uri = "/struts-tags" %>
<% //request.setCharacterEncoding("utf-8") %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <title>系统用户</title>
    <link rel="stylesheet" type="text/css" href="./stylesheet.css"></link>
  </head>
  
  <body>
    <div align = "center">
    <b>用户修改</b>
    <br>
    <br>
    <s:form action = "usersUpdate.action" method = "post" theme = "simple">
    <table style = "border:thin dashed #008080;" width = "500" align = "center">
    <tr>
    <td style = "width:45%">&nbsp;</td>
    <td style = "width:55%">&nbsp;</td>
    </tr>
    <tr>
    <td align = "right">用户名:</td>
    <td>
    	<s:textfield name = "users.username" label = "用户名" size = "10" maxlength= "10" disabled = "true" />
    </td>
    </tr>
     <tr>
    <td align = "right">用户类型:</td>
    <td>
    	<s:select list = "{'系统管理员','普通用户'}" value = "users.usertype" name = "users.usertype" label = "用户类型"></s:select>
    </td>
    </tr>
    <tr>
    <td>&nbsp;</td>
    <td>
    	<s:hidden name = "users.username"></s:hidden>
    	<s:hidden name = "users.userpassword"></s:hidden>
    </td>
    </tr>
    <tr>
    <td align = "center" colspan = "2">
  		<s:submit value = "确定"></s:submit>
  		<s:reset value = "重置"></s:reset>
  	</td>
    </tr>
    </table>
    </s:form>
    </div>
  </body>
</html>
