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
        %>
        <jsp:useBean id="com1mtit1buyer1Buyer_1id" scope="session" class="com.mtit.buyer.Buyer" />
        <%
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
        %>
        <%= tempResultreturnp16 %>
        <%
break;
case 36:
        gotMethod = true;
        String buyerId_10id=  request.getParameter("buyerId39");
        int buyerId_10idTemp  = Integer.parseInt(buyerId_10id);
        boolean deleteBuyer36mtemp = sampleBuyerServiceImplProxyid.deleteBuyer(buyerId_10idTemp);
        String tempResultreturnp37 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(deleteBuyer36mtemp));
        %>
        <%= tempResultreturnp37 %>
        <%
break;
case 41:
        gotMethod = true;
        String buyerID_11id=  request.getParameter("buyerID60");
        int buyerID_11idTemp  = Integer.parseInt(buyerID_11id);
        com.mtit.buyer.Buyer getBuyer41mtemp = sampleBuyerServiceImplProxyid.getBuyer(buyerID_11idTemp);
if(getBuyer41mtemp == null){
%>
<%=getBuyer41mtemp %>
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
if(getBuyer41mtemp != null){
java.lang.String typename44 = getBuyer41mtemp.getName();
        String tempResultname44 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typename44));
        %>
        <%= tempResultname44 %>
        <%
}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">zip:</TD>
<TD>
<%
if(getBuyer41mtemp != null){
java.lang.String typezip46 = getBuyer41mtemp.getZip();
        String tempResultzip46 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typezip46));
        %>
        <%= tempResultzip46 %>
        <%
}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">country:</TD>
<TD>
<%
if(getBuyer41mtemp != null){
java.lang.String typecountry48 = getBuyer41mtemp.getCountry();
        String tempResultcountry48 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typecountry48));
        %>
        <%= tempResultcountry48 %>
        <%
}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">buyerId:</TD>
<TD>
<%
if(getBuyer41mtemp != null){
%>
<%=getBuyer41mtemp.getBuyerId()
%><%}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">city:</TD>
<TD>
<%
if(getBuyer41mtemp != null){
java.lang.String typecity52 = getBuyer41mtemp.getCity();
        String tempResultcity52 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typecity52));
        %>
        <%= tempResultcity52 %>
        <%
}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">addressLine1:</TD>
<TD>
<%
if(getBuyer41mtemp != null){
java.lang.String typeaddressLine154 = getBuyer41mtemp.getAddressLine1();
        String tempResultaddressLine154 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typeaddressLine154));
        %>
        <%= tempResultaddressLine154 %>
        <%
}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">phone:</TD>
<TD>
<%
if(getBuyer41mtemp != null){
java.lang.String typephone56 = getBuyer41mtemp.getPhone();
        String tempResultphone56 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typephone56));
        %>
        <%= tempResultphone56 %>
        <%
}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">email:</TD>
<TD>
<%
if(getBuyer41mtemp != null){
java.lang.String typeemail58 = getBuyer41mtemp.getEmail();
        String tempResultemail58 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typeemail58));
        %>
        <%= tempResultemail58 %>
        <%
}%>
</TD>
</TABLE>
<%
}
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