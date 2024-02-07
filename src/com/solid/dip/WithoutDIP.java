package com.solid.dip;


/*
High level module (for eg. business logic) should depend on low level module (for eg. Database) using
abstract classes and interfaces. Business logic shouldn't directly depend on Databases.

As per below implementation, if you have to change database from MysqlDatabase to PostgresDatabase, you
have to update the Businesslogic which will violate OCP.



 */

class BusinessLogic{
    MysqlDatabase database;
    public BusinessLogic(MysqlDatabase database){
        this.database=database;
    }

    public void performBusinessLogic(){
        this.database.connect();
        //perform business logic
        this.database.disconnect();
    }
}

class MysqlDatabase{
    public void connect(){
        System.out.println("Database connected");
    }
    public void disconnect(){
        System.out.println("Database disconnected");
    }
}

public class WithoutDIP {
}
