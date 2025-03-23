<%@page pageEncoding="UTF-8" contentType="text/html; charset=UTF-8" isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<head>
    <title>Post</title>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" type="text/css" href="/css/style.css">
</head>
<body>
<h1>게시글 - ${post.boardId }</h1>
<div>
    <a href="/">홈</a>
    <span>|</span>
    <a href="#">링크 추가</a>
</div>

<div class="table-container">
    <table>
        <tr>
            <th>조회수</th>
            <td>${post.boardCount}</td>
        </tr>
        <tr>
            <th>게시글 번호</th>
            <td>${post.boardId}</td>
        </tr>
        <tr>
            <th>제목</th>
            <td>${post.boardTitle}</td>
        </tr>
        <tr>
            <th>내용</th>
            <td>${post.boardContent}</td>
        </tr>
        <tr>
            <th>작성자</th>
            <td>${post.boardWriter}</td>
        </tr>
        <tr>
            <th>작성 일자</th>
            <td>${post.boardRegistDate}</td>
        </tr>
        <tr>
            <th>수정 일자</th>
            <td>${post.boardUpdateDate}</td>
        </tr>
    </table>
</div>
</body>
</html>
