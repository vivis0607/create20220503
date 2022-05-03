<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style type="text/css">
	.loginForm-box{
		width: 60%;
		margin: 4rem auto;
		padding-top: 4.5rem;
		border: 5px solid #FAF1CF;
		border-radius: 20px;
	}
	.loginTitle{
		color: #EDDFC2;
		font-weight: bold;
		font-size: 1.5rem;
		display: inline-block;
		padding: 1rem;
		background-color: white;
		position: absolute;
		left: 47%;
		bottom: 59.5%;
	}
	.loginForm-box input[type="text"], .loginForm-box input[type="password"]{
		display: block;
		margin: 5px auto;
		width: 60%;
		height: 3rem;
		border: none;
		
	}
	.loginForm-box input[type="text"], .loginForm-box input[type="password"]:focus {
		background-color: #E8F0FE;
		outline: none;
	}
	
	button{
		background: none;
		  border: 0;
		  box-sizing: border-box;
		  width: 7rem;
		  margin: 2rem auto;
		  display: block;
		  padding: 0.7rem 1.7rem;
		  
		  box-shadow: inset 0 0 0 2px #02475E;
		  color: #02475E;
		  font-size: inherit;
		  font-weight: 700;
		
		  position: relative;
		  vertical-align: middle;
		
		}
	
	
	
</style>
</head>
<body>
<div class="container">
	<div class="loginTitle">LOGIN</div>
	<div class="loginForm-box">
		<form action="" method="post">
			<input type="text" name="memId" placeholder="아이디 입력">
			<input type="password" name="memPwd" placeholder="비밀번호 입력">
			<button type="button" onclick="login();">로그인</button>
			<span></span>
		</form>
		<a href="/member/findId">
		아이디 찾기
		</a> 
		<a href="/member/findPwd">
		비밀번호 찾기
		</a>
		
	</div>
</div>
<script type="text/javascript" src="/resources/js/member/login_form.js?ver=7"></script>
</body>
</html>