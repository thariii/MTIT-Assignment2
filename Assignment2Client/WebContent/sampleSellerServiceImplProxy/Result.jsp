<%@page contentType="text/html;charset=UTF-8"%>
<% request.setCharacterEncoding("UTF-8"); %>
<HTML>
<HEAD>
<TITLE>Result</TITLE>
</HEAD>
<BODY>
<H1>Result</H1>

<jsp:useBean id="sampleSellerServiceImplProxyid" scope="session" class="com.mtit.Seller.SellerServiceImplProxy" />
<%
if (request.getParameter("endpoint") != null && request.getParameter("endpoint").length() > 0)
sampleSellerServiceImplProxyid.setEndpoint(request.getParameter("endpoint"));
%>

<%
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
%>
<%=getEndpoint2mtemp %>
<%
}else{
        String tempResultreturnp3 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(getEndpoint2mtemp));
        %>
        <%= tempResultreturnp3 %>
        <%
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
%>
<%=getSellerServiceImpl10mtemp %>
<%
}else{
%>
<TABLE>
<TR>
<TD COLSPAN="3" ALIGN="LEFT">returnp:</TD>
</TABLE>
<%
}
break;
case 15:
        gotMethod = true;
        String sellerId_1id=  request.getParameter("sellerId18");
        int sellerId_1idTemp  = Integer.parseInt(sellerId_1id);
        boolean deleteSeller15mtemp = sampleSellerServiceImplProxyid.deleteSeller(sellerId_1idTemp);
        String tempResultreturnp16 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(deleteSeller15mtemp));
        %>
        <%= tempResultreturnp16 %>
        <%
break;
case 20:
        gotMethod = true;
        String sellerId_2id=  request.getParameter("sellerId35");
        int sellerId_2idTemp  = Integer.parseInt(sellerId_2id);
        com.mtit.Seller.Seller getSeller20mtemp = sampleSellerServiceImplProxyid.getSeller(sellerId_2idTemp);
if(getSeller20mtemp == null){
%>
<%=getSeller20mtemp %>
<%
}else{
%>
<TABLE>
<TR>
<TD COLSPAN="3" ALIGN="LEFT">returnp:</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">phone:</TD>
<TD>
<%
if(getSeller20mtemp != null){
java.lang.String typephone23 = getSeller20mtemp.getPhone();
        String tempResultphone23 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typephone23));
        %>
        <%= tempResultphone23 %>
        <%
}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">company:</TD>
<TD>
<%
if(getSeller20mtemp != null){
java.lang.String typecompany25 = getSeller20mtemp.getCompany();
        String tempResultcompany25 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typecompany25));
        %>
        <%= tempResultcompany25 %>
        <%
}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">name:</TD>
<TD>
<%
if(getSeller20mtemp != null){
java.lang.String typename27 = getSeller20mtemp.getName();
        String tempResultname27 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typename27));
        %>
        <%= tempResultname27 %>
        <%
}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">email:</TD>
<TD>
<%
if(getSeller20mtemp != null){
java.lang.String typeemail29 = getSeller20mtemp.getEmail();
        String tempResultemail29 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typeemail29));
        %>
        <%= tempResultemail29 %>
        <%
}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">sellerId:</TD>
<TD>
<%
if(getSeller20mtemp != null){
%>
<%=getSeller20mtemp.getSellerId()
%><%}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">country:</TD>
<TD>
<%
if(getSeller20mtemp != null){
java.lang.String typecountry33 = getSeller20mtemp.getCountry();
        String tempResultcountry33 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typecountry33));
        %>
        <%= tempResultcountry33 %>
        <%
}%>
</TD>
</TABLE>
<%
}
break;
case 37:
        gotMethod = true;
        com.mtit.Seller.Seller[] getAllSellers37mtemp = sampleSellerServiceImplProxyid.getAllSellers();
if(getAllSellers37mtemp == null){
%>
<%=getAllSellers37mtemp %>
<%
}else{
        String tempreturnp38 = null;
        if(getAllSellers37mtemp != null){
        java.util.List listreturnp38= java.util.Arrays.asList(getAllSellers37mtemp);
        tempreturnp38 = listreturnp38.toString();
        }
        %>
        <%=tempreturnp38%>
        <%
}
break;
case 40:
        gotMethod = true;
        String phone_4id=  request.getParameter("phone45");
            java.lang.String phone_4idTemp = null;
        if(!phone_4id.equals("")){
         phone_4idTemp  = phone_4id;
        }
        String company_5id=  request.getParameter("company47");
            java.lang.String company_5idTemp = null;
        if(!company_5id.equals("")){
         company_5idTemp  = company_5id;
        }
        String name_6id=  request.getParameter("name49");
            java.lang.String name_6idTemp = null;
        if(!name_6id.equals("")){
         name_6idTemp  = name_6id;
        }
        String email_7id=  request.getParameter("email51");
            java.lang.String email_7idTemp = null;
        if(!email_7id.equals("")){
         email_7idTemp  = email_7id;
        }
        String sellerId_8id=  request.getParameter("sellerId53");
        int sellerId_8idTemp  = Integer.parseInt(sellerId_8id);
        String country_9id=  request.getParameter("country55");
            java.lang.String country_9idTemp = null;
        if(!country_9id.equals("")){
         country_9idTemp  = country_9id;
        }
        %>
        <jsp:useBean id="com1mtit1Seller1Seller_3id" scope="session" class="com.mtit.Seller.Seller" />
        <%
        com1mtit1Seller1Seller_3id.setPhone(phone_4idTemp);
        com1mtit1Seller1Seller_3id.setCompany(company_5idTemp);
        com1mtit1Seller1Seller_3id.setName(name_6idTemp);
        com1mtit1Seller1Seller_3id.setEmail(email_7idTemp);
        com1mtit1Seller1Seller_3id.setSellerId(sellerId_8idTemp);
        com1mtit1Seller1Seller_3id.setCountry(country_9idTemp);
        boolean addSeller40mtemp = sampleSellerServiceImplProxyid.addSeller(com1mtit1Seller1Seller_3id);
        String tempResultreturnp41 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(addSeller40mtemp));
        %>
        <%= tempResultreturnp41 %>
        <%
break;
}
} catch (Exception e) { 
%>
Exception: <%= org.eclipse.jst.ws.util.JspUtils.markup(e.toString()) %>
Message: <%= org.eclipse.jst.ws.util.JspUtils.markup(e.getMessage()) %>
<%
return;
}
if(!gotMethod){
%>
result: N/A
<%
}
%>
</BODY>
</HTML>