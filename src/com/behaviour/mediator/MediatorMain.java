package com.behaviour.mediator;

import java.util.ArrayList;
import java.util.List;

class Mediator{
    List<Colleague> colleagueList;
    public Mediator(){
        colleagueList=new ArrayList<>();
    }
    public void addColleagues(Colleague colleague){
        colleagueList.add(colleague);
    }
    public void sendMessage(String message,Colleague colleague){

        for(Colleague c : colleagueList){
            if(c == colleague){

            }
            else{
                c.receiveMessage(message);
            }
        }
    }
}

interface Colleague{
    public void sendMessage(String message);
    public void receiveMessage(String message);
}
class ConcreateColleague implements Colleague{
    Mediator mediator;
    public ConcreateColleague(Mediator mediator){
        this.mediator=mediator;
    }

    @Override
    public void sendMessage(String message){
        System.out.println("sendMessage: ");
        mediator.sendMessage(message,this);
    }

    @Override
    public void receiveMessage(String message){
        String className = this.getClass().getName();
        System.out.println("receiveMessage: "+className+" : "+ message);

    }
}


public class MediatorMain {

    public static void main(String[] args) {
        Mediator mediator=new Mediator();
        Colleague c1 = new ConcreateColleague(mediator);
        Colleague c2 = new ConcreateColleague(mediator);
        Colleague c3 = new ConcreateColleague(mediator);
        Colleague c4 = new ConcreateColleague(mediator);

        mediator.addColleagues(c1);
        mediator.addColleagues(c2);
        mediator.addColleagues(c3);
        mediator.addColleagues(c4);
        c1.sendMessage("hey from c1");
    }
}
