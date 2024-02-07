package com.behaviour.template;


abstract class Template{
    abstract void read();
    void process(){
        System.out.println("processing data");
        System.out.println("processing completed");
    }
    abstract void write();
    void run(){
        read();
        process();
        write();
    }
}

class ConcreateAlgorithm extends Template{
    void read(){
        System.out.println("reading data");
    }
    void write(){
        System.out.println("writing data");
    }
}

public class TemplateMain {
    public static void main(String[] args) {

        Template template = new ConcreateAlgorithm();
        template.run();
    }
}
