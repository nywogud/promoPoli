/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.68
 * Generated at: 2021-07-01 12:07:35 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.views;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class admin_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(2);
    _jspx_dependants.put("/WEB-INF/lib/jstl-1.2.jar", Long.valueOf(1624934507462L));
    _jspx_dependants.put("jar:file:/D:/workspace/.metadata/.plugins/org.eclipse.wst.server.core/tmp0/wtpwebapps/poli/WEB-INF/lib/jstl-1.2.jar!/META-INF/c.tld", Long.valueOf(1153352682000L));
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
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    final java.lang.String _jspx_method = request.getMethod();
    if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method) && !javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSP들은 오직 GET, POST 또는 HEAD 메소드만을 허용합니다. Jasper는 OPTIONS 메소드 또한 허용합니다.");
      return;
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

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<title>admin</title>\r\n");
      out.write("<script\r\n");
      out.write("	src=\"https://cdnjs.cloudflare.com/ajax/libs/jquery/3.3.1/jquery.min.js\"></script>\r\n");
      out.write("<script>\r\n");
      out.write("	function adMento(postNum) {\r\n");
      out.write("		$.ajax({\r\n");
      out.write("			type : 'POST',\r\n");
      out.write("			url : '/adMento',\r\n");
      out.write("			success : function(result) {\r\n");
      out.write("\r\n");
      out.write("				$(\"#convertAdPage\").empty();\r\n");
      out.write("				$(\"#convertAdPage\").append(result);\r\n");
      out.write("			},\r\n");
      out.write("			error : function(request, status, error) {\r\n");
      out.write("\r\n");
      out.write("				alert(\"code:\" + request.status + \"\\n\" + \"message:\"\r\n");
      out.write("						+ request.responseText + \"\\n\" + \"error:\" + error);\r\n");
      out.write("			}\r\n");
      out.write("		})\r\n");
      out.write("	}\r\n");
      out.write("\r\n");
      out.write("	function adEmpower(postNum) {\r\n");
      out.write("		$.ajax({\r\n");
      out.write("			type : 'POST',\r\n");
      out.write("			url : '/adEmpower',\r\n");
      out.write("			success : function(result) {\r\n");
      out.write("\r\n");
      out.write("				$(\"#convertAdPage\").empty();\r\n");
      out.write("				$(\"#convertAdPage\").append(result);\r\n");
      out.write("			},\r\n");
      out.write("			error : function(request, status, error) {\r\n");
      out.write("\r\n");
      out.write("				alert(\"code:\" + request.status + \"\\n\" + \"message:\"\r\n");
      out.write("						+ request.responseText + \"\\n\" + \"error:\" + error);\r\n");
      out.write("			}\r\n");
      out.write("		})\r\n");
      out.write("	}\r\n");
      out.write("\r\n");
      out.write("	function adSupport(postNum) {\r\n");
      out.write("		$.ajax({\r\n");
      out.write("			type : 'POST',\r\n");
      out.write("			url : '/adSupport',\r\n");
      out.write("			success : function(result) {\r\n");
      out.write("\r\n");
      out.write("				$(\"#convertAdPage\").empty();\r\n");
      out.write("				$(\"#convertAdPage\").append(result);\r\n");
      out.write("			},\r\n");
      out.write("			error : function(request, status, error) {\r\n");
      out.write("\r\n");
      out.write("				alert(\"code:\" + request.status + \"\\n\" + \"message:\"\r\n");
      out.write("						+ request.responseText + \"\\n\" + \"error:\" + error);\r\n");
      out.write("			}\r\n");
      out.write("		})\r\n");
      out.write("	}\r\n");
      out.write("\r\n");
      out.write("	function adIntro(postNum) {\r\n");
      out.write("		$.ajax({\r\n");
      out.write("			type : 'POST',\r\n");
      out.write("			url : '/adIntro',\r\n");
      out.write("			success : function(result) {\r\n");
      out.write("\r\n");
      out.write("				$(\"#convertAdPage\").empty();\r\n");
      out.write("				$(\"#convertAdPage\").append(result);\r\n");
      out.write("			},\r\n");
      out.write("			error : function(request, status, error) {\r\n");
      out.write("\r\n");
      out.write("				alert(\"code:\" + request.status + \"\\n\" + \"message:\"\r\n");
      out.write("						+ request.responseText + \"\\n\" + \"error:\" + error);\r\n");
      out.write("			}\r\n");
      out.write("		})\r\n");
      out.write("	}\r\n");
      out.write("</script>\r\n");
      out.write("<style>\r\n");
      out.write("ul.adUl>li>a {\r\n");
      out.write("	text-decoration: none;\r\n");
      out.write("	list-style: none;\r\n");
      out.write("	color: black;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("ul.adUl>li {\r\n");
      out.write("	margin-top: 60px;\r\n");
      out.write("	margin-bottom: 60px;\r\n");
      out.write("}\r\n");
      out.write("</style>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("	<div>\r\n");
      out.write("		<h1 style=\"text-align: center;\">관리자 페이지 입니다.</h1>\r\n");
      out.write("		<p style=\"text-align: center;\">메뉴 추가 및 삭제를 할 수 있습니다.</p>\r\n");
      out.write("	</div>\r\n");
      out.write("	<hr>\r\n");
      out.write("	<div>\r\n");
      out.write("		<span style=\"float: left;\">\r\n");
      out.write("			<ul class=\"adUl\">\r\n");
      out.write("				<li><a href=\"javascript:;\" onclick=\"adMento();\">멘토링</a></li>\r\n");
      out.write("				<li><a href=\"javascript:;\" onclick=\"adEmpower();\">역량강화</a></li>\r\n");
      out.write("				<li><a href=\"javascript:;\" onclick=\"adSupport();\">취업지원</a></li>\r\n");
      out.write("				<li><a href=\"javascript:;\" onclick=\"adIntro();\">재단소개</a></li>\r\n");
      out.write("			</ul>\r\n");
      out.write("		</span> \r\n");
      out.write("		<span style=\"float: left; padding-left: 50px; width: 90%;\" id=\"convertAdPage\">\r\n");
      out.write("			<h2 style=\"text-align: center;\">좌측 배너를 클릭해서 상세 보기</h2>\r\n");
      out.write("		</span>\r\n");
      out.write("	</div>\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
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
}