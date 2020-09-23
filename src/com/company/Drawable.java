package com.company;

import java.awt.*;

public interface Drawable {
    void draw(Graphics g);
}

class OneFloorHouse implements Drawable {
    private int X, Y, width, height;
    private Color color = Color.PINK;

    public OneFloorHouse(int x, int y, int width, int height, Color color) {
        X = x;
        Y = y;
        this.width = width;
        this.height = height;
        this.color = color;
    }

    public OneFloorHouse(int x, int y, int width, int height) {
        X = x;
        Y = y;
        this.width = width;
        this.height = height;
    }


    @Override
    public void draw(Graphics g) {
        g.setColor(color);
        g.fillRect(X, Y, width, height);

        Door door = new Door(X + width / 2, Y + height / 2, width / 3, height / 2);
        door.draw(g);

        Window window = new Window(X + width / 8, Y + 2 * height / 4, width / 4, height / 3);
        window.draw(g);
    }
}

class NFloorHouse implements Drawable {
    private int X, Y, floorWidth, floorHeight, N_OfFloor;
    private Color color = Color.PINK;

    public NFloorHouse(int x, int y, int floorWidth, int floorHeight, int nOfFloor, Color color) {
        X = x;
        Y = y;
        this.floorWidth = floorWidth;
        this.floorHeight = floorHeight;
        N_OfFloor = nOfFloor;
        this.color = color;
    }

    public NFloorHouse(int x, int y, int floorWidth, int floorHeight, int nOfFloor) {
        X = x;
        Y = y;
        this.floorWidth = floorWidth;
        this.floorHeight = floorHeight;
        N_OfFloor = nOfFloor;
    }


    @Override
    public void draw(Graphics g) {
        int[] roofXPoints = {X, X + floorWidth / 2, X + floorWidth};
        int[] roofYPoints = {Y + floorHeight / 3, Y, Y + floorHeight / 3};
        g.setColor(Color.LIGHT_GRAY);
        g.fillPolygon(new Polygon(roofXPoints, roofYPoints, 3));

        for (int i = 0; i < N_OfFloor; i++) {
            g.setColor(color);
            g.fillRect(X, Y + floorHeight / 3 + i * floorHeight, floorWidth, floorHeight);
            Window window = new Window(X + floorWidth / 8, Y + 2 * floorHeight / 4 + i * floorHeight, floorWidth / 4, floorHeight / 3);
            window.draw(g);
        }

        Door door = new Door(X + floorWidth / 2, Y + (N_OfFloor) * floorHeight - floorHeight / 6,
                floorWidth / 3, floorHeight / 2);
        door.draw(g);

    }
}

class Capitol implements Drawable {
    private int X, Y, width, height;
    private String name;
    private Color color = Color.GRAY;

    public Capitol(int x, int y, int width, int height, String name) {
        X = x;
        Y = y;
        this.width = width;
        this.height = height;
        this.name = name;
    }

    public Capitol(int x, int y, int width, int height, String name, Color color) {
        X = x;
        Y = y;
        this.width = width;
        this.height = height;
        this.name = name;
        this.color = color;
    }

    @Override
    public void draw(Graphics g) {
        OneFloorHouse oneFloorHouse = new OneFloorHouse(X, Y, width, height, color);
        oneFloorHouse.draw(g);

        g.setColor(Color.CYAN);
        g.fillRect(X, Y, 7 * name.length(), height / 8);
        g.setColor(Color.BLACK);
        g.drawString(name, X + name.length(), Y+height/12);


    }
}

class Door implements Drawable {
    private int X, Y, width, height;
    private Color color = Color.GRAY;

    public Door(int x, int y, int width, int height, Color color) {
        X = x;
        Y = y;
        this.width = width;
        this.height = height;
        this.color = color;
    }

    public Door(int x, int y, int width, int height) {
        X = x;
        Y = y;
        this.width = width;
        this.height = height;
    }

    @Override
    public void draw(Graphics g) {
        g.setColor(color);
        g.fillRect(X, Y, width, height);
        for (int i = width / 10; i < width - width / 10; i += 5 * width / 10) {
            g.setColor(Color.darkGray);
            g.fillRect(X + i, Y + height / 15, 3 * width / 10, 4 * height / 10);
        }
        for (int i = width / 10; i < width - width / 10; i += 5 * width / 10) {
            g.setColor(Color.darkGray);
            g.fillRect(X + i, Y + 8 * height / 15, 3 * width / 10, 4 * height / 10);
        }
    }
}

class Window implements Drawable {
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
    }
}