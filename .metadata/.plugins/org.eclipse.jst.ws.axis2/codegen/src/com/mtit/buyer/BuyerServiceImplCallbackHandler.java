
/**
 * BuyerServiceImplCallbackHandler.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.4  Built on : Dec 28, 2015 (10:03:39 GMT)
 */

    package com.mtit.buyer;

    /**
     *  BuyerServiceImplCallbackHandler Callback class, Users can extend this class and implement
     *  their own receiveResult and receiveError methods.
     */
    public abstract class BuyerServiceImplCallbackHandler{



    protected Object clientData;

    /**
    * User can pass in any object that needs to be accessed once the NonBlocking
    * Web service call is finished and appropriate method of this CallBack is called.
    * @param clientData Object mechanism by which the user can pass in user data
    * that will be avilable at the time this callback is called.
    */
    public BuyerServiceImplCallbackHandler(Object clientData){
        this.clientData = clientData;
    }

    /**
    * Please use this constructor if you don't want to set any clientData
    */
    public BuyerServiceImplCallbackHandler(){
        this.clientData = null;
    }

    /**
     * Get the client data
     */

     public Object getClientData() {
        return clientData;
     }

        
           /**
            * auto generated Axis2 call back method for deleteBuyer method
            * override this method for handling normal response from deleteBuyer operation
            */
           public void receiveResultdeleteBuyer(
                    com.mtit.buyer.BuyerServiceImplStub.DeleteBuyerResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from deleteBuyer operation
           */
            public void receiveErrordeleteBuyer(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for getBuyer method
            * override this method for handling normal response from getBuyer operation
            */
           public void receiveResultgetBuyer(
                    com.mtit.buyer.BuyerServiceImplStub.GetBuyerResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from getBuyer operation
           */
            public void receiveErrorgetBuyer(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for getAllBuyers method
            * override this method for handling normal response from getAllBuyers operation
            */
           public void receiveResultgetAllBuyers(
                    com.mtit.buyer.BuyerServiceImplStub.GetAllBuyersResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from getAllBuyers operation
           */
            public void receiveErrorgetAllBuyers(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for addBuyer method
            * override this method for handling normal response from addBuyer operation
            */
           public void receiveResultaddBuyer(
                    com.mtit.buyer.BuyerServiceImplStub.AddBuyerResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from addBuyer operation
           */
            public void receiveErroraddBuyer(java.lang.Exception e) {
            }
                


    }
    