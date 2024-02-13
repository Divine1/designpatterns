package com.structural.facade;


/*
Making Video Uploader Using Facade Pattern
Facade pattern is the most widely used pattern

Use Facade pattern , when you have to do an operation, and if the operation takes multiple steps to complete,

 */

class SubsystemA{
    void operation(){
        System.out.println("operation in SubsystemA");
    }
}
class SubsystemB{
    void operation(){
        System.out.println("operation in SubsystemB");
    }
}
class SubsystemC{
    void operation(){
        System.out.println("operation in SubsystemC");
    }
}

class Facade{
    SubsystemA subsystemA;
    SubsystemB subsystemB;
    SubsystemC subsystemC;

    public Facade(){
        this.subsystemA = new SubsystemA();
        this.subsystemB = new SubsystemB();
        this.subsystemC = new SubsystemC();
    }
    public void process(){
        subsystemA.operation();
        subsystemB.operation();
        subsystemC.operation();
    }
}
public class FacadeMain {
    public static void main(String[] args) {
        Facade facade = new Facade();
        facade.process();
    }
}
