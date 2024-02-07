package com.creational.abstractfactorypattern;

public class AFPClientMain {

    public static void main(String[] args) {
        UIWindowFactory macUIWindowFactory = new MacUIWindowFactory();

        Window window = macUIWindowFactory.createWindow();
        System.out.println("window");
        System.out.println(window);
    }
}
