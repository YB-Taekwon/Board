<%@page pageEncoding="UTF-8" contentType="text/html; charset=UTF-8"
	isELIgnored="false"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<html>
<head>
<title>Post List</title>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<link rel="stylesheet" type="text/css" href="/css/style.css">
</head>
<body>
	<h1>게시글 작성</h1>
	<div>
		<a href="/">홈</a> <span>|</span> <a href="#">링크 추가</a>
	</div>

	<div class="table-container">
		<table>
			<thead>
				<tr>
					<th>조회수</th>
					<th>게시글 번호</th>
					<th>제목</th>
					<th>작성자</th>
					<th>작성 일자</th>
					<th>수정 일자</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach var="post" items="${posts}">
					<tr>
						<td>${post.boardCount }</td>
						<td>${post.boardId }</td>
						<td><a href="/post-info?boardId=${post.boardId}">${post.boardTitle }</a></td>
						<td>${post.boardWriter }</td>
						<td>${post.boardRegistDate }</td>
						<td>${post.boardUpdateDate }</td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
	</div>
</body>
</html>