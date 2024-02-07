package com.solid.srp;

class PrinterService{
    public void printPassbook(){
        //update transaction info in passbook
    }
}

class LoanService{
    public void getLoanInterestInfo(String loanType){
        if("homeloan".equals(loanType)){

        }
        else if("goldloan".equals(loanType)){

        }
        else if("carloan".equals(loanType)){

        }
    }
}

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

public class WithSRP {

}
