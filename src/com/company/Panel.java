package com.company;

import com.company.drawable.houses.*;
import com.company.drawable.util_drawunits.CouncilSpike;
import com.company.drawable.util_drawunits.Gate;
import com.company.drawable.util_drawunits.Tower;

import javax.swing.*;
import java.awt.*;
import java.util.TooManyListenersException;

public class Panel extends JPanel {
    @Override
    public void paint(Graphics g) {
        //super.paint(g);
        Castle castle = new Castle(100, 100, 400, 400, 6);
        castle.draw(g);
    }
}
