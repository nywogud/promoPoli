<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page session="false"%>
<html>
<head>
<title>mentor Page</title>
<script
	src="https://cdnjs.cloudflare.com/ajax/libs/jquery/3.0.0/jquery.min.js"></script>
<script
	src="https://cdnjs.cloudflare.com/ajax/libs/jquery-modal/0.9.1/jquery.modal.min.js"></script>
<link rel="stylesheet"
	href="https://cdnjs.cloudflare.com/ajax/libs/jquery-modal/0.9.1/jquery.modal.min.css" />

<style type="text/css">
#aTag {
	text-decoration: none;
	color: black;
}
</style>

<script>
	function openModal(postNum) {
		$.ajax({
			url : "/adMentoModal",
			type : "POST",
			data : {
				"postNum" : postNum
			},

			success : function(result) {
				$('#convertModal').empty();
				$('#convertModal').append(result);
				$('#viewModal').fadeIn();
			},
			error : function(request, status, error) {
				alert("code:" + request.status + "\n" + "message:"
						+ request.responseText + "\n" + "error:" + error);
			}

		})
	}

	function closeModal() {
		$('#viewModal').fadeOut();
	}

	function insertPost() {
		$('#insertPostModal').fadeIn();
	}

	function closeInsertModal() {
		$('#insertPostModal').fadeOut();
	}

	function insertModalAjax() {
		var cate = document.getElementById("cate").value;
		var title = document.getElementById("title").value;
		var textArea = document.getElementById("textArea").value;
		
		if(cate == 'mento'){
			$.ajax({
			url : "/insertPostMento",
			type : "POST",
			data : {
				"title" : title,
				"content" : textArea
			},
			success : function(result){
				alert("게시글이 등록됐습니다.");
				$('#insertPostModal').fadeOut();
			},
			error : function(request, status, error) {
				alert("code:" + request.status + "\n" + "message:"
						+ request.responseText + "\n" + "error:" + error);
			}

		})
		}else if(cate=='empower'){
			alert(cate);
		}else if(cate=='support'){
			alert(cate);
		}else if(cate=='intro'){
			alert(cate);
		}		
	}
</script>
</head>
<body>
	<h2 style="text-align: center;">멘토링</h2>
	<table>
		<th style="text-align: left;">게시글</th>
		<th style="text-align: left;">작성일</th>
		<th style="text-align: left;">조회수</th>
		<th style="text-align: left;">삭제</th>
		<tr>
			<c:forEach var="post" items="${post}">
				<td style="width: 30%;"><a href="javascript:;"
					onclick="openModal('${post.postNum}')" id="aTag">${post.title}</a></td>
				<td style="width: 30%;">${post.regDate}</td>
				<td style="width: 30%;">${post.views}</td>
				<td style="width: 25%;"><label>삭제</label> <input
					type="checkbox" name="deletePostNum" value="${post.postNum}"></td>
			</c:forEach>
		</tr>
	</table>
	<button onclick="insertPost();" value="submit">등록</button>
	<!--모달창으로-->
	<button type="submit" value="submit">삭제</button>
	<!--삭제 ajax로-->

	<!-- 모달 창이 들어가는 곳 -->
	<div id="convertModal"></div>

	<!-- 입력 모달 창-->
	<div id="insertPostModal" class="modal">
		<h4 style="text-align: center;">게시글을 추가해 주세요</h4>
		<select name="cate" id="cate" style="align-items: center;">
			<option value="mento" selected>멘토링</option>
			<option value="empower">역량강화</option>
			<option value="support">취업지원</option>
			<option value="intro">재단소개</option>
		</select>
		<p>제목</p>
		<input type="text" placeholder="제목을 입력하세요" name="title" id="title"/>
		<p>내용</p>
		<textarea id="textArea" placeholder="내용을 입력하세요" name="textArea"></textarea>
		<br>
		<br>
		<button type="button" onclick="closeInsertModal();">취소</button>
		<button type="button" onclick="insertModalAjax();">등록</button>
	</div>
</body>
</html>