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
          <c:if test="${empty courseList}">
	          <div class="container-fluid">
		          <h4>진행 중인 학습이 없습니다.</h4>
		          <a href="/user/study/info" type="button" class="btn btn-info">학습 신청 하기</a>
	          </div>
          </c:if>
          <c:if test="${not empty courseList}">
          <div class="container-fluid">
	          <h4>진행 중인 학습</h4>
	          <a href="/user/study/info" class="btn btn-primary pull-right  btn-sm">새 학습 신청</a>
	          <br><br>
          </div>
          
          <!-- 진행 중인 학습 -->
          <div class="row">
          <c:forEach items="${courseList}" var="course">
	          <div class="col-md-4">
	              <div class="card card-stats">
	                <div class="card-header card-header-info card-header-icon">
		                <div class="card-icon">
		                  	<i class="material-icons">edit_road</i>
		                </div>
	                	<p class="card-category"> D-${course.daysLeft} </p>
	                  	<h3 class="card-title">${course.coName}</h3><br>
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
			                    <i class="material-icons">update</i> 총 학습 수 ${course.countContents} / 남은 학습 ${course.countRemaingContnents}
	                  		</div>
			                <div class="row container-Fluid">
			                	중요한 것 부터 공부한다!! <br>
			                	주  ${course.daysPerWeeks}일 공부 <br>
			                	<br>
			                	오늘 학습 목표 : 모듈 ${course.todayContents}개 <br>     	
			                <div>
							<div class="row container-Fluid">
		                  		<a href="/user/study/hard?course=${course.coCode}" class="btn btn-info pull-right btn-round" target="_blank">이어서 학습하기</a>
			                </div>
						</div>
	                  </div>
	                </div>
	              </div>
	           </div>
	        </div>
	      </div>
      </c:forEach>
          </div>
      </c:if>
      <%@ include file="../include/footer.jsp" %>
    </div>
  </div>
  
  <c:if test="${not empty courseList}">
  <!-- 학습계획작성 폼 -->
  <div class="fixed-plugin">
    <div class="dropdown show-dropdown">
      <a href="#" data-toggle="dropdown">
        <i class="fa fa-cog fa-2x"> </i>
      </a>
      <ul class="dropdown-menu">
      <form action="/user/study/apply_update">
        <li class="header-title adjustments-line">♡ &nbsp;&nbsp; 학습 계획서 작성 &nbsp;&nbsp;♡           
        </li>
        <li  class="header-title">과정 선택 </li>
        <li class="button-container adjustments-line">
	        <c:forEach items="${courseList}" var="course">
	            <div class="form-check form-check-radio">
				  <label class="form-check-label">
				    <input class="form-check-input" type="radio" name="course" id="course" value="${course.coCode}" checked> ${course.coName}
				    <span class="circle">
				        <span class="check"></span>
				    </span>
				  </label>
				</div>
			</c:forEach>
        </li>
        <li class="header-title">학습 우선 순위 선택</li>
        <li class="button-container adjustments-line">
			<div class="form-check form-check-radio">
			  <label class="form-check-label">
			    <input class="form-check-input" type="radio" name="priority" id="priority" value="1"> 증요한 것부터 학습
			    <span class="circle">
			        <span class="check"></span>
			    </span>
			  </label>
			</div>
			<div class="form-check form-check-radio">
			  <label class="form-check-label">
			    <input class="form-check-input" type="radio" name="priority" id="priority" value="2" checked> 차근 차근 순서대로 학습
			    <span class="circle">
			        <span class="check"></span>
			    </span>
			  </label>
			</div>
        </li>     
        <li class="header-title">주 학습일수 선택</li>
        <li class="button-container text-center adjustments-line">
        		<div class="form-check form-check-radio form-check-inline">
				  <label class="form-check-label">
				    <input class="form-check-input" type="radio" name="days_per_week" id="daysperweek" value="1"> 1일
				    <span class="circle">
				        <span class="check"></span>
				    </span>
				  </label>
				</div>
				<div class="form-check form-check-radio form-check-inline">
				  <label class="form-check-label">
				    <input class="form-check-input" type="radio" name="days_per_week" id="daysperweek" value="2"> 2일
				    <span class="circle">
				        <span class="check"></span>
				    </span>
				  </label>
				</div>
				<div class="form-check form-check-radio form-check-inline">
				  <label class="form-check-label">
				    <input class="form-check-input" type="radio" name="days_per_week" id="daysperweek" value="3"> 3일
				    <span class="circle">
				        <span class="check"></span>
				    </span>
				  </label>
				</div>
				<div class="form-check form-check-radio form-check-inline">
				  <label class="form-check-label">
				    <input class="form-check-input" type="radio" name="days_per_week" id="daysperweek" value="4"> 4일
				    <span class="circle">
				        <span class="check"></span>
				    </span>
				  </label>
				</div>
				<div class="form-check form-check-radio form-check-inline">
				  <label class="form-check-label">
				    <input class="form-check-input" type="radio" name="days_per_week" id="daysperweek" value="5" checked> 5일
				    <span class="circle">
				        <span class="check"></span>
				    </span>
				  </label>
				</div>
				<div class="form-check form-check-radio form-check-inline">
				  <label class="form-check-label">
				    <input class="form-check-input" type="radio" name="days_per_week" id="daysperweek" value="6"> 6일
				    <span class="circle">
				        <span class="check"></span>
				    </span>
				  </label>
				</div>
				<div class="form-check form-check-radio form-check-inline">
				  <label class="form-check-label">
				    <input class="form-check-input" type="radio"  name="days_per_week" id="daysperweek" value="option1"> 7일
				    <span class="circle">
				        <span class="check"></span>
				    </span>
				  </label>
				</div>
        </li>
        
        <li class="header-title">학습 기간 선택</li>
        
        <li class="button-container text-center">
	        	<label> 목표일 : <input type="date" name="expected_end_date"></label>
        </li>
        <li class="button-container">
       		<button type="submit" class="btn btn-primary btn-block">계획 적용</button>
        </li>
      </ul>
      </form>
    </div>
  </div>
  </c:if>
<%@ include file="../include/corejs.jsp" %>
</body>
</html>
