<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>/family/insertform.jsp</title>
</head>
<body>
<div class="container">
	<h1>가족 정보 추가 폼</h1>
	<form action="insert.do" method="post">
		<div>
			<label for="name">이름</label>
			<input type="text" name="name" id="name" />
		</div>
		<div>
			<label for="phone">전화번호</label>
			<input type="text" name="phone" id="phone" />
		</div>
		<button type="submit">추가</button>
	</form>
</div>
</body>
</html>