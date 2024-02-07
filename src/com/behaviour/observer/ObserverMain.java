package com.behaviour.observer;


import java.util.ArrayList;
import java.util.List;

abstract class Observable{

    List<Observer> observerList;

    public Observable(){
        observerList=new ArrayList<>();
    }
    void register(Observer observer){
        observerList.add(observer);
    }

    void unregister(Observer observer){
        observerList.remove(observer);
    }
}
class Subject extends Observable{
    String text;

    public void setText(String text){
        this.text=text;
        for(Observer observer : observerList){
            observer.notifyMethod();
        }
    }
}


interface Observer{
    void notifyMethod();
}

class Observer1 implements Observer{

    @Override
    public void notifyMethod() {
        System.out.println(this.getClass().getSimpleName()+" notified");
    }
}
class Observer2 implements Observer{
    @Override
    public void notifyMethod() {
        System.out.println(this.getClass().getSimpleName()+" notified");
    }
}
class Observer3 implements Observer{
    @Override
    public void notifyMethod() {
        System.out.println(this.getClass().getSimpleName()+" notified");
    }
}

public class ObserverMain {

    public static void main(String[] args) {
        Subject subject = new Subject();
        subject.register(new Observer1());
        subject.register(new Observer2());
        subject.register(new Observer3());

        subject.setText("hey bro");
    }
}
