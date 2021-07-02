<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page session="false"%>
<!DOCTYPE html>
<html>
<script
	src="https://cdnjs.cloudflare.com/ajax/libs/jquery/3.0.0/jquery.min.js"></script>
<script
	src="https://cdnjs.cloudflare.com/ajax/libs/jquery-modal/0.9.1/jquery.modal.min.js"></script>
<link rel="stylesheet"
	href="https://cdnjs.cloudflare.com/ajax/libs/jquery-modal/0.9.1/jquery.modal.min.css" />
<body>
	<div id="viewModal" class="modal">
		<h2 style="text-align: center;">게시글 확인</h2>
		<p style="text-align: center;">카테고리 : 멘토링</p>
		<p style="text-align: center;">제목</p>
		<p>${post[0].title}</p>
		<p style="text-align: center;">내용</p>
		<p>${post[0].content}</p>
		<input type="button" onclick="closeModal();" value="확인"></input>
	</div>
</body>
</html>