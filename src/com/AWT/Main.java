package com.AWT;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main {

    public static void main(String[] args) throws AWTException {
        if (SystemTray.isSupported()){ // есть ли доступ к системному трею (иконки внизу)?

            SystemTray tray = SystemTray.getSystemTray(); // даём ссылку на него, в переменную
            Image image = new ImageIcon("enot.jpeg", "desc").getImage();// берем картинку для иконки

            PopupMenu popupMenu = new PopupMenu(); // создаём меню
            MenuItem menuItem = new MenuItem("One"); // поле меню
            menuItem.addActionListener(new ActionListener() { // действие
                @Override
                public void actionPerformed(ActionEvent e) { // активация
                    System.out.println("one"); // вывод на экран
                }
            });
            popupMenu.add(menuItem); // добавляем на меню, поле

            popupMenu.add(new MenuItem("two")); // добавляем на меню, поле
            popupMenu.add(new MenuItem("three")); // добавляем на меню, поле

            MenuItem menuItem2 = new MenuItem("exit");// поле меню
            menuItem2.addActionListener(new ActionListener() { // действие
                @Override
                public void actionPerformed(ActionEvent e) {// активация
                   System.exit(0); // выход
                }
            });
            popupMenu.add(menuItem2); // добавляем на меню, поле

            tray.add(new TrayIcon(image, "Tray text", popupMenu)); // добавляем наш трей (иконка-меню)
        }
    }
}
