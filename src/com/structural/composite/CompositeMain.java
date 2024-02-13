package com.structural.composite;

/*
when you have structure hierarchical in nature(tree structure), composite pattern is used.
composite pattern helps us to prepare the hierarchy in proper manner. then it
helps to go over the entire hierarchy

Composite class is a class that contain any other composite class or can contain leaf

 */

import java.util.ArrayList;
import java.util.List;

interface Graphic{
    void draw();
}
class Circle implements Graphic{

    @Override
    public void draw() {
        System.out.println("drawing circle");
    }
}
class Square implements Graphic{

    @Override
    public void draw() {
        System.out.println("drawing Square");
    }
}

class CompositeGraphic implements Graphic{

    List<Graphic> graphicList;
    public CompositeGraphic(){
        graphicList = new ArrayList<>();
    }
    public void addGraphic(Graphic graphic){
        this.graphicList.add(graphic);
    }


    @Override
    public void draw() {
        for(Graphic graphic : graphicList){
            graphic.draw();
        }
    }
}



public class CompositeMain {
    public static void main(String[] args) {
        CompositeGraphic compositeGraphic = new CompositeGraphic();

        Circle circle  = new Circle();
        Square square = new Square();
        compositeGraphic.addGraphic(circle);
        compositeGraphic.addGraphic(square);

        compositeGraphic.draw();
    }
}
