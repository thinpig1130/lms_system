<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page session="false"%>
<html>
<head>
<%@ include file="../include/head.jsp"%>
	<script>
		$(document).ready(function() {
			
			$('#select_course').on('change',function(){
				location.href="/admin/contents?course="+this.value;
			});
			
			$('#select_category').on('change',function(){
				let str = "/admin/contents?category="+this.value;
				location.href=str;
			});
			
			$('#select_subcategory').on('change',function(){
				let str = "/admin/contents?subcategory="+this.value;
				location.href=str;
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
					<!-- your content here -->
					<form action="/admin/contents_form" method="post">
						<div class="row container-fluid">
							<div class="form-group col-md-3">
								<label for="inputState">과정선택</label> <select id="select_course"
									name="course" class="form-control">
									<option value="" selected disabled hidden>== 과정 선택 ==</option>
									<c:forEach items="${courses}" var="course">
										<option value="${course.code}"
											${cur_course.code==course.code?"selected":""}>(
											${course.code} ) ${course.name}</option>
									</c:forEach>
								</select>
							</div>
							<div class="form-group col-md-3">
								<label for="inputState">대분류</label> <select id="select_category"
									name="category" class="form-control">
									<option value="" selected disabled hidden>== 분류 선택 ==</option>
									<c:forEach items="${categorys}" var="category">
										<option value="${category.code}"
											${cur_category.code==category.code?"selected":""}>(
											${category.code} ) ${category.name}</option>
									</c:forEach>
								</select>
							</div>
							<div class="form-group col-md-3">
								<label for="inputState">소분류</label> <select
									id="select_subcategory" name="subcategory" class="form-control">
									<option value="" selected disabled hidden>== 소분류 선택 ==</option>
									<c:forEach items="${sub_categorys}" var="subcategory">
										<option value="${subcategory.code}" ${cur_subcategory.code==subcategory.code?"selected":""}>
											(${subcategory.code} ) ${subcategory.name}</option>
									</c:forEach>
								</select>
							</div>
							<div class="form-group col-md-2">
								<button type="submit" class="btn btn-primary pull-right">
									새 학습 등록
								</button>
							</div>
						</div>
					</form>

					<div class="col-md-12">
						<div class="card card-plain">
							<div class="card-header card-header-primary">
								<div class="row container-fluid">
									<c:if test="${empty cur_course.code}">
										<p class="card-category"> 분류를 선택하세요! &nbsp;&nbsp;&nbsp;&nbsp; </p>
										<p class="card-category"> >> &nbsp;&nbsp;&nbsp;&nbsp; 선택된 분류에 해당되는 목록을 보여줍니다. </p>
									</c:if>
									<c:if test="${not empty cur_course.code}">
										<p class="card-category">&nbsp;&nbsp;${cur_course.name}(${cur_course.code})</p>
									</c:if>
									<c:if test="${not empty cur_category.code}">
										<p class="card-category">
											&nbsp;&nbsp;&nbsp;&nbsp;>>&nbsp;&nbsp;&nbsp;&nbsp;${cur_category.name}(${cur_category.code})
										</p>
									</c:if>
									<c:if test="${not empty cur_subcategory.code}">
										<p class="card-category">
											&nbsp;&nbsp;&nbsp;&nbsp;>>&nbsp;&nbsp;&nbsp;&nbsp;${cur_subcategory.name}(${cur_subcategory.code})
										</p>
									</c:if>						
								</div>
							</div>
							<div class="card-body">
								<div class="table-responsive">
									<table class="table table-hover">
										<thead class="">
											<tr>
												<th>과정명</th>
												<th>분류명</th>
												<th>소분류명</th>
												<th>학습제목</th>
												<th class="text-center">중요도</th>
												<th class="text-center">문제수</th>
											</tr>
										</thead>
										<tbody>
											<c:forEach items="${lists}" var="list">
											<tr>
												<td>${list.coName}</td>
												<td>${list.caName}</td>
												<td>${list.subName}</td>
												<td><a href="/admin//contents/details?code=${list.code}"> ${list.title} </a></td>
												<td class="">
													<div class="row d-flex justify-content-center">
													<c:forEach var="i" begin="1" end="${4-list.importance}" step="1">
														<span class="material-icons">star_rate</span>
													</c:forEach>
													</div>
												</td>
												<td class="text-center"> ${list.qCount} </td>
											</tr>
											</c:forEach>
										</tbody>
									</table>
								</div>
							</div>
						</div>
					</div>
	
					<div class="row container-fluid d-flex justify-content-center">
						<c:forEach var="i" begin="1" end="${maxpage}" step="1">
							<a href="/admin/contents?page=${i}&course=${cur_course.code}
								&category=${cur_category.code}&subcategory=${cur_subcategory.code}" 
								class="btn btn-primary btn-sm ${i==page?'btn-round':'btn-link'}">${i}</a>
						</c:forEach>
					</div>

				</div>
			</div>
			<%@ include file="../include/m_footer.jsp"%>
		</div>
	</div>
	<%@ include file="../include/corejs.jsp"%>
</body>
</html>
