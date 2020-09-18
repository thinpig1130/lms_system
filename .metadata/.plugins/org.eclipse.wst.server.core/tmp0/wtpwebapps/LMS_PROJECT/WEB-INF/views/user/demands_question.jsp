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
                <div class="content">
        <div class="container-fluid">
          <div class="row">
              <div class="card">
                <div class="card-header card-header-primary">
                  <h4 class="card-title">관리자에게 문의</h4>
                </div>
                <div class="card-body">
                  <form action="/user/demands_question/regist" method="post">
                    <div class="form-group">
                      <label for="exampleFormControlSelect1">유형 선택</label>
                      <select class="form-control" id="exampleFormControlSelect1" name="qna_type">
                        <option value="시스템 문의">시스템 문의</option>
                        <option value="건의 사항">건의 사항</option>
                        <option value="버그 제보">버그 제보</option>
                        <option value="기타">기타</option>
                      </select>
                    </div>
                        <div class="form-group">
                          <div class="column">
                          <div class="col-xs-7">
                          <label class="bmd-label-floating">글 제목</label>
                          <input type="text" class="form-control" name="title">
                          </div>
                          </div>
                        </div>
                      
                        <div class="form-group">
                          <label for="exampleFormControlTextarea1">글 내용</label>
                          <textarea class="form-control" id="exampleFormControlTextarea1" rows="5" name="contents"></textarea>
                        </div>
                    <div class="col-md-12">
                   <button type="submit" class="btn btn-primary pull-right">
                    	 입력</button>
                    	
                    <button type="button" class="btn btn-primary pull-right" onClick="location.href='demands'">취소</button>
                  </div>
                  </form>
                </div>
            </div>
            </div>
            </div>
            </div>
            <!--  -->
            
        </div>
      </div>
      <%@ include file="../include/footer.jsp" %>
    </div>
  </div>
<%@ include file="../include/corejs.jsp" %>
</body>
</html>
