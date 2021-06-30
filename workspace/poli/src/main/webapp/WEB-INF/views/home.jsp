<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page session="false"%>
<html>
<head>
<title>main</title>
<script src="https://cdnjs.cloudflare.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
<script>
	function mento(postNum){
		
		var data = postNum;
		alert(data);
		$.ajax({
			type:'POST',
			url:'/mento',
			data: data,
			success:function(result){
				$("#content").empty();
				$("#content").append(result);
			},
			error:function(request, status, error){

				alert("code:"+request.status+"\n"+"message:"+request.responseText+"\n"+"error:"+error);

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
		<label><a href="/">MAIN</a></label> <label>|</label> <label><a
			href="#">ADMIN</a></label>
	</div>
	<br>
	<div id="navHovBar">
		<ul class="main">
			<li class="main1 sub"><a href="/">HOME
					<ul class="main1Sub sub">
						<li style="color: rgb(57, 57, 119)">empty</li>
						<li style="color: rgb(57, 57, 119)">empty</li>
						<li style="color: rgb(57, 57, 119)">empty</li>
						<li style="color: rgb(57, 57, 119)">empty</li>
						<li style="color: rgb(57, 57, 119)">empty</li>
					</ul>
			</a></li>
			<li class="main2">멘토링
				<ul class="main2Sub sub">
					<c:forEach var="mento" items="${mento}">
						<li><a href="" onclick="mento('${mento.postNum}');">${mento.title}</a></li><!--멘토링 테이블의 글 목록이 forEach로 들어옴 -->
					</c:forEach>
					<!-- <li><a href="#">멘토 특강</a></li>
					<li><a href="#">온라인 취업 멘토링</a></li>
					<li><a href="#">오프라인 멘토링</a></li>
					<li><a href="#">청년희망 멘토링</a></li> -->
				</ul> 
			</li>
			<li class="mai n3">역량강화
				<ul class= "main3Sub sub">
					<li><a href="#">청년 일경험 지원</a></li>
					<li><a href="#">청년주도형 학습매니저</a></li>
					<li><a href="#">청년 학교</a></li>
					<li><a href="#">청년 프로젝트 실험실</a></li>
					<li style="color: rgb(57, 57, 119)">empty</li>
				</ul>
			</li>
			<li class="main4">취업지원
				<ul class="main4Sub sub">
					<li><a href="#">청년맞춤형지원</a></li>
					<li><a href="#">청년학자금상환 플랫폼</a></li>
					<li><a href="#">청년일자리제안</a></li>
					<li><a href="#">청년공간 이용 안내</a></li>
					<li><a href="#">일자리 한눈에 보기</a></li>
				</ul>
			</li>
			<li class="main5">재단소개
				<ul class="main5Sub sub">
					<li><a href="#">설립취지</a></li>
					<li><a href="#">사업소개</a></li>
					<li><a href="#">가구조직</a></li>
					<li style="color: rgb(57, 57, 119)">empty</li>
					<li style="color: rgb(57, 57, 119)">empty</li>
				</ul>
			</li>
		</ul>
	</div>
	<br>
	<div id="content">
		<h1 style="text-align: center;">청년재단 입니다.</h1>
		<p style="text-align: center;">메뉴를 클릭해 주세요</p>
	</div>
</body>
</html>