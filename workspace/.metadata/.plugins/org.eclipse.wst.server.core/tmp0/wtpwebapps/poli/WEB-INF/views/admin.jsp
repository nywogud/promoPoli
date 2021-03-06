<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page session="false"%>
<html>
<head>
<title>admin</title>
<script
	src="https://cdnjs.cloudflare.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
<script>
	function adMento(postNum) {
		$.ajax({
			type : 'POST',
			url : '/adMento',
			success : function(result) {

				$("#convertAdPage").empty();
				$("#convertAdPage").append(result);
			},
			error : function(request, status, error) {

				alert("code:" + request.status + "\n" + "message:"
						+ request.responseText + "\n" + "error:" + error);
			}
		})
	}

	function adEmpower(postNum) {
		$.ajax({
			type : 'POST',
			url : '/adEmpower',
			success : function(result) {

				$("#convertAdPage").empty();
				$("#convertAdPage").append(result);
			},
			error : function(request, status, error) {

				alert("code:" + request.status + "\n" + "message:"
						+ request.responseText + "\n" + "error:" + error);
			}
		})
	}

	function adSupport(postNum) {
		$.ajax({
			type : 'POST',
			url : '/adSupport',
			success : function(result) {

				$("#convertAdPage").empty();
				$("#convertAdPage").append(result);
			},
			error : function(request, status, error) {

				alert("code:" + request.status + "\n" + "message:"
						+ request.responseText + "\n" + "error:" + error);
			}
		})
	}

	function adIntro(postNum) {
		$.ajax({
			type : 'POST',
			url : '/adIntro',
			success : function(result) {

				$("#convertAdPage").empty();
				$("#convertAdPage").append(result);
			},
			error : function(request, status, error) {

				alert("code:" + request.status + "\n" + "message:"
						+ request.responseText + "\n" + "error:" + error);
			}
		})
	}
</script>
<style>
ul.adUl>li>a {
	text-decoration: none;
	list-style: none;
	color: black;
}

ul.adUl>li {
	margin-top: 60px;
	margin-bottom: 60px;
}
</style>
</head>
<body>
	<div>
		<h1 style="text-align: center;">관리자 페이지 입니다.</h1>
		<p style="text-align: center;">메뉴 추가 및 삭제를 할 수 있습니다.</p>
	</div>
	<hr>
	<div>
		<span style="float: left;">
			<ul class="adUl">
				<li><a href="javascript:;" onclick="adMento();">멘토링</a></li>
				<li><a href="javascript:;" onclick="adEmpower();">역량강화</a></li>
				<li><a href="javascript:;" onclick="adSupport();">취업지원</a></li>
				<li><a href="javascript:;" onclick="adIntro();">재단소개</a></li>
			</ul>
		</span> 
		<span style="float: left; padding-left: 50px; width: 90%;" id="convertAdPage">
			<h2 style="text-align: center;">좌측 배너를 클릭해서 상세 보기</h2>
		</span>
	</div>
</body>
</html>