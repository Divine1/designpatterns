package com.solid.isp;

interface Workable{
    void work();
}
interface Eatable{
    void eat();
}


class Robot2 implements Workable{

    @Override
    public void work() {
        // Robot can work
    }
}
class Human2 implements Eatable,Workable{

    @Override
    public void eat() {
        // Human can eat
    }

    @Override
    public void work(){
        // Human can work
    }
}

public class WithISP {

}
