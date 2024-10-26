package org.dstu.shapes.animators;

import org.dstu.shapes.Ellipse;
import org.dstu.Main;

import javax.swing.*;
import java.awt.*;


public class EllipseAnimator extends Animator {
    public EllipseAnimator(Ellipse shape, JComponent component) {
        super(shape, component);
    }



    @Override
    public void run() {
        while (true) {
            if (shape != null && component != null) {
                shape.moveRel(-(int)(Math.random() * 5), 0);
                component.repaint();
                try {
                    Thread.sleep(200);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }if(shape.getX() == 80 ){
                    shape.changeColor();
                    shape.moveRel((int)(Math.random() * 5), -(int)(Math.random() * 5));
                }
            }
        }
    }



}