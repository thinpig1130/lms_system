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
  				<c:if test="${empty cur_course}">
  					<!-- 과정선택 List -->
	          		<div class="col-md-4">
	              		<div class="card card-stats">
	                		<div class="card-header card-header-primary card-header-icon">
	                  			<div class="card-icon">
	                  				<div class="row">
		                    			<i class="material-icons">store</i> 
		                    			<h4 class="align-self-center">과정선택</h4>
	                  				</div>
	                  				<div class="container-fluid">
	                  					<h6> * &nbsp;&nbsp;분류를 등록 할 과정을 선택하세요.</h6>
	                  				</div>
	                  			</div>
		                	</div>
			                <div class="card-footer">
			                  	<div class="card-body table-responsive">
			                    	<table class="table table-hover">
			                      		<tbody>
			                      			<c:forEach items="${courses}" var="course">
			                      			<tr>
				                          		<td><a href="/admin/categorys?course=${course.code}">
	                		
				                          			( ${course.code} ) ${course.name}
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
          		<c:if test="${not empty cur_course}"> 
	          		<div class="col-md-4 d-flex justify-content-center">
		            	<div class="card">
		                	<div class="card-body d-flex align-items-center">
			                		<div class="container-fluid alert alert-primary">
				                  		<h4> ( ${cur_course.code} ) ${cur_course.name }</h4>
	              						<a href="/admin/categorys" class="btn btn-primary btn-round">
										  	재 선택
										</a>
				                  	</div>
		                	</div>
		              	</div>
	  				</div>
	  				<c:if test="${empty cur_category}">			
		  				<!-- 분류선택 List -->
		          		<div class="col-md-4">
		              		<div class="card card-stats">
		                		<div class="card-header card-header-primary card-header-icon">
		                  			<div class="card-icon">
		                    			<div class="row">
			                    			<i class="material-icons">store</i> 
			                    			<h4 class="align-self-center">분류 선택/등록</h4>
		                  				</div>
		                  				<div class="container-fluid">
		                  					<h6> * &nbsp;&nbsp;대분류 등록 또는 선택하세요.</h6>
		                  				</div>
		                  			</div>
			                	</div>
				                <div class="card-footer">
				                  	<div class="card-body table-responsive">
				                    	<table class="table table-hover">
				                    		<thead>
				                    			<th>
				                    				<h6>* 분류코드/분류명을 입력 후 등록 할 수 있습니다. </h6><br>
								  					<form action="/admin/regist_category" method="post">
										          		<div class="form-group">
										               		<label class="bmd-label-floating">대분류코드 / ex) CAT23401</label>
										                   	<input type="text" class="form-control" name="code">
										                </div>
										                <div class="form-group">
										                   	<label class="bmd-label-floating">분류명 / ex) SQL응용 </label>
										                   	<input type="text" class="form-control" name="name">
										                   	<input type="hidden" name="cocode" value="${cur_course.code}">
										                </div>
										          		<button type="submit" class="btn btn-primary pull-right">등록</button>
										          	</form>
				                      			</th>
				                      		</thead>
				                      		<tbody>
				                      			<tr>
				                      				<td><br><br>
				                      					<h6>* 이미 등록된 분류코드를 선택할 수 있습니다. </h6>
				                      				</td>
				                      			</tr>
				                      			<c:forEach items="${categorys}" var="category">
				                      			<tr>
					                          		<td><a href="/admin/categorys?course=${cur_course.code}&category=${category.code}">
					                          			( ${category.code} ) &nbsp; ${category.name}
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
	            	<c:if test="${not empty cur_category}"> 
	            		<div class="col-md-4 d-flex justify-content-center">
			            	<div class="card">
			                	<div class="card-body d-flex align-items-center">
				                		<div class="container-fluid alert alert-primary">
					                  		<h4> ( ${cur_category.code} ) ${cur_category.name }</h4>
		              						<a href="/admin/categorys?course=${cur_course.code}" class="btn btn-primary btn-round">
											  	재 선택
											</a>
					                  	</div>
			                	</div>
			              	</div>
		  				</div>
		  				<!-- 소분류등록  & List -->
		          		<div class="col-md-4">
		              		<div class="card card-stats">
		                		<div class="card-header card-header-primary card-header-icon">
		                  			<div class="card-icon">
		                    			<div class="row">
			                    			<i class="material-icons">store</i> 
			                    			<h4 class="align-self-center">소분류 등록</h4>
		                  				</div>
		                  				<div class="container-fluid">
		                  					<h6> * &nbsp;&nbsp;선택된 대분류에 속한 소분류를 등록합니다.</h6>
		                  				</div>
		                  			</div>
			                	</div>
				                <div class="card-footer">
				                  	<div class="card-body table-responsive">
				                    	<table class="table table-hover">
				                    		<thead>
				                    			<th>
				                    				<h6>* 소분류코드/소분류명을 입력 후 등록 할 수 있습니다. </h6><br>
								  					<form action="/admin/regist_subcategory" method="post">
										          		<div class="form-group">
										               		<label class="bmd-label-floating">소분류코드 / ex) SUB34001</label>
										                   	<input type="text" class="form-control" name="code">
										                </div>
										                <div class="form-group">
										                   	<label class="bmd-label-floating">분류명 / ex) SQL 문법 </label>
										                   	<input type="text" class="form-control" name="name">
										                   	<input type="hidden" name="cacode" value="${cur_category.code}">
										                   	<input type="hidden" name="cocode" value="${cur_course.code}">
										                </div>
										          		<button type="submit" class="btn btn-primary pull-right">등록</button>
										          	</form>
				                      			</th>
				                      		</thead>
				                      		<tbody>
				                      			<tr>
				                      				<td><br><br>
				                      					<h6>* &nbsp;&nbsp;[ ${cur_category.name } ] 에 등록되어 있는 소분류  목록</h6>
				                      				</td>
				                      			</tr>
				                      			<c:forEach items="${sub_categorys}" var="sub_category">
				                      			<tr>
					                          		<td>
					                          			( ${sub_category.code} ) &nbsp; ${sub_category.name}
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
