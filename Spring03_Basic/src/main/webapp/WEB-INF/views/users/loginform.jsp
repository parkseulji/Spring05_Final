<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>views/users/loginform.jsp</title>
</head>
<body>
<form action="login.do" method="post">
	<label for="id">아이디</label>
	<input type="text" name="id" id="id" />
	<label for="pwd">비밀번호</label>
	<input type="password" name="pwd" id="pwd" />
	 <button type="submit">로그인</button>
</form>
</body>
</html>