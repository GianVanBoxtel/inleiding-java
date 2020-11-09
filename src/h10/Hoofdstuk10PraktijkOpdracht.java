package h10;

import java.awt.*;
import java.applet.*;
import java.awt.event.*;

public class Hoofdstuk10PraktijkOpdracht extends Applet {
    TextField tekstvak;
    Label label;
    String s, tekst, icijfer;
    int cijfer;

    public void init() {
        tekstvak = new TextField("", 20);
        label = new Label("Voer het cijfer in min= 1 max = 10");
        tekstvak.addActionListener(new TekstvakListener());
        tekst = "";
        add(label);
        add(tekstvak);
    }

    public void paint(Graphics g)
    {
        g.drawString("Het cijfer is: "+tekst, 50, 60);
        g.drawString("Het ingevoerde cijfer is: "+icijfer, 50, 40);
    }

    class TekstvakListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            s = tekstvak.getText();
            cijfer = Integer.parseInt(s);
            switch (cijfer) {
                case 1:
                    tekst = "SLECHT";
                    icijfer = "1";
                    break;
                case 2:
                    tekst = "SLECHT";
                    icijfer = "2";
                    break;
                case 3:
                    tekst = "SLECHT";
                    icijfer = "3";
                    break;
                case 4:
                    tekst = "ONVOLDOENDE";
                    icijfer = "4";
                    break;
                case 5:
                    tekst = "MATIG";
                    icijfer = "5";
                    break;
                case 6:
                    tekst = "VOLDOENDE";
                    icijfer = "6";
                    break;
                case 7:
                    tekst = "VOLDOENDE";
                    icijfer = "7";
                    break;
                case 8:
                    tekst = "GOED";
                    icijfer = "8";
                    break;
                case 9:
                    tekst = "GOED";
                    icijfer = "9";
                    break;
                case 10:
                    tekst = "GOED";
                    icijfer = "10";
                    break;
                default:
                    tekst = "ERROR.. Voer een geldig cijfer in..";
                    icijfer = "ERROR.. Voer een geldig cijfer in..";
                    break;
            }
            repaint();
        }
    }
}
