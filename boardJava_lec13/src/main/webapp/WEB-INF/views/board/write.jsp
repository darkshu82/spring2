<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %> 
<c:set var="root" value="${pageContext.request.contextPath}/" /> 
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>tjoeun</title>

<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.1.0/css/bootstrap.min.css">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.0/umd/popper.min.js"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.1.0/js/bootstrap.min.js"></script>
</head>
<style>
  .errors { color:red; font-size:14px; font-weight:bold; }
</style>

<body>

<c:import url="/WEB-INF/views/include/top_menu.jsp"/>

<div class="container" style="margin-top:100px">
	<div class="row">
		<div class="col-sm-3"></div>
		<div class="col-sm-6">
			<div class="card shadow">
				<div class="card-body">
					<form:form action="${root }board/write_procedure" 
					           modelAttribute="writeContentDTO" method="post"
					           enctype="multipart/form-data">
					<form:hidden path="content_board_idx"  />           
					<div class="form-group">
						<form:label path="content_subject">제목</form:label>
						<form:input type="text" path="content_subject" class="form-control"/>
						<form:errors path="content_subject" class="errors"/>
					</div>
					<div class="form-group">
						<form:label path="content_text">내용</form:label>
						<form:textarea path="content_text" class="form-control" rows="10" style="resize:none" />
						<form:errors path="content_text" class="errors"/>
					</div>
					<div class="form-group">
						<form:label path="content_file">첨부 이미지</form:label>
						<form:input type="file" path="uploadFile" class="form-control" accept="images/*" />
					</div>
					<div class="form-group">
						<div class="text-right">
							<form:button class="btn btn-primary">작성하기</form:button>
						</div>
					</div>
					
					</form:form>
				</div>
			</div>
		</div>
		<div class="col-sm-3"></div>
	</div>
</div>

<c:import url="/WEB-INF/views/include/bottom_menu.jsp"/>

</body>
</html>