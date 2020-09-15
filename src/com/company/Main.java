package com.company;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {
        MainForm mainForm = new MainForm(); // object of MainWindow

        mainForm.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE); // set closing on cross ))
        mainForm.setSize(900, 500); // set size 500x500

        mainForm.setVisible(true); // set visible, it's simple
    }
}
