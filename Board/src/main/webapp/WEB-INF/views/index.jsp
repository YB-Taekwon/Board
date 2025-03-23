<%@page pageEncoding="UTF-8" contentType="text/html; charset=UTF-8" isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<head>
    <title>HOME</title>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" type="text/css" href="/css/style.css">
</head>
<body>
<h1>홈 화면</h1>
<div>
    <a href="/">홈</a>
    <span>|</span>
    <a href="#">링크 추가</a>
</div>

<div class="table-container">
    <table>
        <thead>
        <tr>
            <th>게시글 번호</th>
            <th>제목</th>
            <th>작성자</th>
            <th>조회수</th>
            <th>작성 일자</th>
            <th>수정 일자</th>
        </tr>
        </thead>
        <tbody>
        <tr>
            <td colspan="6">게시글이 존재하지 않습니다.</td>
        </tr>
        </tbody>
    </table>
</div>
</body>
</html>