package com.creational.abstractfactorypattern;

import java.util.List;

public class MacUIWindowFactory implements UIWindowFactory{

    @Override
    public Window createWindow() {
        Window window = new Window(List.of(ButtonFactory.createButton(OS.WINDOWS),TextBoxFactory.createTextBox(OS.WINDOWS)));
        return window;
    }
}
