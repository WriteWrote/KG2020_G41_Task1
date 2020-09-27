package com.company.drawable.drawunits.castle_units;

import com.company.Drawable;

import java.awt.*;

public class Gate implements Drawable {
    private int X, Y, width, height;
    private Color color = new Color(0x8C1042);

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

        g2.setColor(Color.black);
        g2.setStroke(new BasicStroke(3));
        g2.drawLine(X + width / 2, Y + 2, X + width / 2, Y + height / 2 - 1);

        g2.setColor(Color.YELLOW);
        g2.setStroke(new BasicStroke(4));

        g.fillOval(X + width / 2 - width / 3 + width / 40, Y + height / 4 - width / 20,
                width / 10, width / 10);
        g.fillOval(X + width / 2 + width / 6 + width / 40, Y + height / 4 - width / 20,
                width / 10, width / 10);

        g2.drawOval(X + width / 2 - width / 3, Y + height / 4, width / 7, width / 5);
        g2.drawOval(X + width / 2 + width / 6, Y + height / 4, width / 7, width / 5);
    }
}
