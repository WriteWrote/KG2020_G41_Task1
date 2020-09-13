package com.company;

import java.awt.*;

public interface Drawable {
    void draw(Graphics g);
}

class AbstractVerticalPicture implements Drawable {

    private int X, Y, width, length;

    public AbstractVerticalPicture(int x, int y, int width, int length) {
        if (X >= 0) X = x;
        else X = Math.abs(x);
        if (Y >= 0) Y = y;
        else Y = Math.abs(y);
        if (width >= 0) this.width = width;
        else this.width = Math.abs(width);
        if (length >= 0) this.length = length;
        else this.length = Math.abs(length);
    }

    @Override
    public void draw(Graphics g) {
        // look how to cast automatic values
        g.setColor(Color.LIGHT_GRAY);
        g.fillRect(X, Y, width, length / 5);
        g.setColor(Color.BLACK);
        StripedTriangle stripedTriangle = new StripedTriangle(X, Y, width, length / 5);
        stripedTriangle.draw(g);
        //StripedTriangle.instance.draw(g, X, Y, length / 5, width);
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

        g.setColor(Color.YELLOW);
        Point[] yellowTria = new Point[3];
        yellowTria[0] = new Point(X + width / 3 + width / 15, Y + length * 2 / 15);
        yellowTria[1] = new Point(X + width / 3 + 4 * width / 15, Y + length * 2 / 15);
        yellowTria[2] = new Point(X + width / 2, Y + length / 5 + length / 15);
/*        yellowTriangle[0][0] = width * 3 / 4;
        yellowTriangle[0][1] = length / 9;
        yellowTriangle[1][0] = width * 5 / 4;
        yellowTriangle[1][1] = length / 9;
        yellowTriangle[2][0] = width / 2;
        yellowTriangle[2][1] = length * 3 / 10;*/
        Triangle triangle = new Triangle(yellowTria);
        triangle.fillTriangle(g);

        //ReversedTriangle.instance.draw(g, 150, 150, length / 5, width);
        g.setColor(Color.BLACK);
        g.drawRect(X, Y, width, length);
    }
}

class StripedTriangle implements Drawable {
    private int X, Y, width, length;

    public StripedTriangle(int x, int y, int width, int length) {
        if (X >= 0) X = x;
        else X = Math.abs(x);
        if (Y >= 0) Y = y;
        else Y = Math.abs(y);
        if (width >= 0) this.width = width;
        else this.width = Math.abs(width);
        if (length >= 0) this.length = length;
        else this.length = Math.abs(length);
    }

    public void draw(Graphics g) {
        int j = 0;
        for (int i = 0; i < length; i++) {
            g.drawLine(X + width / 2 - j, Y + i, X + width / 2 + j, Y + i);
            if (j < width / 3) j++;
        }
    }
}

class Triangle implements Drawable {
    private Polygon triangle;

    public Triangle(int x1, int y1, int x2, int y2, int x3, int y3) {
        triangle = new Polygon();
        triangle.addPoint(x1, y1);
        triangle.addPoint(x2, y2);
        triangle.addPoint(x3, y3);
    }

    public Triangle(int[] X, int[] Y) {
        if (X.length == Y.length && X.length == 3)
            triangle = new Polygon(X, Y, X.length);
    }

    public Triangle(Point[] points) {
        if (points.length == 3) {
            int[] X = new int[points.length];
            int[] Y = new int[points.length];
            for (int i = 0; i < points.length; i++) {
                X[i] = points[i].x;
                Y[i] = points[i].y;
            }
            triangle = new Polygon(X, Y, X.length);
        }
    }

    public Triangle(int[][] points) {
        if (points.length == 3) {
            int[] X = new int[points.length];
            int[] Y = new int[points.length];
            for (int i = 0; i < points.length; i++) {
                X[i] = points[i][0];
                Y[i] = points[i][1];
            }
            triangle = new Polygon(X, Y, X.length);
        }
    }

    @Override
    public void draw(Graphics g) {
        g.drawPolygon(triangle);
    }

    public void fillTriangle(Graphics g) {
        g.fillPolygon(triangle);
    }
}
