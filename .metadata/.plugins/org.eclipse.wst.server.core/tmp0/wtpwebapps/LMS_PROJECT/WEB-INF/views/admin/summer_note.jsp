<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
  	<meta content="width=device-width, initial-scale=1.0, maximum-scale=1.0, user-scalable=0" name="viewport" />
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
  	<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1" />
	
	<!--     Fonts and icons     -->
	<link rel="stylesheet" type="text/css" href="https://fonts.googleapis.com/css?family=Roboto:300,400,500,700|Roboto+Slab:400,700|Material+Icons" />
	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/font-awesome/latest/css/font-awesome.min.css">
	
	<!-- include libraries(jQuery, bootstrap) -->
	<link href="http://netdna.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap.css" rel="stylesheet">
	<script src="http://cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.js"></script> 
	<script src="http://netdna.bootstrapcdn.com/bootstrap/3.3.5/js/bootstrap.js"></script> 

	<!-- Material Kit CSS -->
  	<link href="/resources/assets/css/material-dashboard.css?v=2.1.0" rel="stylesheet" />

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
	  <textarea id="summernote" name="editordata"></textarea>
	</form>	
	

</body>
</html>