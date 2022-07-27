<%--
  Created by IntelliJ IDEA.
  User: 송근호
  Date: 2022-05-24
  Time: 오후 7:10
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0-beta1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-0evHe/X+R7YkIZDRvuzKMRqM+OrBnVFBL6DOitfPri4tjfHxaWutUpFmBp4vmVor" crossorigin="anonymous">
</head>
<body>

<table class="table">
    <tr>
        <th>id</th>
        <th>제목</th>
        <th>작성자</th>
        <th>비밀번호</th>
        <th>조히수</th>
        <th>내용</th>
        <!--<th>시간</th>-->
        <th>시간</th>
    </tr>
    <c:forEach var="board" items="${board}">
        <tr>
            <td>${board.id}</td>
            <td><a href="/detail?id=${board.id}"> ${board.bt}</a></td>
            <td>${board.bw}</td>
            <td>${board.bc}</td>
            <td>${board.bh}</td>
            <td>${board.bp}</td>
            <!--<td>$ {board.boardCreatedDate}</td>-->
            <td><fmt:formatDate pattern="yyyy-MM-dd hh:mm:ss" value="${board.bct}"></fmt:formatDate></td>
        </tr>
    </c:forEach>
</table>

</body>
</html>
