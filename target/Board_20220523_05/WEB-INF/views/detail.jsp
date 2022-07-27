<%--
  Created by IntelliJ IDEA.
  User: 송근호
  Date: 2022-05-24
  Time: 오후 8:03
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
    <link rel="stylesheet" href="/resources/css/bootstrap.min.css">
</head>
<body>
    <h2>detail.jsp</h2>
    ${board.id}
    ${board.bw}
    ${board.bt}
    ${board.bc}
    ${board.bh}
    ${board.bct}
    <a href="/count?id=${board.id}"><button>수정</button></a>
    <a href="/pawCheck?id=${board.id}"><button>삭제</button></a>





<%--    <input type="button" onclick="de()">--%>
<%--    <button onclick="paging()">페이징 목록</button>--%>
<%--<div class="container">--%>
<%--    <div id="comment-write" class="input-group mb-3 form-floating">--%>
<%--        <input type="text" id="commentWriter" placeholder="작성자">--%>
<%--        <label for="commentWriter">작성자</label>--%>
<%--        <input type="text" id="commentContents" placeholder="내용">--%>
<%--        <button id="comment -write-btn" class="btn btn-primary">댓글 작성 </button>--%>
<%--    </div>--%>

<%--    <div id="comment-list">--%>
<%--        <table class="table">--%>
<%--          <tr>--%>
<%--            <tr>댓글번호</tr>--%>
<%--            <tr>작성자</tr>--%>
<%--            <tr>내용</tr>--%>
<%--            <tr>작성시간</tr>--%>
<%--            </tr>--%>
<%--            <c:forEach items="${commentList}" var="comment">--%>
<%--                <tr>--%>
<%--                    <td>${comment.id}</td>--%>
<%--                    <td>${comment.commmentWirter}</td>--%>
<%--                    <td>${comment.commentContents}</td>--%>
<%--                    <td><fmt:formatDate pattern="yyyy-MM-dd hh:mm:ss" value="${comment.commentCreatedDate}"></fmt:formatDate></td>--%>
<%--                </tr>--%>
<%--            </c:forEach>--%>
<%--        </table>--%>
<%--    </div>--%>





<%--</div>--%>
<%--</body>--%>
<%--    <script>--%>
<%--        $("#comment-write-btn").click(function (){--%>
<%--            //alert("안녕")--%>
<%--            //댓글  작성자 ,내용 가져오고--%>
<%--            // ajax 문법을 활용하여 /comment /save주소로 post 발식으로 작성자 내용 글번호 이렇게--%>
<%--            //세게의 값을 보내는 코드를 작성 하시오--%>
<%--            const commentWriter = document.getElementById("commentWriter").value;--%>
<%--            const commentContents = ${"commentContents"}.val();--%>
<%--            const boardId= ''${board.id}--%>
<%--            $.ajax({--%>
<%--                type: "post",--%>
<%--                url: "comment/save",--%>
<%--                data:{--%>
<%--                    "commentWriter": commentWriter,--%>
<%--                    "commentContents":commentContents,--%>
<%--                    "boardId": boardId--%>
<%--                },--%>
<%--                datatype: "json",--%>
<%--                success: function (result) {--%>
<%--                    console.log(result)--%>
<%--                },--%>
<%--                error: function () {--%>
<%--                    alert("어디가 틀렸을까요??");--%>
<%--                }--%>
<%--            });--%>
<%--        });--%>

<%--        const paging =()=>{--%>
<%--            location.href="/paging";--%>
<%--        }--%>
<%--        const de = () =>{--%>
<%--            location.href="pawCheck?id=${board.id}";--%>
<%--        }--%>
<%--    </script>--%>
</html>
