package com.company.drawable.util_units;

import com.company.Drawable;

import java.awt.*;

public class Window implements Drawable {
    private int X, Y, width, heigth;

    public Window(int x, int y, int width, int heigth) {
        X = x;
        Y = y;
        this.width = width;
        this.heigth = heigth;
    }

    @Override
    public void draw(Graphics g) {
        g.setColor(Color.CYAN);
        g.fillRect(X, Y, width, heigth);

        g.setColor(Color.LIGHT_GRAY);
        g.fillRect(X, Y + heigth / 3, width, heigth / 15);
        g.fillRect(X + width / 2, Y, heigth / 15, heigth / 3);

        Frame frame = new Frame(X, Y, width, heigth, heigth / 15, Color.LIGHT_GRAY);
        frame.draw(g);
    }
}
