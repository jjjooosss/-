<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
	<style type="text/css">
		table{
			width: 400px;
			border-collapse: collapse;
		}
		th, td{
			border: 1px solid #cccccc;
			padding: 5px;
		}
	</style>
</head>
<body>
<table width="500" border="1">
		<tr>
			<td>상품명</td>
			<td>가격</td>
			<td>설명</td>
		</tr>
<!-- 		list : 모델 객체에서 보낸 이름 -->
	<c:forEach var="result" items="${resultList}" varStatus="status">
		<tr>
			<td>${result.name}</td>
			<td>${result.price}</td>
			<td>${result.description}</td>
		</tr>
	</c:forEach>
	<tr>
		<td colspan="3">
			<a href="itemWrite.do">글 작성하기</a>
		</td>
	</tr>
	</table>
</body>
</html>