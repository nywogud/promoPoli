<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page session="false"%>
<html>
<head>
<title>main</title>
<style>
ul, ol, li {
	list-style: none;
}

ul.main {
	color: white;
	background: rgb(8, 8, 61);
	width: 100%;
	padding: 0px 0px 0px 0px;
}

ul.main>li {
	display: inline-block;
	width: auto;
	padding: 10px 100px;
	text-align: center;
	position: relative;
}

ul.main>li ul.sub { 
	position: absolute;
	background: rgb(57, 57, 119);
	margin: 10px 0px 0px 0px;
	width:100%;
}

ul.main > li ul.sub{display: none;}
ul.main:hover ul.sub{ display:block;}

ul.main>li ul.sub>li {
	display: inline-block;
	padding: 10px 10px 0px 0px;
	text-align: center;
	position: relative;
	width: 100%;
}
</style>
</head>
<body>
	<div style="text-align: center;">
		<label><a href="/">MAIN</a></label><label>|</label> <label><a href="#">ADMIN</a></label>
	</div>
	<div id="navHovBar">
		<ul class="main">
			<li class="main1">HOME
				<ul class="main1Sub sub">
					<li style="color:rgb(57, 57, 119)">empty</li>
					<li style="color:rgb(57, 57, 119)">empty</li>
					<li style="color:rgb(57, 57, 119)">empty</li>
					<li style="color:rgb(57, 57, 119)">empty</li>
					<li style="color:rgb(57, 57, 119)">empty</li>
				</ul>
			</li>
			<li class="main2">멘토링
				<ul class="main2Sub sub">
					<li><a>멘토링 안내</a></li>
					<li><a>멘토 특강</a></li>
					<li><a>온라인 취업 멘토링</a></li>
					<li><a>오프라인 멘토링</a></li>
					<li><a>청년희망 멘토링</a></li>
				</ul>
			</li>
			<li class="main3">역량강화
				<ul class="main3Sub sub">
					<li><a>청년 일경험 지원</a></li>
					<li><a>청년주도형 학습매니저</a></li>
					<li><a>청년 학교</a></li>
					<li><a>청년 프로젝트 실험실</a></li>
					<li style="color:rgb(57, 57, 119)">empty</li>
				</ul>
			</li>
			<li class="main4">취업지원
				<ul class="main4Sub sub">
					<li><a>청년맞춤형지원</a></li>
					<li><a>청년학자금상환 플랫폼</a></li>
					<li><a>청년일자리제안</a></li>
					<li><a>청년공간 이용 안내</a></li>
					<li><a>일자리 한눈에 보기</a></li>
				</ul>
			</li>
			<li class="main5">재단소개
				<ul class="main5Sub sub">
					<li><a>설립취지</a></li>
					<li><a>사업소개</a></li>
					<li><a>가구조직</a></li>
					<li style="color:rgb(57, 57, 119)">empty</li>
					<li style="color:rgb(57, 57, 119)">empty</li>
				</ul>
			</li>
		</ul>
	</div>
</body>
</html>
