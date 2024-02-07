package com.behaviour.strategy;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

interface PaymentStrategy{
    public void pay(double amount);
}

class PaypalStrategy implements PaymentStrategy{
    public void pay(double amount){
        System.out.println("PaypalStrategy: amount "+amount+" is paid");
    }
}
class CardStrategy implements PaymentStrategy{
    public void pay(double amount){
        System.out.println("CardStrategy: amount "+amount+" is paid");
    }
}

class ShoppingCart{
    List<String> cartItems;
    PaymentStrategy paymentStrategy;

    public ShoppingCart(){
        cartItems = new ArrayList<>();
    }

    public PaymentStrategy getPaymentStrategy() {
        return paymentStrategy;
    }

    public void setPaymentStrategy(PaymentStrategy paymentStrategy) {
        this.paymentStrategy = paymentStrategy;
    }

    public void addItem(String item){
        cartItems.add(item);
    }

    public void makePayment(){
        double finalAmount=100;
        paymentStrategy.pay(finalAmount);
    }
}

public class StrategyMain {
    public static void main(String[] args) {
        ShoppingCart shoppingCart = new ShoppingCart();
        Scanner sin = new Scanner(System.in);
        int choice = sin.nextInt();
        if(choice == 1){
            shoppingCart.setPaymentStrategy(new PaypalStrategy());
        }
        else if(choice == 2){
            shoppingCart.setPaymentStrategy(new CardStrategy());
        }
        else{
            System.out.println("no payment option found");
            return;
        }

        shoppingCart.makePayment();
    }
}
