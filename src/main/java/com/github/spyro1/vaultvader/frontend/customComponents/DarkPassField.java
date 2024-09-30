package com.github.spyro1.vaultvader.frontend.customComponents;

import com.github.spyro1.vaultvader.frontend.UI;

import javax.swing.*;
import java.awt.*;

public class DarkPassField extends JPasswordField {

    private String placeholder = "";
    private char defChar = getEchoChar();

    public DarkPassField() {
        super();
        setup();
    }
    public DarkPassField(String text, String placeholder) {
        super(text);
        this.placeholder = placeholder;
        setup();
    }
    public DarkPassField(String text, String placeholder, boolean underline) {
        super(text);
        this.placeholder = placeholder;
        setup();
        setUnderline(underline);
    }
    private void setup(){
        setForeground(UI.mainTextColor);
        setBackground(UI.bgLightColor);
        setFont(new Font("Arial", Font.PLAIN, 20));
        setCaretColor(UI.mainTextColor);
        setBorder(BorderFactory.createTitledBorder(BorderFactory.createEmptyBorder(), placeholder, 0,0, new Font("Arial", Font.BOLD, 12),  UI.mainTextColor));
    }
    public void setUnderline(boolean underline) {
        if (underline)
            setBorder(BorderFactory.createCompoundBorder(BorderFactory.createMatteBorder(0,0,2,0, UI.mainTextColor), BorderFactory.createTitledBorder(BorderFactory.createEmptyBorder(), placeholder, 0,0, new Font("Arial", Font.BOLD, 12),  UI.mainTextColor)));
        else
            setBorder(BorderFactory.createTitledBorder(BorderFactory.createEmptyBorder(), placeholder, 0,0, new Font("Arial", Font.BOLD, 12),  UI.mainTextColor));
    }
    public void showPassword(boolean shown){
        if (shown) {
            setEchoChar((char) 0);
        } else {
            setEchoChar(defChar);
        }
    }
}
