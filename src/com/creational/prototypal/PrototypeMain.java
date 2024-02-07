package com.creational.prototypal;


import java.util.ArrayList;
import java.util.List;

class Mine{
    public int m;

    public Mine(int m){
        this.m=m;
    }

    @Override
    public String toString() {
        return "Mine{" +
                "m=" + m +
                '}';
    }
}
interface Animal extends Cloneable{
    Object cloneAnimal() throws CloneNotSupportedException;
}

class Dog implements Animal
        {
    public int id;
    public Mine m;

    private Dog(){

    }
    public Dog(int id,Mine m){
        this.id=id;
        this.m = m;


    }
    @Override
    public Object cloneAnimal() throws CloneNotSupportedException {


        //Animal dog = new Dog(this.id,this.name);
        //return dog;
        return super.clone();


    }

    @Override
    public String toString() {
        return "Dog{" +
                "id=" + id +
                ", m='" + m + '\'' +
                '}'+" mhash "+m.hashCode();
    }
}

public class PrototypeMain {

    public static void main(String[] args) throws CloneNotSupportedException {
        Dog tom = new Dog(1,new Mine(10));
        System.out.println("tom "+tom);

        Dog dick = new Dog(2,new Mine(20));
        System.out.println("dick "+dick);

        Dog dickClone = (Dog) dick.cloneAnimal();
        System.out.println("dickClone "+dickClone);

        dickClone.m.m=40;
       // dickClone.m= new Mine(30);

        System.out.println("dick1 "+dick);
        System.out.println("dickClone1 "+dickClone);

    }
}
