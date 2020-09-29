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
    private int N_ofHills = 7;
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
        setRandomHouses(g, hillPoints);
        setRandomTrees(g, hillPoints);

        Castle castle = new Castle(0, 150, 400, 500, 3);
        castle.draw(g);

        Capitol capitol = new Capitol(550, 549, 100, 100, "Library");
        capitol.draw(g);

        NFloorHouse house = new NFloorHouse(20, 530, 100,50, 2);
        house.draw(g);

    }

    private void setRandomTrees(Graphics g, int[][] hillPoints) {
        //Math.random() * (max - min) + min
        int N_OfTreesOnTheHills = (int) (Math.random() * (hillPoints.length - 1) + 1);
        for (int i = 0; i < N_OfTreesOnTheHills; i++) {
            BushTree bushTree = new BushTree(hillPoints[i][0] - 25, hillPoints[i][1] - 65, 50, 70);
            bushTree.draw(g);
        }
        TwoFloorTree tree = new TwoFloorTree(hillPoints[N_OfTreesOnTheHills - 1][0], hillPoints[N_OfTreesOnTheHills - 1][1] - 105,
                60, 120, new Color(0x25872F), new Color(0x874D46));
        tree.draw(g);
        int N_OfTrees = (int) (Math.random() * (10 - 3) + 1);
        for (int i = 0; i < N_OfTrees; i++) {
            if (i * i % 2 == 0) {
                int widthOfTree = 100 / N_OfTrees * i;
                int heightOfTree = 180 / N_OfTrees * i;
                BushTree bushTree = new BushTree((int) (Math.random() * (1300 - 200) + 200) - widthOfTree / 2,
                        (int) (Math.random() * (700 - 500) + 500) - heightOfTree,
                        widthOfTree, heightOfTree);
                bushTree.draw(g);
            } else {
                int widthOfTree = 130 / N_OfTrees * i;
                int heightOfTree = 240 / N_OfTrees * i;
                TwoFloorTree twoFloorTree = new TwoFloorTree((int) (Math.random() * (1300 - 200) + 200) - widthOfTree / 2,
                        (int) (Math.random() * (600 - 500) + 500) - heightOfTree,
                        widthOfTree, heightOfTree, new Color(0x299735), new Color(0x874D46));
                twoFloorTree.draw(g);
            }
        }
    }

    private void setRandomHouses(Graphics g, int[][] hillPoints) {
        int N_OfHousesOnTheHills = (int) (Math.random() * (hillPoints.length - 1) + 1);
        for (int i = 0; i < N_OfHousesOnTheHills; i++) {
            if (i % 2 == 0) {
                NFloorHouse oneFloorHouse = new NFloorHouse(hillPoints[i][0] - 15, hillPoints[i][1] + 20,
                        40, 30, 1, new Color(0x73C8EC));
                oneFloorHouse.draw(g);
            } else {
                Capitol school = new Capitol(hillPoints[i][0], hillPoints[i][1],
                        100, 80, "School №" + i, new Color(0xEB9F82));
                school.draw(g);
            }
        }
    }
}
