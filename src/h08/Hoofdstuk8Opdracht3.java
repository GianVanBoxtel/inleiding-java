package h08;

import java.awt.*;
import java.applet.*;
import java.awt.event.*;

public class Hoofdstuk8Opdracht3 extends Applet {
    Label label1;
    TextField textvak;
    Button ok;
    Button reset;
    double BTWpercentage;
    double prijs;

    public void init() {
        BTWpercentage = 1.21;
        label1 = new Label("€ Inclusief BTW");
        textvak = new TextField(" hier de prijs zonder BTW invoeren",26);
        ok = new Button();
        reset = new Button();
        ok.setLabel("Ok");
        reset.setLabel("Reset");
        Listen1 L = new Listen1();
        Listen2 L2 = new Listen2();
        ok.addActionListener(L);
        reset.addActionListener(L2);
        add(ok);
        add(reset);
        add(textvak);
        add(label1);
    }

    class Listen1 implements ActionListener {

        public void actionPerformed(ActionEvent e) {
            prijs = Double.parseDouble(textvak.getText());
            prijs = prijs * BTWpercentage;
            textvak.setText(String.format("%.2f", Double.valueOf(prijs)));
            repaint();
        }
    }

    class Listen2 implements ActionListener {

        public void actionPerformed(ActionEvent e) {
            textvak.setText(null);
            repaint();
        }

    }
}

