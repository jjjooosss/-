<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
	<style type="text/css">
		table {
			width: 400px;
			border-collapse: collapse;
		}
		th td {
			border: 1px solid #cccccc;
			padding: 5px
		}
	</style>
	<script type="text/javascript">
		function fn_submit() {
			if(document.frm.name.value==""){
				alert("코드명을 입력해주세요.");
				document.frm.name.focus();
				return false;
			}
			document.frm.submit();
		}
		document.addEventListener("DOMContentLoaded", function () {
			var gid = "${codeVO.gid}"; // codeVO의 gid 값을 JavaScript 변수에 할당
			document.getElementById("gid").value = gid; // 해당 값에 해당하는 옵션을 선택
		});
		
	</script>
</head>
<body>
	<table border="1">
		<form name="frm" method="post" action="updateCodeSave.do">
			<tr>
				<th>분류</th>
				<td>
						<select name="gid" id="gid">
							<option value="1">Job(업무)</option>
							<option value="2">Hobby(취미)</option>
<%-- 							<option value="1" <c:if test="${codeVO.gid == '1'}"> selected </c:if>Job(업무)</option> --%>
<%-- 							<option value="2" <c:if test="${codeVO.gid == '2'}"> selected </c:if>Hobby(취미)</option> --%>
						</select>
				</td>
			</tr>
			<tr>
				<th>코드명</th>
				<td>
					<input type="text" name="name" value="${codeVO.name}"> 
					<input type="hidden" name="code" value="${codeVO.code}"> 
				</td>
			</tr>
			<tr align="center">
				<td colspan="2">
					<button type="submit" onclick="fn_submit(); return false;">저장</button>
					<button type="reset">취소</button>
				</td>
			</tr>
		</form>
	</table>
</body>
</html>