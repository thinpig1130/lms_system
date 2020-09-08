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
          <div class="col-md-4 d-flex justify-content-center">
           	<div class="card">
               	<div class="card-body d-flex align-items-center">
               		
                  	<table class="table table-hover">
                  		<thead>
                   			<th>
			  					<div class="container-fluid alert alert-primary">
			  						<form action="/user/study/applyform">
	                  					<h4> &nbsp; 과정명 출력  </h4>
	                  					<input type="hidden" name="course" value="과정코드">
	                  					<button class="btn btn-info btn-round pull-right"> 신청하기 </button>
                  					</form>      			
                  				</div>
                     		</th>
                     	</thead>
                     		<tr>
                          		<td>
                          			<h6>* 학습 내용 미리 보기 </h6>
                          		</td>			                        	
                        	</tr>
                   			<tr>
                          		<td>
                          			분류1 
                          		</td>			                        	
                        	</tr>
                        	<tr>
                          		<td>
                          			분류2 
                          		</td>			                        	
                        	</tr>
                        	<tr>
                          		<td>
                          			뷴류3 
                          		</td>			                        	
                        	</tr>
                        	
                        </tbody>
               		</table>
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