package com.creational.factorypattern;


public class FPClientMain {
    public static void main(String[] args) {

        Button button = ButtonFactory.createButton(OS.WINDOWS);
        System.out.println(button);
    }
}
