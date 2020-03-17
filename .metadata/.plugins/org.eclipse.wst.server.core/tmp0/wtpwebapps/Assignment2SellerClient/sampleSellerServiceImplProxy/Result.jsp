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
        %>
        <jsp:useBean id="com1mtit1Seller1Seller_1id" scope="session" class="com.mtit.Seller.Seller" />
        <%
        com1mtit1Seller1Seller_1id.setPhone(phone_2idTemp);
        com1mtit1Seller1Seller_1id.setCompany(company_3idTemp);
        com1mtit1Seller1Seller_1id.setName(name_4idTemp);
        com1mtit1Seller1Seller_1id.setEmail(email_5idTemp);
        com1mtit1Seller1Seller_1id.setSellerId(sellerId_6idTemp);
        com1mtit1Seller1Seller_1id.setCountry(country_7idTemp);
        boolean addSeller15mtemp = sampleSellerServiceImplProxyid.addSeller(com1mtit1Seller1Seller_1id);
        String tempResultreturnp16 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(addSeller15mtemp));
        %>
        <%= tempResultreturnp16 %>
        <%
break;
case 32:
        gotMethod = true;
        String sellerId_8id=  request.getParameter("sellerId35");
        int sellerId_8idTemp  = Integer.parseInt(sellerId_8id);
        boolean deleteSeller32mtemp = sampleSellerServiceImplProxyid.deleteSeller(sellerId_8idTemp);
        String tempResultreturnp33 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(deleteSeller32mtemp));
        %>
        <%= tempResultreturnp33 %>
        <%
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
        String sellerId_9id=  request.getParameter("sellerId55");
        int sellerId_9idTemp  = Integer.parseInt(sellerId_9id);
        com.mtit.Seller.Seller getSeller40mtemp = sampleSellerServiceImplProxyid.getSeller(sellerId_9idTemp);
if(getSeller40mtemp == null){
%>
<%=getSeller40mtemp %>
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
if(getSeller40mtemp != null){
java.lang.String typephone43 = getSeller40mtemp.getPhone();
        String tempResultphone43 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typephone43));
        %>
        <%= tempResultphone43 %>
        <%
}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">company:</TD>
<TD>
<%
if(getSeller40mtemp != null){
java.lang.String typecompany45 = getSeller40mtemp.getCompany();
        String tempResultcompany45 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typecompany45));
        %>
        <%= tempResultcompany45 %>
        <%
}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">name:</TD>
<TD>
<%
if(getSeller40mtemp != null){
java.lang.String typename47 = getSeller40mtemp.getName();
        String tempResultname47 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typename47));
        %>
        <%= tempResultname47 %>
        <%
}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">email:</TD>
<TD>
<%
if(getSeller40mtemp != null){
java.lang.String typeemail49 = getSeller40mtemp.getEmail();
        String tempResultemail49 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typeemail49));
        %>
        <%= tempResultemail49 %>
        <%
}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">sellerId:</TD>
<TD>
<%
if(getSeller40mtemp != null){
%>
<%=getSeller40mtemp.getSellerId()
%><%}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">country:</TD>
<TD>
<%
if(getSeller40mtemp != null){
java.lang.String typecountry53 = getSeller40mtemp.getCountry();
        String tempResultcountry53 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typecountry53));
        %>
        <%= tempResultcountry53 %>
        <%
}%>
</TD>
</TABLE>
<%
}
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