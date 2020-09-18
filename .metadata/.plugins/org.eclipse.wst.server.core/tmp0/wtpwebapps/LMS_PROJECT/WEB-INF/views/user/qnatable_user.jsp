<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<html>
<head>
	<%@ include file="../include/head.jsp" %>
</head>
<body class="dark-edition">
 <!-- <div class="wrapper "> -->
    <%@ include file="../include/sidebar.jsp" %>
 	<div class="main-panel">
      <%@ include file="../include/m_topbar.jsp" %>
        <div class="content">
        <div class="container-fluid">
          <!-- your content here -->
                <div class="content">
        <div class="container-fluid">
          <div class="row">
              <div class="card">
                <div class="card-header card-header-primary">
                  <h4 class="card-title">QnA 게시글</h4>
                </div>
                <div class="card-body">
                  <form>
                    <div class="form-group">
                      작성자 cjscn &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                      작성일자 2020-09-18 &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                      조회수 1 &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;


                    </div>
                        <div class="form-group">
                          <div class="column">
                          <div class="col-xs-7">
                          <label class="bmd-label-floating"><h4>글 제목 : 더 많은 학습이 추가 되었으면 좋겠습니다.</h4> </label>
                          </div>
                          </div>
                        </div>
                      
                        <div class="form-group">
                          2가지를 제외한 더 많은 학습이 추가 되었으면 좋겠습니다.<br>
                        </div>
                        <div class="col-md-12">
                    <button type="submit" class="btn btn-primary pull-right">입력</button>
                    <button type="button" class="btn btn-primary pull-right">취소</button>
                    <button type="submit" class="btn btn-primary pull-right">수정</button>
                    <button type="submit" class="btn btn-primary pull-right">삭제</button>
                  </form>
                </div>
                </div>
                </div>
                
                
                <div class="col-md-12">
                <div class="content">
                  <div class="container-fluid">
                    <div class="row">
                        <div class="card">
                          <div class="card-header card-header-primary">
                            <h4 class="card-title">QnA 댓글</h4>
                          </div>
                          <div class="card-body">
                            <form>
                              <div class="form-group">
                                댓글 작성자 tp1130 &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                                댓글 작성일자 2020-09-19 &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                              </div>
                                  <div class="form-group">
                                    <div class="column">
                                    <div class="col-xs-7">
                                    <label class="bmd-label-floating"><h4>댓글 내용 : 정보처리기능사 과정이 추가될 예정입니다.</h4> </label>
                                    </div>
                                    </div>
                                  </div>
                                
                                  <div class="form-group">
                                    
                                  </div>
                              <div class="col-md-12">
                            </div>
                            </form>
                          </div>
            </div>
            </div>
            </div>
          <!-- 컨텐츠 끝 -->
      </div>
      </div>
      <%@ include file="../include/m_footer.jsp" %>
    </div>
  </div>
<%@ include file="../include/corejs.jsp" %>
</body>
</html>
