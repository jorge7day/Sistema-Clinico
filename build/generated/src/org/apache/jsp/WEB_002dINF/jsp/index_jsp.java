package org.apache.jsp.WEB_002dINF.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_url_var_value_nobody;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_c_url_var_value_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_c_url_var_value_nobody.release();
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\"\n");
      out.write("    \"http://www.w3.org/TR/html4/loose.dtd\">\n");
      out.write("<!-- fksdfksdj-->\n");
      out.write("<html>\n");
      out.write("<!--================================================================================\n");
      out.write("\tItem Name: Materialize - Material Design Admin Template\n");
      out.write("\tVersion: 3.1\n");
      out.write("\tAuthor: GeeksLabs\n");
      out.write("\tAuthor URL: http://www.themeforest.net/user/geekslabs\n");
      out.write("================================================================================ -->\n");
      out.write("<head>\n");
      out.write("    ");
      if (_jspx_meth_c_url_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("    ");
      if (_jspx_meth_c_url_1(_jspx_page_context))
        return;
      out.write("\n");
      out.write("    ");
      if (_jspx_meth_c_url_2(_jspx_page_context))
        return;
      out.write("\n");
      out.write("    ");
      if (_jspx_meth_c_url_3(_jspx_page_context))
        return;
      out.write("\n");
      out.write("    ");
      if (_jspx_meth_c_url_4(_jspx_page_context))
        return;
      out.write("\n");
      out.write("    ");
      if (_jspx_meth_c_url_5(_jspx_page_context))
        return;
      out.write("\n");
      out.write("    ");
      if (_jspx_meth_c_url_6(_jspx_page_context))
        return;
      out.write("\n");
      out.write("    ");
      if (_jspx_meth_c_url_7(_jspx_page_context))
        return;
      out.write("\n");
      out.write("    \n");
      out.write("    \n");
      out.write("  <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("  <meta name=\"viewport\" content=\"width=device-width, initial-scale=1, maximum-scale=1.0, user-scalable=no\">\n");
      out.write("  <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n");
      out.write("  <meta name=\"msapplication-tap-highlight\" content=\"no\">\n");
      out.write("\n");
      out.write("  <title>Centro Médico</title>\n");
      out.write("  <link rel=\"shortcut icon\" href=\"/resoures/images/logo.png\">\n");
      out.write("\n");
      out.write("  <!-- Favicons-->\n");
      out.write("   <!-- <link href=\"http://fonts.googleapis.com/icon?family=Material+Icons\" rel=\"stylesheet\"> -->\n");
      out.write("\n");
      out.write("  <!--<link rel=\"icon\" href=\"http://demo.geekslabs.com/materialize/v3.1/images/favicon/favicon-32x32.png\" sizes=\"32x32\">-->\n");
      out.write("  <!-- Favicons-->\n");
      out.write("  <link rel=\"apple-touch-icon-precomposed\" href=\"http://demo.geekslabs.com/materialize/v3.1/images/favicon/apple-touch-icon-152x152.png\">\n");
      out.write("  <!-- For iPhone -->\n");
      out.write("  <meta name=\"msapplication-TileColor\" content=\"#00bcd4\">\n");
      out.write("  <meta name=\"msapplication-TileImage\" content=\"images/favicon/mstile-144x144.png\">\n");
      out.write("  <!-- For Windows Phone -->\n");
      out.write("\n");
      out.write("\n");
      out.write("  <!-- CORE CSS-->\n");
      out.write(" \n");
      out.write("\n");
      out.write(" \n");
      out.write("  <link rel=\"shortcut icon\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${logoURL}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\">\n");
      out.write("  <link href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${loginURL}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" type=\"text/css\" rel=\"stylesheet\" media=\"screen,projection\">\n");
      out.write("  <link href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${styleloginURL}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" type=\"text/css\" rel=\"stylesheet\" media=\"screen,projection\">\n");
      out.write("    <!-- Custome CSS-->\n");
      out.write("    <link href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${customloginURL}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" type=\"text/css\" rel=\"stylesheet\" media=\"screen,projection\">\n");
      out.write("  <link href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageloginURL}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" type=\"text/css\" rel=\"stylesheet\" media=\"screen,projection\">\n");
      out.write("\n");
      out.write("  <!-- INCLUDED PLUGIN CSS ON THIS PAGE -->\n");
      out.write("  <link href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${prismloginURL}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" type=\"text/css\" rel=\"stylesheet\" media=\"screen,projection\">\n");
      out.write("  <link href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${scrollbarURL}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" type=\"text/css\" rel=\"stylesheet\" media=\"screen,projection\">\n");
      out.write("  </head>\n");
      out.write("\n");
      out.write("\n");
      out.write("<body class=\"cyan loaded\" data-pinterest-extension-installed=\"ff1.37.9\">\n");
      out.write("  <!-- Start Page Loading -->\n");
      out.write("  <div id=\"loader-wrapper\">\n");
      out.write("      <div id=\"loader\"></div>\n");
      out.write("      <div class=\"loader-section section-left\"></div>\n");
      out.write("      <div class=\"loader-section section-right\"></div>\n");
      out.write("  </div>\n");
      out.write("  <!-- End Page Loading -->\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("  <div id=\"login-page\" class=\"row\">\n");
      out.write("    <div class=\"col m12 z-depth-4 card-panel pull-m10\">\n");
      out.write("      <form class=\"login-form\">\n");
      out.write("        <div class=\"row\">\n");
      out.write("          <div class=\"input-field col s12 center\">\n");
      out.write("            <!--<img src=\" Images/logo1.png\" alt=\"\" class=\"circle responsive-img valign profile-image-login>-->\n");
      out.write("            <img src=\"resources/images/Logo1.png\">\n");
      out.write("\n");
      out.write("          </div>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"row margin\">\n");
      out.write("          <div class=\"input-field col s12\">\n");
      out.write("            <!--<img src=\" Images/logo.png\">-->\n");
      out.write("            <input id=\"username\" type=\"text\">\n");
      out.write("            <label for=\"username\" class=\"center-align\">Usuario</label>\n");
      out.write("          </div>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"row margin\">\n");
      out.write("          <div class=\"input-field col s12\">\n");
      out.write("           <!-- <i class=\"material-icons prefix black-text\">lock_outline</i>-->\n");
      out.write("            <input id=\"password\" type=\"password\">\n");
      out.write("            <label for=\"password\">Contraseña</label>\n");
      out.write("          </div>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"row\">\n");
      out.write("          <div class=\"input-field col s12 m12 l12  login-text\">\n");
      out.write("              <input id=\"remember-me\" type=\"checkbox\">\n");
      out.write("              <!--<label for=\"remember-me\">Remember me</label>-->\n");
      out.write("          </div>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"row\">\n");
      out.write("          <div class=\"input-field col s12\">\n");
      out.write("            <a href=\"principal.htm\" class=\"btn waves-effect waves-light col s12\">Iniciar Sesión</a>\n");
      out.write("          </div>\n");
      out.write("        </div>\n");
      out.write("          <div class=\"row\">\n");
      out.write("        <!--<div class=\"input-field col s6 m6 l6\">\n");
      out.write("            <p class=\"margin medium-small\"><a href=\"http://demo.geekslabs.com/materialize/v3.1/page-register.html\">Register Now!</a></p>\n");
      out.write("          </div>\n");
      out.write("          <div class=\"input-field col s6 m6 l6\">\n");
      out.write("              <p class=\"margin right-align medium-small\"><a href=\"http://demo.geekslabs.com/materialize/v3.1/page-forgot-password.html\">Forgot password ?</a></p>\n");
      out.write("          </div>\n");
      out.write("        </div>-->\n");
      out.write("\n");
      out.write("      </form>\n");
      out.write("    </div>\n");
      out.write("  </div>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("  <!-- ================================================\n");
      out.write("    Scripts\n");
      out.write("    ================================================ -->\n");
      out.write("\n");
      out.write("  <!-- jQuery Library -->\n");
      out.write("  <script type=\"text/javascript\" src=\"resources/Login/jquery-1.js\"></script>\n");
      out.write("  <!--materialize js-->\n");
      out.write("  <script type=\"text/javascript\" src=\"resources/Login/materialize.js\"></script>\n");
      out.write("  <!--prism-->\n");
      out.write("  <script type=\"text/javascript\" src=\"resources/Login/prism.js\"></script>\n");
      out.write("  <!--scrollbar-->\n");
      out.write("  <script type=\"text/javascript\" src=\"resources/Login/perfect-scrollbar.js\"></script>\n");
      out.write("\n");
      out.write("      <!--plugins.js - Some Specific JS codes for Plugin Settings-->\n");
      out.write("    <script type=\"text/javascript\" src=\"resources/Login/plugins.js\"></script>\n");
      out.write("    <!--custom-script.js - Add your own theme custom JS-->\n");
      out.write("    <script type=\"text/javascript\" src=\"resources/Login/custom-script.js\"></script>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<div class=\"hiddendiv common\"></div>\n");
      out.write("<!--<span style=\"border-radius: 2px; text-indent: 20px; width: auto; padding: 0px 4px 0px 0px; text-align: center; font: bold 11px/20px &quot;Helvetica Neue&quot;,Helvetica,sans-serif; color: rgb(255, 255, 255); background: rgb(189, 8, 28) url(&quot;data:image/svg+xml;base64,PHN2ZyB4bWxucz0iaHR0cDovL3d3dy53My5vcmcvMjAwMC9zdmciIGhlaWdodD0iMzBweCIgd2lkdGg9IjMwcHgiIHZpZXdCb3g9Ii0xIC0xIDMxIDMxIj48Zz48cGF0aCBkPSJNMjkuNDQ5LDE0LjY2MiBDMjkuNDQ5LDIyLjcyMiAyMi44NjgsMjkuMjU2IDE0Ljc1LDI5LjI1NiBDNi42MzIsMjkuMjU2IDAuMDUxLDIyLjcyMiAwLjA1MSwxNC42NjIgQzAuMDUxLDYuNjAxIDYuNjMyLDAuMDY3IDE0Ljc1LDAuMDY3IEMyMi44NjgsMC4wNjcgMjkuNDQ5LDYuNjAxIDI5LjQ0OSwxNC42NjIiIGZpbGw9IiNmZmYiIHN0cm9rZT0iI2ZmZiIgc3Ryb2tlLXdpZHRoPSIxIj48L3BhdGg+PHBhdGggZD0iTTE0LjczMywxLjY4NiBDNy41MTYsMS42ODYgMS42NjUsNy40OTUgMS42NjUsMTQuNjYyIEMxLjY2NSwyMC4xNTkgNS4xMDksMjQuODU0IDkuOTcsMjYuNzQ0IEM5Ljg1NiwyNS43MTggOS43NTMsMjQuMTQzIDEwLjAxNiwyMy4wMjIgQzEwLjI1MywyMi4wMSAxMS41NDgsMTYuNTcyIDExLjU0OCwxNi41NzIgQzExLjU0OCwxNi41NzIgMTEuMTU3LDE1Ljc5NSAxMS4xNTcsMTQuNjQ2IEMxMS4xNTcsMTIuODQyIDEyLjIxMSwxMS40OTUgMTMuNTIyLDExLjQ5NSBDMTQuNjM3LDExLjQ5NSAxNS4xNzUsMTIuMzI2IDE1LjE3NSwxMy4zMjMgQzE1LjE3NSwxNC40MzYgMTQuNDYyLDE2LjEgMTQuMDkzLDE3LjY0MyBDMTMuNzg1LDE4LjkzNSAxNC43NDUsMTkuOTg4IDE2LjAyOCwxOS45ODggQzE4LjM1MSwxOS45ODggMjAuMTM2LDE3LjU1NiAyMC4xMzYsMTQuMDQ2IEMyMC4xMzYsMTAuOTM5IDE3Ljg4OCw4Ljc2NyAxNC42NzgsOC43NjcgQzEwLjk1OSw4Ljc2NyA4Ljc3NywxMS41MzYgOC43NzcsMTQuMzk4IEM4Ljc3NywxNS41MTMgOS4yMSwxNi43MDkgOS43NDksMTcuMzU5IEM5Ljg1NiwxNy40ODggOS44NzIsMTcuNiA5Ljg0LDE3LjczMSBDOS43NDEsMTguMTQxIDkuNTIsMTkuMDIzIDkuNDc3LDE5LjIwMyBDOS40MiwxOS40NCA5LjI4OCwxOS40OTEgOS4wNCwxOS4zNzYgQzcuNDA4LDE4LjYyMiA2LjM4NywxNi4yNTIgNi4zODcsMTQuMzQ5IEM2LjM4NywxMC4yNTYgOS4zODMsNi40OTcgMTUuMDIyLDYuNDk3IEMxOS41NTUsNi40OTcgMjMuMDc4LDkuNzA1IDIzLjA3OCwxMy45OTEgQzIzLjA3OCwxOC40NjMgMjAuMjM5LDIyLjA2MiAxNi4yOTcsMjIuMDYyIEMxNC45NzMsMjIuMDYyIDEzLjcyOCwyMS4zNzkgMTMuMzAyLDIwLjU3MiBDMTMuMzAyLDIwLjU3MiAxMi42NDcsMjMuMDUgMTIuNDg4LDIzLjY1NyBDMTIuMTkzLDI0Ljc4NCAxMS4zOTYsMjYuMTk2IDEwLjg2MywyNy4wNTggQzEyLjA4NiwyNy40MzQgMTMuMzg2LDI3LjYzNyAxNC43MzMsMjcuNjM3IEMyMS45NSwyNy42MzcgMjcuODAxLDIxLjgyOCAyNy44MDEsMTQuNjYyIEMyNy44MDEsNy40OTUgMjEuOTUsMS42ODYgMTQuNzMzLDEuNjg2IiBmaWxsPSIjYmQwODFjIj48L3BhdGg+PC9nPjwvc3ZnPg==&quot;) no-repeat scroll 3px 50% / 14px 14px; position: absolute; opacity: 1; z-index: 8675309; display: none; cursor: pointer; border: medium none;\">Guardar</span></body></html>-->\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }

  private boolean _jspx_meth_c_url_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_url_0 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _jspx_tagPool_c_url_var_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    _jspx_th_c_url_0.setPageContext(_jspx_page_context);
    _jspx_th_c_url_0.setParent(null);
    _jspx_th_c_url_0.setValue("/resources/Login/materialize.css");
    _jspx_th_c_url_0.setVar("loginURL");
    int _jspx_eval_c_url_0 = _jspx_th_c_url_0.doStartTag();
    if (_jspx_th_c_url_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_url_var_value_nobody.reuse(_jspx_th_c_url_0);
      return true;
    }
    _jspx_tagPool_c_url_var_value_nobody.reuse(_jspx_th_c_url_0);
    return false;
  }

  private boolean _jspx_meth_c_url_1(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_url_1 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _jspx_tagPool_c_url_var_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    _jspx_th_c_url_1.setPageContext(_jspx_page_context);
    _jspx_th_c_url_1.setParent(null);
    _jspx_th_c_url_1.setValue("/resources/Login/style.css");
    _jspx_th_c_url_1.setVar("styleloginURL");
    int _jspx_eval_c_url_1 = _jspx_th_c_url_1.doStartTag();
    if (_jspx_th_c_url_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_url_var_value_nobody.reuse(_jspx_th_c_url_1);
      return true;
    }
    _jspx_tagPool_c_url_var_value_nobody.reuse(_jspx_th_c_url_1);
    return false;
  }

  private boolean _jspx_meth_c_url_2(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_url_2 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _jspx_tagPool_c_url_var_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    _jspx_th_c_url_2.setPageContext(_jspx_page_context);
    _jspx_th_c_url_2.setParent(null);
    _jspx_th_c_url_2.setValue("/resources/Login/custom.css");
    _jspx_th_c_url_2.setVar("customloginURL");
    int _jspx_eval_c_url_2 = _jspx_th_c_url_2.doStartTag();
    if (_jspx_th_c_url_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_url_var_value_nobody.reuse(_jspx_th_c_url_2);
      return true;
    }
    _jspx_tagPool_c_url_var_value_nobody.reuse(_jspx_th_c_url_2);
    return false;
  }

  private boolean _jspx_meth_c_url_3(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_url_3 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _jspx_tagPool_c_url_var_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    _jspx_th_c_url_3.setPageContext(_jspx_page_context);
    _jspx_th_c_url_3.setParent(null);
    _jspx_th_c_url_3.setValue("/resources/Login/page-center.css");
    _jspx_th_c_url_3.setVar("pageloginURL");
    int _jspx_eval_c_url_3 = _jspx_th_c_url_3.doStartTag();
    if (_jspx_th_c_url_3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_url_var_value_nobody.reuse(_jspx_th_c_url_3);
      return true;
    }
    _jspx_tagPool_c_url_var_value_nobody.reuse(_jspx_th_c_url_3);
    return false;
  }

  private boolean _jspx_meth_c_url_4(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_url_4 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _jspx_tagPool_c_url_var_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    _jspx_th_c_url_4.setPageContext(_jspx_page_context);
    _jspx_th_c_url_4.setParent(null);
    _jspx_th_c_url_4.setValue("/resources/Login/prism.css");
    _jspx_th_c_url_4.setVar("prismloginURL");
    int _jspx_eval_c_url_4 = _jspx_th_c_url_4.doStartTag();
    if (_jspx_th_c_url_4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_url_var_value_nobody.reuse(_jspx_th_c_url_4);
      return true;
    }
    _jspx_tagPool_c_url_var_value_nobody.reuse(_jspx_th_c_url_4);
    return false;
  }

  private boolean _jspx_meth_c_url_5(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_url_5 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _jspx_tagPool_c_url_var_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    _jspx_th_c_url_5.setPageContext(_jspx_page_context);
    _jspx_th_c_url_5.setParent(null);
    _jspx_th_c_url_5.setValue("/resources/Login/perfect-scrollbar.css");
    _jspx_th_c_url_5.setVar("scrollbarURL");
    int _jspx_eval_c_url_5 = _jspx_th_c_url_5.doStartTag();
    if (_jspx_th_c_url_5.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_url_var_value_nobody.reuse(_jspx_th_c_url_5);
      return true;
    }
    _jspx_tagPool_c_url_var_value_nobody.reuse(_jspx_th_c_url_5);
    return false;
  }

  private boolean _jspx_meth_c_url_6(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_url_6 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _jspx_tagPool_c_url_var_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    _jspx_th_c_url_6.setPageContext(_jspx_page_context);
    _jspx_th_c_url_6.setParent(null);
    _jspx_th_c_url_6.setValue("/resources/Login/page-center.css");
    _jspx_th_c_url_6.setVar("pageloginURL");
    int _jspx_eval_c_url_6 = _jspx_th_c_url_6.doStartTag();
    if (_jspx_th_c_url_6.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_url_var_value_nobody.reuse(_jspx_th_c_url_6);
      return true;
    }
    _jspx_tagPool_c_url_var_value_nobody.reuse(_jspx_th_c_url_6);
    return false;
  }

  private boolean _jspx_meth_c_url_7(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_url_7 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _jspx_tagPool_c_url_var_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    _jspx_th_c_url_7.setPageContext(_jspx_page_context);
    _jspx_th_c_url_7.setParent(null);
    _jspx_th_c_url_7.setValue("/resources/images/Logo.png");
    _jspx_th_c_url_7.setVar("logoURL");
    int _jspx_eval_c_url_7 = _jspx_th_c_url_7.doStartTag();
    if (_jspx_th_c_url_7.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_url_var_value_nobody.reuse(_jspx_th_c_url_7);
      return true;
    }
    _jspx_tagPool_c_url_var_value_nobody.reuse(_jspx_th_c_url_7);
    return false;
  }
}
