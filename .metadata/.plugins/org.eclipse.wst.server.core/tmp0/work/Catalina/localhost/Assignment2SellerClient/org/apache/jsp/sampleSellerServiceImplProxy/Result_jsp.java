/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.31
 * Generated at: 2020-03-16 16:04:29 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.sampleSellerServiceImplProxy;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Result_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

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
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


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

      out.write('\r');
      out.write('\n');
 request.setCharacterEncoding("UTF-8"); 
      out.write("\r\n");
      out.write("<HTML>\r\n");
      out.write("<HEAD>\r\n");
      out.write("<TITLE>Result</TITLE>\r\n");
      out.write("</HEAD>\r\n");
      out.write("<BODY>\r\n");
      out.write("<H1>Result</H1>\r\n");
      out.write("\r\n");
      com.mtit.Seller.SellerServiceImplProxy sampleSellerServiceImplProxyid = null;
      synchronized (session) {
        sampleSellerServiceImplProxyid = (com.mtit.Seller.SellerServiceImplProxy) _jspx_page_context.getAttribute("sampleSellerServiceImplProxyid", javax.servlet.jsp.PageContext.SESSION_SCOPE);
        if (sampleSellerServiceImplProxyid == null){
          sampleSellerServiceImplProxyid = new com.mtit.Seller.SellerServiceImplProxy();
          _jspx_page_context.setAttribute("sampleSellerServiceImplProxyid", sampleSellerServiceImplProxyid, javax.servlet.jsp.PageContext.SESSION_SCOPE);
        }
      }
      out.write('\r');
      out.write('\n');

if (request.getParameter("endpoint") != null && request.getParameter("endpoint").length() > 0)
sampleSellerServiceImplProxyid.setEndpoint(request.getParameter("endpoint"));

      out.write("\r\n");
      out.write("\r\n");

String method = request.getParameter("method");
int methodID = 0;
if (method == null) methodID = -1;

if(methodID != -1) methodID = Integer.parseInt(method);
boolean gotMethod = false;

try {
switch (methodID){ 
case 2:
        gotMethod = true;
        java.lang.String getEndpoint2mtemp = sampleSellerServiceImplProxyid.getEndpoint();
if(getEndpoint2mtemp == null){

      out.write('\r');
      out.write('\n');
      out.print(getEndpoint2mtemp );
      out.write('\r');
      out.write('\n');

}else{
        String tempResultreturnp3 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(getEndpoint2mtemp));
        
      out.write("\r\n");
      out.write("        ");
      out.print( tempResultreturnp3 );
      out.write("\r\n");
      out.write("        ");

}
break;
case 5:
        gotMethod = true;
        String endpoint_0id=  request.getParameter("endpoint8");
            java.lang.String endpoint_0idTemp = null;
        if(!endpoint_0id.equals("")){
         endpoint_0idTemp  = endpoint_0id;
        }
        sampleSellerServiceImplProxyid.setEndpoint(endpoint_0idTemp);
break;
case 10:
        gotMethod = true;
        com.mtit.Seller.SellerServiceImpl getSellerServiceImpl10mtemp = sampleSellerServiceImplProxyid.getSellerServiceImpl();
if(getSellerServiceImpl10mtemp == null){

      out.write('\r');
      out.write('\n');
      out.print(getSellerServiceImpl10mtemp );
      out.write('\r');
      out.write('\n');

}else{

      out.write("\r\n");
      out.write("<TABLE>\r\n");
      out.write("<TR>\r\n");
      out.write("<TD COLSPAN=\"3\" ALIGN=\"LEFT\">returnp:</TD>\r\n");
      out.write("</TABLE>\r\n");

}
break;
case 15:
        gotMethod = true;
        String phone_2id=  request.getParameter("phone20");
            java.lang.String phone_2idTemp = null;
        if(!phone_2id.equals("")){
         phone_2idTemp  = phone_2id;
        }
        String company_3id=  request.getParameter("company22");
            java.lang.String company_3idTemp = null;
        if(!company_3id.equals("")){
         company_3idTemp  = company_3id;
        }
        String name_4id=  request.getParameter("name24");
            java.lang.String name_4idTemp = null;
        if(!name_4id.equals("")){
         name_4idTemp  = name_4id;
        }
        String email_5id=  request.getParameter("email26");
            java.lang.String email_5idTemp = null;
        if(!email_5id.equals("")){
         email_5idTemp  = email_5id;
        }
        String sellerId_6id=  request.getParameter("sellerId28");
        int sellerId_6idTemp  = Integer.parseInt(sellerId_6id);
        String country_7id=  request.getParameter("country30");
            java.lang.String country_7idTemp = null;
        if(!country_7id.equals("")){
         country_7idTemp  = country_7id;
        }
        
      out.write("\r\n");
      out.write("        ");
      com.mtit.Seller.Seller com1mtit1Seller1Seller_1id = null;
      synchronized (session) {
        com1mtit1Seller1Seller_1id = (com.mtit.Seller.Seller) _jspx_page_context.getAttribute("com1mtit1Seller1Seller_1id", javax.servlet.jsp.PageContext.SESSION_SCOPE);
        if (com1mtit1Seller1Seller_1id == null){
          com1mtit1Seller1Seller_1id = new com.mtit.Seller.Seller();
          _jspx_page_context.setAttribute("com1mtit1Seller1Seller_1id", com1mtit1Seller1Seller_1id, javax.servlet.jsp.PageContext.SESSION_SCOPE);
        }
      }
      out.write("\r\n");
      out.write("        ");

        com1mtit1Seller1Seller_1id.setPhone(phone_2idTemp);
        com1mtit1Seller1Seller_1id.setCompany(company_3idTemp);
        com1mtit1Seller1Seller_1id.setName(name_4idTemp);
        com1mtit1Seller1Seller_1id.setEmail(email_5idTemp);
        com1mtit1Seller1Seller_1id.setSellerId(sellerId_6idTemp);
        com1mtit1Seller1Seller_1id.setCountry(country_7idTemp);
        boolean addSeller15mtemp = sampleSellerServiceImplProxyid.addSeller(com1mtit1Seller1Seller_1id);
        String tempResultreturnp16 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(addSeller15mtemp));
        
      out.write("\r\n");
      out.write("        ");
      out.print( tempResultreturnp16 );
      out.write("\r\n");
      out.write("        ");

break;
case 32:
        gotMethod = true;
        String sellerId_8id=  request.getParameter("sellerId35");
        int sellerId_8idTemp  = Integer.parseInt(sellerId_8id);
        boolean deleteSeller32mtemp = sampleSellerServiceImplProxyid.deleteSeller(sellerId_8idTemp);
        String tempResultreturnp33 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(deleteSeller32mtemp));
        
      out.write("\r\n");
      out.write("        ");
      out.print( tempResultreturnp33 );
      out.write("\r\n");
      out.write("        ");

break;
case 37:
        gotMethod = true;
        com.mtit.Seller.Seller[] getAllSellers37mtemp = sampleSellerServiceImplProxyid.getAllSellers();
if(getAllSellers37mtemp == null){

      out.write('\r');
      out.write('\n');
      out.print(getAllSellers37mtemp );
      out.write('\r');
      out.write('\n');

}else{
        String tempreturnp38 = null;
        if(getAllSellers37mtemp != null){
        java.util.List listreturnp38= java.util.Arrays.asList(getAllSellers37mtemp);
        tempreturnp38 = listreturnp38.toString();
        }
        
      out.write("\r\n");
      out.write("        ");
      out.print(tempreturnp38);
      out.write("\r\n");
      out.write("        ");

}
break;
case 40:
        gotMethod = true;
        String sellerId_9id=  request.getParameter("sellerId55");
        int sellerId_9idTemp  = Integer.parseInt(sellerId_9id);
        com.mtit.Seller.Seller getSeller40mtemp = sampleSellerServiceImplProxyid.getSeller(sellerId_9idTemp);
if(getSeller40mtemp == null){

      out.write('\r');
      out.write('\n');
      out.print(getSeller40mtemp );
      out.write('\r');
      out.write('\n');

}else{

      out.write("\r\n");
      out.write("<TABLE>\r\n");
      out.write("<TR>\r\n");
      out.write("<TD COLSPAN=\"3\" ALIGN=\"LEFT\">returnp:</TD>\r\n");
      out.write("<TR>\r\n");
      out.write("<TD WIDTH=\"5%\"></TD>\r\n");
      out.write("<TD COLSPAN=\"2\" ALIGN=\"LEFT\">phone:</TD>\r\n");
      out.write("<TD>\r\n");

if(getSeller40mtemp != null){
java.lang.String typephone43 = getSeller40mtemp.getPhone();
        String tempResultphone43 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typephone43));
        
      out.write("\r\n");
      out.write("        ");
      out.print( tempResultphone43 );
      out.write("\r\n");
      out.write("        ");

}
      out.write("\r\n");
      out.write("</TD>\r\n");
      out.write("<TR>\r\n");
      out.write("<TD WIDTH=\"5%\"></TD>\r\n");
      out.write("<TD COLSPAN=\"2\" ALIGN=\"LEFT\">company:</TD>\r\n");
      out.write("<TD>\r\n");

if(getSeller40mtemp != null){
java.lang.String typecompany45 = getSeller40mtemp.getCompany();
        String tempResultcompany45 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typecompany45));
        
      out.write("\r\n");
      out.write("        ");
      out.print( tempResultcompany45 );
      out.write("\r\n");
      out.write("        ");

}
      out.write("\r\n");
      out.write("</TD>\r\n");
      out.write("<TR>\r\n");
      out.write("<TD WIDTH=\"5%\"></TD>\r\n");
      out.write("<TD COLSPAN=\"2\" ALIGN=\"LEFT\">name:</TD>\r\n");
      out.write("<TD>\r\n");

if(getSeller40mtemp != null){
java.lang.String typename47 = getSeller40mtemp.getName();
        String tempResultname47 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typename47));
        
      out.write("\r\n");
      out.write("        ");
      out.print( tempResultname47 );
      out.write("\r\n");
      out.write("        ");

}
      out.write("\r\n");
      out.write("</TD>\r\n");
      out.write("<TR>\r\n");
      out.write("<TD WIDTH=\"5%\"></TD>\r\n");
      out.write("<TD COLSPAN=\"2\" ALIGN=\"LEFT\">email:</TD>\r\n");
      out.write("<TD>\r\n");

if(getSeller40mtemp != null){
java.lang.String typeemail49 = getSeller40mtemp.getEmail();
        String tempResultemail49 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typeemail49));
        
      out.write("\r\n");
      out.write("        ");
      out.print( tempResultemail49 );
      out.write("\r\n");
      out.write("        ");

}
      out.write("\r\n");
      out.write("</TD>\r\n");
      out.write("<TR>\r\n");
      out.write("<TD WIDTH=\"5%\"></TD>\r\n");
      out.write("<TD COLSPAN=\"2\" ALIGN=\"LEFT\">sellerId:</TD>\r\n");
      out.write("<TD>\r\n");

if(getSeller40mtemp != null){

      out.write('\r');
      out.write('\n');
      out.print(getSeller40mtemp.getSellerId()
);
}
      out.write("\r\n");
      out.write("</TD>\r\n");
      out.write("<TR>\r\n");
      out.write("<TD WIDTH=\"5%\"></TD>\r\n");
      out.write("<TD COLSPAN=\"2\" ALIGN=\"LEFT\">country:</TD>\r\n");
      out.write("<TD>\r\n");

if(getSeller40mtemp != null){
java.lang.String typecountry53 = getSeller40mtemp.getCountry();
        String tempResultcountry53 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typecountry53));
        
      out.write("\r\n");
      out.write("        ");
      out.print( tempResultcountry53 );
      out.write("\r\n");
      out.write("        ");

}
      out.write("\r\n");
      out.write("</TD>\r\n");
      out.write("</TABLE>\r\n");

}
break;
}
} catch (Exception e) { 

      out.write("\r\n");
      out.write("Exception: ");
      out.print( org.eclipse.jst.ws.util.JspUtils.markup(e.toString()) );
      out.write("\r\n");
      out.write("Message: ");
      out.print( org.eclipse.jst.ws.util.JspUtils.markup(e.getMessage()) );
      out.write('\r');
      out.write('\n');

return;
}
if(!gotMethod){

      out.write("\r\n");
      out.write("result: N/A\r\n");

}

      out.write("\r\n");
      out.write("</BODY>\r\n");
      out.write("</HTML>");
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
