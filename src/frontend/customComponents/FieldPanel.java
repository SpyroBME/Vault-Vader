package frontend.customComponents;

import frontend.VV;

import javax.swing.*;
import java.awt.*;

public class FieldPanel extends JPanel {

    IconButton optionsButton = new IconButton("", new ImageIcon("assets/white/ui-dots.png"));
    DarkTextField textField;
//    JLabel fieldLabel = new JLabel();

    public FieldPanel(String labelTitle) {
        setLayout(new BorderLayout());
        setOpaque(false);
        setBorder(BorderFactory.createEmptyBorder(VV.margin, VV.margin, VV.margin, VV.margin));
        JPanel panel = new JPanel(new BorderLayout()); {
            panel.setOpaque(false);
            textField = new DarkTextField("", labelTitle, true);
            panel.add(textField, BorderLayout.CENTER);
            optionsButton.addActionListener(e -> {System.out.println("Megkattintottak!");});
            panel.add(optionsButton, BorderLayout.EAST);
        }
        add(panel);
    }
}
