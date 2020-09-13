package com.company;

import java.awt.*;

public interface Drawable {
    void draw(Graphics g);
}

class AbstractVerticalPicture implements Drawable {

    private int X, Y, width, length;

    public AbstractVerticalPicture(int x, int y, int width, int length) {
        if (x >= 0) X = x;
        else X = Math.abs(x);
        if (y >= 0) Y = y;
        else Y = Math.abs(y);
        if (width >= 0) this.width = width;
        else this.width = Math.abs(width);
        if (length >= 0) this.length = length;
        else this.length = Math.abs(length);
    }

    @Override
    public void draw(Graphics g) {
        g.setColor(Color.WHITE);
        g.fillRect(X, Y, width, length);

        g.setColor(Color.LIGHT_GRAY);
        g.fillRect(X, Y, width, length / 5);

        g.setColor(Color.CYAN);
        Point[] trianglePoints = new Point[3];
        trianglePoints[0] = new Point(X, Y + length / 2);
        trianglePoints[1] = new Point(X, Y + length);
        trianglePoints[2] = new Point(X + 3 * width / 4, Y + length);
        Triangle triangle = new Triangle(trianglePoints);
        triangle.fillTriangle(g);

        trianglePoints[0].x = X + width;
        trianglePoints[1].x = X + width;
        trianglePoints[2].x = X + width / 4;
        triangle = new Triangle(trianglePoints);
        triangle.fillTriangle(g);

        g.setColor(Color.BLACK);
        StripedTriangle stripedTriangle = new StripedTriangle(X, Y, width, length / 5);
        stripedTriangle.draw(g);
        stripedTriangle = new StripedTriangle(X + width / 25, Y + 4 * length / 5 + length / 30, width - 2 * width / 25, length / 6);
        stripedTriangle.draw(g);

        g.setColor(Color.pink);
        g.fillOval(X + width / 4, Y + length / 6, width / 2, width / 2);

        g.setColor(Color.YELLOW);
        trianglePoints[0] = new Point(X + width / 3 - width / 25, Y + length * 2 / 15);
        trianglePoints[1] = new Point(X + 2 * width / 3 + width / 25, Y + length * 2 / 15);
        trianglePoints[2] = new Point(X + width / 2, Y + length / 5 + length / 15);
/*        yellowTriangle[0][0] = width * 3 / 4;
        yellowTriangle[0][1] = length / 9;
        yellowTriangle[1][0] = width * 5 / 4;
        yellowTriangle[1][1] = length / 9;
        yellowTriangle[2][0] = width / 2;
        yellowTriangle[2][1] = length * 3 / 10;*/
        triangle = new Triangle(trianglePoints);
        triangle.fillTriangle(g);

        //ReversedTriangle.instance.draw(g, 150, 150, length / 5, width);
        g.setColor(Color.BLACK);
        g.drawRect(X, Y, width, length);
    }
}

class StripedTriangle implements Drawable {
    private int X, Y, width, length;

    public StripedTriangle(int x, int y, int width, int length) {
        if (x >= 0) X = x;
        else X = Math.abs(x);
        if (y >= 0) Y = y;
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

class Frame implements Drawable {
    private int X, Y, width, length, thickness;
    private Color color = Color.GRAY;
    private String text = "Unknown painter";

    public Frame(int x, int y, int width, int length, int thickness, Color color) {
        X = x;
        Y = y;
        this.width = width;
        this.length = length;
        this.thickness = thickness;
        this.color = color;
    }

    public Frame(int x, int y, int width, int length, int thickness, String text, Color color) {
        X = x;
        Y = y;
        this.width = width;
        this.length = length;
        this.thickness = thickness;
        this.text = text;
        this.color = color;
    }

    public Frame(int x, int y, int width, int length, int thickness) {
        X = x;
        Y = y;
        this.width = width;
        this.length = length;
        this.thickness = thickness;
    }

    public Frame(int x, int y, int width, int length, int thickness, String text) {
        X = x;
        Y = y;
        this.width = width;
        this.length = length;
        this.thickness = thickness;
        this.text = text;
    }

    @Override
    public void draw(Graphics g) {
        g.setColor(color);

        g.fillRect(X, Y, width, thickness);
        g.fillRect(X, Y, thickness, length);
        g.fillRect(X + width - thickness, Y, thickness, length);
        g.fillRect(X, Y + length - thickness, width, thickness);

        g.setColor(Color.BLACK);

        g.drawRect(X, Y, width, length);
        g.drawRect(X + thickness, Y + thickness, width - 2 * thickness, length - 2 * thickness);
        int lengthOfText = 8 * text.length();
        g.drawRect(X+(width-lengthOfText)/2, Y+length-thickness, lengthOfText, thickness);

        g.drawString(text,X+(width-lengthOfText)/2 + lengthOfText/8, Y+length-thickness/3);
    }
}
