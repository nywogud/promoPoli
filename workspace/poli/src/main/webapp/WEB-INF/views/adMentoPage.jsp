<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page session="false"%>
<html>
<head>
<title>mentor Page</title>
<script src="https://cdnjs.cloudflare.com/ajax/libs/jquery/3.0.0/jquery.min.js"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/jquery-modal/0.9.1/jquery.modal.min.js"></script>
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/jquery-modal/0.9.1/jquery.modal.min.css" />

<style type="text/css">

#aTag {
	text-decoration: none;
	color: black;
}

</style>
</head>
<body>
	<h2 style="text-align: center;">멘토링</h2>
	<table>
		<th style="text-align: left;">게시글</th>
		<th style="text-align: left;">작성일</th>
		<th style="text-align: left;">조회수</th>
		<th style="text-align: left;">삭제</th>
		<tr>
			<form>
				<c:forEach var="post" items="${mento}">
					<td style="width: 30%;"><a href="#viewPostMento" id="aTag" rel="modal:open">${post.title}</a></td>
					<td style="width: 30%;">${post.regDate}</td>
					<td style="width: 30%;">${post.views}</td>
					<td style="width: 25%;"><label>삭제</label><input type="checkbox" name="deletePostNum" value="${post.postNum}"></td>
				</c:forEach>
		</tr>
	</table>
	<button onclick="" value="submit">등록</button>
	<!--모달창으로-->
	<button type="submit" value="submit">삭제</button>
	<!--삭제 ajax로-->
	</form>
	<div id="viewPostMento" class="modal">
		<h2 style="text-align: center;">게시글 확인</h2>
		<p style="text-align: center;">카테고리 : 멘토링</p>
		<p style="text-align: center;">제목</p>
		<p>${post.title}</p>
		<p style="text-align: center;">내용</p>
		<p>${post.content}</p>
		<a href="javascript:;" rel="modal:close">확인</a>
	</div>
</body>
</html>