package com.solid.isp;

/*
Interface Segregation Principle -
a class should not be forced to implement an interface it doesn't use
 */

interface Worker{
    void work();
    void eat();
}

class Robot1 implements Worker{

    @Override
    public void work() {
        // robot can work
    }

    @Override
    public void eat() {
        //robot cannot eat
    }
}

class Human1 implements Worker{

    @Override
    public void work() {
        // Human can work
    }

    @Override
    public void eat() {
        // Human can eat
    }
}
public class WithoutISP {
}
