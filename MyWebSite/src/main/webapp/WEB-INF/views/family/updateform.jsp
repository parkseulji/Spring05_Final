<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>/family/updateform.jsp</title>
</head>
<body>
<div class="container">
	<h1>가족정보 수정 폼</h1>
	<form action="update.do" method="post">
		<input type="hidden" name="num" value="${dto.num }" />
		<div>
			<label for="num">번호</label>
			<input type="text" id="num" value="${dto.num }" disabled/>
		</div>
		<div>
			<label for="name">이름</label>
			<input type="text" name="name" id="name"
				value="${dto.name }" />
		</div>
		<div>
			<label for="phone">전화번호</label>
			<input type="text" name="phone" id="phone"
				value="${dto.phone }" />
		</div>
		<button type="submit">수정확인</button>
		<button type="reset">취소</button>
	</form>
</div>
</body>
</html>