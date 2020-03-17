<%@page contentType="text/html;charset=UTF-8"%>
<% request.setCharacterEncoding("UTF-8"); %>
<HTML>
<HEAD>
<TITLE>Result</TITLE>
</HEAD>
<BODY>
<H1>Result</H1>

<jsp:useBean id="sampleBuyerServiceImplProxyid" scope="session" class="com.mtit.buyer.BuyerServiceImplProxy" />
<%
if (request.getParameter("endpoint") != null && request.getParameter("endpoint").length() > 0)
sampleBuyerServiceImplProxyid.setEndpoint(request.getParameter("endpoint"));
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
        java.lang.String getEndpoint2mtemp = sampleBuyerServiceImplProxyid.getEndpoint();
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
        sampleBuyerServiceImplProxyid.setEndpoint(endpoint_0idTemp);
break;
case 10:
        gotMethod = true;
        com.mtit.buyer.BuyerServiceImpl getBuyerServiceImpl10mtemp = sampleBuyerServiceImplProxyid.getBuyerServiceImpl();
if(getBuyerServiceImpl10mtemp == null){
%>
<%=getBuyerServiceImpl10mtemp %>
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
        String buyerID_1id=  request.getParameter("buyerID34");
        int buyerID_1idTemp  = Integer.parseInt(buyerID_1id);
        com.mtit.buyer.Buyer getBuyer15mtemp = sampleBuyerServiceImplProxyid.getBuyer(buyerID_1idTemp);
if(getBuyer15mtemp == null){
%>
<%=getBuyer15mtemp %>
<%
}else{
%>
<TABLE>
<TR>
<TD COLSPAN="3" ALIGN="LEFT">returnp:</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">name:</TD>
<TD>
<%
if(getBuyer15mtemp != null){
java.lang.String typename18 = getBuyer15mtemp.getName();
        String tempResultname18 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typename18));
        %>
        <%= tempResultname18 %>
        <%
}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">zip:</TD>
<TD>
<%
if(getBuyer15mtemp != null){
java.lang.String typezip20 = getBuyer15mtemp.getZip();
        String tempResultzip20 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typezip20));
        %>
        <%= tempResultzip20 %>
        <%
}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">country:</TD>
<TD>
<%
if(getBuyer15mtemp != null){
java.lang.String typecountry22 = getBuyer15mtemp.getCountry();
        String tempResultcountry22 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typecountry22));
        %>
        <%= tempResultcountry22 %>
        <%
}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">buyerId:</TD>
<TD>
<%
if(getBuyer15mtemp != null){
%>
<%=getBuyer15mtemp.getBuyerId()
%><%}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">city:</TD>
<TD>
<%
if(getBuyer15mtemp != null){
java.lang.String typecity26 = getBuyer15mtemp.getCity();
        String tempResultcity26 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typecity26));
        %>
        <%= tempResultcity26 %>
        <%
}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">addressLine1:</TD>
<TD>
<%
if(getBuyer15mtemp != null){
java.lang.String typeaddressLine128 = getBuyer15mtemp.getAddressLine1();
        String tempResultaddressLine128 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typeaddressLine128));
        %>
        <%= tempResultaddressLine128 %>
        <%
}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">phone:</TD>
<TD>
<%
if(getBuyer15mtemp != null){
java.lang.String typephone30 = getBuyer15mtemp.getPhone();
        String tempResultphone30 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typephone30));
        %>
        <%= tempResultphone30 %>
        <%
}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">email:</TD>
<TD>
<%
if(getBuyer15mtemp != null){
java.lang.String typeemail32 = getBuyer15mtemp.getEmail();
        String tempResultemail32 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typeemail32));
        %>
        <%= tempResultemail32 %>
        <%
}%>
</TD>
</TABLE>
<%
}
break;
case 36:
        gotMethod = true;
        String buyerId_2id=  request.getParameter("buyerId39");
        int buyerId_2idTemp  = Integer.parseInt(buyerId_2id);
        boolean deleteBuyer36mtemp = sampleBuyerServiceImplProxyid.deleteBuyer(buyerId_2idTemp);
        String tempResultreturnp37 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(deleteBuyer36mtemp));
        %>
        <%= tempResultreturnp37 %>
        <%
break;
case 41:
        gotMethod = true;
        String name_4id=  request.getParameter("name46");
            java.lang.String name_4idTemp = null;
        if(!name_4id.equals("")){
         name_4idTemp  = name_4id;
        }
        String zip_5id=  request.getParameter("zip48");
            java.lang.String zip_5idTemp = null;
        if(!zip_5id.equals("")){
         zip_5idTemp  = zip_5id;
        }
        String country_6id=  request.getParameter("country50");
            java.lang.String country_6idTemp = null;
        if(!country_6id.equals("")){
         country_6idTemp  = country_6id;
        }
        String buyerId_7id=  request.getParameter("buyerId52");
        int buyerId_7idTemp  = Integer.parseInt(buyerId_7id);
        String city_8id=  request.getParameter("city54");
            java.lang.String city_8idTemp = null;
        if(!city_8id.equals("")){
         city_8idTemp  = city_8id;
        }
        String addressLine1_9id=  request.getParameter("addressLine156");
            java.lang.String addressLine1_9idTemp = null;
        if(!addressLine1_9id.equals("")){
         addressLine1_9idTemp  = addressLine1_9id;
        }
        String phone_10id=  request.getParameter("phone58");
            java.lang.String phone_10idTemp = null;
        if(!phone_10id.equals("")){
         phone_10idTemp  = phone_10id;
        }
        String email_11id=  request.getParameter("email60");
            java.lang.String email_11idTemp = null;
        if(!email_11id.equals("")){
         email_11idTemp  = email_11id;
        }
        %>
        <jsp:useBean id="com1mtit1buyer1Buyer_3id" scope="session" class="com.mtit.buyer.Buyer" />
        <%
        com1mtit1buyer1Buyer_3id.setName(name_4idTemp);
        com1mtit1buyer1Buyer_3id.setZip(zip_5idTemp);
        com1mtit1buyer1Buyer_3id.setCountry(country_6idTemp);
        com1mtit1buyer1Buyer_3id.setBuyerId(buyerId_7idTemp);
        com1mtit1buyer1Buyer_3id.setCity(city_8idTemp);
        com1mtit1buyer1Buyer_3id.setAddressLine1(addressLine1_9idTemp);
        com1mtit1buyer1Buyer_3id.setPhone(phone_10idTemp);
        com1mtit1buyer1Buyer_3id.setEmail(email_11idTemp);
        boolean addBuyer41mtemp = sampleBuyerServiceImplProxyid.addBuyer(com1mtit1buyer1Buyer_3id);
        String tempResultreturnp42 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(addBuyer41mtemp));
        %>
        <%= tempResultreturnp42 %>
        <%
break;
case 62:
        gotMethod = true;
        com.mtit.buyer.Buyer[] getAllBuyers62mtemp = sampleBuyerServiceImplProxyid.getAllBuyers();
if(getAllBuyers62mtemp == null){
%>
<%=getAllBuyers62mtemp %>
<%
}else{
        String tempreturnp63 = null;
        if(getAllBuyers62mtemp != null){
        java.util.List listreturnp63= java.util.Arrays.asList(getAllBuyers62mtemp);
        tempreturnp63 = listreturnp63.toString();
        }
        %>
        <%=tempreturnp63%>
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