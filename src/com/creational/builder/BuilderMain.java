package com.creational.builder;
/*
Builder pattern
 */

class Border{
    private int width;
    private String color;

    private Border(BorderBuilder borderBuilder){
        this.width=borderBuilder.width;
        this.color=borderBuilder.color;
    }

    public int getWidth() {
        return width;
    }
    public String getColor() {
        return color;
    }

    public static BorderBuilder builder(){
        return new BorderBuilder();
    }

    @Override
    public String toString() {
        return "Border{" +
                "width=" + width +
                ", color='" + color + '\'' +
                '}';
    }

    public static class BorderBuilder{
        private int width;
        private String color;

        public BorderBuilder(){

        }

        public BorderBuilder withWidth(int width) {
            this.width= width;
            return this;
        }


        public BorderBuilder withColor(String color) {
            this.color= color;
            return this;
        }

        public Border build(){
            return new Border(this);
        }


    }
}

public class BuilderMain {
    public static void main(String[] args) {


        Border border = Border.builder()
                .withWidth(20)
                .withColor("#000000")
                .build();

        System.out.println("border");
        System.out.println(border);
    }
}
