<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib prefix = "s" uri = "/struts-tags" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <title>人事管理-系统登录</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="人事管理">
	<link rel="stylesheet" type="text/css" href="stylesheet.css">

  </head>
  
  <body>
    <div align = "center">
    <table style = "padding:0px;margin:0px; width:800px;" border="0" cellpadding="0" cellspacing="0">
    	<tr>
    	<td>
    		<table style="width:100%;">
    		<tr>
    			<td style = "text-align:left"><img alt="" src="images/Title.JPG"></td>
    			<td>&nbsp;</td>
    			<td><img alt = "" src = "./images/earth.png"></td>
    		</tr>
    		</table>
    	</td>
    	</tr>
    	<tr>
    		<td><hr /></td>
    	</tr>
    	<tr>
    		<td>&nbsp;</td>
    	</tr>
    	<tr>
    		<td>&nbsp;</td>
    	</tr>
    	<tr>
    		<td>&nbsp;</td>
    	</tr>
    	<tr>
    		<td align = "center">
    			<s:form action = "login.action" method = "post" theme = "simple">
    			<table style = "border:thin dashed #008080;" width = "350" align = "center">
    			<tr>
    			<td style="width:30%">&nbsp;</td>
    			<td style="width:70%">&nbsp;</td>
    			</tr>
    			<tr>
    			<td align = "center" colspan = "2">
    			<b>系统登录</b>
    			</td>
    			</tr>
    			<tr>
    			<td>&nbsp;</td>
    			<td>&nbsp;</td>
    			</tr>
    			<tr>
    			<td align = "right">用户名:</td>
    			<td>
    				<s:textfield name = "users.username" label = "用户名" size = "15"/>
    			</td>
    			</tr>
    			<tr>
    			<td align = "right">密码:</td>
    			<td>
    				<s:password name = "users.password" label = "密码" size = "15"/>
    			</td>
    			</tr>
    			<tr>
    			<td>&nbsp;</td>
    			<td>&nbsp;</td>
    			</tr>
    			<tr>
    				<td align = "center" colspan = "2">
    				<s:submit value = "确定"></s:submit>
    				</td>
    			</tr>
    			</table>
    			</s:form>
    		</td>
    	</tr>
    	<tr>
    		<td>&nbsp;</td>
    	</tr>
    	<tr>
    		<td>&nbsp;</td>
    	</tr>
    	<tr>
    		<td><hr /></td>
    	</tr>
    	<tr>
    		<td style = "text-align:center">
    			<font color = "#330033">Copyright &copy; LiangWeibin.<br />
    			All Rights Reserved</font><br />
    		</td>
    	</tr>
    </table>
    </div>
  </body>
</html>
