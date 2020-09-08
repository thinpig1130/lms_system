<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<html>
<head>
	<%@ include file="../include/head.jsp" %>
</head>
<body class="dark-edition">
 <div class="wrapper ">
    <%@ include file="../include/sidebar.jsp" %>
    <div class="main-panel">
      <%@ include file="../include/topbar.jsp" %>
      <div class="content">
        <div class="container-fluid">
          <!-- your content here -->
          <hr>
          <div class="container-fluid">
	          <h4>진행 중인 학습이 없습니다.</h4>
	          <a href="/user/study/apply" type="button" class="btn btn-info">학습 신청 하기</a>
          </div>
          <hr>
          <div class="container-fluid">
	          <h4>진행 중인 학습</h4>
	          <a href="/user/study/apply" class="btn btn-primary pull-right  btn-sm">새 학습 신청</a>
	          <br><br>
          </div>
          
          <!-- 진행 중인 학습 -->
          <div class="col-md-4">
              <div class="card card-stats">
                <div class="card-header card-header-info card-header-icon">
	                <div class="card-icon">
	                  	<i class="material-icons">edit_road</i>
	                </div>
                	<p class="card-category"> D -100 </p>
                  	<h3 class="card-title">정보처리기사 </h3><br>
             		<div class="progress">
	  					<div class="progress-bar progress-bar-striped bg-success progress-bar-animated" role="progressbar" style="width: 70%;" aria-valuenow="70" aria-valuemin="0" aria-valuemax="100">진도율 70%</div>
					</div>
					<br>
					<div class="progress">
	  					<div class="progress-bar progress-bar-striped bg-warning progress-bar-animated" role="progressbar" style="width: 30%;" aria-valuenow="30" aria-valuemin="0" aria-valuemax="100">기억률 30%</div>
					</div>
                </div>
                <div class="card-footer">
                  <div class="stats">
                  	<div class="container-Fluid">
                  		<div class="row container-Fluid">
		                    <i class="material-icons">update</i> 총 학습 수 40 / 남은 학습 10
                  		</div>
		                <div class="row container-Fluid">
		                	중요도 A만 공부 <br>
		                	주 5일 공부 <br>
		                	목표기간 : 2002.03.04~2002.05.07<br>
		                	하루 학습 목표 : 7개 <br>
		                	하루 복습 목표 : 10개  <br>         	
		                <div>
						<div class="row container-Fluid">
							<button class="btn btn-info pull-right btn-round">계획변경하기</button>
	                  		<button class="btn btn-info pull-right btn-round">이어서 학습하기</button>
		                </div>
					</div>
                  </div>
                </div>
              </div>
           </div>
        </div>
      </div>
      <%@ include file="../include/footer.jsp" %>
    </div>
  </div>
<%@ include file="../include/corejs.jsp" %>
</body>
</html>