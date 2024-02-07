package com.creational.abstractfactorypattern;


public class TextBoxFactory {
    public static TextBox createTextBox(OS os){

        TextBox textBox;

        if(OS.WINDOWS == os){
            textBox = new TextBox("#FFFFFF",os+" Button",os);
        }
        else if(OS.MAC == os){
            textBox = new TextBox("#45DDAA",os+" Button",os);
        }
        else if( OS.LINUX == os){
            textBox = new TextBox("#000000",os+" Button",os);
        }
        else{
            throw new RuntimeException("OS not found "+os);
        }

        return textBox;
    }
}
