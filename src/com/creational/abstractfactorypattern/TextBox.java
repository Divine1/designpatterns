package com.creational.abstractfactorypattern;


public class TextBox implements UIElement{

    String color;
    OS os;
    String text;

    public TextBox(String color, String text, OS os){
        this.color=color;
        this.text=text;
        this.os=os;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public OS getOs() {
        return os;
    }

    public void setOs(OS os) {
        this.os = os;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    @Override
    public String toString() {
        return "TextBox{" +
                "color='" + color + '\'' +
                ", os=" + os +
                ", text='" + text + '\'' +
                '}';
    }

    @Override
    public void render() {
        System.out.println("rendering "+getClass().getName()+" in "+this.os);
    }
}
