package com.structural.Decorator;

/*
 Decorator pattern is useful for extending the functionalities of object in a flexible
 and reusable way.
 */


interface Coffee{
    String getDescription();
    double getCost();

}
interface CoffeeDecorator extends Coffee{

}


class SimpleCoffee implements Coffee{

    @Override
    public String getDescription() {
        return "just coffee";
    }

    @Override
    public double getCost() {
        return 10;
    }
}

class MilkDecorator implements CoffeeDecorator{
    Coffee coffee;

    public MilkDecorator(Coffee coffee){
        this.coffee=coffee;
    }

    @Override
    public String getDescription() {
        return coffee.getDescription()+" with milk";
    }

    @Override
    public double getCost() {
        return coffee.getCost()+20;
    }
}
public class DecoratorMain {
    public static void main(String[] args) {

        Coffee simpleCoffee=new SimpleCoffee();
        Coffee milkDecorator = new MilkDecorator(simpleCoffee);

        System.out.println("simpleCoffee");
        System.out.println(simpleCoffee.getCost());
        System.out.println(simpleCoffee.getDescription());

        System.out.println("milkDecorator");
        System.out.println(milkDecorator.getCost());
        System.out.println(milkDecorator.getDescription());
    }
}
