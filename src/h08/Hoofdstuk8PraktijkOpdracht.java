package h08;

import java.awt.*;
import java.applet.*;
import java.awt.event.*;

public class Hoofdstuk8PraktijkOpdracht extends Applet {

    TextField vak1;
    TextField vak2;
    TextField vak3;
    Button gedeelddoor;
    Button keer1;
    Button min1;
    Button plus1;
    Button reset;
    double waarde1;
    double waarde2;
    double waarde3;

    public void init() {
        vak1 = new TextField(10);
        vak2 = new TextField(10);
        vak3 = new TextField(10);
        reset = new Button();
        gedeelddoor = new Button();
        keer1 = new Button();
        plus1 = new Button();
        min1 = new Button();

        reset.setLabel("CE");
        gedeelddoor.setLabel("/");
        keer1.setLabel("*");
        plus1.setLabel("+");
        min1.setLabel("-");

        listen1 minus = new listen1();
        listen2 plus = new listen2();
        listen3 div = new listen3();
        listen4 mult = new listen4();
        listen5 ce = new listen5();

        plus1.addActionListener(plus);
        min1.addActionListener(minus);
        gedeelddoor.addActionListener(div);
        keer1.addActionListener(mult);
        reset.addActionListener(ce);

        add(vak1);
        add(vak2);
        add(vak3);
        add(reset);
        add(plus1);
        add(min1);
        add(keer1);
        add(gedeelddoor);

    }

    public void paint(Graphics g) {

    }
    class listen1 implements ActionListener {

        public void actionPerformed(ActionEvent e) {
            waarde1 = Double.parseDouble(vak1.getText());
            waarde2 = Double.parseDouble(vak2.getText());
            waarde3 = waarde1 - waarde2;
            vak1.setText(null);
            vak2.setText(null);
            vak3.setText(String.valueOf(waarde3));
            repaint();
        }
    }
    class listen2 implements ActionListener {

        public void actionPerformed(ActionEvent e) {
            waarde1 = Double.parseDouble(vak1.getText());
            waarde2 = Double.parseDouble(vak2.getText());
            waarde3 = waarde1+waarde2;
            vak1.setText(null);
            vak2.setText(null);
            vak3.setText(String.valueOf(waarde3));
            repaint();
        }
    }
    class listen3 implements ActionListener {

        public void actionPerformed(ActionEvent e) {
            waarde1 = Double.parseDouble(vak1.getText());
            waarde2 = Double.parseDouble(vak2.getText());
            waarde3 = waarde1/waarde2;
            vak1.setText(null);
            vak2.setText(null);
            vak3.setText(String.valueOf(waarde3));
            repaint();
        }
    }
    class listen4 implements ActionListener {

        public void actionPerformed(ActionEvent e) {
            waarde1 = Double.parseDouble(vak1.getText());
            waarde2 = Double.parseDouble(vak2.getText());
            waarde3 = waarde1*waarde2;
            vak1.setText(null);
            vak2.setText(null);
            vak3.setText(String.valueOf(waarde3));
            repaint();
        }
    }
    class listen5 implements ActionListener {

        public void actionPerformed(ActionEvent e) {
            vak1.setText(null);
            vak2.setText(null);
            vak3.setText(null);
            repaint();
        }
    }
}