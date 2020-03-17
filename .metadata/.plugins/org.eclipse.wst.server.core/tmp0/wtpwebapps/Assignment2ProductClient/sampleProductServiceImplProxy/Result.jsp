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
        String name_3id=  request.getParameter("name37");
            java.lang.String name_3idTemp = null;
        if(!name_3id.equals("")){
         name_3idTemp  = name_3id;
        }
        String sellerId_4id=  request.getParameter("sellerId39");
            java.lang.String sellerId_4idTemp = null;
        if(!sellerId_4id.equals("")){
         sellerId_4idTemp  = sellerId_4id;
        }
        String productId_5id=  request.getParameter("productId41");
        int productId_5idTemp  = Integer.parseInt(productId_5id);
        String price_6id=  request.getParameter("price43");
            java.lang.String price_6idTemp = null;
        if(!price_6id.equals("")){
         price_6idTemp  = price_6id;
        }
        String description_7id=  request.getParameter("description45");
            java.lang.String description_7idTemp = null;
        if(!description_7id.equals("")){
         description_7idTemp  = description_7id;
        }
        String category_8id=  request.getParameter("category47");
            java.lang.String category_8idTemp = null;
        if(!category_8id.equals("")){
         category_8idTemp  = category_8id;
        }
        %>
        <jsp:useBean id="com1mtit1Product1Product_2id" scope="session" class="com.mtit.Product.Product" />
        <%
        com1mtit1Product1Product_2id.setName(name_3idTemp);
        com1mtit1Product1Product_2id.setSellerId(sellerId_4idTemp);
        com1mtit1Product1Product_2id.setProductId(productId_5idTemp);
        com1mtit1Product1Product_2id.setPrice(price_6idTemp);
        com1mtit1Product1Product_2id.setDescription(description_7idTemp);
        com1mtit1Product1Product_2id.setCategory(category_8idTemp);
        boolean addProduct32mtemp = sampleProductServiceImplProxyid.addProduct(com1mtit1Product1Product_2id);
        String tempResultreturnp33 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(addProduct32mtemp));
        %>
        <%= tempResultreturnp33 %>
        <%
break;
case 49:
        gotMethod = true;
        com.mtit.Product.Product[] getAllProducts49mtemp = sampleProductServiceImplProxyid.getAllProducts();
if(getAllProducts49mtemp == null){
%>
<%=getAllProducts49mtemp %>
<%
}else{
        String tempreturnp50 = null;
        if(getAllProducts49mtemp != null){
        java.util.List listreturnp50= java.util.Arrays.asList(getAllProducts49mtemp);
        tempreturnp50 = listreturnp50.toString();
        }
        %>
        <%=tempreturnp50%>
        <%
}
break;
case 52:
        gotMethod = true;
        String productId_9id=  request.getParameter("productId55");
        int productId_9idTemp  = Integer.parseInt(productId_9id);
        boolean deleteProduct52mtemp = sampleProductServiceImplProxyid.deleteProduct(productId_9idTemp);
        String tempResultreturnp53 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(deleteProduct52mtemp));
        %>
        <%= tempResultreturnp53 %>
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