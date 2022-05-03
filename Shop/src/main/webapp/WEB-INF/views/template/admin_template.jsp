<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="tiles" uri="http://tiles.apache.org/tags-tiles" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>
<tiles:insertAttribute name="title"/>
</title>
<!-- 부트스트랩 css -->
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
<!-- 공통 적용 css -->
<link href="/resources/css/common/common.css" rel="stylesheet">
<!-- jquery 사용을 위한 태그 -->
<script src="https://code.jquery.com/jquery-latest.min.js"></script>
<!-- 부트스트랩 js -->
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-ka7Sk0Gln4gmtz2MlQnikT1wXgYsOg+OMhuP+IlRH9sENBO0LRn5q+8nbTov4+1p" crossorigin="anonymous"></script>
</head>
<body>
<div class="container-fluid">
	<div class="row">
		<div class="col">
			<tiles:insertAttribute name="menu"/>
		</div>
	</div>
	<div style="height: 16px;"></div>
	<div class="row">
		<div class="col-3">
			<tiles:insertAttribute name="side"/>
		</div>
		<div class="col-9">
			<tiles:insertAttribute name="body"/>
		</div>
	</div>
</div>
</body>
</html>
















