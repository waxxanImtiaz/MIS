package org.apache.jsp.about_002dus;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
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
      out.write("\n");
      out.write("﻿<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("\n");
      out.write("<head>\n");
      out.write("\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" media=\"all\" href=\"../wp-content/themes/duet/style.css\" />\n");
      out.write("\n");
      out.write("\t  \n");
      out.write("<!-- MIS DUET-->\n");
      out.write("<title>MIS DUET</title>\n");
      out.write("\n");
      out.write("<script src=\"../wp-content/themes/duet/menu/jquery-1.10.2.min.js\"></script>\n");
      out.write("\n");
      out.write("</head>\n");
      out.write("\n");
      out.write("<link rel=\"stylesheet\" href=\"../wp-content/themes/duet/menu/demo.css\">\n");
      out.write("<link rel=\"stylesheet\" href=\"../wp-content/themes/duet/menu/daisynav.css\">\n");
      out.write("\n");
      out.write("\n");
      out.write("<body class=\"page page-id-22 page-parent page-template-default\">\n");
      out.write("\n");
      out.write("    \t<!-- page -->\n");
      out.write("\t\t<script src=\"../wp-content/themes/duet/backstretch/jquery.backstretch.min.js\"></script>\n");
      out.write("\t\t<script>\n");
      out.write("            $.backstretch([\n");
      out.write("                 \n");
      out.write("              \"../wp-content/uploads/2014/09/about_bg1.png\",\n");
      out.write("              \n");
      out.write("            ],  {\n");
      out.write("                fade: 750,\n");
      out.write("                duration: 4000,\n");
      out.write("                transition :'fade',\n");
      out.write("                transition_speed:500, \n");
      out.write("                navigation : 1,\n");
      out.write("                fit_portrait: 0,\n");
      out.write("                fit_landscape0:0,\n");
      out.write("                slide_captions: 1,\n");
      out.write("                slide_counter :1\n");
      out.write("            });\n");
      out.write("     \n");
      out.write("    //    \t$.backstretch(\"\");\n");
      out.write("        </script>\n");
      out.write("\t\t\n");
      out.write("\t\n");
      out.write("<div id=\"wrapper\" class=\"hfeed\">\n");
      out.write("\t<div class=\"inner_wrap\">\n");
      out.write("    <div id=\"header\">\n");
      out.write("    <!--inner_wrap-->\n");
      out.write("    \n");
      out.write("        <!--.inner_head-->\t\n");
      out.write("    \t<div class=\"inner_header\">\n");
      out.write("         \n");
      out.write("                <div class=\"logo\">\n");
      out.write("                <a href=\"index.html\" title=\"MIS DUET\">\n");
      out.write("                         <img src=\"../wp-content/themes/duet/images/logo1.jpg\" height=314  width=244>\n");
      out.write("                                </a>\n");
      out.write("                </div>\n");
      out.write("                <div id=\"nav-trigger\">\n");
      out.write("                        <div>- <span class=\"slicknav_icon\"><span class=\"slicknav_icon-bar\"></span><span class=\"slicknav_icon-bar\"></span><span class=\"slicknav_icon-bar\"></span></span></div>\n");
      out.write("                </div>\n");
      out.write("                <nav id=\"nav-mobile\">\n");
      out.write("                    \t<div class=\"menu-top-menu-container\"><ul id=\"menu-top-menu\" class=\"menu\">\n");
      out.write("<li id=\"menu-item-7286\" class=\"menu-item menu-item-type-post_type menu-item-object-page menu-item-7286\"><a href=\"#\">Log Out</a></li>\n");
      out.write("</ul></div>                </nav>\n");
      out.write("                <div class=\"top_menu\">\n");
      out.write("                \t<div class=\"menu-header\"><ul id=\"menu-top-menu-1\" class=\"menu\">\n");
      out.write("<li class=\"menu-item menu-item-type-post_type menu-item-object-page menu-item-7286\"><a href=\"#\">Log Out</a></li>\n");
      out.write("</ul></div>                \n");
      out.write("      \n");
      out.write("                <div class=\"search\">\n");
      out.write("                \t     \n");
      out.write("\t\t\t\t\n");
      out.write("                </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("\t\t\t<!--.inner_head-->\n");
      out.write("            \n");
      out.write("            <div class=\"vav_wrap\">\n");
      out.write("            <div  class=\"menu-toggle-button\" data-menu-id=\"demo-menu\">MENU <i>---</i>≡</div>\n");
      out.write("            <div class=\"res_menu\"><ul class=\"menu-list\" id=\"demo-menu\"><li id=\"item-id\">Menu: </li>\n");
      out.write("\t\t\t\n");
      out.write("\t\t\t</div>            \n");
      out.write("            \t<div class=\"inner_wraper\">\n");
      out.write("                    <div id=\"access\" role=\"navigation\">\n");
      out.write("                        <div class=\"menu-header\"><ul id=\"menu-main-menu-1\" class=\"menu\">\n");
      out.write("\t\t\t\t\t\t<li class=\"menu-item menu-item-type-post_type menu-item-object-page current-menu-item page_item page-item-22 current_page_item menu-item-has-children menu-item-36\"><a href=\"index.html\">Home Page </a>\n");
      out.write("\t\t\t\t\t\t<li class=\"menu-item menu-item-type-post_type menu-item-object-page current-menu-item page_item page-item-22 current_page_item menu-item-has-children menu-item-36\"><a href=\"personel.html\">Personel </a>\n");
      out.write("\t\t\t\t\t\t\n");
      out.write("<ul class=\"sub-menu\">\n");
      out.write("\t<li class=\"menu-item menu-item-type-post_type menu-item-object-page menu-item-7840\"><a href=\"personel.html\">Personel Information</a></li>\n");
      out.write("</ul>\n");
      out.write("</li>\n");
      out.write("\n");
      out.write("<li class=\"menu-item menu-item-type-post_type menu-item-object-page menu-item-has-children menu-item-50\"><a href=\"academics.html\"> Academics </a>\n");
      out.write("<ul class=\"sub-menu\">\n");
      out.write("\t<li class=\"menu-item menu-item-type-post_type menu-item-object-page menu-item-has-children menu-item-975\"><a href=\"m_attendance.html\">Attendance</a>\n");
      out.write("\t<ul class=\"sub-menu\">\n");
      out.write("\t\t<li class=\"menu-item menu-item-type-post_type menu-item-object-page menu-item-980\"><a href=\"attendance.html\">1st Semister</a></li>\n");
      out.write("\t\t<li class=\"menu-item menu-item-type-post_type menu-item-object-page menu-item-981\"><a href=\"#\">2nd Semister</a></li>\n");
      out.write("\t\t<li class=\"menu-item menu-item-type-post_type menu-item-object-page menu-item-982\"><a href=\"#\">3rd Semister</a></li>\n");
      out.write("\t\t<li class=\"menu-item menu-item-type-post_type menu-item-object-page menu-item-7308\"><a href=\"#\">4th Semister</a></li>\n");
      out.write("\t\t<li class=\"menu-item menu-item-type-post_type menu-item-object-page menu-item-980\"><a href=\"#\">5th Semister</a></li>\n");
      out.write("\t\t<li class=\"menu-item menu-item-type-post_type menu-item-object-page menu-item-981\"><a href=\"#\">6th Semister</a></li>\n");
      out.write("\t\t<li class=\"menu-item menu-item-type-post_type menu-item-object-page menu-item-982\"><a href=\"#\">7th Semister</a></li>\n");
      out.write("\t\t<li class=\"menu-item menu-item-type-post_type menu-item-object-page menu-item-7308\"><a href=\"#\">8th Semister</a></li>\n");
      out.write("\t</ul>\n");
      out.write("\t<li class=\"menu-item menu-item-type-post_type menu-item-object-page menu-item-has-children menu-item-975\"><a href=\"library.html\">Library</a>\n");
      out.write("\t<ul class=\"sub-menu\">\n");
      out.write("\t\t<li class=\"menu-item menu-item-type-post_type menu-item-object-page menu-item-980\"><a href=\"library.html\">Borrowed Books</a></li>\n");
      out.write("\t\t<li class=\"menu-item menu-item-type-post_type menu-item-object-page menu-item-981\"><a href=\"#\">Books List</a></li>\n");
      out.write("\t\t\n");
      out.write("\t</ul>\n");
      out.write("</li>\n");
 beans.Students personalInfo = (beans.Students)session.getAttribute("personalInfo"); 
      out.write("\n");
      out.write("\t<li class=\"menu-item menu-item-type-post_type menu-item-object-page menu-item-has-children menu-item-975\"><a href=\"library.html\">Lectures</a>\n");
      out.write("\t<ul class=\"sub-menu\">\n");
      out.write("\t\t<li class=\"menu-item menu-item-type-post_type menu-item-object-page menu-item-980\"><a href=\"#\">1st Semister</a></li>\n");
      out.write("\t\t<li class=\"menu-item menu-item-type-post_type menu-item-object-page menu-item-981\"><a href=\"#\">2nd Semister</a></li>\n");
      out.write("\t\t<li class=\"menu-item menu-item-type-post_type menu-item-object-page menu-item-982\"><a href=\"#\">3rd Semister</a></li>\n");
      out.write("\t\t<li class=\"menu-item menu-item-type-post_type menu-item-object-page menu-item-7308\"><a href=\"#\">4th Semister</a></li>\n");
      out.write("\t\t<li class=\"menu-item menu-item-type-post_type menu-item-object-page menu-item-980\"><a href=\"#\">5th Semister</a></li>\n");
      out.write("\t\t<li class=\"menu-item menu-item-type-post_type menu-item-object-page menu-item-981\"><a href=\"#\">6th Semister</a></li>\n");
      out.write("\t\t<li class=\"menu-item menu-item-type-post_type menu-item-object-page menu-item-982\"><a href=\"#\">7th Semister</a></li>\n");
      out.write("\t\t<li class=\"menu-item menu-item-type-post_type menu-item-object-page menu-item-7308\"><a href=\"#\">8th Semister</a></li>\n");
      out.write("\t\t\n");
      out.write("\t</ul>\n");
      out.write("</li>\n");
      out.write("\t<li class=\"menu-item menu-item-type-post_type menu-item-object-page menu-item-9573\"><a href=\"#\">Time table</a></li>\n");
      out.write("</ul>\n");
      out.write("</li>\n");
      out.write("<li class=\"menu-item menu-item-type-post_type menu-item-object-page menu-item-has-children menu-item-37\"><a href=\"miscellaneous.html\"> Miscellenous </a>\n");
      out.write("<ul class=\"sub-menu\">\n");
      out.write("\t<li class=\"menu-item menu-item-type-post_type menu-item-object-page menu-item-9783\"><a href=\"#\">News</a></li>\n");
      out.write("\t<li class=\"menu-item menu-item-type-post_type menu-item-object-page menu-item-has-children menu-item-515\"><a href=\"#\">Messege</a>\n");
      out.write("\t\n");
      out.write("</ul>\n");
      out.write("</li>\n");
      out.write("<li class=\"menu-item menu-item-type-post_type menu-item-object-page menu-item-has-children menu-item-37\"><a href=\"m_result.html\"> Result / Exams </a>\n");
      out.write("<ul class=\"sub-menu\">\n");
      out.write("\t<li class=\"menu-item menu-item-type-post_type menu-item-object-page menu-item-9783\"><a href=\"result.html\">1st Semister</a></li>\n");
      out.write("\t<li class=\"menu-item menu-item-type-post_type menu-item-object-page menu-item-has-children menu-item-515\"><a href=\"#\">2nd Semister</a>\n");
      out.write("\t<li class=\"menu-item menu-item-type-post_type menu-item-object-page menu-item-has-children menu-item-8238\"><a href=\"#\">3rd Semister</a>\n");
      out.write("\t<li class=\"menu-item menu-item-type-post_type menu-item-object-page menu-item-has-children menu-item-515\"><a href=\"#\">4th Semister</a>\n");
      out.write("\t<li class=\"menu-item menu-item-type-post_type menu-item-object-page menu-item-has-children menu-item-8238\"><a href=\"#\">5th Semister</a>\n");
      out.write("\t<li class=\"menu-item menu-item-type-post_type menu-item-object-page menu-item-has-children menu-item-8238\"><a href=\"#\">6th Semister</a>\n");
      out.write("\t<li class=\"menu-item menu-item-type-post_type menu-item-object-page menu-item-has-children menu-item-515\"><a href=\"#\">7th Semister</a>\n");
      out.write("\t<li class=\"menu-item menu-item-type-post_type menu-item-object-page menu-item-has-children menu-item-8238\"><a href=\"#\">8th Semister</a>\n");
      out.write("</ul>\n");
      out.write("</li>\n");
      out.write("<li id=\"menu-item-8238\" class=\"menu-item menu-item-type-post_type menu-item-object-page menu-item-has-children menu-item-8238\"><a href=\"#\"> Transport </a>\n");
      out.write("<ul class=\"sub-menu\">\n");
      out.write("\t<li class=\"menu-item menu-item-type-post_type menu-item-object-page menu-item-has-children menu-item-975\"><a href=\"#\">Points Route</a>\n");
      out.write("\t<ul class=\"sub-menu\">\n");
      out.write("\t<li class=\"menu-item menu-item-type-post_type menu-item-object-page menu-item-has-children menu-item-515\"><a href=\"#\">Point No: 1</a>\n");
      out.write("\t<li class=\"menu-item menu-item-type-post_type menu-item-object-page menu-item-has-children menu-item-8238\"><a href=\"#\">Point No: 2</a>\n");
      out.write("\t<li class=\"menu-item menu-item-type-post_type menu-item-object-page menu-item-has-children menu-item-515\"><a href=\"#\">Point No: 3</a>\n");
      out.write("\t<li class=\"menu-item menu-item-type-post_type menu-item-object-page menu-item-has-children menu-item-8238\"><a href=\"#\">Point No: 4</a>\n");
      out.write("\t<li class=\"menu-item menu-item-type-post_type menu-item-object-page menu-item-has-children menu-item-8238\"><a href=\"#\">Point No: 5</a>\n");
      out.write("\t<li class=\"menu-item menu-item-type-post_type menu-item-object-page menu-item-has-children menu-item-515\"><a href=\"#\">Point No: 6</a>\n");
      out.write("\t<li class=\"menu-item menu-item-type-post_type menu-item-object-page menu-item-has-children menu-item-8238\"><a href=\"#\">Point No: 7</a>\t\n");
      out.write("\t\t\n");
      out.write("\t</ul>\n");
      out.write("</li>\n");
      out.write("\t<li class=\"menu-item menu-item-type-post_type menu-item-object-page menu-item-has-children menu-item-975\"><a href=\"#\">Points Location</a>\n");
      out.write("\t<ul class=\"sub-menu\">\n");
      out.write("\t<li class=\"menu-item menu-item-type-post_type menu-item-object-page menu-item-has-children menu-item-515\"><a href=\"#\">Point No: 1</a>\n");
      out.write("\t<li class=\"menu-item menu-item-type-post_type menu-item-object-page menu-item-has-children menu-item-8238\"><a href=\"#\">Point No: 2</a>\n");
      out.write("\t<li class=\"menu-item menu-item-type-post_type menu-item-object-page menu-item-has-children menu-item-515\"><a href=\"#\">Point No: 3</a>\n");
      out.write("\t<li class=\"menu-item menu-item-type-post_type menu-item-object-page menu-item-has-children menu-item-8238\"><a href=\"#\">Point No: 4</a>\n");
      out.write("\t<li class=\"menu-item menu-item-type-post_type menu-item-object-page menu-item-has-children menu-item-8238\"><a href=\"#\">Point No: 5</a>\n");
      out.write("\t<li class=\"menu-item menu-item-type-post_type menu-item-object-page menu-item-has-children menu-item-515\"><a href=\"#\">Point No: 6</a>\n");
      out.write("\t<li class=\"menu-item menu-item-type-post_type menu-item-object-page menu-item-has-children menu-item-8238\"><a href=\"#\">Point No: 7</a>\t\n");
      out.write("\t\t\n");
      out.write("\t</ul>\n");
      out.write("</li>\n");
      out.write("\t\n");
      out.write("</ul>\n");
      out.write("</li>\n");
      out.write("<li class=\"menu-item menu-item-type-post_type menu-item-object-page menu-item-has-children menu-item-7300\"><a href=\"m_attendance.html\"> Attendance </a>\n");
      out.write("<ul class=\"sub-menu\">\n");
      out.write("\t<li class=\"menu-item menu-item-type-post_type menu-item-object-page menu-item-8788\"><a href=\"attendance.html\">1st Semister</a></li>\n");
      out.write("\t<li class=\"menu-item menu-item-type-post_type menu-item-object-page menu-item-8787\"><a href=\"#\">2nd Semister</a></li>\n");
      out.write("\t<li class=\"menu-item menu-item-type-post_type menu-item-object-page menu-item-8791\"><a href=\"#\">3rd Semister</a></li>\n");
      out.write("\t<li class=\"menu-item menu-item-type-post_type menu-item-object-page menu-item-8790\"><a href=\"#\">4th Semister</a></li>\n");
      out.write("\t<li class=\"menu-item menu-item-type-post_type menu-item-object-page menu-item-8789\"><a href=\"#\">5th Semister</a></li>\n");
      out.write("\t<li class=\"menu-item menu-item-type-post_type menu-item-object-page menu-item-8790\"><a href=\"#\">6th Semister</a></li>\n");
      out.write("\t<li class=\"menu-item menu-item-type-post_type menu-item-object-page menu-item-8789\"><a href=\"#\">7th Semister</a></li>\n");
      out.write("\t<li class=\"menu-item menu-item-type-custom menu-item-object-custom menu-item-7306\"><a href=\"#\">8th Semister</a></li>\n");
      out.write("</ul> \n");
      out.write("</li>\n");
      out.write("<li class=\"menu-item menu-item-type-post_type menu-item-object-page menu-item-has-children menu-item-7300\"><a href=\"library.html\"> Library </a>\n");
      out.write("<ul class=\"sub-menu\">\n");
      out.write("\t<li class=\"menu-item menu-item-type-post_type menu-item-object-page menu-item-8787\"><a href=\"library.html\">Borrowed Books</a></li>\n");
      out.write("\t<li class=\"menu-item menu-item-type-post_type menu-item-object-page menu-item-8791\"><a href=\"#\">Books List</a></li>\n");
      out.write("</ul>\n");
      out.write("</li>\n");
      out.write("<li class=\"menu-item menu-item-type-post_type menu-item-object-page menu-item-7307\"><a href=\"#\"> Course Content </a></li>\n");
      out.write("</ul></div>                    </div><!-- #access -->\n");
      out.write("                    <nav id=\"nav-mobile\">\n");
      out.write("                    \t                    </nav>\n");
      out.write("                 </div>   \n");
      out.write("        \t</div>\n");
      out.write("\t</div><!-- #header -->\n");
      out.write("        <!-- setting objects -->\n");
      out.write("       \n");
      out.write("        <div id=\"main\">\n");
      out.write("           \n");
      out.write("            \t\n");
      out.write("       \n");
      out.write("\t\t<div id=\"container\">\n");
      out.write("\t\t\t<div id=\"content\" role=\"main\">\n");
      out.write("\n");
      out.write("\t\t\t\n");
      out.write("\n");
      out.write("\t\t\t\t<div id=\"post-22\" class=\"post-22 page type-page status-publish has-post-thumbnail hentry\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<h1 class=\"entry-title\">Profile</h1>\n");
      out.write("\t\t\t\t\t\n");
      out.write("\t\t\t\t\t<div class=\"entry-content\">\n");
      out.write("<div class=\"link_images\">\n");
      out.write("<div class=\"menu_item col4\"><a href=\"personel.html\" ><h2 class=\"red white\" style=\"bottom:0\">Personel Information</h2><img class=\"alignnone size-full wp-image-84\" src=\"../wp-content/uploads/2014/09/personel.jpg\" alt=\"vision-values\" width=\"256\" height=\"165\" /></a></div><br />\n");
      out.write("<div class=\"menu_item col4\"><a href=\"academics.html\" ><h2 class=\"blue white\" style=\"bottom:0\">Academics</h2><img class=\"alignnone size-full wp-image-88\" src=\"../wp-content/uploads/2014/09/academics.jpg\" alt=\"uni-leaders\" width=\"256\" height=\"165\" /></a></div><br />\n");
      out.write("<div class=\"menu_item col4\"><a href=\"miscellaneous.html\" ><h2 class=\"yellow indigo\" style=\"bottom:0\">Miscellenous</h2><img class=\"alignnone size-full wp-image-85\" src=\"../wp-content/uploads/2014/09/miscellaneous.jpg\" alt=\"offic-of-president\" width=\"257\" height=\"165\" /></a></div><br />\n");
      out.write("<div class=\"menu_item col4\"><a href=\"m_result.html\" ><h2 class=\"yellow indigo\" style=\"bottom:0\">Result</h2><img class=\"alignnone size-full wp-image-85\" src=\"../wp-content/uploads/2014/09/result.jpg\" alt=\"offic-of-president\" width=\"257\" height=\"165\" /></a></div><br />\n");
      out.write("<div class=\"menu_item col4\"><a href=\"#\" ><h2 class=\"blue white\" style=\"bottom:0\">Transport</h2><img class=\"alignnone size-full wp-image-84\" src=\"../wp-content/uploads/2014/09/transport.jpg\" alt=\"vision-values\" width=\"256\" height=\"165\" /></a></div><br />\n");
      out.write("<div class=\"menu_item col4\"><a href=\"#\" ><h2 class=\"red white\" style=\"bottom:0\">Complaints/Help</h2><img class=\"alignnone size-full wp-image-88\" src=\"../wp-content/uploads/2014/09/duet.jpg\" alt=\"uni-leaders\" width=\"256\" height=\"165\" /></a></div>\n");
      out.write("\n");
      out.write("\n");
      out.write("</div>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t</div><!-- .entry-content -->\n");
      out.write("\t\t\t\t</div><!-- #post-## -->\n");
      out.write("\n");
      out.write("\t\t\t\t\n");
      out.write("\n");
      out.write("\t\t\t</div><!-- #content -->\n");
      out.write("                        \n");
      out.write("\t\t<div id=\"primary\" class=\"widget-area\" role=\"complementary\">\n");
      out.write("\n");
      out.write("                    <h3  class=\"widget-title side\"></h3>\n");
      out.write("  <ul class=\"tb_side\">\n");
      out.write("      <li class=\"page_item page-item-51 page_item_has_children\"><a>");
      out.print(personalInfo.getRollNum());
      out.write("</a>\n");
      out.write("<ul class='children'>\n");
      out.write("\t\n");
      out.write("</ul>\n");
      out.write("</li>\n");
      out.write("<li class=\"page_item page-item-53 page_item_has_children\"><a>");
      out.print(personalInfo.getName());
      out.write("</a>\n");
      out.write("<ul class='children'>\n");
      out.write("\t\n");
      out.write("</ul>\n");
      out.write("</li>\n");
      out.write("\n");
      out.write("\n");
      out.write("<li class=\"page_item page-item-59 page_item_has_children\"><a>Computer Systems Engineerig</a>\n");
      out.write("<ul class='children'>\n");
      out.write("\n");
      out.write("</ul>\n");
      out.write("</li>\n");
      out.write("<li class=\"page_item page-item-53 page_item_has_children\"><a>Contact No: ");
      out.print(personalInfo.getStContactNum());
      out.write(" </a>\n");
      out.write("<ul class='children'>\n");
      out.write("\t\n");
      out.write("</ul>\n");
      out.write("</li>\n");
      out.write("\n");
      out.write("\n");
      out.write("<li class=\"page_item page-item-59 page_item_has_children\"><a>F/contact:");
      out.print(personalInfo.getFtContactNum());
      out.write("</a>\n");
      out.write("<ul class='children'>\n");
      out.write("\n");
      out.write("</ul>\n");
      out.write("</li>\n");
      out.write("<li class=\"page_item page-item-7830\"><a href=\"complaint.html\">Complaints/Help</a></li>\n");
      out.write("  </ul>\n");
      out.write("\n");
      out.write("    \n");
      out.write("\t\n");
      out.write("\t\t\t\n");
      out.write("\t\t</div><!-- #primary .widget-area -->\n");
      out.write("\n");
      out.write("\n");
      out.write("\t\t</div><!-- #container -->\n");
      out.write("\n");
      out.write("\n");
      out.write("</div>\n");
      out.write("<!-- #main -->\n");
      out.write("</div>\n");
      out.write("<!--.inner_wrap-->\n");
      out.write("<div id=\"footer\" role=\"contentinfo\">\n");
      out.write("  <div class=\"inner_footer\">\n");
      out.write("    <div class=\"main_footer\">\n");
      out.write("      <div class=\"footer_col\">\n");
      out.write("        <li id=\"nav_menu-2\" class=\"widget-container widget_nav_menu\"><h3 class=\"widget-title\">PERSONEL</h3><div class=\"menu-about-us-container\"><ul id=\"menu-about-us\" class=\"menu\"><li id=\"menu-item-65\" class=\"menu-item menu-item-type-post_type menu-item-object-page menu-item-65\"><a href=\"#\">Personel Information</a></li>\n");
      out.write("</ul></div></li>\n");
      out.write("<li id=\"nav_menu-3\" class=\"widget-container widget_nav_menu\"><h3 class=\"widget-title\"> </h3></a> <div class=\"menu-footer-house-of-habib-container\"><ul id=\"menu-footer-house-of-habib\" class=\"menu\">\n");
      out.write("<li id=\"menu-item-6363\" class=\"menu-item menu-item-type-post_type menu-item-object-page menu-item-6363\"><a href=\"complaint.html\">Complaints/Help</a></li>\n");
      out.write("\n");
      out.write("</ul></div></li>      </div>\n");
      out.write("      <div class=\"footer_col\">\n");
      out.write("        <li id=\"nav_menu-4\" class=\"widget-container widget_nav_menu\"><h3 class=\"widget-title\">DEPARTMENTS</h3><div class=\"menu-footer-prospective-container\"><ul id=\"menu-footer-prospective\" class=\"menu\"><li id=\"menu-item-241\" class=\"menu-item menu-item-type-post_type menu-item-object-page menu-item-241\"><a href=\"#\">Computer System Engineering</a></li>\n");
      out.write("<li id=\"menu-item-242\" class=\"menu-item menu-item-type-post_type menu-item-object-page menu-item-242\"><a href=\"#\">Chemical Engineering</a></li>\n");
      out.write("<li id=\"menu-item-240\" class=\"menu-item menu-item-type-post_type menu-item-object-page menu-item-240\"><a href=\"#\">Telecommunication Engineering</a></li>\n");
      out.write("<li id=\"menu-item-6373\" class=\"menu-item menu-item-type-post_type menu-item-object-page menu-item-6373\"><a href=\"#\">Petrolium and Gas Engineering</a></li>\n");
      out.write("<li id=\"menu-item-243\" class=\"menu-item menu-item-type-post_type menu-item-object-page menu-item-243\"><a href=\"#\">Electronics Engineering</a></li>\n");
      out.write("<li id=\"menu-item-6373\" class=\"menu-item menu-item-type-post_type menu-item-object-page menu-item-6373\"><a href=\"#\">Metaulargy and Materials Engineering</a></li>\n");
      out.write("<li id=\"menu-item-6374\" class=\"menu-item menu-item-type-post_type menu-item-object-page menu-item-6374\"><a href=\"#\">Industrial Engineering and Management</a></li>\n");
      out.write("<li id=\"menu-item-6375\" class=\"menu-item menu-item-type-post_type menu-item-object-page menu-item-6375\"><a href=\"#\">Energy and Enviroment Engineering </a></li>\n");
      out.write("<li id=\"menu-item-6729\" class=\"menu-item menu-item-type-post_type menu-item-object-page menu-item-6729\"><a href=\"#\">Architecture</a></li>\n");
      out.write("\n");
      out.write("</ul></div></li>      </div>\n");
      out.write("      <div class=\"footer_col\">\n");
      out.write("        <li id=\"nav_menu-5\" class=\"widget-container widget_nav_menu\"><h3 class=\"widget-title\">DUET</h3><div class=\"menu-footer-life-habib-container\">\n");
      out.write("\t\t<ul id=\"menu-footer-life-habib\" class=\"menu\">\n");
      out.write("\t\t<li id=\"menu-item-6248\" class=\"menu-item menu-item-type-post_type menu-item-object-page menu-item-6248\"><a href=\"#\">Duet Website</a></li>\n");
      out.write("<li id=\"menu-item-6249\" class=\"menu-item menu-item-type-post_type menu-item-object-page menu-item-6249\"><a href=\"#\">Duet QEC</a></li>\n");
      out.write("<li id=\"menu-item-6250\" class=\"menu-item menu-item-type-post_type menu-item-object-page menu-item-6250\"><a href=\"#\">Duet Mail</a></li>\n");
      out.write("</ul></div></li>\n");
      out.write("</ul></div></li>      </div>\n");
      out.write("      <div class=\"footer_col\">\n");
      out.write("        <li id=\"nav_menu-6\" class=\"widget-container widget_nav_menu\"><h3 class=\"widget-title\">Contact Us</h3><div class=\"menu-footer-current-student-container\"><ul id=\"menu-footer-current-student\" class=\"menu\"><li id=\"menu-item-9091\" class=\"menu-item menu-item-type-post_type menu-item-object-page menu-item-9091\"><a href=\"#\">Duet M.A Jinnah Road, Karachi-74800</a></li>\n");
      out.write("<li id=\"menu-item-9093\" class=\"menu-item menu-item-type-post_type menu-item-object-page menu-item-9093\"><a href=\"#\">Telephone: \n");
      out.write("+92 21 9923 1195/96/97/98 Ext: 267 </a></li>\n");
      out.write("<li id=\"menu-item-9094\" class=\"menu-item menu-item-type-post_type menu-item-object-page menu-item-9094\"><a href=\"#\">Vice Chancellor\n");
      out.write("Dr. Faiz ullah Abbasi \n");
      out.write("PS to VC: +92 021 9923 1195/98 Ext: 267 </a></li>\n");
      out.write("<li id=\"menu-item-288\" class=\"menu-item menu-item-type-post_type menu-item-object-page menu-item-288\"><a href=\"#\">Registrar \n");
      out.write("Engr. Capt(R) Syed Waqar Hussain\n");
      out.write("Ph: +92 21 9923 2645 Ext: 262\n");
      out.write("registrar@duet.edu.pk </a></li>\n");
      out.write("</ul></div></li>\n");
      out.write("</ul></div></li>      </div>\n");
      out.write("      <div class=\"footer_col\">\n");
      out.write("        <li id=\"nav_menu-7\" class=\"widget-container widget_nav_menu\"><h3 class=\"widget-title\">About Us</h3><div class=\"menu-footer-library-container\"><ul id=\"menu-footer-library\" class=\"menu\"><li id=\"menu-item-8039\" class=\"menu-item menu-item-type-post_type menu-item-object-page menu-item-8039\"><a href=\"#\">Imtiaz Ali Wassan</a></li>\n");
      out.write("<li id=\"menu-item-6459\" class=\"menu-item menu-item-type-custom menu-item-object-custom menu-item-6459\"><a target=\"_blank\" href=\"#\">Abdul Qayyum Laghari</a></li>\n");
      out.write("<li id=\"menu-item-9379\" class=\"menu-item menu-item-type-post_type menu-item-object-page menu-item-9379\"><a href=\"#\">Asghar Ali Lashari</a></li>\n");
      out.write("<li id=\"menu-item-9380\" class=\"menu-item menu-item-type-post_type menu-item-object-page menu-item-9380\"><a href=\"#\">Munesh Kumar Rathore</a></li>\n");
      out.write("</ul></div></li>\n");
      out.write("</ul></div></li>      </div>\n");
      out.write("    </div>\n");
      out.write("      </div>\n");
      out.write("  \n");
      out.write("  <div id=\"site-info\">\n");
      out.write("    <div class=\"inner_wraper\">\n");
      out.write("      <div class=\"footer_social\"> \n");
      out.write("      </div>\n");
      out.write("      <div class=\"footer_right\">\n");
      out.write("        \n");
      out.write("         Rights Reserved - Dawood unniversity Of Engineering and Technology karachi | Laghari - Wassan - Lashari - Kumar<a href=\"#\" target=\"_blank\" style=\"color:#fff !important;\"></a></p>\n");
      out.write("      </div>\n");
      out.write("    </div>\n");
      out.write("    <!-- #site-info --> \n");
      out.write("    \n");
      out.write("  </div>\n");
      out.write("</div>\n");
      out.write("<!-- #footer -->\n");
      out.write("</div>\n");
      out.write("<!-- #wrapper -->\n");
      out.write("<link rel='stylesheet' id='elite-accordion-plugin-style-css'  href='../wp-content/plugins/elite-accordion/css/elite_style8686.css?ver=4.5.1' type='text/css' media='all' />\n");
      out.write("<script type='text/javascript' src='../wp-content/plugins/elite-accordion/js/main68b3.js?ver=1'></script>\n");
      out.write("<script type='text/javascript' src='../wp-content/plugins/elite-accordion/js/modernizr68b3.js?ver=1'></script>\n");
      out.write("<script type='text/javascript'>\n");
      out.write("/* <![CDATA[ */\n");
      out.write("var JQLBSettings = {\"fitToScreen\":\"0\",\"resizeSpeed\":\"400\",\"displayDownloadLink\":\"0\",\"navbarOnTop\":\"0\",\"loopImages\":\"\",\"resizeCenter\":\"\",\"marginSize\":\"\",\"linkTarget\":\"\",\"help\":\"\",\"prevLinkTitle\":\"previous image\",\"nextLinkTitle\":\"next image\",\"prevLinkText\":\"\\u00ab Previous\",\"nextLinkText\":\"Next \\u00bb\",\"closeTitle\":\"close image gallery\",\"image\":\"Image \",\"of\":\" of \",\"download\":\"Download\",\"jqlb_overlay_opacity\":\"80\",\"jqlb_overlay_color\":\"#000000\",\"jqlb_overlay_close\":\"1\",\"jqlb_border_width\":\"10\",\"jqlb_border_color\":\"#ffffff\",\"jqlb_border_radius\":\"0\",\"jqlb_image_info_background_transparency\":\"100\",\"jqlb_image_info_bg_color\":\"#ffffff\",\"jqlb_image_info_text_color\":\"#000000\",\"jqlb_image_info_text_fontsize\":\"10\",\"jqlb_show_text_for_image\":\"1\",\"jqlb_next_image_title\":\"next image\",\"jqlb_previous_image_title\":\"previous image\",\"jqlb_next_button_image\":\"http:\\/\\/habib.edu.pk\\/wp-content\\/plugins\\/wp-lightbox-2\\/styles\\/images\\/next.gif\",\"jqlb_previous_button_image\":\"http:\\/\\/habib.edu.pk\\/wp-content\\/plugins\\/wp-lightbox-2\\/styles\\/images\\/prev.gif\",\"jqlb_maximum_width\":\"\",\"jqlb_maximum_height\":\"\",\"jqlb_show_close_button\":\"1\",\"jqlb_close_image_title\":\"close image gallery\",\"jqlb_close_image_max_heght\":\"22\",\"jqlb_image_for_close_lightbox\":\"http:\\/\\/habib.edu.pk\\/wp-content\\/plugins\\/wp-lightbox-2\\/styles\\/images\\/closelabel.gif\",\"jqlb_keyboard_navigation\":\"1\",\"jqlb_popup_size_fix\":\"0\"};\n");
      out.write("/* ]]> */\n");
      out.write("</script>\n");
      out.write("<script type='text/javascript' src='../wp-content/plugins/wp-lightbox-2/wp-lightbox-2.min1894.js?ver=1.3.4.1'></script>\n");
      out.write("<script type='text/javascript' src='../wp-content/plugins/social-sharing-toolkit/script_2.1.28686.js?ver=4.5.1'></script>\n");
      out.write("<script type='text/javascript' src='../../connect.facebook.net/en_US/all8686.js?ver=4.5.1#xfbml=1&#038;appId=188707654478'></script>\n");
      out.write("<script type='text/javascript' src='../wp-content/plugins/social-sharing-toolkit/includes/buttons/button.googleplus8686.js?ver=4.5.1'></script>\n");
      out.write("<script type='text/javascript' src='../../platform.twitter.com/widgets8686.js?ver=4.5.1'></script>\n");
      out.write("<script type='text/javascript' src='../wp-includes/js/wp-embed.min8686.js?ver=4.5.1'></script>\n");
      out.write("<script type=\"text/javascript\" src=\"../wp-content/themes/duet/js/script.js\"></script>\n");
      out.write("</body>\n");
      out.write("<!-- Mirrored from habib.edu.pk/about-us/ by HTTrack Website Copier/3.x [XR&CO'2014], Mon, 02 May 2016 10:03:10 GMT -->\n");
      out.write("</html>\n");
      out.write("\n");
      out.write("<script type=\"text/javascript\">\n");
      out.write("\tjQuery( document ).ready(function() {\n");
      out.write("\t\tjQuery(\"h3.activeClass a\").attr(\"aria-expanded\", \"true\").addClass(\"active\");\n");
      out.write("\t\tjQuery(\"div.activeClass\").attr(\"aria-hidden\", \"false\").show();\n");
      out.write("\t\t\n");
      out.write("\t\tjQuery(\".mwUpcomingEvents a.pressRelease[href=#]\").siblings('a.watchVideo').css('width', '100%');\n");
      out.write("\t\tjQuery(\".mwUpcomingEvents a.watchVideo[href=#]\").siblings('a.pressRelease').css('width', '100%');\n");
      out.write("\t\tjQuery(\".singleEvent a.btn[href=#], a.watchVideo[href=#], a.pressRelease[href=#]\").hide();\n");
      out.write("\t});\n");
      out.write("</script>");
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
}
