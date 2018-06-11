<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib prefix = "s" uri = "/struts-tags" %>
<% //request.setCharacterEncoding("utf-8") %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <title>部门</title>
    <link rel="stylesheet" type="text/css" href="./stylesheet.css"></link>
  </head>
  
  <body>
    <div align = "center">
    <b>用户修改</b>
    <br>
    <br>
    <s:form action = "bmbUpdate.action" method = "post" theme = "simple">
    <table style = "border:thin dashed #008080;" width = "500" align = "center">
    <tr>
    <td style = "width:45%">&nbsp;</td>
    <td style = "width:55%">&nbsp;</td>
    </tr>
    <tr>
    <td align = "right">编号:</td>
    <td>
    	<s:hidden name = "bmb.bmbh"></s:hidden>
    	<s:textfield name = "bmb.bmbh" label = "编号" size = "2" maxlength= "2" disabled = "true" />
    </td>
    </tr>
     <tr>
    <td align = "right">名称:</td>
    <td>
    	<s:textfield name = "bmb.bmmc" label = "名称" size = "20" maxlength= "20" />
    </td>
    </tr>
    <tr>
    <td>&nbsp;</td>
    <td>&nbsp;</td>
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
