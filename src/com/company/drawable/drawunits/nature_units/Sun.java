package com.company.drawable.drawunits.nature_units;

import com.company.Drawable;
import java.awt.*;
import java.awt.geom.GeneralPath;

public class Sun implements Drawable {
    private int X;
    private int Y;
    private int R;
    private int r;
    private int n;
    private Color color = new Color(0xFFF0EB3B, true);

    public Sun(int x, int y, int r, int r1, int n, Color color) {
        X = x;
        Y = y;
        R = r;
        this.r = r1;
        this.n = n;
        this.color = color;
    }

    public Sun(int x, int y, int r, int r1, int n) {
        X = x;
        Y = y;
        R = r;
        this.r = r1;
        this.n = n;
    }

    @Override
    public void draw(Graphics g) {
        Graphics2D g2 = (Graphics2D) g;
        g2.setColor(color);
        Point[] array = getPoints(r, R, n, X, Y);
        GeneralPath path = new GeneralPath();
        path.moveTo(array[0].x, array[0].y);
        for (int i = 1; i < array.length; i++) {
            path.lineTo(array[i].x, array[i].y);
        }
        path.closePath();
        g2.setStroke(new BasicStroke(10));
        g2.draw(path);
        g2.fillOval(X - r, Y - r, 2 * r, 2 * r);
    }
    private static Point[] getPoints(int r, int R, int n, int X, int Y) {
        Point[] array = new Point[n * 2];
        double deltaAngle = 2 * Math.PI / n;
        for (int i = 0; i < 2*n; i+=2) {
            double angle = i * deltaAngle;
            double cosA_X = Math.cos(angle);
            double sinA_Y = Math.sin(angle);
            if ((i & 1) == 0) {
                cosA_X *= R;
                sinA_Y *= R;
            } else {
                cosA_X *= r;
                sinA_Y *= r;
            }
            array[i] = new Point (X, Y);
            array[i+1] = new Point((int) cosA_X + X, (int) sinA_Y + Y);
        }
        return array;
    }
}
