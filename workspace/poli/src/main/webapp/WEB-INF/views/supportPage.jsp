<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<html>
<head>
<title>support Page</title>
</head>
<body>
	<div>
		<label style="float: left;">글번호 : ${post[0].postNum}</label> <label
			style="float: right">${post[0].regDate} | 조회수: ${post[0].views}</label>
	</div>
	<div style="text-align: center;">
		<label style="font-size: x-large;">${post[0].title}</label>
	</div>
	<hr>
	<br> ${post[0].content}
</body>
</html>