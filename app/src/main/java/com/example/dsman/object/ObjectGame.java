package com.example.dsman.object;

import android.graphics.Rect;

public class ObjectGame {
    int maxScreenX;
    int maxScreenY;
    int   minScreenX;
     int   minScreenY;
      int  x;
       int  y;
       int speed;
        Rect hitBox;
    Double   radius;


    public int getMaxScreenX() {
        return maxScreenX;
    }

    public void setMaxScreenX(int maxScreenX) {
        this.maxScreenX = maxScreenX;
    }

    public int getMaxScreenY() {
        return maxScreenY;
    }

    public void setMaxScreenY(int maxScreenY) {
        this.maxScreenY = maxScreenY;
    }

    public int getMinScreenX() {
        return minScreenX;
    }

    public void setMinScreenX(int minScreenX) {
        this.minScreenX = minScreenX;
    }

    public int getMinScreenY() {
        return minScreenY;
    }

    public void setMinScreenY(int minScreenY) {
        this.minScreenY = minScreenY;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public Rect getHitBox() {
        return hitBox;
    }

    public void setHitBox(Rect hitBox) {
        this.hitBox = hitBox;
    }

    public Double getRadius() {
        return radius;
    }

    public void setRadius(Double radius) {
        this.radius = radius;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }
}
