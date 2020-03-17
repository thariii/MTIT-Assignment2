<%@page contentType="text/html;charset=UTF-8"%>
<% request.setCharacterEncoding("UTF-8"); %>
<HTML>
<HEAD>
<TITLE>Result</TITLE>
</HEAD>
<BODY>
<H1>Result</H1>

<jsp:useBean id="sampleProductServiceImplProxyid" scope="session" class="com.mtit.Product.ProductServiceImplProxy" />
<%
if (request.getParameter("endpoint") != null && request.getParameter("endpoint").length() > 0)
sampleProductServiceImplProxyid.setEndpoint(request.getParameter("endpoint"));
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
        java.lang.String getEndpoint2mtemp = sampleProductServiceImplProxyid.getEndpoint();
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
        sampleProductServiceImplProxyid.setEndpoint(endpoint_0idTemp);
break;
case 10:
        gotMethod = true;
        com.mtit.Product.ProductServiceImpl getProductServiceImpl10mtemp = sampleProductServiceImplProxyid.getProductServiceImpl();
if(getProductServiceImpl10mtemp == null){
%>
<%=getProductServiceImpl10mtemp %>
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
        String productId_1id=  request.getParameter("productId30");
        int productId_1idTemp  = Integer.parseInt(productId_1id);
        com.mtit.Product.Product getProduct15mtemp = sampleProductServiceImplProxyid.getProduct(productId_1idTemp);
if(getProduct15mtemp == null){
%>
<%=getProduct15mtemp %>
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
if(getProduct15mtemp != null){
java.lang.String typename18 = getProduct15mtemp.getName();
        String tempResultname18 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typename18));
        %>
        <%= tempResultname18 %>
        <%
}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">sellerId:</TD>
<TD>
<%
if(getProduct15mtemp != null){
java.lang.String typesellerId20 = getProduct15mtemp.getSellerId();
        String tempResultsellerId20 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typesellerId20));
        %>
        <%= tempResultsellerId20 %>
        <%
}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">productId:</TD>
<TD>
<%
if(getProduct15mtemp != null){
%>
<%=getProduct15mtemp.getProductId()
%><%}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">price:</TD>
<TD>
<%
if(getProduct15mtemp != null){
java.lang.String typeprice24 = getProduct15mtemp.getPrice();
        String tempResultprice24 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typeprice24));
        %>
        <%= tempResultprice24 %>
        <%
}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">description:</TD>
<TD>
<%
if(getProduct15mtemp != null){
java.lang.String typedescription26 = getProduct15mtemp.getDescription();
        String tempResultdescription26 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typedescription26));
        %>
        <%= tempResultdescription26 %>
        <%
}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">category:</TD>
<TD>
<%
if(getProduct15mtemp != null){
java.lang.String typecategory28 = getProduct15mtemp.getCategory();
        String tempResultcategory28 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typecategory28));
        %>
        <%= tempResultcategory28 %>
        <%
}%>
</TD>
</TABLE>
<%
}
break;
case 32:
        gotMethod = true;
        String productId_2id=  request.getParameter("productId35");
        int productId_2idTemp  = Integer.parseInt(productId_2id);
        boolean deleteProduct32mtemp = sampleProductServiceImplProxyid.deleteProduct(productId_2idTemp);
        String tempResultreturnp33 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(deleteProduct32mtemp));
        %>
        <%= tempResultreturnp33 %>
        <%
break;
case 37:
        gotMethod = true;
        String name_4id=  request.getParameter("name42");
            java.lang.String name_4idTemp = null;
        if(!name_4id.equals("")){
         name_4idTemp  = name_4id;
        }
        String sellerId_5id=  request.getParameter("sellerId44");
            java.lang.String sellerId_5idTemp = null;
        if(!sellerId_5id.equals("")){
         sellerId_5idTemp  = sellerId_5id;
        }
        String productId_6id=  request.getParameter("productId46");
        int productId_6idTemp  = Integer.parseInt(productId_6id);
        String price_7id=  request.getParameter("price48");
            java.lang.String price_7idTemp = null;
        if(!price_7id.equals("")){
         price_7idTemp  = price_7id;
        }
        String description_8id=  request.getParameter("description50");
            java.lang.String description_8idTemp = null;
        if(!description_8id.equals("")){
         description_8idTemp  = description_8id;
        }
        String category_9id=  request.getParameter("category52");
            java.lang.String category_9idTemp = null;
        if(!category_9id.equals("")){
         category_9idTemp  = category_9id;
        }
        %>
        <jsp:useBean id="com1mtit1Product1Product_3id" scope="session" class="com.mtit.Product.Product" />
        <%
        com1mtit1Product1Product_3id.setName(name_4idTemp);
        com1mtit1Product1Product_3id.setSellerId(sellerId_5idTemp);
        com1mtit1Product1Product_3id.setProductId(productId_6idTemp);
        com1mtit1Product1Product_3id.setPrice(price_7idTemp);
        com1mtit1Product1Product_3id.setDescription(description_8idTemp);
        com1mtit1Product1Product_3id.setCategory(category_9idTemp);
        boolean addProduct37mtemp = sampleProductServiceImplProxyid.addProduct(com1mtit1Product1Product_3id);
        String tempResultreturnp38 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(addProduct37mtemp));
        %>
        <%= tempResultreturnp38 %>
        <%
break;
case 54:
        gotMethod = true;
        com.mtit.Product.Product[] getAllProducts54mtemp = sampleProductServiceImplProxyid.getAllProducts();
if(getAllProducts54mtemp == null){
%>
<%=getAllProducts54mtemp %>
<%
}else{
        String tempreturnp55 = null;
        if(getAllProducts54mtemp != null){
        java.util.List listreturnp55= java.util.Arrays.asList(getAllProducts54mtemp);
        tempreturnp55 = listreturnp55.toString();
        }
        %>
        <%=tempreturnp55%>
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