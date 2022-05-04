<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<table>
			<thead>
				<tr>
					<td>No</td>
					<td>회원아이디</td>
					<td>제목</td>
					<td>저자</td>
					<td>출판사</td>
					<td>신청일</td>
					<td>상태</td>
				</tr>
			</thead>
			<tbody>
				<c:forEach items="${hbBook }" var="hbBook">
					<tr>
						<td>${hbBook.rowNum }</td>
						<td>${hbBook.memId }</td>
						<td>${hbBook.title }</td>
						<td>${hbBook.writer }</td>
						<td>${hbBook.publisher }</td>
						<td>${hbBook.hopeDate }</td>
						<td><c:choose>
							<c:when test="${hbBook.status eq 0}">승인대기</c:when>
							<c:when test="${hbBook.status eq 1 }">처리중</c:when>
							<c:otherwise>소장중</c:otherwise>	
						</c:choose></td>
	 				</tr>
				</c:forEach>
			</tbody>
		</table>
</body>
</html>