<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>


	<%@ include file="../include/head.jsp" %>
	<%@ include file="../include/corejs_summernote.jsp" %>
	
	
	
	<!--   Core JS Files   -->

   <script src="/resources/assets/js/core/popper.min.js"></script>
   <script src="/resources/assets/js/core/bootstrap-material-design.min.js"></script>
   <script src="https://unpkg.com/default-passive-events"></script>
   <script src="/resources/assets/js/plugins/perfect-scrollbar.jquery.min.js"></script>
   <!-- Place this tag in your head or just before your close body tag. -->
  <script async defer src="https://buttons.github.io/buttons.js"></script>
    <!--  Google Maps Plugin    -->
  <script src="https://maps.googleapis.com/maps/api/js?key=YOUR_KEY_HERE"></script>
  <!-- Chartist JS -->
  <script src="/resources/assets/js/plugins/chartist.min.js"></script>
 
	<!--  Notifications Plugin    -->
  <script src="/resources/assets/js/plugins/bootstrap-notify.js"></script>
    <!-- Control Center for Material Dashboard: parallax effects, scripts for the example pages etc -->
  <script src="/resources/assets/js/material-dashboard.js?v=2.1.0"></script>
	
	
	
	
	
	
	
	
	

	<!-- 썸머노트 헤더 -->
	<script src="/resources/assets/js/summernote-lite.js"></script>
	<script src="/resources/assets/js/summernote-ko-KR.js"></script>	
	<link rel="stylesheet" href="/resources/assets/css/summernote-lite.css">
	<title>글쓰기</title>
	
	<meta charset="utf-8">

	<script>
		$(document).ready(function() {
			//여기 아래 부분
			$('#summernote').summernote({
				  height: 300,                 // 에디터 높이
				  minHeight: null,             // 최소 높이
				  maxHeight: null,             // 최대 높이
				  focus: true,                  // 에디터 로딩후 포커스를 맞출지 여부
				  lang: "ko-KR",					// 한글 설정
				  placeholder: '최대 2048자까지 쓸 수 있습니다'	//placeholder 설정
		          
			});
		});
	</script>
</head>
<body>
	<!-- form 안에 에디터를 사용하는 경우 (보통 이경우를 많이 사용하는듯)-->
	<form method="post">
		<input type="text" name="title" placeholder="제목입력">
	  	<textarea id="summernote" name="editordata"></textarea>
	</form>	
</body>
</html>