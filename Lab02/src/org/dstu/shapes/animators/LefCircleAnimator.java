package org.dstu.shapes.animators;

import org.dstu.shapes.Circle;
import org.dstu.shapes.Shape;

import javax.swing.*;

public class LefCircleAnimator extends Animator {
    public LefCircleAnimator(Circle shape, JComponent component) {
        super(shape, component);
    }

    @Override
    public void run() {
        while (true) {
            if (shape != null && component != null) {
                shape.moveRel(-10, 0);
                component.repaint();
                try {
                    Thread.sleep(200);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }if(shape.getX() == 40 && shape.getY() >= 650){
                    shape.changeColor();
                    shape.moveRel(-10, 0);
                }else if(shape.getX() == 10 && shape.getY() >= 10){
                    shape.moveRel(10, -10);
                }else if(shape.getX() == 10) {
                    shape.changeColor();
                    shape.moveRel(15,0);
                }else if(shape.getX() == 675){
                    shape.changeColor();
                    shape.moveRel(15,0);
                }else if(shape.getY() < 10 && shape.getX() < 679) {
                    shape.moveRel(15,0);
                }else if(shape.getX() == 680 && shape.getY() == 660){
                    shape.changeColor();
                    shape.moveRel(10,10);
                }else if(shape.getX() == 680){
                    shape.moveRel(10,10);
                }
            }
        }
    }
}
