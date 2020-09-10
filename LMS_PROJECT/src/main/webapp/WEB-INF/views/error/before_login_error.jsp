<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<html>
<head>
	<%@ include file="../include/head.jsp" %>
</head>
<body class="dark-edition">
 <div class="wrapper">
  <div>
    <div class="container-fluid">
    	<br><br><br>
    	<div class="row align-self-center d-flex  justify-content-md-center">
            <div class="col-md-6">
              <div class="card">
                <div class="card-header card-header-primary">
                  <h4 class="card-title">로그인 되지 않음</h4>
                  <p class="card-category">Not logged in error</p>
                </div>
                <div class="card-body table-responsive">
                   <p>로그인 후 이용하실 수 있습니다.</p>
                </div>
                <div class="container-fluid d-flex justify-content-end">
                	<div class="row col-md-3">
                   <a href="/member/loginform"><p class="text-primary">로그인 페이지로 이동<p></a>
                	</div>
                </div>
              </div>
            </div>
       </div>
     </div>
 </div>
<%@ include file="../include/corejs.jsp" %>
</body>
</html>
