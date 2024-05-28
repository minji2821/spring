<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="../header.jsp" %>

<h4>글작성</h4>

<form method="post">
  <p><input name="idx" type="number" placeholder="글번호" required></p>
  <p><input name="title" placeholder="제목" required></p>
  <p><input name="contents" placeholder="글내용" required></p>
  <p><input name="w_date" type="date" placeholder="작성일" required></p>
  <p><input name="nick" placeholder="작성자" required></p>
  <p><input name="userid" placeholder="아이디" required></p>
  
  <button>전송</button>
</form>

</body>
</html>