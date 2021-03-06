<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<html>
<head>
	<%@ include file="../include/head.jsp" %>
</head>
<body class="dark-edition">
 <div class="wrapper ">
    <%@ include file="../include/m_sidebar.jsp" %>
    <div class="main-panel">
      <%@ include file="../include/m_topbar.jsp" %>
      <div class="content">
        <div class="container-fluid">
          	<!-- your content here -->
          	<div class="row">	
  				<c:if test="${true}">
  					<!-- 과정선택 List -->
	          		<div class="col-md-4">
	              		<div class="card card-stats">
	                		<div class="card-header card-header-primary card-header-icon">
	                  			<div class="card-icon">
	                  				<div class="row">
		                    			<i class="material-icons">people</i> 
		                    			<h4 class="align-self-center">일반 사용자</h4>
	                  				</div>
	                  				<div class="container-fluid">
	                  					<h6> * &nbsp;&nbsp; 관리자로 등록하려면 '+' 버튼을 누르세요!! </h6>
	                  				</div>
	                  			</div>
		                	</div>
			                <div class="card-footer">
			                  	<div class="card-body table-responsive">
			                    	<table class="table table-hover">
			                      		<tbody>
			                      			<c:forEach items="${userList}" var="user">
			                      			<tr>
				                          		<td>
				                          			 ${user.id} 
				                          		</td>
				                          		<td>
				                          			${user.email}
				                          		</td>
				                          		<td>
					                      			<a href="/admin/users/regist_manager?id=${user.id}">
				                          			<i class="material-icons">add</i>
						                          	</a>
				                          		</td>			                        	
				                        	</tr>
				                        	</c:forEach>
				                        </tbody>
			                   		</table>
			                  	</div>
			                </div>
	              		</div>
	            	</div>
  				</c:if>
  				<c:if test="${true}">
  					<!-- 과정선택 List -->
	          		<div class="col-md-4">
	              		<div class="card card-stats">
	                		<div class="card-header card-header-primary card-header-icon">
	                  			<div class="card-icon">
	                  				<div class="row">
		                    			<i class="material-icons">settings</i> 
		                    			<h4 class="align-self-center">관리자</h4>
	                  				</div>
	                  				<div class="container-fluid">
	                  					<h6> * &nbsp;&nbsp; 자신은 관리자 목록에서 삭제 할 수 없습니다. </h6>
	                  				</div>
	                  			</div>
		                	</div>
			                <div class="card-footer">
			                  	<div class="card-body table-responsive">
			                    	<table class="table table-hover">
			                      		<tbody>
			                      			<c:forEach items="${managerList}" var="manager">
			                      			<tr>
				                          		<td>
				                          			${manager.id}
				                          		</td>
				                          		<td>
				                          			${manager.email}
				                          		</td>
				                          		<td>
				                          		<c:if test="${manager.id eq id}">
				                          			<i class="material-icons">horizontal_rule</i>
				                          		</c:if>
				                          		<c:if test="${ not (manager.id eq id) }">
					                          		<a href="/admin/users/delete_manager?id=${manager.id}">
					                          			<i class="material-icons">horizontal_rule</i>
							                        </a>
						                        </c:if>
				                          		</td>			                        	
				                        	</tr>
				                        	</c:forEach>
				                        </tbody>
			                   		</table>
			                  	</div>
			                </div>
	              		</div>
	            	</div>
  				</c:if>
  			</div>

        </div>
      </div>
      <%@ include file="../include/m_footer.jsp" %>
    </div>
  </div>
<%@ include file="../include/corejs.jsp" %>
</body>
</html>
