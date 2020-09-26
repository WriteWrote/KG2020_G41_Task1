package com.company.drawable.houses;

import com.company.drawable.util_drawunits.Gate;
import com.company.drawable.util_drawunits.Tower;

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
        int[] pointsXForBottom = new int[N_OfTowers * 4 + 2];
        int[] pointsYForBottom = new int[N_OfTowers * 4 + 2];
        int deltaX = width / N_OfTowers;
        int deltaY = height / 3;
        g.setColor(color);
        if (N_OfTowers % 2 == 0) {
            for (int i = 1; i <= (N_OfTowers) / 2; i++) {
                g.fillRect(X + deltaX * i, Y + (i % 2) * deltaY / 5 + deltaY * 2, deltaX, deltaY - (i % 2) * deltaY / 5);
                Tower tower = new Tower(X + deltaX * i + deltaX / 2, Y + (i % 2) * deltaY / 5 + deltaY * 2, deltaX * 3 / 4, 3 * deltaY / 2);
                tower.draw(g);
            }

            g.fillRect(X + deltaX * (N_OfTowers / 2) + deltaX, Y + deltaY * 2, deltaX, deltaY);

            for (int i = N_OfTowers / 2 + 2; i <= N_OfTowers + 1; i++) {
                g.fillRect(X + deltaX * i, Y + (i % 2) * deltaY / 5 + deltaY * 2, deltaX, deltaY - (i % 2) * deltaY / 5);
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
            Tower centerTower = new Tower(X + deltaX * ((N_OfTowers + 1) / 2) + deltaX / 8, Y, deltaX*3/4, deltaY*2);
            centerTower.draw(g);


            for (int i = N_OfTowers / 2 + 2; i <= N_OfTowers; i++) {
                g.setColor(color);
                g.fillRect(X + deltaX * i, Y + (i % 2) * deltaY / 5 + deltaY * 2, deltaX, deltaY - (i % 2) * deltaY / 5);
                Tower tower = new Tower(X + deltaX * i + deltaX / 8, Y + (i % 2) * deltaY / 5 + deltaY, deltaX * 3 / 4, 3 * deltaY / 2);
                tower.draw(g);
            }
        }

/*
        Tower tower = new Tower(100, 70, 100, 180);
        tower.draw(g);
        tower = new Tower(220, 20, 130, 230);
        tower.draw(g);
        tower = new Tower (370, 70, 100, 180);
        tower.draw(g);

        g.setColor(Color.pink);
        g.fillRect(80, 249, 410, 100);

        Gate gate = new Gate(245, 270, 80, 158);
        gate.draw(g);
*/
    }
}
