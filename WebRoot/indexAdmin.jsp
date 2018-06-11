<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    
    <title>人事管理</title>
	<link rel="stylesheet" type="text/css" href="stylesheet.css"></link>
	
	<frameset rows = "100,*" cols = "*">
		<frame src = "./main.jsp" name = "topFrame" scrolling = "yes" id = "topFrame">
		<frameset rows = "*" cols = "200,*">
			<frame src = "./menu.jsp" name = "leftFrame" scrolling = "auto" id = "leftFrame">
			<frame src = "./home.jsp" name = "rightFrame" scrolling = "yes" id = "rightFrame">
		</frameset>
	</frameset>
	
  </head>
  <noframes>
  <body>
    <div align = "center">
    	此网页使用了框架，但您的浏览器不支持框架。
    </div>
  </body>
  </noframes>
</html>
