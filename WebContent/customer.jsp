<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>

	<h1>Struts+Spring+Hibernate</h1>

	<h2>添加客户信息</h2>
	<s:form action="addCustomerAction" >
		<s:textfield name="name" label="姓名" value=""></s:textfield>
		<s:textarea name="address" label="地址" value="" cols="50" rows="5"></s:textarea>
		<s:submit />
	</s:form>

	<s:if test="customerList.size() > 0">
		<table border="1px" cellpadding="8px">
			<tr>
				<th>客户Id</th>
				<th>名字</th>
				<th>地址</th>
				<th>创建日期</th>
			</tr>
			<s:iterator value="customerList" status="userStatus">
				<tr>
					<td><s:property value="customerId" /></td>
					<td><s:property value="name" /></td>
					<td><s:property value="address" /></td>
					<td><s:date name="createdDate" format="yyyy-MM-dd" /></td>
				</tr>
			</s:iterator>
		</table>
	</s:if>
	
	<br/>
	<br/>
</body>
</html>