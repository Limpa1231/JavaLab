package org.dstu;

import org.dstu.components.MyPanel;
import org.dstu.shapes.Circle;
import org.dstu.shapes.Ellipse;
import org.dstu.shapes.Shape;
import org.dstu.shapes.Square;
import org.dstu.shapes.animators.*;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Shape> shapes = new ArrayList<>();
        Circle c1 = new Circle(600, 650, 100, Color.MAGENTA);
        Circle c2 = new Circle(570, 650, 100, Color.RED);
        Circle c3 = new Circle(540, 650, 100, Color.BLUE);
        Circle c4 = new Circle(510, 650, 100, Color.BLACK);
        Circle c5 = new Circle(480, 650, 100, Color.YELLOW);

//        Square s = new Square(600, 600, 50, Color.BLUE);
//        Ellipse Ellipse1 = new Ellipse(500,630,210,160,Color.GREEN);
//       Ellipse Ellipse2 = new Ellipse(100,100,80,60,Color.BLACK);

       shapes.add(c1);
       shapes.add(c2);
       shapes.add(c3);
       shapes.add(c4);
       shapes.add(c5);

//        shapes.add(c2);
//        shapes.add(s);
//        shapes.add(Ellipse1);
//        shapes.add(Ellipse2);

        // 1. Создать реализацию Runnable
        // 2. Создать нить (поток) - экземпляр Thread
        // 3. Запустить поток (Thread.start())

        MyPanel canvas = new MyPanel(shapes);
        c1.setAnimator(new LefCircleAnimator(c1, canvas));
        c2.setAnimator(new LefCircleAnimator(c2, canvas));
        c3.setAnimator(new LefCircleAnimator(c3, canvas));
        c4.setAnimator(new LefCircleAnimator(c4, canvas));
        c5.setAnimator(new LefCircleAnimator(c5, canvas));
//        c2.setAnimator(new RightBottomCircleAnimator(c2, canvas));
//        s.setAnimator(new LeftTopSquareAnimator(s, canvas));
//        Ellipse1.setAnimator(new EllipseAnimator(Ellipse1, canvas));
//        Ellipse2.setAnimator(new RightBottomEllipseAnimator(Ellipse2, canvas));


        for (Shape shape: shapes) {
            Thread t = new Thread(shape.getAnimator());
            t.start();
        }

//        Runnable myController = () -> {
//            while (true) {
//                shapes.forEach(shape -> {
//                    if (shape instanceof Circle) {
//                        shape.moveRel((int)(Math.random() * 15), (int)(Math.random() * 10));
//                    } else if (shape instanceof Square) {
//                        shape.moveRel(-(int)(Math.random() * 15), -(int)(Math.random() * 10));
//                    }
//                });
//                canvas.repaint();
//                try {
//                    Thread.sleep(200);
//                } catch (InterruptedException e) {
//                    throw new RuntimeException(e);
//                }
//            }
//        };

        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setSize(800, 800);
        frame.add(canvas);

//        Thread thread = new Thread(myController);
//        thread.start();

        frame.setVisible(true);
    }

}