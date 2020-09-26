package com.company;

import com.company.drawable.houses.*;
import com.company.drawable.util_drawunits.CouncilSpike;
import com.company.drawable.util_drawunits.Tower;

import javax.swing.*;
import java.awt.*;
import java.util.TooManyListenersException;

public class Panel extends JPanel {
    @Override
    public void paint(Graphics g) {
        //super.paint(g);
        Tower tower = new Tower(100, 70, 100, 180);
        tower.draw(g);
        tower = new Tower(220, 20, 130, 230);
        tower.draw(g);
        tower = new Tower (370, 70, 100, 180);
        tower.draw(g);

        g.setColor(Color.pink);
        g.fillRect(80, 249, 410, 100);
        int x;
    }
}
