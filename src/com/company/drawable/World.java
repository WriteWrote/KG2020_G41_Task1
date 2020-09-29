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
        Sky sky = new Sky(N_ofClouds, true);
        sky.draw(g);

        Ground ground = new Ground(N_ofHills);
        ground.draw(g);
        int[][] hillPoints = ground.getHillPoints();
        setRandomTrees(g, hillPoints);


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

    private void setRandomTrees(Graphics g, int[][] hillPoints) {
        //Math.random() * (max - min) + min
        int N_OfTreesOnTheHills = (int) (Math.random() * (hillPoints.length - 1) + 1);
        for (int i = 0; i < N_OfTreesOnTheHills; i++){
            BushTree bushTree = new BushTree(hillPoints[i][0] - 25, hillPoints[i][1] - 65, 50,70);
            bushTree.draw(g);
        }
        TwoFloorTree tree = new TwoFloorTree(hillPoints[N_OfTreesOnTheHills-1][0], hillPoints[N_OfTreesOnTheHills-1][1] - 105,
                60, 120, new Color(0x25872F), new Color(0x874D46));
        tree.draw(g);
    }
}
