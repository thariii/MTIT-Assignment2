/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.31
 * Generated at: 2020-03-16 15:58:23 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.sampleBuyerServiceImplProxy;

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
      com.mtit.buyer.BuyerServiceImplProxy sampleBuyerServiceImplProxyid = null;
      synchronized (session) {
        sampleBuyerServiceImplProxyid = (com.mtit.buyer.BuyerServiceImplProxy) _jspx_page_context.getAttribute("sampleBuyerServiceImplProxyid", javax.servlet.jsp.PageContext.SESSION_SCOPE);
        if (sampleBuyerServiceImplProxyid == null){
          sampleBuyerServiceImplProxyid = new com.mtit.buyer.BuyerServiceImplProxy();
          _jspx_page_context.setAttribute("sampleBuyerServiceImplProxyid", sampleBuyerServiceImplProxyid, javax.servlet.jsp.PageContext.SESSION_SCOPE);
        }
      }
      out.write('\r');
      out.write('\n');

if (request.getParameter("endpoint") != null && request.getParameter("endpoint").length() > 0)
sampleBuyerServiceImplProxyid.setEndpoint(request.getParameter("endpoint"));

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
        java.lang.String getEndpoint2mtemp = sampleBuyerServiceImplProxyid.getEndpoint();
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
        sampleBuyerServiceImplProxyid.setEndpoint(endpoint_0idTemp);
break;
case 10:
        gotMethod = true;
        com.mtit.buyer.BuyerServiceImpl getBuyerServiceImpl10mtemp = sampleBuyerServiceImplProxyid.getBuyerServiceImpl();
if(getBuyerServiceImpl10mtemp == null){

      out.write('\r');
      out.write('\n');
      out.print(getBuyerServiceImpl10mtemp );
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
        String name_2id=  request.getParameter("name20");
            java.lang.String name_2idTemp = null;
        if(!name_2id.equals("")){
         name_2idTemp  = name_2id;
        }
        String zip_3id=  request.getParameter("zip22");
            java.lang.String zip_3idTemp = null;
        if(!zip_3id.equals("")){
         zip_3idTemp  = zip_3id;
        }
        String country_4id=  request.getParameter("country24");
            java.lang.String country_4idTemp = null;
        if(!country_4id.equals("")){
         country_4idTemp  = country_4id;
        }
        String buyerId_5id=  request.getParameter("buyerId26");
        int buyerId_5idTemp  = Integer.parseInt(buyerId_5id);
        String city_6id=  request.getParameter("city28");
            java.lang.String city_6idTemp = null;
        if(!city_6id.equals("")){
         city_6idTemp  = city_6id;
        }
        String addressLine1_7id=  request.getParameter("addressLine130");
            java.lang.String addressLine1_7idTemp = null;
        if(!addressLine1_7id.equals("")){
         addressLine1_7idTemp  = addressLine1_7id;
        }
        String phone_8id=  request.getParameter("phone32");
            java.lang.String phone_8idTemp = null;
        if(!phone_8id.equals("")){
         phone_8idTemp  = phone_8id;
        }
        String email_9id=  request.getParameter("email34");
            java.lang.String email_9idTemp = null;
        if(!email_9id.equals("")){
         email_9idTemp  = email_9id;
        }
        
      out.write("\r\n");
      out.write("        ");
      com.mtit.buyer.Buyer com1mtit1buyer1Buyer_1id = null;
      synchronized (session) {
        com1mtit1buyer1Buyer_1id = (com.mtit.buyer.Buyer) _jspx_page_context.getAttribute("com1mtit1buyer1Buyer_1id", javax.servlet.jsp.PageContext.SESSION_SCOPE);
        if (com1mtit1buyer1Buyer_1id == null){
          com1mtit1buyer1Buyer_1id = new com.mtit.buyer.Buyer();
          _jspx_page_context.setAttribute("com1mtit1buyer1Buyer_1id", com1mtit1buyer1Buyer_1id, javax.servlet.jsp.PageContext.SESSION_SCOPE);
        }
      }
      out.write("\r\n");
      out.write("        ");

        com1mtit1buyer1Buyer_1id.setName(name_2idTemp);
        com1mtit1buyer1Buyer_1id.setZip(zip_3idTemp);
        com1mtit1buyer1Buyer_1id.setCountry(country_4idTemp);
        com1mtit1buyer1Buyer_1id.setBuyerId(buyerId_5idTemp);
        com1mtit1buyer1Buyer_1id.setCity(city_6idTemp);
        com1mtit1buyer1Buyer_1id.setAddressLine1(addressLine1_7idTemp);
        com1mtit1buyer1Buyer_1id.setPhone(phone_8idTemp);
        com1mtit1buyer1Buyer_1id.setEmail(email_9idTemp);
        boolean addBuyer15mtemp = sampleBuyerServiceImplProxyid.addBuyer(com1mtit1buyer1Buyer_1id);
        String tempResultreturnp16 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(addBuyer15mtemp));
        
      out.write("\r\n");
      out.write("        ");
      out.print( tempResultreturnp16 );
      out.write("\r\n");
      out.write("        ");

break;
case 36:
        gotMethod = true;
        String buyerId_10id=  request.getParameter("buyerId39");
        int buyerId_10idTemp  = Integer.parseInt(buyerId_10id);
        boolean deleteBuyer36mtemp = sampleBuyerServiceImplProxyid.deleteBuyer(buyerId_10idTemp);
        String tempResultreturnp37 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(deleteBuyer36mtemp));
        
      out.write("\r\n");
      out.write("        ");
      out.print( tempResultreturnp37 );
      out.write("\r\n");
      out.write("        ");

break;
case 41:
        gotMethod = true;
        String buyerID_11id=  request.getParameter("buyerID60");
        int buyerID_11idTemp  = Integer.parseInt(buyerID_11id);
        com.mtit.buyer.Buyer getBuyer41mtemp = sampleBuyerServiceImplProxyid.getBuyer(buyerID_11idTemp);
if(getBuyer41mtemp == null){

      out.write('\r');
      out.write('\n');
      out.print(getBuyer41mtemp );
      out.write('\r');
      out.write('\n');

}else{

      out.write("\r\n");
      out.write("<TABLE>\r\n");
      out.write("<TR>\r\n");
      out.write("<TD COLSPAN=\"3\" ALIGN=\"LEFT\">returnp:</TD>\r\n");
      out.write("<TR>\r\n");
      out.write("<TD WIDTH=\"5%\"></TD>\r\n");
      out.write("<TD COLSPAN=\"2\" ALIGN=\"LEFT\">name:</TD>\r\n");
      out.write("<TD>\r\n");

if(getBuyer41mtemp != null){
java.lang.String typename44 = getBuyer41mtemp.getName();
        String tempResultname44 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typename44));
        
      out.write("\r\n");
      out.write("        ");
      out.print( tempResultname44 );
      out.write("\r\n");
      out.write("        ");

}
      out.write("\r\n");
      out.write("</TD>\r\n");
      out.write("<TR>\r\n");
      out.write("<TD WIDTH=\"5%\"></TD>\r\n");
      out.write("<TD COLSPAN=\"2\" ALIGN=\"LEFT\">zip:</TD>\r\n");
      out.write("<TD>\r\n");

if(getBuyer41mtemp != null){
java.lang.String typezip46 = getBuyer41mtemp.getZip();
        String tempResultzip46 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typezip46));
        
      out.write("\r\n");
      out.write("        ");
      out.print( tempResultzip46 );
      out.write("\r\n");
      out.write("        ");

}
      out.write("\r\n");
      out.write("</TD>\r\n");
      out.write("<TR>\r\n");
      out.write("<TD WIDTH=\"5%\"></TD>\r\n");
      out.write("<TD COLSPAN=\"2\" ALIGN=\"LEFT\">country:</TD>\r\n");
      out.write("<TD>\r\n");

if(getBuyer41mtemp != null){
java.lang.String typecountry48 = getBuyer41mtemp.getCountry();
        String tempResultcountry48 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typecountry48));
        
      out.write("\r\n");
      out.write("        ");
      out.print( tempResultcountry48 );
      out.write("\r\n");
      out.write("        ");

}
      out.write("\r\n");
      out.write("</TD>\r\n");
      out.write("<TR>\r\n");
      out.write("<TD WIDTH=\"5%\"></TD>\r\n");
      out.write("<TD COLSPAN=\"2\" ALIGN=\"LEFT\">buyerId:</TD>\r\n");
      out.write("<TD>\r\n");

if(getBuyer41mtemp != null){

      out.write('\r');
      out.write('\n');
      out.print(getBuyer41mtemp.getBuyerId()
);
}
      out.write("\r\n");
      out.write("</TD>\r\n");
      out.write("<TR>\r\n");
      out.write("<TD WIDTH=\"5%\"></TD>\r\n");
      out.write("<TD COLSPAN=\"2\" ALIGN=\"LEFT\">city:</TD>\r\n");
      out.write("<TD>\r\n");

if(getBuyer41mtemp != null){
java.lang.String typecity52 = getBuyer41mtemp.getCity();
        String tempResultcity52 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typecity52));
        
      out.write("\r\n");
      out.write("        ");
      out.print( tempResultcity52 );
      out.write("\r\n");
      out.write("        ");

}
      out.write("\r\n");
      out.write("</TD>\r\n");
      out.write("<TR>\r\n");
      out.write("<TD WIDTH=\"5%\"></TD>\r\n");
      out.write("<TD COLSPAN=\"2\" ALIGN=\"LEFT\">addressLine1:</TD>\r\n");
      out.write("<TD>\r\n");

if(getBuyer41mtemp != null){
java.lang.String typeaddressLine154 = getBuyer41mtemp.getAddressLine1();
        String tempResultaddressLine154 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typeaddressLine154));
        
      out.write("\r\n");
      out.write("        ");
      out.print( tempResultaddressLine154 );
      out.write("\r\n");
      out.write("        ");

}
      out.write("\r\n");
      out.write("</TD>\r\n");
      out.write("<TR>\r\n");
      out.write("<TD WIDTH=\"5%\"></TD>\r\n");
      out.write("<TD COLSPAN=\"2\" ALIGN=\"LEFT\">phone:</TD>\r\n");
      out.write("<TD>\r\n");

if(getBuyer41mtemp != null){
java.lang.String typephone56 = getBuyer41mtemp.getPhone();
        String tempResultphone56 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typephone56));
        
      out.write("\r\n");
      out.write("        ");
      out.print( tempResultphone56 );
      out.write("\r\n");
      out.write("        ");

}
      out.write("\r\n");
      out.write("</TD>\r\n");
      out.write("<TR>\r\n");
      out.write("<TD WIDTH=\"5%\"></TD>\r\n");
      out.write("<TD COLSPAN=\"2\" ALIGN=\"LEFT\">email:</TD>\r\n");
      out.write("<TD>\r\n");

if(getBuyer41mtemp != null){
java.lang.String typeemail58 = getBuyer41mtemp.getEmail();
        String tempResultemail58 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typeemail58));
        
      out.write("\r\n");
      out.write("        ");
      out.print( tempResultemail58 );
      out.write("\r\n");
      out.write("        ");

}
      out.write("\r\n");
      out.write("</TD>\r\n");
      out.write("</TABLE>\r\n");

}
break;
case 62:
        gotMethod = true;
        com.mtit.buyer.Buyer[] getAllBuyers62mtemp = sampleBuyerServiceImplProxyid.getAllBuyers();
if(getAllBuyers62mtemp == null){

      out.write('\r');
      out.write('\n');
      out.print(getAllBuyers62mtemp );
      out.write('\r');
      out.write('\n');

}else{
        String tempreturnp63 = null;
        if(getAllBuyers62mtemp != null){
        java.util.List listreturnp63= java.util.Arrays.asList(getAllBuyers62mtemp);
        tempreturnp63 = listreturnp63.toString();
        }
        
      out.write("\r\n");
      out.write("        ");
      out.print(tempreturnp63);
      out.write("\r\n");
      out.write("        ");

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
