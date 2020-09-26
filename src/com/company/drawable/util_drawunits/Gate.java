package com.company.drawable.util_drawunits;

import com.company.Drawable;

import java.awt.*;

public class Gate implements Drawable {
    private int X, Y, width, height;
    private Color color = new Color(0x8C2E4B);

    public Gate(int x, int y, int width, int height) {
        X = x;
        Y = y;
        this.width = width;
        this.height = height;
    }

    public Gate(int x, int y, int width, int height, Color color) {
        X = x;
        Y = y;
        this.width = width;
        this.height = height;
        this.color = color;
    }

    @Override
    public void draw(Graphics g) {
        Graphics2D g2 = (Graphics2D) g;
        g.setColor(color);
        g.fillArc(X, Y, width, height, 0, 180);
        g.setColor(Color.black);
        g.fillRect(X+width/2, Y, 5, height/2);

        g2.setColor(Color.YELLOW);
        g2.setStroke(new BasicStroke(4));
        g2.drawOval(X + width/2 - width/4, Y + height/4, width/7, width/5);
        g2.drawOval(X + width/2 + width/6, Y + height/4, width/7, width/5);
    }
}
