package org.dstu.shapes.animators;

import org.dstu.shapes.Circle;

import javax.swing.*;

public class RightBottomCircleAnimator extends Animator {

    public RightBottomCircleAnimator(Circle shape, JComponent component) {
        super(shape, component);
    }

    @Override
    public void run() {
        while (true) {
            if (shape != null && component != null) {
                shape.moveRel((int)(Math.random() * 5), 0);
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
