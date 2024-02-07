package com.solid.ocp;

interface INotificationService{
    public void sendOTP(String mode);
    public void sendTransactionReport(String medium);
}

class EmailNotificationService implements  INotificationService{

    @Override
    public void sendOTP(String mode) {
        //integrate with email api
    }

    @Override
    public void sendTransactionReport(String medium) {
        //integrate with email api
    }
}

class MobileNotificationService implements INotificationService{

    @Override
    public void sendOTP(String mode) {
        //integrate with twilio api
    }

    @Override
    public void sendTransactionReport(String medium) {
        //integrate with twilio api
    }
}

class WhatsAppNotificationService implements INotificationService{

    @Override
    public void sendOTP(String mode) {

    }

    @Override
    public void sendTransactionReport(String medium) {

    }
}

public class WithOCP {
}
