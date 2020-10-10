package com.company;

import com.company.drawable.World;

import javax.swing.*;
import java.awt.*;

public class Panel extends JPanel {
    @Override
    public void paint(Graphics g) {
        //super.paint(g);
        World braveNewWorld = new World(new Color(0x6A7C43), new Color(0x6FC6D0), 5, 7, true);
        braveNewWorld.draw(g);

    }
}
