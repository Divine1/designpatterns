package com.creational.singleton;

class Singleton{
    public static Singleton instance;

    private Singleton(){


    }

    public static Singleton getInstance(){
        if(instance == null){
            System.out.println("instance is null ");
            Singleton.instance= new Singleton();
        }
        return Singleton.instance;
    }
}


public class SingletonMain {
    public static void main(String[] args) {
        Singleton singleton1 = Singleton.getInstance();
        System.out.println("singleton1 ");
        System.out.println(singleton1);

        Singleton singleton2 = Singleton.getInstance();
        System.out.println("singleton2");
        System.out.println(singleton2);
    }
}
