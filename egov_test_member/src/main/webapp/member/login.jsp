<%--
  Created by IntelliJ IDEA.
  User: suhyeon
  Date: 2023-06-12
  Time: 오후 11:37
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>

</head>
<body>
<form action="loginOk.do" method="post">
    <table width="400" border="1">
        <tr>
            <td>사용자 ID</td>
            <td>
                <input type="text" name="mem_uid" />
            </td>
        </tr>
        <tr>
            <td>비밀번호</td>
            <td>
                <input type="text" name="mem_pwd" />
            </td>
        </tr>
        <tr>
            <td colspan="2">
                <input type="submit" value="로그인" />
                <a href="register.do">회원가입</a>
            </td>
        </tr>
    </table>
</form>
</body>
</html>