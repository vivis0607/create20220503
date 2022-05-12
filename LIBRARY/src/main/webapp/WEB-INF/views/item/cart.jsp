<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
     <%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style type="text/css">
.cart_container{
	margin: 0 auto;
	margin-top: 30px;
	width: 80%;
}
.table{
	vertical-align: middle;
}
thead{
	font-weight: bold;
}
.priceDiv{
	width: 100%;
	margin: 0 auto;
	margin-top: 20px;
}
.priceTb{
	margin-left: 70%;
}
h3{
	text-align: center;
}
.buyBtn{
	float: right;
}
input[type="number"]{
	width: 80px;
	text-align: center;
}
</style>
</head>
<body>
<div class="cart_container">
	<h3>장바구니</h3>
	<div><input type="checkbox" id="chk" onclick="Allcheck();" checked> 전체선택 </div>
	<div>
		<table class="table table-border text-center">
			<colgroup>
				<col width="10%">
				<col width="10%">
				<col width="*%">
				<col width="15%">
				<col width="15%">
				<col width="15%">
				<col width="10%">
			</colgroup>
			<thead>
				<tr>
					<td colspan="3">상품명</td>
					<td>가격</td>
					<td>수량</td>
					<td>합계</td>
					<td>삭제</td>
				</tr>
			</thead>
			<tbody>
			<c:choose>
				<c:when test="${not empty cartList }">
					<c:forEach items="${cartList }" var="cart">
						<tr>
							<th style="text-align: left;"><input type="checkbox" class="chk" value="${cart.itemCode }" checked></th>
							<td><span>
								<img alt="..." src="/resources/images/item/${cart.itemAtImgName}" height="100px">
							</span></td>
							<td style="text-align: left; padding-left: 20px;"><span >
								${cart.itemName }
							</span></td>
							<td><div>
								<fmt:formatNumber value="${cart.itemPrice }" pattern="\#,###"/>
							</div></td>
							<td>
								<div style="margin-bottom: 8px;">
									<input type="number" value="${cart.itemCnt }" id="itemCnt" max="10">
								</div>
								<div>
									<button type="button" class="btn btn-success btn-m" style="height: 30px; width: 80px; padding-top: 2px;" onclick="turnCnt(this, '${cart.itemCode}', ${cart.itemPrice });">수정</button>
								</div>
							</td>
							<td class="totalPriceTd">
								<fmt:formatNumber value="${cart.totalPrice }" pattern="\#,###"/>
							</td>
							<td><span>
								<button type="button" class="btn btn-success btn-m" style="width: 80px;" onclick="deleteCart(this,'${cart.itemCode}');">삭제</button>
							</span></td>
						</tr>
					</c:forEach>
				</c:when>
				<c:otherwise>
					<tr>
						<td colspan="7"><div>장바구니에 담긴 상품이 없습니다</div></td>
					</tr>
				</c:otherwise>
			</c:choose>
			</tbody>
		</table>
	</div>
	<div class="priceDiv">
		<table class="priceTb">
			<tr>
				<td>총구매금액</td>
				<td>
					<div id="buyPriceDiv">
						<fmt:formatNumber value="${totalPrice }" pattern="\#,###"/>
					</div>
				</td>
			</tr>
			<tr>
				<td>배송료</td>
				<td><span>\ 0</span></td>
			</tr>
			<tr>
				<td>결재예정금액</td>
				<td>
					<div id="buytotalPriceDiv">
						<fmt:formatNumber value="${totalPrice }" pattern="\#,###"/>
					</div>
				</td>
			</tr>
		</table>
	</div>
	<hr>
	<div>
		<span>
			<button type="button" class="btn btn-success btn-m" onclick="deleteCarts();">선택삭제</button>
			<button type="button" class="btn btn-success btn-m" onclick="location.href='/cart/deleteAllCart';">장바구니비우기</button>
		</span>
		<span class="buyBtn">
			<button type="button" class="btn btn-success btn-m" onclick="location.href='/item/itemList';">쇼핑하기</button>
			<button type="button" class="btn btn-success btn-m" onclick="buy();">주문하기</button>
		</span>
	</div>
</div>
<script type="text/javascript" src="/resources/js/item/cart.js?var=15"></script>
</body>
</html>