package com.company;

import com.company.drawable.World;
import javax.swing.*;
import java.awt.*;

public class Panel extends JPanel {
    @Override
    public void paint(Graphics g) {
        //super.paint(g);
        World braveNewWorld = new World();
        braveNewWorld.draw(g);

    }
}
