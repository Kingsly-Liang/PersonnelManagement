<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib prefix = "s" uri = "/struts-tags" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <title>部门</title>
	<link rel="stylesheet" type="text/css" href="./stylesheet.css"></link>
	<script type="text/javascript" src = "<%=request.getContextPath()%>/dwr/engine.js"></script>
	<script type="text/javascript" src = "<%=request.getContextPath()%>/dwr/util.js"></script>
	<script type="text/javascript" src = "<%=request.getContextPath()%>/dwr/interface/AjaxUsersService.js"></script>
	<script type="text/javascript">
		function check(){
			var bmbh = document.all.bmbh.value;
			if(bmbh == ""){
				window.alert("编号不能为空!");
				return;
			}
			AjaxUsersService.exist(bmbh,show);
		}
		function show(data){
			if(data){
				window.alert("该编号已被使用！");
				return;
			}
		}
	</script>
  </head>
  
  <body>
    <div align = "center">
    <b>部门增加</b>
    <br>
    <br>
    <s:form action = "bmbAdd.action" method = "post" theme = "simple">
    <table style = "border: thin dashed #008080;" width = "500" align = "center">
    <tr>
    <td style = "width:45%">&nbsp;</td>
    <td style = "width:55%">&nbsp;</td>
    </tr>
    <tr>
    <td align = "right">编号:</td>
    <td>
    	<s:textfield name = "bmb.bmbh" label = "编号" size = "2" maxlength= "2" onblur = "check()" id = "bmbh" />
    </td>
    </tr>
    <tr>
    <td align = "right">名称:</td>
    <td>
    	<s:textfield name = "bmb.bmmc" label = "名称" size = "20" maxlength= "20"  />
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
