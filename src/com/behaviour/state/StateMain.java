package com.behaviour.state;

class Context{
    State state;

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }

    void request(){
        state.handle(this);
    }
}

interface State{
    public void handle(Context context);
}

class ConcreteState1 implements State{
    @Override
    public void handle(Context context) {
        System.out.println("in ConcreteState1");
        context.setState( new ConcreteState2());
    }
}

class ConcreteState2 implements State{
    @Override
    public void handle(Context context) {
        System.out.println("in ConcreteState2");
        context.setState(new ConcreteState3());
    }
}
class ConcreteState3 implements State{
    @Override
    public void handle(Context context) {
        System.out.println("in ConcreteState3");
        context.setState(null);
    }
}

public class StateMain {
    public static void main(String[] args) {
        Context context = new Context();
        context.setState(new ConcreteState1());

        while (context.getState() !=null){
            context.request();
        }
        System.out.println("End state machine");
    }
}
