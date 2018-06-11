<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib prefix = "s" uri = "/struts-tags" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <title>职工</title>
	<link rel="stylesheet" type="text/css" href="./stylesheet.css"></link>
  </head>
  
  <body>
    <div align = "center">
    <b>职工列表</b><br>
    <table width = "500" border = "0">
    <tr>
    <td><hr></td>
    </tr>
    <tr>
    <td>
    	<table width = "450" align = "center" border = "0">
    		<tr>
    		<td>
    			<form action="zgbList.action">
    			部门:
    			<select name = "zgb.bm">
    			<option value = ""></option>
    			<s:iterator value = "#request.bmb" id = "bmb">
    			<option value = "<s:property value="#bmb.bmbh"/>"<s:if test = "#bmb.bmbh == zgb.bm">selected = "selected"</s:if>>
    			[<s:property value = "#bmb.bmbh"/>]<s:property value = "#bmb.bmmc"/>
    			</option>
    			</s:iterator>
    			</select>
    			编号：
    			<input type = "text" name = "zgb.bh" value = "<s:property value = "zgb.bh" />"size = "7" maxlength = "7" />
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
    			<td>部门</td><td>编号</td><td>姓名</td><td>性别</td><td>出生日期</td><td>基本工资</td><td>岗位津贴</td><td>操作</td>
    		</tr>
    		<s:iterator value = "#request.list" id = "zgb">
    		<tr align = "center">
    			<td>
    				<select disabled>
    					<s:iterator value = "#request.list" id = "bmb">
    						<option value = "<s:property value="#bmb.bmbh"/>"<s:if test = "#bmb.bmbh == zgb.bm">selected = "selected"</s:if>>
    						[<s:property value = "#bmb.bmbh"/>]<s:property value = "#bmb.bmmc"/>
    						</option>
    					</s:iterator>
    				</select>
    			</td>
    			<td><s:property value = "#zgb.bh"/></td>
    			<td><s:property value = "#zgb.xm"/></td>
    			<td><s:property value = "#zgb.xb"/></td>
    			<td><s:property value = "%{getText('{0,date,yyyy-MM-dd}',{#zgb.csrq})}"/></td>
    			<td><s:property value = "#zgb.jbgz"/></td>
    			<td><s:property value = "#zgb.gwjt"/></td>
    			<td align = "center">
    			<a href = "zgbDelete.action?zgb.bh=<s:property value = "#zgb.bh"/>" onClick = "if(!confirm('确定删除吗？')) return false; else return true;">删除</a>
    			<a href = "zgbUpdateView.action?zgb.bh=<s:property value = "#zgb.bh"/>">修改</a>
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
    					<a href = "zgbList.action?pageNow = 1&zgb.bm = <s:property value = "zgb.bm"/>&zgb.bh = <s:property value = "zgb.bh"/>">首页</a>
    				</s:if>
    				<s:if test="#page.hasPre">
    					<a href = "zgbList.action?pageNow = <s:property value = "#page.pageNow - 1"/>&zgb.bm = <s:property value = "zgb.bm"/>&zgb.bh = <s:property value = "zgb.bh"/>">上一页</a>
    				</s:if>
    				<s:if test="#page.hasNext">
    					<a href = "zgbList.action?pageNow = <s:property value = "#page.pageNow + 1"/>&zgb.bm = <s:property value = "zgb.bm"/>&zgb.bh = <s:property value = "zgb.bh"/>">下一页</a>
    				</s:if>
    				<s:if test="#page.hasLast">
    					<a href = "zgbList.action?pageNow = <s:property value = "#page.totalPage"/>&zgb.bm = <s:property value = "zgb.bm"/>&zgb.bh = <s:property value = "zgb.bh"/>">尾页</a>
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
