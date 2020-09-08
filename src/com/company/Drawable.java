package com.company;

import java.awt.*;

public interface Drawable {
    void draw(Graphics g, int length, int width, int X, int Y);
}

class AbstractVerticalPicture implements Drawable {

    @Override
    public void draw(Graphics g, int X, int Y, int width, int length) {
        // look how to cast automatic values
        g.setColor(Color.LIGHT_GRAY);
        g.fillRect(X, Y, width, length / 5);
        g.setColor(Color.BLACK);
        Triangle.instance.draw(g, X, Y, length / 5, width);
        /*
        g.setColor(Color.BLACK);
        int j = 0;
        for (int i = 0; i < length / 5; i++) {
            // try to draw lines to each pix to draw filled triangle
            g.drawLine(X + width / 2 - j, Y + i, X + width / 2 + j, Y + i);
            if (j < width / 3) j++;

        }*/
        g.setColor(Color.pink);
        g.fillOval(X + width / 4, Y + length / 6, width / 2, width / 2);
g.setColor(Color.BLUE);
ReversedTriangle.instance.draw(g,150, 150, length/5, width);
        g.setColor(Color.BLACK);
        g.drawRect(X, Y, width, length);
    }
}

class Triangle implements Drawable {

    public void draw(Graphics g, int X, int Y, int length, int width) {
        int j = 0;
        for (int i = 0; i < length; i++) {
            g.drawLine(X + width / 2 - j, Y + i, X + width / 2 + j, Y + i);
            if (j < width / 3) j++;
        }
    }

    public static final Triangle instance = new Triangle();
}

class ReversedTriangle implements Drawable {

    @Override
    public void draw(Graphics g, int length, int width, int X, int Y) {
        int j = 0;
        for (int i = length; i > 0; i--) {
            g.drawLine(X + width / 2 - j, Y + i, X + width / 2 + j, Y + i);
            if (j < width / 3) j++;
        }
    }
// make reversed triangle
    public static final Triangle instance = new Triangle();
}
