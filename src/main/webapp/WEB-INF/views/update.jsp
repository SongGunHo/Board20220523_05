<%--
  Created by IntelliJ IDEA.
  User: 송근호
  Date: 2022-05-25
  Time: 오후 8:04
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <input type="text" name="bp" id="bp">
    <button type="submit" onclick="bu()">확인</button>
</body>
    <script>
        const bu= ()=>{
            const bu= document.getElementById("bp").value;
            const buDB="${board.bp}";
            if(bu==buDB){
                location.href="update?id=${board.bp}";
            }else{
                alert("확인다시부탁드립니다");
                location.href="count?id=${board.id}";
            }
        }
    </script>
</html>
