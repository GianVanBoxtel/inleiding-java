package h10;

import java.awt.*;
import java.applet.*;
import java.awt.event.*;
public class Hoofdstuk10Opdracht1 extends Applet {
    TextField tekst1;
    Label label1;
    long cijfer1, cijfer2;


    public void init() {
        tekst1 = new TextField("",30);
        label1 = new Label("Type een getal");
        tekst1.addActionListener(new tekst1listen());
        add(label1);
        add(tekst1);
    }


    public void paint(Graphics g) {
        g.drawString(cijfer1+"",20,40);
    }

    class tekst1listen implements ActionListener {

        public void actionPerformed(ActionEvent e) {
            cijfer2 = Long.parseLong(tekst1.getText());

            if ((cijfer2>cijfer1))
            {
                cijfer1 = cijfer2;
                tekst1.setText(null);
                repaint();
            }
        }
    }
}
