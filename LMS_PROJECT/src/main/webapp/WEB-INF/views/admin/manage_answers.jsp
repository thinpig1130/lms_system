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
          	            <div class="col-md-12">
              <div class="card card-plain">
                <div class="card-header card-header-primary">
                  <div class="form-row">
                    <div class="form-group col-md-10">
                  <h4>관리자 답변</h4>
                    </div>
                    </div>
                </div>
              </div>
              <div class="form-group">
                <label for="exampleFormControlSelect1">유형 선택</label>
                <form action="" method="post">
                <select class="form-control" id="exampleFormControlSelect1" name="noanswer">
                  <option value="1" checked>미답변 목록 보기</option>
                  <option value="2">전체 목록 보기</option>
                </select>
                </form>
              </div>

                <div class="card-body">
                  <div class="table-responsive">
                    <table class="table table-hover">
                      <thead class="">
                        <th>
                          번호
                        </th>
                        <th>
                          유형
                        </th>
                        <th>
                          제목
                        </th>
                        <th>
                          댓글
                        </th>
                        <th>
                          작성자
                        </th>
                        <th>
                          등록일
                        </th>
                        <th>
                          조회수
                        </th>
                      </thead>
                      <tbody>
                      <!-- 가 데이터 시작 -->
                             <tr>
                          <td>
                            3
                          </td>
                          <td>
                            	시스템문의
                          </td>
                          <td>
                          <a href="/user/qnatable_user2">
                           test</a>
                          </td>
                          <td>

                          </td>
                          <td>
                            test
                          </td>
                          <td>
                            2020-09-21
                          </td>
                          <td>
                            <center>
                            0
                            </center>
                            <!-- 가 데이터 끝 -->
                        <tr>
                          <td>
                            1
                          </td>
                          <td>
                            	시스템문의
                          </td>
                          <td>
                          <a href="/user/qnatable_user2">
                           복습하기에 빨간색,주황색,초록색은 무슨 의미 인가요?</a>
                          </td>
                          <td>

                          </td>
                          <td>
                            cjscn
                          </td>
                          <td>
                            2020-09-18
                          </td>
                          <td>
                            <center>
                            1
                            </center>
                            
                          </td>
                        </tr>
                      </tbody>
                    </table>
                  </div>
                  
        </div>    
        </div>
        </div>
      </div>
      <%@ include file="../include/m_footer.jsp" %>
    </div>
  </div>
<%@ include file="../include/corejs.jsp" %>
</body>
</html>
