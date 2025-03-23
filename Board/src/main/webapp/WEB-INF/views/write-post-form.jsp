<%@page pageEncoding="UTF-8" contentType="text/html; charset=UTF-8" isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<head>
    <title>Write Post</title>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" type="text/css" href="/css/style.css">

</head>
<body>
<h1>게시글 작성</h1>
<div>
    <a href="/">홈</a>
    <span>|</span>
    <a href="#">링크 추가</a>
</div>

<div class="table-container">
    <form action="/write-post" method="post">
        <table>
            <tr>
                <th>제목</th>
                <td>
                    <label for="boardTitle"></label>
                    <input id="boardTitle" name="boardTitle" type="text"/>
                </td>
            </tr>
            <tr>
                <th>내용</th>
                <td>
                    <label for="boardContent"></label>
                    <textarea id="boardContent" name="boardContent" rows="5" cols="40"></textarea>
                </td>
            </tr>
            <tr>
                <th>작성자</th>
                <td>
                    <label for="boardWriter"></label>
                    <input id="boardWriter" name="boardWriter" type="text"/>
                </td>
            </tr>
            <tr>
                <td colspan="3">
                    <button type="submit">작성</button>
                </td>
            </tr>
        </table>
    </form>
</div>


</body>
</html>
