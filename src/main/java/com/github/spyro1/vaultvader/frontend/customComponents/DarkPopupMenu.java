package com.github.spyro1.vaultvader.frontend.customComponents;

import com.github.spyro1.vaultvader.frontend.UI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public class DarkPopupMenu extends JPopupMenu {

    public DarkPopupMenu(DarkPopupMenuItem... menuItems) {
        super();
        setBackground(UI.bgDarkColor);
        setForeground(UI.mainTextColor);
        setBorder(BorderFactory.createEmptyBorder());
        for (DarkPopupMenuItem menuitem : menuItems){
            add(menuitem);
        }
    }

    public void show(ActionEvent actionEvent) {
        // Show popupmenu at buttons position
//        Component source = (Component)actionEvent.getSource();
//        Dimension size = source.getSize();
//        int xPos = ((size.width - getPreferredSize().width) / 2);
//        int yPos = size.height;
//        super.show(source, xPos, yPos);
        Component source = (Component)actionEvent.getSource();
        Dimension size = source.getSize();
        int xPos = ((size.width /*- moreOptions.getPreferredSize().width) / 2*/));
        int yPos = 0; //size.height / 2;
        show(source, xPos, yPos);
    }
}