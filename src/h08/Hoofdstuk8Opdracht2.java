package h08;

import java.awt.*;
import java.applet.*;
import java.awt.event.*;

public class Hoofdstuk8Opdracht2 extends Applet {
    int man;
    int vrouw;
    int mannelijkeLeerling;
    int vrouwelijkeLeerling;
    Button knop1;
    Button knop2;
    Button knop3;
    Button knop4;
    Button reset;

    public void init() {
        man = 0;
        vrouw = 0;
        mannelijkeLeerling = 0;
        vrouwelijkeLeerling = 0;

        knop1 = new Button();
        knop2 = new Button();
        knop3 = new Button();
        knop4 = new Button();
        reset = new Button();

        knop1.setLabel("Volwassen man");
        knop2.setLabel("Volwassen vrouw");
        knop3.setLabel("Mannelijke leerling");
        knop4.setLabel("Vrouwelijke leerling");
        reset.setLabel("Reset");

        knop1.addActionListener( new knop1Listener() );
        knop2.addActionListener( new knop2Listener() );
        knop3.addActionListener( new knop3Listener() );
        knop4.addActionListener( new knop4Listener() );
        reset.addActionListener( new resetListener() );

        add(knop1);
        add(knop2);
        add(knop3);
        add(knop4);
        add(reset);

    }

    public void paint(Graphics g) {
        g.drawString("Volwassen mannen: " +man,20,50);
        g.drawString("Volwassen vrouwen: " +vrouw,20,80);
        g.drawString("Mannelijke leerlingen: " +mannelijkeLeerling,20,110);
        g.drawString("Vrouwelijke leerlingen: " +vrouwelijkeLeerling,20,140);
    }

    class knop1Listener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            man++;
            repaint();
        }
    }
    class knop2Listener implements ActionListener {


        public void actionPerformed(ActionEvent e) {
            vrouw++;
            repaint();
        }
    }
    class knop3Listener implements ActionListener {


        public void actionPerformed(ActionEvent e) {
            mannelijkeLeerling++;
            repaint();
        }
    }
    class knop4Listener implements ActionListener {


        public void actionPerformed(ActionEvent e) {
            vrouwelijkeLeerling++;
            repaint();
        }
    }
    class resetListener implements ActionListener {


        public void actionPerformed(ActionEvent e) {
            man = 0;
            vrouw = 0;
            mannelijkeLeerling = 0;
            vrouwelijkeLeerling = 0;
            repaint();
        }
    }
}
