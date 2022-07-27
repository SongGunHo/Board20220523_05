<%--
  Created by IntelliJ IDEA.
  User: 송근호
  Date: 2022-05-24
  Time: 오후 8:38
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <input type="text" name="bp" id="pass">
    <input type="submit" value="클릭" onclick="pa()">
</body>
    <script>
        const pa = () =>{
            const bp =document.getElementById("pass").value;
            const bpDB="${board.bp}";
            if(bp==bpDB){
                location.href="/delete?id=${board.id}";

            }else{
                alert("불일치 합니다 !!!")
                location.href="/detail?id=${board.id}";
            }
        }
    </script>
</html>
