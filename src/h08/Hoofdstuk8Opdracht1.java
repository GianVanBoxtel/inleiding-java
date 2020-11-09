package h08;

import java.awt.*;
import java.applet.*;
import java.awt.event.*;

public class Hoofdstuk8Opdracht1 extends Applet {
    TextField tekstvak;
    Button ok;
    Label label;
    Button reset;
    String tekst;

    public void init() {
        tekstvak = new TextField("",30);
        ok = new Button("Ok");
        label = new Label("Type iets");
        tekst = "";
        reset = new Button("Reset");
        ok.addActionListener( new OkKnopListener() );
        reset.addActionListener( new ResetKnopListener() );
        add(tekstvak);
        add(ok);
        add(label);


        add(reset);
    }

    
    public void paint(Graphics g) {
        g.drawString(tekst,50,60);
    }

    class OkKnopListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            tekst = tekstvak.getText();
            repaint();
        }

    }


    class ResetKnopListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            tekstvak.setText("");
            tekst = "";
            repaint();
        }

    }
}
