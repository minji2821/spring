<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="../header.jsp" %>

<h4>글수정</h4>

<form method="post">
  <p><input name="idx" value="${row.idx}" type="number" placeholder="글번호" required></p>
  <p><input name="title" value="${row.title }" placeholder="제목" required></p>
  <p><input name="contents" value="${row.contents}" placeholder="글내용" required></p>
  <p><input name="w_date" value="${row.w_date}" type="date" placeholder="작성일" required></p>
  <p><input name="nick" value="${row.nick}" placeholder="작성자" required></p>
  <p><input name="userid" value="${row.userid}" placeholder="아이디" required></p>
  
  <button>전송</button>
</form>

</body>
</html>