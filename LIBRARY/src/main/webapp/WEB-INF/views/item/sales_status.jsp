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
.DayBoxDiv{
	border: 2px solid #F6F6F6;
	border-radius: 3px;
	margin: 0 auto;
}
.StateBoxDiv{
	border: 2px solid #F6F6F6;
	border-radius: 3px;
	margin: 0 auto;
}
.SalesStatusContainer{
margin: 0 auto;
padding: 20px;
}
</style>
</head>
<body>
<div class="row SalesStatusContainer">
<div class="col-12 ">
	<div class="row">
		<span>매출현황</span><br>
		<div class="col-3 DayBoxDiv">
			<div>
			<fmt:formatNumber value="${salesDay.totalPrice }" pattern="#,###"/>원</div>
			<div class="row">
				<div class="col-6">오늘</div>			
				<div class="col-6"><fmt:formatNumber value="${salesDay.orderCnt }" pattern="#,###"/> 건</div>			
			</div>
		</div>
		<div class="col-3 DayBoxDiv">
			<div><fmt:formatNumber value="${salesWeek.totalPrice }" pattern="#,###"/>원</div>
			<div class="row">
				<div class="col-6">이번주</div>			
				<div class="col-6"><fmt:formatNumber value="${salesWeek.orderCnt }" pattern="#,###"/> 건</div>			
			</div>
		</div>
		<div class="col-3 DayBoxDiv">
			<div><fmt:formatNumber value="${salesMonth.totalPrice }" pattern="#,###"/>원</div>
			<div class="row">
				<div class="col-6">이번달</div>			
				<div class="col-6"><fmt:formatNumber value="${salesMonth.orderCnt }" pattern="#,###"/>건</div>			
			</div>
		</div>
		<div class="col-3 DayBoxDiv">
			<div><fmt:formatNumber value="${salesYear.totalPrice}" pattern="#,###"/> 원</div>
			<div class="row">
				<div class="col-6">올해</div>			
				<div class="col-6"><fmt:formatNumber value="${salesYear.orderCnt}" pattern="#,###"/> 건</div>			
			</div>
		</div>
	</div>
	<div class="row">
		<div class="col-4 StateBoxDiv">
			<div class="row">
				<div class="col-12">
					<span> 상품준비중 </span> <span><fmt:formatNumber value="${itemPre.orderCnt}" pattern="#,###"/></span>건
				</div>
				<div class="col-12">
					<span><fmt:formatNumber value="${itemPre.totalPrice}" pattern="#,###"/></span>원
				</div>
			</div>
			<div class="row">
				<div class="col-12">
					<span> 배송준비중 </span> <span><fmt:formatNumber value="${deliPre.orderCnt}" pattern="#,###"/></span>건<br>
				</div>
				<div class="col-12">
					<span><fmt:formatNumber value="${deliPre.totalPrice}" pattern="#,###"/></span>원
				</div>
			</div>
		</div>
		<div class="col-4 StateBoxDiv">
			<div class="row">결제완료</div>
			<div class="row"><fmt:formatNumber value="${payFin.orderCnt}" pattern="#,###"/>건</div>
			<div class="row"><fmt:formatNumber value="${payFin.totalPrice}" pattern="#,###"/>원</div>
		</div>
		<div class="col-4 StateBoxDiv">
			<div class="row">
				<div class="col-6">
					<span> 배송처리 </span> <span><fmt:formatNumber value="${deliPro.orderCnt}" pattern="#,###"/>건</span><br>
					<span><fmt:formatNumber value="${deliPro.totalPrice}" pattern="#,###"/></span>원
				</div>
				<div class="col-6">
					<span> 배송완료 </span> <span><fmt:formatNumber value="${deliFin.orderCnt}" pattern="#,###"/>건</span><br>
					<span><fmt:formatNumber value="${deliFin.totalPrice}" pattern="#,###"/></span>원
				</div>
			</div>
			<div class="row">
				<div class="col-12">
					<span> 취소요청 </span> <span><fmt:formatNumber value="${cancle.orderCnt}" pattern="#,###"/>건</span><br>
					<span><fmt:formatNumber value="${cancle.totalPrice}" pattern="#,###"/></span>원
				</div>
			</div>
		</div>
	</div>
	<div>
		<form action="/sales/sByItemStatePeriod" method="post">
			<input type="date">
			<button>조회</button>
		</form>
	</div>
	<div class="row">
		<div class="col-12">
			<div>매출현황그래프자리</div>
			<canvas id="myChart" width="300" height="200"></canvas>
		</div>
	</div>
	<div class="row">
		<div class="col-12">
			시간별 매출현황그래프자리
		</div>
	</div>
</div>	
</div>


<script src="//code.jquery.com/jquery-1.11.1.min.js"></script>
<script src="//cdnjs.cloudflare.com/ajax/libs/Chart.js/0.2.0/Chart.min.js"></script>
<script type="text/javascript" src="/resources/js/item/sales_status.js"></script>
</body>
</html>