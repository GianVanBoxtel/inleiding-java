package h12;

import java.awt.*;
import java.applet.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;

public class Hoofdstuk12Opdracht3 extends Applet {
    TextField[] tekstvelden;
    int[] getallen;
    Button ok;

    public void init() {

        getallen = new int[5];
        tekstvelden = new TextField[5];

        for (int i = 0; i < tekstvelden.length; i++) {
            tekstvelden[i] = new TextField("", 5);
            add(tekstvelden[i]);
        }
        ok = new Button("Oké");
        ok.addActionListener(new Listener());
        add(ok);
    }

    class Listener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            for (int i = 0; i < getallen.length; i++) {
                getallen[i] = Integer.parseInt(tekstvelden[i].getText());
            }
            Arrays.sort(getallen);
            for (int i = 0; i < getallen.length; i++) {
                tekstvelden[i].setText("" + getallen[i]);
            }
        }
    }

}
