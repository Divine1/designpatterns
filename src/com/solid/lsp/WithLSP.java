package com.solid.lsp;


/*
Liskov Substitution Principle  states that object of super class should be replaceable with object of subclass
without affecting the correctness of the program.

if a classA is a subclass of classB, we should be able to replace object of classA with object of classB
without affecting the behaviour of the program
 */

class Bird{
    void fly(){
        System.out.println("Bird can fly");
    }
}
class Duck extends  Bird{

    @Override
    void fly(){
        System.out.println("Duck can fly");
    }

    void swim(){
        System.out.println("Duck can swim");
    }
}

public class WithLSP {
    public void makeBirdFly(Bird bird){
        bird.fly();
    }

    public static void main(String[] args) {
        Bird bird = new Bird();
        Duck duck = new Duck();
        WithLSP obj = new WithLSP();
        obj.makeBirdFly(bird);
        obj.makeBirdFly(duck);

    }
}
