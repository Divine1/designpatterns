package com.solid.dip;

/*
    Now if you need to change the Database from Mysql to Postgres, you can make this change without
    modifying the  business logic

*/
class BusinessLogic1{
    Database database;
    public BusinessLogic1(Database database){
        this.database=database;
    }

    public void performBusinessLogic(){
        this.database.connect();
        //perform business logic
        this.database.disconnect();
    }
}

interface Database{
    public void connect();
    public void disconnect();
}
class MysqlDatabase1 implements Database{
    @Override
    public void connect(){
        System.out.println("Database connected");
    }

    @Override
    public void disconnect(){
        System.out.println("Database disconnected");
    }
}


public class WithDIP {
}
