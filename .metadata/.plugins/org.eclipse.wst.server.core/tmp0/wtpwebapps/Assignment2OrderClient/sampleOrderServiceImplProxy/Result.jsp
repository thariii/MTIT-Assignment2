<%@page contentType="text/html;charset=UTF-8"%>
<% request.setCharacterEncoding("UTF-8"); %>
<HTML>
<HEAD>
<TITLE>Result</TITLE>
</HEAD>
<BODY>
<H1>Result</H1>

<jsp:useBean id="sampleOrderServiceImplProxyid" scope="session" class="com.mtit.Order.OrderServiceImplProxy" />
<%
if (request.getParameter("endpoint") != null && request.getParameter("endpoint").length() > 0)
sampleOrderServiceImplProxyid.setEndpoint(request.getParameter("endpoint"));
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
        java.lang.String getEndpoint2mtemp = sampleOrderServiceImplProxyid.getEndpoint();
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
        sampleOrderServiceImplProxyid.setEndpoint(endpoint_0idTemp);
break;
case 10:
        gotMethod = true;
        com.mtit.Order.OrderServiceImpl getOrderServiceImpl10mtemp = sampleOrderServiceImplProxyid.getOrderServiceImpl();
if(getOrderServiceImpl10mtemp == null){
%>
<%=getOrderServiceImpl10mtemp %>
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
        String orderId_1id=  request.getParameter("orderId32");
        int orderId_1idTemp  = Integer.parseInt(orderId_1id);
        com.mtit.Order.Order getOrder15mtemp = sampleOrderServiceImplProxyid.getOrder(orderId_1idTemp);
if(getOrder15mtemp == null){
%>
<%=getOrder15mtemp %>
<%
}else{
%>
<TABLE>
<TR>
<TD COLSPAN="3" ALIGN="LEFT">returnp:</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">orderId:</TD>
<TD>
<%
if(getOrder15mtemp != null){
%>
<%=getOrder15mtemp.getOrderId()
%><%}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">totalPrice:</TD>
<TD>
<%
if(getOrder15mtemp != null){
%>
<%=getOrder15mtemp.getTotalPrice()
%><%}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">date:</TD>
<TD>
<%
if(getOrder15mtemp != null){
java.lang.String typedate22 = getOrder15mtemp.getDate();
        String tempResultdate22 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typedate22));
        %>
        <%= tempResultdate22 %>
        <%
}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">sellerId:</TD>
<TD>
<%
if(getOrder15mtemp != null){
%>
<%=getOrder15mtemp.getSellerId()
%><%}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">productId:</TD>
<TD>
<%
if(getOrder15mtemp != null){
%>
<%=getOrder15mtemp.getProductId()
%><%}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">quantity:</TD>
<TD>
<%
if(getOrder15mtemp != null){
%>
<%=getOrder15mtemp.getQuantity()
%><%}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">buyerId:</TD>
<TD>
<%
if(getOrder15mtemp != null){
%>
<%=getOrder15mtemp.getBuyerId()
%><%}%>
</TD>
</TABLE>
<%
}
break;
case 34:
        gotMethod = true;
        String orderId_3id=  request.getParameter("orderId39");
        int orderId_3idTemp  = Integer.parseInt(orderId_3id);
        String totalPrice_4id=  request.getParameter("totalPrice41");
        float totalPrice_4idTemp  = Float.parseFloat(totalPrice_4id);
        String date_5id=  request.getParameter("date43");
            java.lang.String date_5idTemp = null;
        if(!date_5id.equals("")){
         date_5idTemp  = date_5id;
        }
        String sellerId_6id=  request.getParameter("sellerId45");
        int sellerId_6idTemp  = Integer.parseInt(sellerId_6id);
        String productId_7id=  request.getParameter("productId47");
        int productId_7idTemp  = Integer.parseInt(productId_7id);
        String quantity_8id=  request.getParameter("quantity49");
        int quantity_8idTemp  = Integer.parseInt(quantity_8id);
        String buyerId_9id=  request.getParameter("buyerId51");
        int buyerId_9idTemp  = Integer.parseInt(buyerId_9id);
        %>
        <jsp:useBean id="com1mtit1Order1Order_2id" scope="session" class="com.mtit.Order.Order" />
        <%
        com1mtit1Order1Order_2id.setOrderId(orderId_3idTemp);
        com1mtit1Order1Order_2id.setTotalPrice(totalPrice_4idTemp);
        com1mtit1Order1Order_2id.setDate(date_5idTemp);
        com1mtit1Order1Order_2id.setSellerId(sellerId_6idTemp);
        com1mtit1Order1Order_2id.setProductId(productId_7idTemp);
        com1mtit1Order1Order_2id.setQuantity(quantity_8idTemp);
        com1mtit1Order1Order_2id.setBuyerId(buyerId_9idTemp);
        boolean addOrder34mtemp = sampleOrderServiceImplProxyid.addOrder(com1mtit1Order1Order_2id);
        String tempResultreturnp35 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(addOrder34mtemp));
        %>
        <%= tempResultreturnp35 %>
        <%
break;
case 53:
        gotMethod = true;
        String orderId_10id=  request.getParameter("orderId56");
        int orderId_10idTemp  = Integer.parseInt(orderId_10id);
        boolean deleteOrder53mtemp = sampleOrderServiceImplProxyid.deleteOrder(orderId_10idTemp);
        String tempResultreturnp54 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(deleteOrder53mtemp));
        %>
        <%= tempResultreturnp54 %>
        <%
break;
case 58:
        gotMethod = true;
        com.mtit.Order.Order[] getAllOrders58mtemp = sampleOrderServiceImplProxyid.getAllOrders();
if(getAllOrders58mtemp == null){
%>
<%=getAllOrders58mtemp %>
<%
}else{
        String tempreturnp59 = null;
        if(getAllOrders58mtemp != null){
        java.util.List listreturnp59= java.util.Arrays.asList(getAllOrders58mtemp);
        tempreturnp59 = listreturnp59.toString();
        }
        %>
        <%=tempreturnp59%>
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