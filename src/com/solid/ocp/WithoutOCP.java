package com.solid.ocp;

/*

As per Open closed principle , a class,functions should be open for extension and closed for modification.

Let's  say in future you have to implement sendOTP through whatsapp feature, then you have to modify the
sendOTP(mode) method, but this will violate OCP.

As per OCP, developers should implement new features just by extending the existing implementation.

*/


class NotificationService{
    public void sendOTP(String mode){
        if("email".equals(mode)){
            // Java mail sender api
        }
        else if("mobile".equals(mode)){
            //twilio api
        }
        else{

        }
    }
}


public class WithoutOCP {

}
