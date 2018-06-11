<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib prefix = "s" uri = "/struts-tags" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <title>部门</title>
	<link rel="stylesheet" type="text/css" href="./stylesheet.css"></link>
  </head>
  
  <body>
    <div align = "center">
    <b>部门列表</b><br>
    <table width = "500" border = "0">
    <tr>
    <td><hr></td>
    </tr>
    <tr>
    <td>
    	<table width = "450" align = "center" border = "0">
    		<tr>
    		<td>
    			<form action="bmbList.action">
    			编号:<input type = "text" name = "bmb.bmbh" value = "<s:property value ="bmb.bmbh" />" size = "10" maxlength = "10" />
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
    			<td>编号</td><td>名称</td><td>操作</td>
    		</tr>
    		<s:iterator value = "#request.list" id = "bmb">
    		<tr align = "center">
    			<td><s:property value = "#bmb.bmbh"/></td>
    			<td><s:property value = "#bmb.bmmc"/></td>
    			<td align = "center">
    			<a href = "bmbDelete.action?bmb.bmbh=<s:property value = "#bmb.bmbh"/>" onClick = "if(!confirm('确定删除吗？')) return false; else return true;">删除</a>
    			<a href = "bmbUpdateView.action?bmb.bmbh=<s:property value = "#bmb.bmbh"/>">修改</a>
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
    					<a href = "bmbList.action?pageNow = 1&bmb.bmbh = <s:property value = "bmb.bmbh"/>">首页</a>
    				</s:if>
    				<s:if test="#page.hasPre">
    					<a href = "bmbList.action?pageNow = <s:property value = "#page.pageNow - 1"/>&bmb.bmbh = <s:property value = "bmb.bmbh"/>">上一页</a>
    				</s:if>
    				<s:if test="#page.hasNext">
    					<a href = "bmbList.action?pageNow = <s:property value = "#page.pageNow + 1"/>&bmb.bmbh = <s:property value = "bmb.bmbh"/>">下一页</a>
    				</s:if>
    				<s:if test="#page.hasLast">
    					<a href = "bmbList.action?pageNow = <s:property value = "#page.totalPage"/>&bmb.bmbh = <s:property value = "bmb.bmbh"/>">尾页</a>
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
