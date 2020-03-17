/**
 * Order.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.mtit.Order;

public class Order  implements java.io.Serializable {
    private int buyerId;

    private java.lang.String date;

    private int orderId;

    private int productId;

    private int quantity;

    private int sellerId;

    private float totalPrice;

    public Order() {
    }

    public Order(
           int buyerId,
           java.lang.String date,
           int orderId,
           int productId,
           int quantity,
           int sellerId,
           float totalPrice) {
           this.buyerId = buyerId;
           this.date = date;
           this.orderId = orderId;
           this.productId = productId;
           this.quantity = quantity;
           this.sellerId = sellerId;
           this.totalPrice = totalPrice;
    }


    /**
     * Gets the buyerId value for this Order.
     * 
     * @return buyerId
     */
    public int getBuyerId() {
        return buyerId;
    }


    /**
     * Sets the buyerId value for this Order.
     * 
     * @param buyerId
     */
    public void setBuyerId(int buyerId) {
        this.buyerId = buyerId;
    }


    /**
     * Gets the date value for this Order.
     * 
     * @return date
     */
    public java.lang.String getDate() {
        return date;
    }


    /**
     * Sets the date value for this Order.
     * 
     * @param date
     */
    public void setDate(java.lang.String date) {
        this.date = date;
    }


    /**
     * Gets the orderId value for this Order.
     * 
     * @return orderId
     */
    public int getOrderId() {
        return orderId;
    }


    /**
     * Sets the orderId value for this Order.
     * 
     * @param orderId
     */
    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }


    /**
     * Gets the productId value for this Order.
     * 
     * @return productId
     */
    public int getProductId() {
        return productId;
    }


    /**
     * Sets the productId value for this Order.
     * 
     * @param productId
     */
    public void setProductId(int productId) {
        this.productId = productId;
    }


    /**
     * Gets the quantity value for this Order.
     * 
     * @return quantity
     */
    public int getQuantity() {
        return quantity;
    }


    /**
     * Sets the quantity value for this Order.
     * 
     * @param quantity
     */
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }


    /**
     * Gets the sellerId value for this Order.
     * 
     * @return sellerId
     */
    public int getSellerId() {
        return sellerId;
    }


    /**
     * Sets the sellerId value for this Order.
     * 
     * @param sellerId
     */
    public void setSellerId(int sellerId) {
        this.sellerId = sellerId;
    }


    /**
     * Gets the totalPrice value for this Order.
     * 
     * @return totalPrice
     */
    public float getTotalPrice() {
        return totalPrice;
    }


    /**
     * Sets the totalPrice value for this Order.
     * 
     * @param totalPrice
     */
    public void setTotalPrice(float totalPrice) {
        this.totalPrice = totalPrice;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Order)) return false;
        Order other = (Order) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.buyerId == other.getBuyerId() &&
            ((this.date==null && other.getDate()==null) || 
             (this.date!=null &&
              this.date.equals(other.getDate()))) &&
            this.orderId == other.getOrderId() &&
            this.productId == other.getProductId() &&
            this.quantity == other.getQuantity() &&
            this.sellerId == other.getSellerId() &&
            this.totalPrice == other.getTotalPrice();
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        _hashCode += getBuyerId();
        if (getDate() != null) {
            _hashCode += getDate().hashCode();
        }
        _hashCode += getOrderId();
        _hashCode += getProductId();
        _hashCode += getQuantity();
        _hashCode += getSellerId();
        _hashCode += new Float(getTotalPrice()).hashCode();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Order.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://Order.mtit.com", "Order"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("buyerId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://Order.mtit.com", "buyerId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("date");
        elemField.setXmlName(new javax.xml.namespace.QName("http://Order.mtit.com", "date"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("orderId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://Order.mtit.com", "orderId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("productId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://Order.mtit.com", "productId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("quantity");
        elemField.setXmlName(new javax.xml.namespace.QName("http://Order.mtit.com", "quantity"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sellerId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://Order.mtit.com", "sellerId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("totalPrice");
        elemField.setXmlName(new javax.xml.namespace.QName("http://Order.mtit.com", "totalPrice"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "float"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
