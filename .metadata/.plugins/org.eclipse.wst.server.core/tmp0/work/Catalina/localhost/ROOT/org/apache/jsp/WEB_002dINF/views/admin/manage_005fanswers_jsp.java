/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.8
 * Generated at: 2020-09-08 08:25:53 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.views.admin;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class manage_005fanswers_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(7);
    _jspx_dependants.put("/WEB-INF/views/admin/../include/m_sidebar.jsp", Long.valueOf(1599525165247L));
    _jspx_dependants.put("/WEB-INF/views/admin/../include/m_footer.jsp", Long.valueOf(1599440205144L));
    _jspx_dependants.put("/WEB-INF/views/admin/../include/corejs.jsp", Long.valueOf(1599095872595L));
    _jspx_dependants.put("/WEB-INF/views/admin/../include/head.jsp", Long.valueOf(1599012036070L));
    _jspx_dependants.put("/WEB-INF/views/admin/../include/m_topbar.jsp", Long.valueOf(1599525076650L));
    _jspx_dependants.put("/WEB-INF/lib/standard-1.1.2.jar", Long.valueOf(1598927620350L));
    _jspx_dependants.put("jar:file:/D:/Git_repositories/lms_system/.metadata/.plugins/org.eclipse.wst.server.core/tmp0/wtpwebapps/LMS_PROJECT/WEB-INF/lib/standard-1.1.2.jar!/META-INF/c.tld", Long.valueOf(1098678690000L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
  }

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fif_0026_005ftest;

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.release();
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    if (!javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      final java.lang.String _jspx_method = request.getMethod();
      if ("OPTIONS".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        return;
      }
      if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET, POST or HEAD. Jasper also permits OPTIONS");
        return;
      }
    }

    final javax.servlet.jsp.PageContext pageContext;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, false, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("\t");
      out.write("\r\n");
      out.write("\r\n");
      out.write(" <title>사이트 이름</title>\r\n");
      out.write(" <!-- Required meta tags -->\r\n");
      out.write(" <meta charset=\"utf-8\">\r\n");
      out.write(" <meta content=\"width=device-width, initial-scale=1.0, maximum-scale=1.0, user-scalable=0\" name=\"viewport\" />\r\n");
      out.write(" <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge,chrome=1\" />\r\n");
      out.write(" <!--     Fonts and icons     -->\r\n");
      out.write(" <link rel=\"stylesheet\" type=\"text/css\" href=\"https://fonts.googleapis.com/css?family=Roboto:300,400,500,700|Roboto+Slab:400,700|Material+Icons\" />\r\n");
      out.write(" <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/font-awesome/latest/css/font-awesome.min.css\">\r\n");
      out.write(" <!-- Material Kit CSS -->\r\n");
      out.write(" <link href=\"/resources/assets/css/material-dashboard.css?v=2.1.0\" rel=\"stylesheet\" />\r\n");
      out.write(" <!-- include libraries(jQuery) -->\r\n");
      out.write(" <script src=\"http://cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.js\"></script>\r\n");
      out.write("\n");
      out.write("</head>\n");
      out.write("<body class=\"dark-edition\">\n");
      out.write(" <div class=\"wrapper \">\n");
      out.write("    ");
      out.write("\r\n");
      out.write("\r\n");
      out.write("  <div class=\"sidebar\" data-color=\"purple\" data-background-color=\"black\" data-image=\"/resources/assets/img/sidebar-2.jpg\">\r\n");
      out.write("      <div class=\"logo\"><a href=\"/home\" class=\"simple-text logo-normal\">\r\n");
      out.write("        \t  관리자 '");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ id }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("'님\r\n");
      out.write("        </a></div>\r\n");
      out.write("      <div class=\"sidebar-wrapper\">\r\n");
      out.write("        <ul class=\"nav\">\r\n");
      out.write("          <li class=\"nav-item active\">\r\n");
      out.write("            <a class=\"nav-link\" href=\"/admin/courses\">\r\n");
      out.write("              <i class=\"material-icons\">dashboard</i>\r\n");
      out.write("              <p>과정등록</p>\r\n");
      out.write("            </a>\r\n");
      out.write("          </li>\r\n");
      out.write("          <li class=\"nav-item \">\r\n");
      out.write("            <a class=\"nav-link\" href=\"/admin/categorys\">\r\n");
      out.write("              <i class=\"material-icons\">edit</i>\r\n");
      out.write("              <p>분류등록</p>\r\n");
      out.write("            </a>\r\n");
      out.write("          </li>\r\n");
      out.write("          <li class=\"nav-item \">\r\n");
      out.write("            <a class=\"nav-link\" href=\"/admin/contents\">\r\n");
      out.write("              <i class=\"material-icons\">rate_review</i>\r\n");
      out.write("              <p>학습모듈관리</p>\r\n");
      out.write("            </a>\r\n");
      out.write("          </li>\r\n");
      out.write("          <li class=\"nav-item \">\r\n");
      out.write("            <a class=\"nav-link\" href=\"/admin/users\">\r\n");
      out.write("              <i class=\"material-icons\">person_pin</i>\r\n");
      out.write("              <p>사용자관리</p>\r\n");
      out.write("            </a>\r\n");
      out.write("          </li>\r\n");
      out.write("          <li class=\"nav-item \">\r\n");
      out.write("            <a class=\"nav-link\" href=\"/admin/manage/answers\">\r\n");
      out.write("              <i class=\"material-icons\">support_agent</i>\r\n");
      out.write("              <p>관리자답변</p>\r\n");
      out.write("            </a>\r\n");
      out.write("          </li>\r\n");
      out.write("        </ul>\r\n");
      out.write("      </div>\r\n");
      out.write("    </div>");
      out.write("\n");
      out.write("    <div class=\"main-panel\">\n");
      out.write("      ");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<nav\r\n");
      out.write("\tclass=\"navbar navbar-expand-lg navbar-transparent navbar-absolute fixed-top \"\r\n");
      out.write("\tid=\"navigation-example\">\r\n");
      out.write("\t<div class=\"container-fluid\">\r\n");
      out.write("\t\t<div class=\"navbar-wrapper\">\r\n");
      out.write("\t\t\t<a class=\"navbar-brand\" href=\"javascript:void(0)\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${page_name}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("</a>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<button class=\"navbar-toggler\" type=\"button\" data-toggle=\"collapse\"\r\n");
      out.write("\t\t\taria-controls=\"navigation-index\" aria-expanded=\"false\"\r\n");
      out.write("\t\t\taria-label=\"Toggle navigation\" data-target=\"#navigation-example\">\r\n");
      out.write("\t\t\t<span class=\"sr-only\">Toggle navigation</span> <span\r\n");
      out.write("\t\t\t\tclass=\"navbar-toggler-icon icon-bar\"></span> <span\r\n");
      out.write("\t\t\t\tclass=\"navbar-toggler-icon icon-bar\"></span> <span\r\n");
      out.write("\t\t\t\tclass=\"navbar-toggler-icon icon-bar\"></span>\r\n");
      out.write("\t\t</button>\r\n");
      out.write("\t\t<div class=\"collapse navbar-collapse justify-content-end\">\r\n");
      out.write("\t\t\t<ul class=\"navbar-nav\">\r\n");
      out.write("\t\t\t\t<li class=\"nav-item dropdown\"><a class=\"nav-link\" href=\"javscript:void(0)\" id=\"navbarDropdownMenuLink\"\r\n");
      out.write("\t\t\t\t\tdata-toggle=\"dropdown\" aria-haspopup=\"true\" aria-expanded=\"false\">\r\n");
      out.write("\t\t\t\t\t\t<i class=\"material-icons\">person</i>\r\n");
      out.write("\t\t\t\t\t\t<p class=\"d-lg-none d-md-block\">Account</p>\r\n");
      out.write("\t\t\t\t\t</a>\r\n");
      out.write("\t\t\t\t\t");
      if (_jspx_meth_c_005fif_005f0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\t\t\t\t\t");
      if (_jspx_meth_c_005fif_005f1(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t<li class=\"nav-item\"><a class=\"nav-link\" href=\"javascript:void(0)\">\r\n");
      out.write("\t\t\t\t\t<i class=\"material-icons\">notifications</i>\r\n");
      out.write("\t\t\t\t\t<span class=\"notification\">5</span>\r\n");
      out.write("\t\t\t\t\t<p class=\"d-lg-none d-md-block\">알림</p>\r\n");
      out.write("\t\t\t\t</a></li>\r\n");
      out.write("\t\t\t</ul>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("</nav>\r\n");
      out.write("\n");
      out.write("      <div class=\"content\">\n");
      out.write("        <div class=\"container-fluid\">\n");
      out.write("          <!-- your content here -->\n");
      out.write("          \t            <div class=\"col-md-12\">\n");
      out.write("              <div class=\"card card-plain\">\n");
      out.write("                <div class=\"card-header card-header-primary\">\n");
      out.write("                  <div class=\"form-row\">\n");
      out.write("                    <div class=\"form-group col-md-10\">\n");
      out.write("                  <h4>관리자 답변</h4>\n");
      out.write("                    </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("              </div>\n");
      out.write("              <div class=\"form-group\">\n");
      out.write("                <label for=\"exampleFormControlSelect1\">유형 선택</label>\n");
      out.write("                <select class=\"form-control\" id=\"exampleFormControlSelect1\">\n");
      out.write("                  <option>미답변 목록 보기(기본값)</option>\n");
      out.write("                  <option>전체 목록 보기</option>\n");
      out.write("                </select>\n");
      out.write("              </div>\n");
      out.write("\n");
      out.write("                <div class=\"card-body\">\n");
      out.write("                  <div class=\"table-responsive\">\n");
      out.write("                    <table class=\"table table-hover\">\n");
      out.write("                      <thead class=\"\">\n");
      out.write("                        <th>\n");
      out.write("                          번호\n");
      out.write("                        </th>\n");
      out.write("                        <th>\n");
      out.write("                          유형\n");
      out.write("                        </th>\n");
      out.write("                        <th>\n");
      out.write("                          제목\n");
      out.write("                        </th>\n");
      out.write("                        <th>\n");
      out.write("                          댓글\n");
      out.write("                        </th>\n");
      out.write("                        <th>\n");
      out.write("                          작성자\n");
      out.write("                        </th>\n");
      out.write("                        <th>\n");
      out.write("                          등록일\n");
      out.write("                        </th>\n");
      out.write("                        <th>\n");
      out.write("                          조회수\n");
      out.write("                        </th>\n");
      out.write("                      </thead>\n");
      out.write("                      <tbody>\n");
      out.write("                        <tr>\n");
      out.write("                          <td>\n");
      out.write("                            1\n");
      out.write("                          </td>\n");
      out.write("                          <td>\n");
      out.write("                            ???유형\n");
      out.write("                          </td>\n");
      out.write("                          <td>\n");
      out.write("                            제목을 길게 써놓아서 얼마나 쓸수있나 보자~~~~~~~~~~~~~~~~~~~~~~~~~~~1\n");
      out.write("                          </td>\n");
      out.write("                          <td>\n");
      out.write("\n");
      out.write("                          </td>\n");
      out.write("                          <td>\n");
      out.write("                            Oud-Turnhoot\n");
      out.write("                          </td>\n");
      out.write("                          <td>\n");
      out.write("                            2020.09.01\n");
      out.write("                          </td>\n");
      out.write("                          <td>\n");
      out.write("                            <center>\n");
      out.write("                            11\n");
      out.write("                            </center>\n");
      out.write("                          </td>\n");
      out.write("                        </tr>\n");
      out.write("\n");
      out.write("                        <tr>\n");
      out.write("                          <td>\n");
      out.write("                            3\n");
      out.write("                          </td>\n");
      out.write("                          <td>\n");
      out.write("                            yyy유형\n");
      out.write("                          </td>\n");
      out.write("                          <td>\n");
      out.write("                            제목을 길게 써놓아서 얼마나 쓸수있나 보자~~~~~~~~~~~~~~~~~~~~~~~~~~~3\n");
      out.write("                          </td>\n");
      out.write("                          <td>\n");
      out.write("                            \n");
      out.write("                          </td>\n");
      out.write("                          <td>\n");
      out.write("                            Baileux\n");
      out.write("                          </td>\n");
      out.write("                          <td>\n");
      out.write("                            2020.09.01\n");
      out.write("                          </td>\n");
      out.write("                          <td>\n");
      out.write("                            <center>\n");
      out.write("                            13\n");
      out.write("                            </center>\n");
      out.write("                          </td>\n");
      out.write("                        </tr>\n");
      out.write("                      </tbody>\n");
      out.write("                    </table>\n");
      out.write("                  </div>\n");
      out.write("                  <center>\n");
      out.write("                      ◀ [1] [2] [3] ▶\n");
      out.write("                  </center>\n");
      out.write("                  \n");
      out.write("        </div>    \n");
      out.write("        </div>\n");
      out.write("        </div>\n");
      out.write("      </div>\n");
      out.write("      ");
      out.write("\r\n");
      out.write("\r\n");
      out.write("    <footer class=\"footer\">\r\n");
      out.write("        <div class=\"container-fluid\">\r\n");
      out.write("          <nav class=\"float-left\">\r\n");
      out.write("            <ul>\r\n");
      out.write("              <li>\r\n");
      out.write("                <a href=\"\">\r\n");
      out.write("                  It Person\r\n");
      out.write("                </a>\r\n");
      out.write("              </li>\r\n");
      out.write("              <li>\r\n");
      out.write("                <a href=\"\">\r\n");
      out.write("                  About Us\r\n");
      out.write("                </a>\r\n");
      out.write("              </li>\r\n");
      out.write("              <li>\r\n");
      out.write("                <a href=\"\">\r\n");
      out.write("                  Blog\r\n");
      out.write("                </a>\r\n");
      out.write("              </li>\r\n");
      out.write("              <li>\r\n");
      out.write("                <a href=\"/\">\r\n");
      out.write("                \t일반사용자 home                 \r\n");
      out.write("                </a>\r\n");
      out.write("              </li>\r\n");
      out.write("            </ul>\r\n");
      out.write("          </nav>\r\n");
      out.write("          <div class=\"copyright float-right\" id=\"date\">\r\n");
      out.write("            , made with <i class=\"material-icons\">favorite</i> by\r\n");
      out.write("            <a href=\"https://www.creative-tim.com\" target=\"_blank\">잇플</a> for a better learn.\r\n");
      out.write("          </div>\r\n");
      out.write("        </div>\r\n");
      out.write("      </footer>");
      out.write("\n");
      out.write("    </div>\n");
      out.write("  </div>\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!--   Core JS Files   -->\r\n");
      out.write("\r\n");
      out.write("  <script src=\"/resources/assets/js/core/popper.min.js\"></script>\r\n");
      out.write("  <script src=\"/resources/assets/js/core/bootstrap-material-design.min.js\"></script>\r\n");
      out.write("  <script src=\"https://unpkg.com/default-passive-events\"></script>\r\n");
      out.write("  <script src=\"/resources/assets/js/plugins/perfect-scrollbar.jquery.min.js\"></script>\r\n");
      out.write("  <!-- Place this tag in your head or just before your close body tag. -->\r\n");
      out.write("  <script async defer src=\"https://buttons.github.io/buttons.js\"></script>\r\n");
      out.write("  <!--  Google Maps Plugin    -->\r\n");
      out.write("  <script src=\"https://maps.googleapis.com/maps/api/js?key=YOUR_KEY_HERE\"></script>\r\n");
      out.write("  <!-- Chartist JS -->\r\n");
      out.write("  <script src=\"/resources/assets/js/plugins/chartist.min.js\"></script>\r\n");
      out.write("  <!--  Notifications Plugin    -->\r\n");
      out.write("  <script src=\"/resources/assets/js/plugins/bootstrap-notify.js\"></script>\r\n");
      out.write(" \r\n");
      out.write(" \r\n");
      out.write("  <!-- 썸머노트와는 충돌 됨 ... -->\r\n");
      out.write("  <!-- Control Center for Material Dashboard: parallax effects, scripts for the example pages etc   -->\r\n");
      out.write("  <script src=\"/resources/assets/js/material-dashboard.js?v=2.1.0\"></script> \r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("  <!-- Material Dashboard DEMO methods, don't include it in your project! -->\r\n");
      out.write("  <script src=\"/resources/assets/demo/demo.js\"></script>\r\n");
      out.write("  <script>\r\n");
      out.write("    $(document).ready(function() {\r\n");
      out.write("      $().ready(function() {\r\n");
      out.write("        $sidebar = $('.sidebar');\r\n");
      out.write("\r\n");
      out.write("        $sidebar_img_container = $sidebar.find('.sidebar-background');\r\n");
      out.write("\r\n");
      out.write("        $full_page = $('.full-page');\r\n");
      out.write("\r\n");
      out.write("        $sidebar_responsive = $('body > .navbar-collapse');\r\n");
      out.write("\r\n");
      out.write("        window_width = $(window).width();\r\n");
      out.write("\r\n");
      out.write("        $('.fixed-plugin a').click(function(event) {\r\n");
      out.write("          // Alex if we click on switch, stop propagation of the event, so the dropdown will not be hide, otherwise we set the  section active\r\n");
      out.write("          if ($(this).hasClass('switch-trigger')) {\r\n");
      out.write("            if (event.stopPropagation) {\r\n");
      out.write("              event.stopPropagation();\r\n");
      out.write("            } else if (window.event) {\r\n");
      out.write("              window.event.cancelBubble = true;\r\n");
      out.write("            }\r\n");
      out.write("          }\r\n");
      out.write("        });\r\n");
      out.write("\r\n");
      out.write("        $('.fixed-plugin .active-color span').click(function() {\r\n");
      out.write("          $full_page_background = $('.full-page-background');\r\n");
      out.write("\r\n");
      out.write("          $(this).siblings().removeClass('active');\r\n");
      out.write("          $(this).addClass('active');\r\n");
      out.write("\r\n");
      out.write("          var new_color = $(this).data('color');\r\n");
      out.write("\r\n");
      out.write("          if ($sidebar.length != 0) {\r\n");
      out.write("            $sidebar.attr('data-color', new_color);\r\n");
      out.write("          }\r\n");
      out.write("\r\n");
      out.write("          if ($full_page.length != 0) {\r\n");
      out.write("            $full_page.attr('filter-color', new_color);\r\n");
      out.write("          }\r\n");
      out.write("\r\n");
      out.write("          if ($sidebar_responsive.length != 0) {\r\n");
      out.write("            $sidebar_responsive.attr('data-color', new_color);\r\n");
      out.write("          }\r\n");
      out.write("        });\r\n");
      out.write("\r\n");
      out.write("        $('.fixed-plugin .background-color .badge').click(function() {\r\n");
      out.write("          $(this).siblings().removeClass('active');\r\n");
      out.write("          $(this).addClass('active');\r\n");
      out.write("\r\n");
      out.write("          var new_color = $(this).data('background-color');\r\n");
      out.write("\r\n");
      out.write("          if ($sidebar.length != 0) {\r\n");
      out.write("            $sidebar.attr('data-background-color', new_color);\r\n");
      out.write("          }\r\n");
      out.write("        });\r\n");
      out.write("\r\n");
      out.write("        $('.fixed-plugin .img-holder').click(function() {\r\n");
      out.write("          $full_page_background = $('.full-page-background');\r\n");
      out.write("\r\n");
      out.write("          $(this).parent('li').siblings().removeClass('active');\r\n");
      out.write("          $(this).parent('li').addClass('active');\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("          var new_image = $(this).find(\"img\").attr('src');\r\n");
      out.write("\r\n");
      out.write("          if ($sidebar_img_container.length != 0 && $('.switch-sidebar-image input:checked').length != 0) {\r\n");
      out.write("            $sidebar_img_container.fadeOut('fast', function() {\r\n");
      out.write("              $sidebar_img_container.css('background-image', 'url(\"' + new_image + '\")');\r\n");
      out.write("              $sidebar_img_container.fadeIn('fast');\r\n");
      out.write("            });\r\n");
      out.write("          }\r\n");
      out.write("\r\n");
      out.write("          if ($full_page_background.length != 0 && $('.switch-sidebar-image input:checked').length != 0) {\r\n");
      out.write("            var new_image_full_page = $('.fixed-plugin li.active .img-holder').find('img').data('src');\r\n");
      out.write("\r\n");
      out.write("            $full_page_background.fadeOut('fast', function() {\r\n");
      out.write("              $full_page_background.css('background-image', 'url(\"' + new_image_full_page + '\")');\r\n");
      out.write("              $full_page_background.fadeIn('fast');\r\n");
      out.write("            });\r\n");
      out.write("          }\r\n");
      out.write("\r\n");
      out.write("          if ($('.switch-sidebar-image input:checked').length == 0) {\r\n");
      out.write("            var new_image = $('.fixed-plugin li.active .img-holder').find(\"img\").attr('src');\r\n");
      out.write("            var new_image_full_page = $('.fixed-plugin li.active .img-holder').find('img').data('src');\r\n");
      out.write("\r\n");
      out.write("            $sidebar_img_container.css('background-image', 'url(\"' + new_image + '\")');\r\n");
      out.write("            $full_page_background.css('background-image', 'url(\"' + new_image_full_page + '\")');\r\n");
      out.write("          }\r\n");
      out.write("\r\n");
      out.write("          if ($sidebar_responsive.length != 0) {\r\n");
      out.write("            $sidebar_responsive.css('background-image', 'url(\"' + new_image + '\")');\r\n");
      out.write("          }\r\n");
      out.write("        });\r\n");
      out.write("\r\n");
      out.write("        $('.switch-sidebar-image input').change(function() {\r\n");
      out.write("          $full_page_background = $('.full-page-background');\r\n");
      out.write("\r\n");
      out.write("          $input = $(this);\r\n");
      out.write("\r\n");
      out.write("          if ($input.is(':checked')) {\r\n");
      out.write("            if ($sidebar_img_container.length != 0) {\r\n");
      out.write("              $sidebar_img_container.fadeIn('fast');\r\n");
      out.write("              $sidebar.attr('data-image', '#');\r\n");
      out.write("            }\r\n");
      out.write("\r\n");
      out.write("            if ($full_page_background.length != 0) {\r\n");
      out.write("              $full_page_background.fadeIn('fast');\r\n");
      out.write("              $full_page.attr('data-image', '#');\r\n");
      out.write("            }\r\n");
      out.write("\r\n");
      out.write("            background_image = true;\r\n");
      out.write("          } else {\r\n");
      out.write("            if ($sidebar_img_container.length != 0) {\r\n");
      out.write("              $sidebar.removeAttr('data-image');\r\n");
      out.write("              $sidebar_img_container.fadeOut('fast');\r\n");
      out.write("            }\r\n");
      out.write("\r\n");
      out.write("            if ($full_page_background.length != 0) {\r\n");
      out.write("              $full_page.removeAttr('data-image', '#');\r\n");
      out.write("              $full_page_background.fadeOut('fast');\r\n");
      out.write("            }\r\n");
      out.write("\r\n");
      out.write("            background_image = false;\r\n");
      out.write("          }\r\n");
      out.write("        });\r\n");
      out.write("\r\n");
      out.write("        $('.switch-sidebar-mini input').change(function() {\r\n");
      out.write("          $body = $('body');\r\n");
      out.write("\r\n");
      out.write("          $input = $(this);\r\n");
      out.write("\r\n");
      out.write("          if (md.misc.sidebar_mini_active == true) {\r\n");
      out.write("            $('body').removeClass('sidebar-mini');\r\n");
      out.write("            md.misc.sidebar_mini_active = false;\r\n");
      out.write("\r\n");
      out.write("            $('.sidebar .sidebar-wrapper, .main-panel').perfectScrollbar();\r\n");
      out.write("\r\n");
      out.write("          } else {\r\n");
      out.write("\r\n");
      out.write("            $('.sidebar .sidebar-wrapper, .main-panel').perfectScrollbar('destroy');\r\n");
      out.write("\r\n");
      out.write("            setTimeout(function() {\r\n");
      out.write("              $('body').addClass('sidebar-mini');\r\n");
      out.write("\r\n");
      out.write("              md.misc.sidebar_mini_active = true;\r\n");
      out.write("            }, 300);\r\n");
      out.write("          }\r\n");
      out.write("\r\n");
      out.write("          // we simulate the window Resize so the charts will get updated in realtime.\r\n");
      out.write("          var simulateWindowResize = setInterval(function() {\r\n");
      out.write("            window.dispatchEvent(new Event('resize'));\r\n");
      out.write("          }, 180);\r\n");
      out.write("\r\n");
      out.write("          // we stop the simulation of Window Resize after the animations are completed\r\n");
      out.write("          setTimeout(function() {\r\n");
      out.write("            clearInterval(simulateWindowResize);\r\n");
      out.write("          }, 1000);\r\n");
      out.write("\r\n");
      out.write("        });\r\n");
      out.write("      });\r\n");
      out.write("    });\r\n");
      out.write("  </script>");
      out.write("\n");
      out.write("</body>\n");
      out.write("</html>\n");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }

  private boolean _jspx_meth_c_005fif_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f0 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    boolean _jspx_th_c_005fif_005f0_reused = false;
    try {
      _jspx_th_c_005fif_005f0.setPageContext(_jspx_page_context);
      _jspx_th_c_005fif_005f0.setParent(null);
      // /WEB-INF/views/admin/../include/m_topbar.jsp(28,5) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005fif_005f0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${empty id}", boolean.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null)).booleanValue());
      int _jspx_eval_c_005fif_005f0 = _jspx_th_c_005fif_005f0.doStartTag();
      if (_jspx_eval_c_005fif_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("\t\t\t\t\t\t<div class=\"dropdown-menu dropdown-menu-right\" aria-labelledby=\"navbarDropdownMenuLink\">\r\n");
          out.write("\t\t\t\t\t\t\t<a class=\"dropdown-item\" href=\"/member/loginform\">로그인</a> \r\n");
          out.write("\t\t\t\t\t\t\t<a class=\"dropdown-item\" href=\"/member/joinform\">회원가입</a>\r\n");
          out.write("\t\t\t\t\t\t</div>\r\n");
          out.write("\t\t\t\t\t");
          int evalDoAfterBody = _jspx_th_c_005fif_005f0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_005fif_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
      _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f0);
      _jspx_th_c_005fif_005f0_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_c_005fif_005f0, _jsp_getInstanceManager(), _jspx_th_c_005fif_005f0_reused);
    }
    return false;
  }

  private boolean _jspx_meth_c_005fif_005f1(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f1 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    boolean _jspx_th_c_005fif_005f1_reused = false;
    try {
      _jspx_th_c_005fif_005f1.setPageContext(_jspx_page_context);
      _jspx_th_c_005fif_005f1.setParent(null);
      // /WEB-INF/views/admin/../include/m_topbar.jsp(34,5) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005fif_005f1.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${not empty id}", boolean.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null)).booleanValue());
      int _jspx_eval_c_005fif_005f1 = _jspx_th_c_005fif_005f1.doStartTag();
      if (_jspx_eval_c_005fif_005f1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("\t\t\t\t\t\t<div class=\"dropdown-menu dropdown-menu-right\" aria-labelledby=\"navbarDropdownMenuLink\">\r\n");
          out.write("\t\t\t\t\t\t\t<a class=\"dropdown-item\" href=\"/member/logout\">로그아웃</a>\r\n");
          out.write("\t\t\t\t\t\t</div>\r\n");
          out.write("\t\t\t\t\t");
          int evalDoAfterBody = _jspx_th_c_005fif_005f1.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_005fif_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
      _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f1);
      _jspx_th_c_005fif_005f1_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_c_005fif_005f1, _jsp_getInstanceManager(), _jspx_th_c_005fif_005f1_reused);
    }
    return false;
  }
}
