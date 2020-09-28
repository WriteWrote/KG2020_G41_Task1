package com.company.drawable;

import com.company.Drawable;
import com.company.Panel;
import com.company.drawable.drawunits.nature_units.BushTree;
import com.company.drawable.drawunits.nature_units.Hill;
import com.company.drawable.drawunits.nature_units.TwoFloorTree;
import com.company.drawable.houses.Capitol;
import com.company.drawable.houses.Castle;
import com.company.drawable.houses.NFloorHouse;

import java.awt.*;

public class World implements Drawable {
    private Color groundColor = new Color(0x6A7C43);
    private Color skyColor = new Color(0x6FC6D0);
    private int N_ofClouds = 5;
    private int N_ofHills = 3;
    private boolean isSunny = false;
    private int [][] hillPoints;

    public World() {

    }

    public World(Color groundColor, Color skyColor, int n_ofClouds, int n_ofHills, boolean isSunny) {
        this.groundColor = groundColor;
        this.skyColor = skyColor;
        N_ofClouds = n_ofClouds;
        N_ofHills = n_ofHills;
        this.isSunny = isSunny;
    }

    @Override
    public void draw(Graphics g) {
        Sky sky = new Sky(N_ofClouds);
        sky.draw(g);

        Ground ground = new Ground(N_ofHills);
        ground.draw(g);

        hillPoints = ground.getHillPoints();
/*
        Castle castle = new Castle(50, 100, 200, 200, 3);
        castle.draw(g);
        BushTree bushTree = new BushTree(300, 200, 50, 100);
        bushTree.draw(g);
        TwoFloorTree tree = new TwoFloorTree(350, 150, 100, 150);
        tree.draw(g);
        Capitol capitol = new Capitol(470, 200, 200, 100, "Library");
        capitol.draw(g);
        capitol = new Capitol(700, 200, 150, 100, "School #1", new Color(0xAC7266));
        capitol.draw(g);
        NFloorHouse house = new NFloorHouse(870, 135, 100,50, 3);
        house.draw(g);
*/

    }
}
