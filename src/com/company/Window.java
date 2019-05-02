package com.company;

import javax.swing.*;
import java.awt.*;

public class Window extends JFrame implements Runnable {
    public Window(String title) throws HeadlessException {
        super(title);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        setSize(400, 400);

        setVisible(true);

        Thread t = new Thread(this);
        t.start();
    }

    @Override
    public void run() {

    }
}
