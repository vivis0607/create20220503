<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style type="text/css">
.container{
	text-align: center;
	width: 800px;
}
.boardDiv table{
	border: 1px solid black;
	border-collapse: collapse;
	width: 800px;
	margin-top: 10px;
	text-align: center;
	margin-bottom: 30px;
}
.boardDiv table td{
	border: 1px solid black;
}
.clubInfo{
	text-align: left;
	margin-bottom: 20px;
}
.memListTable{
	text-align: center;
}
table{
	width: 800px;
}
</style>
</head>
<body>
<div class="container">
	<div class="clubInfo">
		<table>
			<tr>
				<td>
					모임명 : ${club.clubName } <br>
					모임 인원수 : ${club.clubHeadCnt }<br>
					모임장 : ${club.memName }<br>
					모임소개 : ${club.clubIntro }
				</td>
				<td style="text-align: right;">
					<c:forEach items="${memList }" var="mem" >
					<img alt="" src="/resources/images/member/${mem.memImage }" style="width: 30px; border-radius: 70%;">
						${mem.memName }
						완독수<br>
					</c:forEach>
				</td>
			</tr>
		</table>
	</div>
	<div style="text-align: right;">
		<c:if test="${not empty sessionScope.loginInfo }">
			<input type="button" value="글쓰기" onclick="location.href='/club/clubBoardWrite?clubCode=${club.clubCode}';">
		</c:if>
		<c:if test="${sessionScope.loginInfo.clubAdmin eq 'Y' }">
			<input type="button" value="수정" onclick="location.href='/club/clubDetailUpdate?clubCode=${club.clubCode}';">
		</c:if>
	</div>
	<div class="boardDiv">
		<table>
		<colgroup>
			<col width="10%">
			<col width="*">
			<col width="10%">
			<col width="20%">
			<thead>
			<tr>
				<td>No</td>
				<td>제목</td>
				<td>작성자</td>
				<td>날짜</td>
			</tr>
			</thead>
			<tbody>
			<c:choose>
				<c:when test="${not empty boardList}">
					<c:forEach items="${boardList }" var="boardInfo" varStatus="status">
						<tr>
							<td>${clubBoardVO.totalCnt - boardInfo.rowNum + 1 }</td>
							<c:choose>
								<c:when test="${sessionScope.loginInfo.clubCode eq boardInfo.clubCode }">
									<td><a href="/club/clubBoardDetail?cbBoardNum=${boardInfo.cbBoardNum }&&clubCode=${boardInfo.clubCode}">${boardInfo.cbBoardTitle } (${boardInfo.cbCmtCount })</a></td>
								</c:when>
								<c:otherwise>
									<td><a href="" onclick="cbDetail();">${boardInfo.cbBoardTitle } (${boardInfo.cbCmtCount })</a></td>
								</c:otherwise>
							</c:choose>
							<td>${boardInfo.memName }</td>
							<td>${boardInfo.cbBoardDate }</td>
						</tr>
					</c:forEach>
				</c:when>
				<c:otherwise>
					<tr>
						<td colspan="4">
							등록된 게시글이 없습니다.
						</td>
					</tr>
				</c:otherwise>
			</c:choose>
			</tbody>
		</table>
	</div>
	<div class="row">
		<div class="col">
			<nav aria-label="Page navigation example">
				<ul class="pagination pagination-sm justify-content-center">
					<li class="page-item <c:if test="${!clubBoardVO.prev }">disabled</c:if>">
					<a class="page-link" href="/club/clubDetail?nowPage=${clubBoardVO.beginPage - 1 }&&clubCode=${clubBoardVO.clubCode }"
						aria-label="Previous"> <span aria-hidden="true">&laquo;</span>
					</a></li>
					<c:forEach begin="${clubBoardVO.beginPage }" end="${clubBoardVO.endPage }" var="pageIndex">
							<li class="page-item <c:if test="${clubBoardVO.nowPage eq pageIndex }">active</c:if>"><a class="page-link" 
							href="/club/clubDetail?nowPage=${pageIndex }&&clubCode=${clubBoardVO.clubCode }">${pageIndex }</a></li>
						</c:forEach>
					<li class="page-item <c:if test="${!clubBoardVO.next }">disabled</c:if>"><a class="page-link" href="/club/clubDetail?nowPage=${clubBoardVO.endPage + 1 }&&clubCode=${clubBoardVO.clubCode }"
						aria-label="Next"> <span aria-hidden="true">&raquo;</span>
					</a></li>
				</ul>
			</nav>
		</div>
	</div>
	<div class="row">
		<div class="col-6">	
			<form action="/club/clubDetail" method="post" id="searchForm">
			<input type="hidden" value="1" id="nowPage" name="nowPage">
			<input type="hidden" name="clubCode" value="${clubBoardVO.clubCode }">
				<select id="sort" name="sort" <c:if test="${clubBoardVO.sort eq 'MEM_NAME'}">selected</c:if>>
					<option value="CB_BOARD_TITLE">제목</option>
					<option value="MEM_NAME">작성자</option>
				</select>
				<input type="text" name="keyword" value="${clubBoardVO.keyword }">
				<button type="submit" class="btn btn-secondary">검색</button>
			</form>
		</div>
	</div>	
	</div>
<script type="text/javascript" src="/resources/js/club/club_detail.js"></script>
</body>
</html>