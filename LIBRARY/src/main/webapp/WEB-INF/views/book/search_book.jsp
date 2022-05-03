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
 <c:forEach items="${searchList }" var="search">
		
	
	<table>
	<tr>
		<h4><a href="/book/bookDetail?bookCode=${search.bookCode }">${search.title }</a></h4>
	</tr>
	<tr>
		<td colspan="4"><a href="/book/bookDetail?bookCode=${search.bookCode }&memId=${sessionScope.loginInfo.memId}"><img src="/resources/images/book/${search.bkImg }"  alt="..." height="120px;" width="80px;" ></a></td>
		<td>저자</td>
		<td>${search.writer }</td>
	</tr>
	<tr>
		<td>발행처<td>
		<td>${search.publisher }<td>
	</tr>
	<tr>
		<td>발행년<td>
		<td>${search.pubDate }<td>
	</tr>
	<tr>
		<td>ISBN<td>
		<td>${search.isbn }<td>
	</tr>
<%-- 	<tr>
		<td>대출여부<td>
		<td>
			<c:if test="${${search.staus} eq '0' } ">
				대출 가능
			</c:if>
		</td>
	</tr> --%>
	<tr>
		<td rowspan="3">
			${search.bkContent }
		</td>
	</tr>
	<tr>
		<td >
			*자료위치 ${search.area }
		</td>

	</tr>
</table>
</c:forEach>
	
	<%-- <c:forEach items="${searchList } " var="search">
		<div class="span-3 text-center">
		<img src="/resources/images/book/${search.bkImg }" class="card-img-top" alt="..." height="150px;">
		<h3>${search.title }</h3>
	<table>
		<tr>
			<td>저자</td>
			<td> ${search.writer }</td>
			<td>카테코드</td>
			<td>${search.cateCode }</td>
			<td>발행년도</td>
			<td>${search.pubDate }</td>
		</tr>
		<tr>
			<td>청구기호</td>
			<td>청구기호</td>
			<td>ISBN</td>
			<td>ISBN</td>
			<td>키워드</td>
			<td>${search.keyword }</td>
		</tr>
	</table>
		<button type="button" onclick="location.href='/book/selectStatus';">${search.status } </button>
	</div>
	</c:forEach>  --%>
</div>
</body>
</html>