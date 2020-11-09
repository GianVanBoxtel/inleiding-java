package h10;

import java.awt.*;
import java.applet.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Hoofdstuk10Opdracht5 extends Applet {
    double gem1, gem2, newc, cijfer;
    Button knop1;
    Button knop2;
    TextField vak1;

    public void init() {

        vak1 = new TextField("", 10);
        knop2 = new Button("reset");
        gem1 = 0;
        newc = 0;
        cijfer = 0;
        Listen1 nc = new Listen1(); //Add a new number
        Listen2 re = new Listen2(); //Reset
        knop1 = new Button("Voeg een cijfer toe.");
        knop1.addActionListener(nc);
        knop2.addActionListener(re);
        add(vak1);
        add(knop1);
        add(knop2);

    }

    public void paint(Graphics g) {

        if (gem2 > 5.4 && gem2 < 10.1) {

            g.drawString("U bent geslaagd.", 50, 100);

        }

        if (gem2 > 10.1) {

            g.drawString("ERROR.. voer correcte cijfers in.", 50, 100);

        }


     else if(gem2 < 5.5)




        g.drawString("U bent gezakt.", 50, 100);

        g.drawString("uw gemiddelde is: " + (String.format("%.2f", Double.valueOf(gem2))), 50, 120);
    }

    class Listen1 implements ActionListener {
        public void actionPerformed(ActionEvent e) {

            newc = Double.parseDouble(vak1.getText());
            gem1++;
            cijfer = cijfer + newc;
            gem2 = cijfer / gem1;
            repaint();

        }
    }

    class Listen2 implements ActionListener {
        public void actionPerformed(ActionEvent e) {

            newc = 0;
            gem1 = 0;
            gem2 = 0;
            cijfer = 0;
            repaint();

        }
    }
}
