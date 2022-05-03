<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style type="text/css">
img:hover{
	opacity: 0.7;
}
</style>
</head>
<body>
<div align="center">
<%-- 	<c:forEach items="${bookList }" var="book">
		<div class="col-3 text-center" style="margin-bottom: 16px;">
			<div class="card" style="width: 13rem; margin: 0 auto;">
			  <a href="/book/bookDetail?bookCode=${book.bookCode }"><img src="/resources/images/book/${book.bkImg }" class="card-img-top" alt="..." height="250px;"></a>
			  <div class="card-body" style="padding: 0.2rem 1.2rem;">
			    <h5 class="card-title">${book.title }</h5>
			    <p class="card-text">
			    </p>
			  </div>
			</div>
		</div>
	</c:forEach> --%>
<div>
	<form action="/book/searchBook" method="post" id="searchBook">
	<!-- 검색구분 선택 -->
	<label for="select">소장자료검색</label>
		<select name="searchSub">
			<option value="all" >전체</option>
			<option value="title">도서명</option>
			<option value="writer">저자</option>
			<option value="publisher">출판사</option>
			<option value="keyword">키워드</option>
		</select>
		<input type="text" name="searchTxt" placeholder="소장자료 검색">
		<input type="submit" value="검색">
	</form>
</div>

<c:forEach items="${bookList}" var="book">

<table>
	<tr>
		<h4><a href="/book/bookDetail?bookCode=${book.bookCode }">${book.title }</a></h4>
	</tr>
	<tr>
		<td colspan="4"><a href="/book/bookDetail?bookCode=${book.bookCode }&memId=${sessionScope.loginInfo.memId}"><img src="/resources/images/book/${book.bkImg }"  alt="..." height="120px;" width="80px;" ></a></td>
		<td>저자</td>
		<td>${book.writer }</td>
	</tr>
	<tr>
		<td>발행처<td>
		<td>${book.publisher }<td>
	</tr>
	<tr>
		<td>발행년<td>
		<td>${book.pubDate }<td>
	</tr>
	<tr>
		<td>ISBN<td>
		<td>${book.isbn }<td>
	</tr>
<%-- 	<tr>
		<td>대출여부<td>
		<td>
			<c:if test="${${book.staus} eq '0' } ">
				대출 가능
			</c:if>
		</td>
	</tr> --%>
	<tr>
		<td rowspan="3">
			${book.bkContent }
		</td>
	</tr>
	<tr>
		<td >
			*자료위치 ${book.area }
		</td>

	</tr>
</table>
</c:forEach>
</div>
</body>
</html>
