<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page session="false"%>
<html>
<head>
<title>main</title>
<script src="https://cdnjs.cloudflare.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
<script>
	function mento(postNum) {
		var postNum = postNum;
		$.ajax({
			type : 'POST',
			url : '/mento',
			data : {
				"postNum" : postNum
			},
			success : function(result) {

				$("#content").empty();
				$("#content").append(result);
			},
			error : function(request, status, error) {

				alert("code:" + request.status + "\n" + "message:"
						+ request.responseText + "\n" + "error:" + error);

			}
		})
	}

	function empower(postNum) {
		var postNum = postNum;
		$.ajax({
			type : 'POST',
			url : '/empower',
			data : {
				"postNum" : postNum
			},
			success : function(result) {

				$("#content").empty();
				$("#content").append(result);
			},
			error : function(request, status, error) {

				alert("code:" + request.status + "\n" + "message:"
						+ request.responseText + "\n" + "error:" + error);
			}
		})
	}

	function support(postNum) {
		var postNum = postNum;
		$.ajax({
			type : 'POST',
			url : '/support',
			data : {
				"postNum" : postNum
			},
			success : function(result) {

				$("#content").empty();
				$("#content").append(result);
			},
			error : function(request, status, error) {

				alert("code:" + request.status + "\n" + "message:"
						+ request.responseText + "\n" + "error:" + error);
			}
		})
	}

	function intro(postNum) {
		var postNum = postNum;
		$.ajax({
			type : 'POST',
			url : '/intro',
			data : {
				"postNum" : postNum
			},
			success : function(result) {

				$("#content").empty();
				$("#content").append(result);
			},
			error : function(request, status, error) {

				alert("code:" + request.status + "\n" + "message:"
						+ request.responseText + "\n" + "error:" + error);
			}
		})
	}

	function admin(){
		$.ajax({
			type : 'POST',
			url : '/admin',
			success : function(result) {

				$("#content").empty();
				$("#content").append(result);
			},
			error : function(request, status, error) {

				alert("code:" + request.status + "\n" + "message:"
						+ request.responseText + "\n" + "error:" + error);
			}
		})
	}
</script>
<style>
ul, ol, li {
	list-style: none;
	margin: 0;
	padding: 0;
}

ul.main {
	color: white;
	background: rgb(8, 8, 61);
	width: 100%;
}

ul.main>li {
	display: inline-block;
	padding-top: 10px;
	padding-bottom: 10px;
	text-align: center;
	position: relative;
	width: 18%;
}

ul.main>li ul.sub {
	position: absolute;
	background: rgb(57, 57, 119);
	text-align: center;
	margin-top: 10px;
	width: 100%;
}

ul.main>li>a {
	text-decoration: none;
	color: white;
}

ul.main>li>ul>li>a {
	text-decoration: none;
	color: white;
}

ul.main>li ul.sub {
	display: none;
}

ul.main:hover ul.sub {
	display: block;
}

ul.main>li ul.sub>li {
	display: inline-block;
	padding: 10px 10px 0px 0px;
	text-align: center;
	position: relative;
	width: 240px;
}
</style>
</head>
<body>
	<div style="text-align: center;">
		<label><a href="/">MAIN</a></label><label>|</label> <label><a
			href="javascript:;" onclick="admin();">ADMIN</a></label>
	</div>
	<br>
	<div id="navHovBar">
		<ul class="main">
			<li class="main1 sub"><a href="/">HOME
					<ul class="main1Sub sub">
						<li style="color: rgb(57, 57, 119)">empty</li>
						<!--<li style="color: rgb(57, 57, 119)">empty</li>
						<li style="color: rgb(57, 57, 119)">empty</li>
						<li style="color: rgb(57, 57, 119)">empty</li>
						<li style="color: rgb(57, 57, 119)">empty</li>-->
					</ul>
			</a></li>
			<li class="main2">?????????
				<ul class="main2Sub sub">
					<c:forEach var="mento" items="${mento}">
						<li><a href="javascript:;"
							onclick="mento('${mento.postNum}');">${mento.title}</a></li>
						<!--??? ????????? forEach??? ????????? -->
					</c:forEach>
				</ul>
			</li>
			<li class="main3">????????????
				<ul class="main3Sub sub">
					<c:forEach var="empower" items="${empower}">
						<li><a href="javascript:;"
							onclick="empower('${empower.postNum}');">${empower.title}</a></li>
						<!--??? ????????? forEach??? ????????? -->
					</c:forEach>
				</ul>
			</li>
			<li class="main4">????????????
				<ul class="main4Sub sub">
					<c:forEach var="support" items="${support}">
						<li><a href="javascript:;"
							onclick="support('${support.postNum}');">${support.title}</a></li>
						<!--??? ????????? forEach??? ????????? -->
					</c:forEach>
				</ul>
			</li>
			<li class="main5">????????????
				<ul class="main5Sub sub">
					<c:forEach var="intro" items="${intro}">
						<li><a href="javascript:;"
							onclick="intro('${intro.postNum}');">${intro.title}</a></li>
						<!--??? ????????? forEach??? ????????? -->
					</c:forEach>
				</ul>
			</li>
		</ul>
	</div>
	<br>
	<span id="content">
		<h1 style="text-align: center;">???????????? ?????????.</h1>
		<p style="text-align: center;">????????? ????????? ?????????</p>
	</span>
</body>
</html>