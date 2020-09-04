<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>

<head>
<%@ include file="../include/head.jsp"%>

<!-- 썸머노트 헤더 -->
<script src="/resources/assets/js/summernote-lite.js"></script>
<script src="/resources/assets/js/summernote-ko-KR.js"></script>
<link rel="stylesheet" href="/resources/assets/css/summernote-lite.css">

<script>
	$(document)
			.ready(
					function() {
						//여기 아래 부분
						$('#summernote').summernote({
							height : 300, // 에디터 높이
							minHeight : null, // 최소 높이
							maxHeight : null, // 최대 높이
							focus : true, // 에디터 로딩후 포커스를 맞출지 여부
							lang : "ko-KR", // 한글 설정
							placeholder : '최대 2048자까지 쓸 수 있습니다' //placeholder 설정

						});

						$('#select_course')
								.on(
										'change',
										function() {
											location.href = "/admin/contents_form?course="
													+ this.value;
										});

						$('#select_category')
								.on(
										'change',
										function() {
											let str = "/admin/contents_form?course=${cur_course.code}&category="
													+ this.value;
											location.href = str;
										});

						$('#select_subcategory')
								.on(
										'change',
										function() {
											let str = "/admin/contents_form?course=${cur_course.code}&category=${cur_category.code}&subcategory="
													+ this.value;
											location.href = str;
										});						
					});
</script>
</head>

<body class="dark-edition">
	<div class="wrapper ">
		<%@ include file="../include/m_sidebar.jsp"%>
		<div class="main-panel">
			<%@ include file="../include/m_topbar.jsp"%>
			<div class="content">
				<div class="container-fluid">
					<form action="/admin/contents/regist" method="post">
						<div class="row container-fluid">
							<div class="form-group col-md-4">
								<label for="inputState">과정선택</label> <select id="select_course"
									name="cocode" class="form-control" ${cur_course.name==null?"":"readonly"}>
									<option value="" selected disabled hidden>== 과정 선택 ==</option>
									<c:forEach items="${courses}" var="course">
										<option value="${course.code}"
											${cur_course.code==course.code?"selected":""}>(
											${course.code} ) ${course.name}</option>
									</c:forEach>
								</select>
							</div>
							<div class="form-group col-md-4">
								<label for="inputState">대분류</label> <select id="select_category"
									name="cacode" class="form-control" ${cur_category.name==null?"":"readonly"}>
									<option value="" selected disabled hidden>== 분류 선택 ==</option>
									<c:forEach items="${categorys}" var="category">
										<option value="${category.code}"
											${cur_category.code==category.code?"selected":""}>(
											${category.code} ) ${category.name}</option>
									</c:forEach>
								</select>
							</div>
							<div class="form-group col-md-4">
								<label for="inputState">소분류</label> <select
									id="select_subcategory" name=subcode class="form-control" ${cur_subcategory.name==null?"":"readonly"}>
									<option value="" selected disabled hidden>== 소분류 선택 ==</option>
									<c:forEach items="${sub_categorys}" var="subcategory">
										<option value="${subcategory.code}"
											${cur_subcategory.code==subcategory.code?"selected":""}>
											(${subcategory.code} ) ${subcategory.name}</option>
									</c:forEach>
								</select>
							</div>
						</div>
						
						<c:if test="${not empty cur_subcategory.name}">
						
						<br>
						<div class="form-group">
							<label for="inputState">&nbsp; * &nbsp;중요도&nbsp; ▶ </label>&nbsp;&nbsp;&nbsp;
							|&nbsp;
							<div class="form-check form-check-radio form-check-inline">
								<label class="form-check-label"> <input
									class="form-check-input" type="radio" name="importance"
									value="1" checked>높음 <span class="circle"> <span
										class="check"></span>
								</span>
								</label>
							</div>
							|&nbsp;
							<div class="form-check form-check-radio form-check-inline">
								<label class="form-check-label"> <input
									class="form-check-input" type="radio" name="importance"
									value="2"> 중간 <span class="circle"> <span
										class="check"></span>
								</span>
								</label>
							</div>
							|&nbsp;
							<div
								class="form-check form-check-radio form-check-inline">
								<label class="form-check-label"> <input
									class="form-check-input" type="radio" name="importance"
									value="3"> 낮음 <span class="circle"> <span
										class="check"></span>
								</span>
								</label>
							</div>
							|&nbsp;
						</div>
						<div class="form-group">
							<label class="bmd-label-floating">학습 대표 제목 </label> <input
								type="text" class="form-control" name="title">
						</div>
						<textarea id="summernote" name="contents"></textarea>
						<button id="submit" type="submit" class="btn btn-primary pull-right">등록</button>
						
						</c:if>

					</form>
				</div>
			</div>
			<%@ include file="../include/m_footer.jsp"%>
		</div>
	</div>

	<%@ include file="../include/corejs_summernote.jsp"%>
</body>
</html>
