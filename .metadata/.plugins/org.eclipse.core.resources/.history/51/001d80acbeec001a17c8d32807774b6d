<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<html>
<%@ include file="../include/head.jsp" %>
<body class="dark-edition">
 <div class="wrapper ">
    <div class="container-fluid">
    	<h3>${page_name}</h3>
       <div class="card">
         <div class="card-header card-header-primary">
           <h4 class="card-title">Log in</h4>
         </div>
         <div class="card-body">
           <form action="/admin/courses" method="post">
           	<div class="form-group">
           		<label class="bmd-label-floating" >UserID</label>
                	<input type="text" class="form-control" name="id">
             </div>
             <div class="form-group">
               <label class="bmd-label-floating">Password</label>
               <input type="password" class="form-control" name="password">
             </div>
             <div class="col-md-12">
             <button type="button" class="btn btn-primary pull-right" onclick="location.href='/member/joinform'">회원가입</button>
             <button type="submit" class="btn btn-primary pull-right">로그인</button>
           </div>
           </form>
         </div>
     </div>
  </div>
<%@ include file="../include/corejs.jsp" %>
</body>
</html>
