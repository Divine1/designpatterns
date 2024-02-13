package com.structural.flyweight;

/*


intrinsic state - state shared across all objects
extrinsic state - each object will have its own state

Flyweight pattern is similar to caching

 */

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Bullet{
    String color;
    public Bullet(String color){
        this.color=color;
    }
}

class BulletFactory{
    private static Map<String,Bullet> bulletMap = new HashMap<>();

    public static Bullet createBullet(String color){
        Bullet bullet = bulletMap.get(color);
        if(bullet == null){
            bullet = new Bullet(color);
        }
        System.out.println("created bullet");
        return bullet;
    }
}

class MovingBullet{

    Bullet bullet;
    int x;
    int y;
    public MovingBullet(String color,int x,int y){
        this.bullet = BulletFactory.createBullet(color);
        this.x=x;
        this.y=y;
    }
}


public class FlyweightMain {
    public static void main(String[] args) {
        List<MovingBullet> movingBulletList = new ArrayList<>();

        for(int i=0;i<100;i++){
            movingBulletList.add(new MovingBullet("black",i,i*10));
        }
    }
}
