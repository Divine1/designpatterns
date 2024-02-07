package com.creational.abstractfactorypattern;


public class Button implements  UIElement{

    String color;
    boolean border;
    OS os;

    public Button(String color, boolean border, OS os){
        this.color=color;
        this.border=border;
        this.os=os;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isBorder() {
        return border;
    }

    public void setBorder(boolean border) {
        this.border = border;
    }

    public OS getOs() {
        return os;
    }

    public void setOs(OS os) {
        this.os = os;
    }

    @Override
    public String toString() {
        return "Button{" +
                "color='" + color + '\'' +
                ", border=" + border +
                ", os=" + os +
                '}';
    }

    @Override
    public void render() {
        System.out.println("rendering "+getClass().getName()+" in "+this.os);
    }
}
