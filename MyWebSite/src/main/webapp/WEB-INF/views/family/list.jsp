<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>/family/list.jsp</title>
</head>
<body>
<div class="container">
	<h1>가족 정보 목록</h1>
	<table>
		<thead>
			<tr>
				<th>번호</th>
				<th>이름</th>
				<th>전화번호</th>
				<th>수정</th>
				<th>삭제</th>
			</tr>
		</thead>
		<tbody>
		<c:forEach var="tmp" items="${list }">
			<tr>
				<td>${tmp.num }</td>
				<td>${tmp.name }</td>
				<td>${tmp.phone }</td>
				<td><a href="updateform.do?num=${tmp.num }">수정</a></td>
				<td><a href="delete.do?num=${tmp.num }">삭제</a></td>
			</tr>
		</c:forEach>
		</tbody>
	</table>
	<a href="insertform.do">가족정보 추가</a>
</div>
</body>
</html>