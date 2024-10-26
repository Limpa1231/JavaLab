package org.dstu.shapes.animators;

import org.dstu.shapes.Square;

import javax.swing.*;

public class LeftTopSquareAnimator extends Animator {
    public LeftTopSquareAnimator(Square shape, JComponent component) {
        super(shape, component);
    }


    @Override
    public void run() {
        while (true) {
            if (shape != null && component != null) {
                shape.moveRel(-(int)(Math.random() * 100), -(int)(Math.random() * 100));
                component.repaint();
                try {
                    Thread.sleep(200);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }
}
