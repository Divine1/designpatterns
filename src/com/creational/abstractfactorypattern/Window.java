package com.creational.abstractfactorypattern;

import java.util.List;

public class Window implements UIElement{

    OS os;
    List<UIElement> uiElementsList;


    public Window(List<UIElement> uiElementsList){
        this.uiElementsList = uiElementsList;
    }

    @Override
    public String toString() {
        return "Window{" +
                "os=" + os +
                ", uiElementsList=" + uiElementsList +
                '}';
    }

    @Override
    public void render() {
        System.out.println("rendering "+getClass().getName()+" in "+this.os);
        for(UIElement uiElement : uiElementsList){
            uiElement.render();
        }
    }
}
