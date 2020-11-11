package h13;

import java.awt.*;
import java.applet.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class Hoofdstuk13Opdracht3 extends Applet {
    int soortMuur;
    public void init() {
        soortMuur = 1;
        Button knop1 = new Button("Baksteen");
        Button knop2 = new Button("Beton");
        Listen1 l1 = new Listen1();
        Listen2 l2 = new Listen2();
        knop1.addActionListener(l1);
        knop2.addActionListener(l2);
        add(knop1);
        add(knop2);
    }

    public void paint(Graphics g) {
        if (soortMuur == 0) {
            for (int muur = 0; muur < 25; muur++) {
                for (int muur0 = 0; muur0 < 25; muur0++) {
                    tekenBaksteen(g, muur0 * 22 + 10 * (muur0 % 2), muur0 * 12);
        }
    }
        } else if (soortMuur == 1) {
            for (int muur1 = 0; muur1 < 15; muur1++) {
                for (int muur2 = 0; muur2 < 15; muur2++) {
                    tekenBeton(g, muur1 * 42 + 20 * (muur2 % 2), (muur2 + 5) * 22);
                }
            }
        }
    }

    public class Listen1 implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            soortMuur = 0;
            repaint();
        }
    }

    public class Listen2 implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            soortMuur = 1;
            repaint();
        }
    }
    public void tekenBaksteen(Graphics g, int x1, int y1) {
        g.setColor(Color.red);
        g.fillRect(x1, y1, 20,10);
    }

    public void tekenBeton(Graphics g, int x1, int y1) {
        g.setColor(Color.gray);
        g.fillRect(x1, y1, 40,20);
    }

}
