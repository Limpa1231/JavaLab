package org.dstu.shapes;

import org.dstu.shapes.animators.Animator;

import java.awt.*;

public abstract class Shape {
    public int x;
    public int y;
    protected Color color;

    protected Animator animator;

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

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }
    public void changeColor() {
        int red = (int) (Math.random() * 255);
        int green = (int) (Math.random() * 255);
        int blue = (int) (Math.random() * 255);
        color = new Color(red, green, blue);
    }



    public Animator getAnimator() {
        return animator;
    }

    public void setAnimator(Animator animator) {
        this.animator = animator;
    }

    public Shape() {
    }

    public Shape(int x, int y, Color color) {
        this.x = x;
        this.y = y;
        this.color = color;
    }

    public void moveTo(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void moveRel(int dx, int dy) {
        x += dx;
        y += dy;
    }




    public abstract void draw(Graphics g);
}
