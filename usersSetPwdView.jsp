<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib prefix = "s" uri = "/struts-tags" %>
<% //request.setCharacterEncoding("UTF-8"); %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    
    <title>系统用户-密码设置</title>
	 <link rel="stylesheet" type="text/css" href="./stylesheet.css"></link>
  </head>
  
  <body>
    <div align = "center">
    <b>密码设置</b><br>
    <br>
    <s:form action = "usersSetPwd.action" method = "post" theme = "simple">
    <table align = "center" width = "350" style = "border: thin dashed rgb(0,128,128);">
    <tr>
    <td style = "width :30%;">&nbsp;</td>
    <td style = "width :70%;">&nbsp;</td>
    </tr>
    <tr>
    <td align = "right">用户名:</td>
    <td>
    	<s:textfield name = "users.username" label = "用户名" size = "15" maxlength = "10" disabled = "ture"></s:textfield>
    </td>
    </tr>
    <tr>
    <td align = "right">密码:</td>
    <td>
    	<s:password name = "users.password" label = "密码" size = "15" maxlength = "20" disabled = "false"></s:password>
    </td>
    </tr>
    <tr>
    <td>&nbsp;</td>
    <td>
    	<s:hidden name = "users.usertype" value="%{users.usertype}"></s:hidden>
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
