<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@taglib prefix="s" uri="/struts-tags" %>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <title>人事管理</title>
    <link rel="stylesheet" type="text/css" href="./stylesheet.css"></link>
  </head>
  
  <body>
    <div>
    	<table style = "width:100%;">
    		<tr>
    			<td>
    				<img alt = "" src = "./images/Title.JPG">
    			</td>
    			<td style = "width:20%" align = "center">
    				<img alt = "" src = "./images/earth.png">
    				<br />
    				[<s:property value = "#session.user.username"/>|<s:property value = "#session.user.usertype" />|<a href ="./logout.action" target = "_top">注销</a>]
    			</td> 
    		</tr>
    		<tr>
    			<td>&nbsp;</td>
    			<td>&nbsp;</td>
    			<td>&nbsp;</td>
    		</tr>
    	</table>
    </div>
  </body>
</html>
