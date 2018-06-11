<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib prefix = "s" uri = "/struts-tags" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <title>系统用户</title>
	<link rel="stylesheet" type="text/css" href="./stylesheet.css"></link>
	<script type="text/javascript" src = "<%=request.getContextPath()%>/dwr/engine.js"></script>
	<script type="text/javascript" src = "<%=request.getContextPath()%>/dwr/util.js"></script>
	<script type="text/javascript" src = "<%=request.getContextPath()%>/dwr/interface/AjaxUsersService.js"></script>
	<script type="text/javascript">
		function check(){
			var username = document.all.username.value;
			if(username == ""){
				window.alert("用户名不能为空!");
				return;
			}
			AjaxUsersService.exist(username,show);
		}
		function show(data){
			if(data){
				window.alert("该用户名已被使用！");
				return;
			}
		}
	</script>
  </head>
  
  <body>
    <div align = "center">
    <b>用户增加</b>
    <br>
    <br>
    <s:form action = "usersAdd.action" method = "post" theme = "simple">
    <table style = "border: thin dashed #008080;" width = "500" align = "center">
    <tr>
    <td style = "width:45%">&nbsp;</td>
    <td style = "width:55%">&nbsp;</td>
    </tr>
    <tr>
    <td align = "right">用户名:</td>
    <td>
    	<s:textfield name = "users.username" label = "用户名" size = "10" maxlength= "10" onblur = "check()" id = "username" />
    </td>
    </tr>
    <tr>
    <td align = "right">用户类型:</td>
    <td>
    	<s:select list = "{'系统管理员','普通用户'}" value = "'普通用户'" name = "users.usertype" label = "用户类型"></s:select>
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
