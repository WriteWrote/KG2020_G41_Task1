package com.company.drawable.houses;

import com.company.drawable.House;
import com.company.drawable.drawunits.castle_units.Gate;
import com.company.drawable.drawunits.castle_units.Tower;

import java.awt.*;

public class Castle extends House {
    private int X, Y, width, height, N_OfTowers;
    private Color color = Color.pink;

    public Castle(int x, int y, int width, int height, int N_OfTowers) {
        super(x, y, width, height);
        X = x;
        Y = y;
        this.width = width;
        this.height = height;
        this.N_OfTowers = N_OfTowers;
    }

    public Castle(int x, int y, int width, int height, Color color) {
        super(x, y, width, height, color);
        X = x;
        Y = y;
        this.width = width;
        this.height = height;
        this.color = color;
    }

    @Override
    public void draw(Graphics g) {
        int deltaX = width / N_OfTowers;
        int deltaY = height / 3;
        if (N_OfTowers % 2 == 0) {
            for (int i = 1; i <= (N_OfTowers) / 2; i++) {
                g.setColor(color);
                g.fillRect(X + deltaX * i, Y + (i % 2) * deltaY / 5 + deltaY * 2, deltaX, deltaY - (i % 2) * deltaY / 5);
                Tower tower = new Tower(X + deltaX * i + deltaX / 8, Y + (i % 2) * deltaY / 5 + deltaY, deltaX * 3 / 4, 3 * deltaY / 2);
                tower.draw(g);
            }
            g.setColor(color);
            g.fillRect(X + deltaX * (N_OfTowers / 2) + deltaX, Y + deltaY * 2, deltaX, deltaY);
            for (int i = N_OfTowers / 2 + 2; i <= N_OfTowers + 1; i++) {
                g.setColor(color);
                g.fillRect(X + deltaX * i, Y + (i % 2) * deltaY / 5 + deltaY * 2, deltaX, deltaY - (i % 2) * deltaY / 5);
                Tower tower = new Tower(X + deltaX * i + deltaX / 8, Y + (i % 2) * deltaY / 5 + deltaY, deltaX * 3 / 4, 3 * deltaY / 2);
                tower.draw(g);
            }
        }
        if (N_OfTowers % 2 == 1) {
            for (int i = 1; i <= N_OfTowers / 2; i++) {
                g.setColor(color);
                g.fillRect(X + deltaX * i, Y + (i % 2) * deltaY / 5 + deltaY * 2, deltaX, deltaY - (i % 2) * deltaY / 5);
                Tower tower = new Tower(X + deltaX * i + deltaX / 8, Y + (i % 2) * deltaY / 5 + deltaY, deltaX * 3 / 4, 3 * deltaY / 2);
                tower.draw(g);
            }

            g.setColor(color);
            g.fillRect(X + deltaX * ((N_OfTowers + 1) / 2), Y + deltaY * 2, deltaX, deltaY);
            Tower centerTower = new Tower(X + deltaX * ((N_OfTowers + 1) / 2) + deltaX / 8, Y + 1, deltaX * 3 / 4, deltaY * 2);
            centerTower.draw(g);


            for (int i = N_OfTowers / 2 + 2; i <= N_OfTowers; i++) {
                g.setColor(color);
                g.fillRect(X + deltaX * i, Y + (i % 2) * deltaY / 5 + deltaY * 2, deltaX, deltaY - (i % 2) * deltaY / 5);
                Tower tower = new Tower(X + deltaX * i + deltaX / 8, Y + (i % 2) * deltaY / 5 + deltaY, deltaX * 3 / 4, 3 * deltaY / 2);
                tower.draw(g);
            }
        }

        Gate gate = new Gate(X + deltaX * (N_OfTowers / 2 + 1), Y + 2 * deltaY + deltaY / 4, deltaX, 3 * deltaY / 2);
        gate.draw(g);
    }
}
