package com.creational.factorypattern;

public class ButtonFactory {

    public static Button createButton(OS os){
        Button button=null;
        if(OS.WINDOWS == os){
            button = new Button("#FFFFFF",true,os);
        }
        else if(OS.MAC == os){
            button = new Button("#45DDAA",false,os);
        }
        else if( OS.LINUX == os){
            button = new Button("#000000",true,os);
        }
        else{
            throw new RuntimeException("OS not found "+os);
        }
        return button;
    }
}
