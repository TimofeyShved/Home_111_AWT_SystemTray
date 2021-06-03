package com.AWT;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main {

    public static void main(String[] args) throws AWTException {
        if (SystemTray.isSupported()){
            SystemTray tray = SystemTray.getSystemTray();
            Image image = new ImageIcon("enot.jpeg", "desc").getImage();
            PopupMenu popupMenu = new PopupMenu();
            MenuItem menuItem = new MenuItem("One");
            menuItem.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    System.out.println("one");
                }
            });
            popupMenu.add(menuItem);

            popupMenu.add(new MenuItem("two"));
            popupMenu.add(new MenuItem("three"));

            MenuItem menuItem2 = new MenuItem("exit");
            menuItem2.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                   System.exit(0);
                }
            });
            popupMenu.add(menuItem2);

            tray.add(new TrayIcon(image, "Tray text", popupMenu));
        }
    }
}
