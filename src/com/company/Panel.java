package com.company;

import com.company.drawable.World;
import com.company.drawable.drawunits.nature_units.BushTree;
import com.company.drawable.drawunits.nature_units.Cloud;
import com.company.drawable.drawunits.nature_units.Hill;
import com.company.drawable.drawunits.nature_units.TwoFloorTree;
import com.company.drawable.houses.*;

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
