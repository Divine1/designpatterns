package com.behaviour.chainofresp;

class Request{
    double amount;
    String username;

    public Request(String username,double amount){
        this.username=username;
        this.amount=amount;
    }
    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    @Override
    public String toString() {
        return "Request{" +
                "amount=" + amount +
                ", username='" + username + '\'' +
                '}';
    }
}

abstract class Approver{

    protected Approver nextHandler;
    protected Approver(Approver nextHandler){
        this.nextHandler  = nextHandler;
    }
    abstract public void handle(Request request);
}

class FinanceExecutive extends Approver{
    private final double FINANCEEXECUTIVE_APPROVAL_LIMIT=10000;

    public FinanceExecutive(Approver nextHandler){
        super(nextHandler);
    }

    @Override
    public void handle(Request request) {
        if(request.getAmount() <= FINANCEEXECUTIVE_APPROVAL_LIMIT){
            System.out.println("FinanceExecutive has approved the request "+request);
        }
        else{
            if(super.nextHandler !=null){
                super.nextHandler.handle(request);
            }
            else{
                System.out.println("No handler exists");
            }
        }
    }

}
class DepartmentHead extends Approver{
    private final double DEPARTMENTHEAD_APPROVAL_LIMIT = 5000;
    public DepartmentHead(Approver nextHandler){
        super(nextHandler);
    }

    @Override
    public void handle(Request request) {

        if(request.getAmount() <= DEPARTMENTHEAD_APPROVAL_LIMIT){
            System.out.println("DepartmentHead has approved the request "+request);
        }
        else{
            super.nextHandler.handle(request);
        }

    }
}

class Manager extends Approver{
    private final double MANAGER_APPROVAL_LIMIT = 1000;
    public Manager(Approver nextHandler){
        super(nextHandler);
    }

    @Override
    public void handle(Request request) {

        if(request.getAmount() <= MANAGER_APPROVAL_LIMIT){
            System.out.println("Manager has approved the request "+request);
        }
        else{
            super.nextHandler.handle(request);
        }

    }
}


public class ChainMain {
    public static void main(String[] args) {

        Approver financeExecutive = new FinanceExecutive(null);
        Approver departmentHead = new DepartmentHead(financeExecutive);
        Approver manager = new Manager(departmentHead);


        Request request1=new Request("tom",200);
        Request request2=new Request("dick",2000);
        Request request3=new Request("rufus",6000);
        Request request4=new Request("jerry",70000);


        manager.handle(request1);
        manager.handle(request2);
        manager.handle(request3);
        manager.handle(request4);

        System.out.println("all requests processed");

    }
}
