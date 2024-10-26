package org.dstu.shapes;

import java.awt.*;

public class  Ellipse extends Shape {
    private int width;
    private int height;

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public Ellipse() {
    }

    public Ellipse(int x, int y, int width,int height, Color color) {
        super(x, y, color);
        this.width = width;
        this.height = height;
    }

    public boolean intersects(Ellipse other) {
        int halfWidthSum = (width + other.width) / 2;
        int halfHeightSum = (height + other.height) / 2;
        int distanceX = Math.abs(x - other.x);
        int distanceY = Math.abs(y - other.y);

        return distanceX < halfWidthSum && distanceY < halfHeightSum;
    }



    @Override
    public void draw(Graphics g) {
        g.setColor(color);
        g.drawOval(x - width / 2, y - height / 2, width, height);
        g.fillOval(x - width / 2, y - height / 2, width, height);
    }
}
