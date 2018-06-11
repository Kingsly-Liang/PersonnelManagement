<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib prefix = "s" uri = "/struts-tags" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <title>系统用户</title>
	<link rel="stylesheet" type="text/css" href="./stylesheet.css"></link>
  </head>
  
  <body>
    <div align = "center">
    <b>用户列表</b><br>
    <table width = "500" border = "0">
    <tr>
    <td><hr></td>
    </tr>
    <tr>
    <td>
    	<table width = "450" align = "center" border = "0">
    		<tr>
    		<td>
    			<form action="usersList.action">
    			用户名:<input type = "text" name = "users.username" value = "<s:property value ="users.username" />" size = "10" maxlength = "10" />
    			<input type = "submit" value = "查询" />
    			</form>
    		</td>
    		<td align = "right">
    			<img alt="" src="./images/LuArrow.jpg" align = "absmiddle">
    			<a href = "usersAddView.action" target = "rightFrame">增加</a>
    		</td>
    		</tr>
    	</table>
    	<table width = "450" align = "center" border = "0">
    		<tr>
    			<td>
    			查询结果：共<s:property value = "#request.page.totalSize"/>项。
    			</td>
    		</tr>
    	</table>
    	<table width = "450" align = "center" border = "1">
    		<tr align = "center">
    			<td>用户名</td><td>用户类型</td><td>操作</td>
    		</tr>
    		<s:iterator value = "#request.list" id = "users">
    		<tr align = "center">
    			<td><s:property value = "#users.username"/></td>
    			<td><s:property value = "#users.usertype"/></td>
    			<td align = "center">
    			<a href = "usersDelete.action?users.username=<s:property value = "#users.username"/>" onClick = "if(!confirm('确定删除吗？')) return false; else return true;">删除</a>
    			<a href = "usersUpdateView.action?users.username=<s:property value = "#users.username"/>">修改</a>
    			<a href = "usersResetPwd.action?users.username=<s:property value = "#users.username"/>" onClick = "if(!confirm('确定重置密码吗？')) return false; else return true;">密码重置</a>
    			</td>
    		</tr>
    		</s:iterator>
    	</table>
    	<table width = "450" align = "center" border = "0">
    		<tr align = "center">
    		<td>
    			<s:set name = "page" value = "#request.page"></s:set>
    				<s:if test="#page.totalSize != 0">
    					[第<s:property value = "#page.pageNow"/>页/共<s:property value = "#page.totalPage"/>页]
    				</s:if>
    				<s:if test="#page.hasFirst">
    					<a href = "usersList.action?pageNow = 1&users.username = <s:property value = "users.username"/>">首页</a>
    				</s:if>
    				<s:if test="#page.hasPre">
    					<a href = "usersList.action?pageNow = <s:property value = "#page.pageNow - 1"/>&users.username = <s:property value = "users.username"/>">上一页</a>
    				</s:if>
    				<s:if test="#page.hasNext">
    					<a href = "usersList.action?pageNow = <s:property value = "#page.pageNow + 1"/>&users.username = <s:property value = "users.username"/>">下一页</a>
    				</s:if>
    				<s:if test="#page.hasLast">
    					<a href = "usersList.action?pageNow = <s:property value = "#page.totalPage"/>&users.username = <s:property value = "users.username"/>">尾页</a>
    				</s:if>
    		</td>
    		</tr>
    	</table>
    </td>
    </tr>
    <tr>
    <td><hr></td>
    </tr>
    </table>
    </div>
  </body>
</html>
