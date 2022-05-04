<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link href="/resources/css/member/menu.css" rel="stylesheet">
</head>
<body>
<div class="top-container">
	<header>
		<div class="header-loginBox">
			<c:choose>
				<c:when test="${not empty sessionScope.loginInfo}">
					<div class="header-loginBoxDiv" id="weather">
						<span></span>
						<span class="weatherIcon"><i class="fa-solid fa-sun"></i></span>
						<span></span>
					</div>
					<div class="header-loginBoxDiv" onclick="location.href='/member/logout';">로그아웃</div>
				</c:when>
				<c:otherwise>
					<div class="header-loginBoxDiv" onclick="location.href='/member/login';">로그인</div>
					<div class="header-loginBoxDiv" onclick="location.href='/member/join';">회원가입</div>
				</c:otherwise>
			</c:choose>
		</div>
		<div class="header-mainBox">
			<div class="nav-logoDiv"><a href="/admin/test"><h1>양심<br>도서관</h1></a></div>
			<c:if test="${not empty sessionScope.loginInfo }">
				<div class="header-profile">
					<div><img alt="" src="/resources/images/member/${loginInfo.memImage }"></div>
					<div>
						<div>${sessionScope.loginInfo.memName}님 반가워요!</div>
						<div class="header-profile-myPage" onclick="location.href='/member/myPageDetail?memId=${sessionScope.loginInfo.memId}'">
							마이 페이지
						</div>
					</div>
				</div>
			</c:if>
		</div>
	</header>
	<nav>
		<div class="nav-main-menu">
			<ul>
				<li>도서관소개</li>
				<li>
				<a href="/book/list">자료검색</a></li>
				<li>도서관이용</li>
				<li>참여마당
					<ul>
						<li><a href="/board/ntBoardList">공지사항</a></li>
						<li><a href="/otherB/freeBoard">자유게시판</a></li>
						<li><a href="/otherB/qnaBoard">Q&A</a></li>
					</ul>
				</li>
				<li>
				<a href="/item/itemList">Goods</a></li>
				<li>
				<a href="/club/clubList">독서모임</a></li>
			</ul>
		</div>
	</nav>
</div>
<script type="text/javascript" src="/resources/js/member/menu.js?ver=3"></script>
<script type="text/javascript" src="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.1.1/js/all.min.js"></script>
</body>
</html>