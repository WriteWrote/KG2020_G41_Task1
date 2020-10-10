package com.company.drawable.houses;

import com.company.drawable.House;
import com.company.drawable.drawunits.*;
import com.company.drawable.drawunits.Window;

import java.awt.*;

public class NFloorHouse extends House {
    private int X, Y, floorWidth, floorHeight, N_OfFloor;
    private Color color = Color.PINK;

    public NFloorHouse(int x, int y, int floorWidth, int floorHeight, int nOfFloor, Color color) {
        super(x, y, floorWidth, floorHeight, color);
        X = x;
        Y = y;
        this.floorWidth = floorWidth;
        this.floorHeight = floorHeight;
        N_OfFloor = nOfFloor;
        this.color = color;
    }

    public NFloorHouse(int x, int y, int floorWidth, int floorHeight, int nOfFloor) {
        super(x, y, floorWidth, floorHeight);
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
            drawHouseUnit(g, X, Y + floorHeight / 3 + i * floorHeight, floorWidth, floorHeight, color);
            //g.fillRect(X, Y + floorHeight / 3 + i * floorHeight, floorWidth, floorHeight);
            if (i != N_OfFloor - 1) {
                Window window = new Window(X + floorWidth / 2 + floorWidth / 8, Y + floorHeight / 3 + floorHeight / 2 + i * floorHeight, floorWidth / 4, floorHeight / 3);
                window.draw(g);
            }
        }

        Door door = new Door(X + floorWidth / 2 + floorWidth/10, Y + (N_OfFloor) * floorHeight - floorHeight / 2 + floorHeight/11,
                floorWidth / 4, 3*floorHeight / 4);
        door.draw(g);

    }
}
