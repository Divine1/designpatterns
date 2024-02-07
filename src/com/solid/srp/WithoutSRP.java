package com.solid.srp;

/*

This class has too many responsibilities or tasks to perform.
This class doesnot adhere to Single Responsibility Principle.
According to SRP principle, a class should have single responsibility only.

*/
class BankService{
    public long deposit(long amount,String accountNumber){
        //deposit amount;
        return 0;
    }
    public long withDraw(long amount,String accountNumber){
        //withdraw amount
        return 0;
    }

    public void printPassbook(){
        //update transaction info in passbook
    }
    public void getLoanInterestInfo(String loanType){
        if("homeloan".equals(loanType)){

        }
        else if("goldloan".equals(loanType)){

        }
        else if("carloan".equals(loanType)){

        }
    }
    public void sendOTP(String mode){
        if("email".equals(mode)){
            // Java mail sender api
        }
        else if("mobile".equals(mode)){
            // twilio api
        }
        else{

        }
    }
}


public class WithoutSRP {


}
