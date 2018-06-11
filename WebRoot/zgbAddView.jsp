<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib prefix = "s" uri = "/struts-tags" %>
<%@ taglib uri = "/struts-dojo-tags" prefix = "sd" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <title>职工</title>
	<link rel="stylesheet" type="text/css" href="./stylesheet.css"></link>
	<script type="text/javascript" src = "<%=request.getContextPath()%>/dwr/engine.js"></script>
	<script type="text/javascript" src = "<%=request.getContextPath()%>/dwr/util.js"></script>
	<script type="text/javascript" src = "<%=request.getContextPath()%>/dwr/interface/AjaxUsersService.js"></script>
	<script type="text/javascript">
		function check(){
			var bh = document.all.bh.value;
			if(bh == ""){
				window.alert("编号不能为空!");
				return;
			}
			AjaxUsersService.exist(bh,show);
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
    <b>职工增加</b>
    <br>
    <br>
    <s:form action = "zgbAdd.action" method = "post" theme = "simple">
    <table style = "border: thin dashed #008080;" width = "500" align = "center">
    <tr>
    <td style = "width:45%">&nbsp;</td>
    <td style = "width:55%">&nbsp;</td>
    </tr>
    <tr>
    <td align = "right">编号:</td>
    <td>
    	<s:textfield name = "zgb.bh" label = "编号" size = "7" maxlength= "7" onblur = "check()" id = "bh" />
    </td>
    </tr>
    <tr>
    <td align = "right">姓名:</td>
    <td>
    	<s:textfield name = "zgb.xm" label = "姓名" size = "10" maxlength= "10" />
    </td>
    </tr>
    <tr>
    <td align = "right">性别:</td>
    <td>
    	<s:radio list = "{'男', '女'}" value = "'男'" name = "zgb.xb" label = "性别" ></s:radio>
    </td>
    </tr>
    <tr>
    <td align = "right">出生日期:</td>
    <td>
    	<s:head theme="xhtml"/>
    	<sd:head parseContent="true"/>
    	<sd:datetimepicker name = "zgb.csrq" id = "csrq" displayFormat = "yyyy-MM-dd" ></sd:datetimepicker>
    </td>
    </tr>
     <tr>
    <td align = "right">基本工资:</td>
    <td>
    	<s:textfield name = "zgb.jbgz" label = "基本工资" size = "8" maxlength= "8" />
    </td>
    </tr>
     <tr>
    <td align = "right">岗位津贴:</td>
    <td>
    	<s:textfield name = "zgb.gwjt" label = "岗位津贴" size = "8" maxlength= "8" />
    </td>
    </tr>
     <tr>
    <td align = "right">部门:</td>
    <td>
    	<select name = "zgb.bm">
    		<s:iterator value = "#request.bmb" id = "bmb">
    			<option value = "<s:property value="#bmb.bmbh"/>" <s:if test = "#bmb.bmbh == zgb.bm">selected</s:if>>[<s:property value = "#bmb.bmbh"/>]<s:property value = "#bmb.bmmc"/></option>
    		</s:iterator>
    	</select>
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
