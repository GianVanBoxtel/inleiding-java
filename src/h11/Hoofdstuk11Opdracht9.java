package h11;

import java.awt.*;
import java.applet.*;

public class Hoofdstuk11Opdracht9 extends Applet {

    public void init() {
        setBackground(Color.gray);
    }

    public void paint(Graphics g) {
        int y = 50;
        int x = 50;
        int breedte = 50;
        int hoogte =50;
        Color wit = Color.white;
        Color zwart = Color.black;
        for (int kolom = 0; kolom < 8; kolom++) {
            if (kolom == 0 || kolom == 2 || kolom == 4 || kolom == 6) {
                g.setColor(zwart);
                g.fillRect(x, y, breedte, hoogte);
            } else {
                g.setColor(wit);
                g.fillRect(x, y, breedte, hoogte);
            }
            x += breedte;
        }


        x = 50;
        y += hoogte;

        for (int kolom = 0; kolom < 8; kolom++) {
            if (kolom == 0 || kolom == 2 || kolom == 4 || kolom == 6) {
                g.setColor(wit);
                g.fillRect(x, y, breedte, hoogte);
            } else {
                g.setColor(zwart);
                g.fillRect(x, y, breedte, hoogte);

            }
            x += breedte;
        }

        x = 50;
        y += hoogte;

        for (
                int kolom = 0;
                kolom < 8; kolom++)

        {
            if (kolom == 0 || kolom == 2 || kolom == 4 || kolom == 6) {
                g.setColor(zwart);
                g.fillRect(x, y, breedte, hoogte);
            } else {
                g.setColor(wit);
                g.fillRect(x, y, breedte, hoogte);

            }
            x += breedte;
        }

        x = 50;
        y += hoogte;

        for (
                int kolom = 0;
                kolom < 8; kolom++)

        {
            if (kolom == 0 || kolom == 2 || kolom == 4 || kolom == 6) {
                g.setColor(wit);
                g.fillRect(x, y, breedte, hoogte);
            } else {
                g.setColor(zwart);
                g.fillRect(x, y, breedte, hoogte);

            }
            x += breedte;
        }

        x = 50;
        y += hoogte;

        for (
                int kolom = 0;
                kolom < 8; kolom++)

        {
            if (kolom == 0 || kolom == 2 || kolom == 4 || kolom == 6) {
                g.setColor(zwart);
                g.fillRect(x, y, breedte, hoogte);
            } else {
                g.setColor(wit);
                g.fillRect(x, y, breedte, hoogte);

            }
            x += breedte;
        }

        x = 50;
        y += hoogte;

        for (
                int kolom = 0;
                kolom < 8; kolom++)

        {
            if (kolom == 0 || kolom == 2 || kolom == 4 || kolom == 6) {
                g.setColor(wit);
                g.fillRect(x, y, breedte, hoogte);
            } else {
                g.setColor(zwart);
                g.fillRect(x, y, breedte, hoogte);

            }
            x += breedte;
        }

        x = 50;
        y += hoogte;

        for (
                int kolom = 0;
                kolom < 8; kolom++)

        {
            if (kolom == 0 || kolom == 2 || kolom == 4 || kolom == 6) {
                g.setColor(zwart);
                g.fillRect(x, y, breedte, hoogte);
            } else {
                g.setColor(wit);
                g.fillRect(x, y, breedte, hoogte);

            }
            x += breedte;
        }

        x = 50;
        y += hoogte;

        for (
                int kolom = 0;
                kolom < 8; kolom++)

        {
            if (kolom == 0 || kolom == 2 || kolom == 4 || kolom == 6) {
                g.setColor(wit);
                g.fillRect(x, y, breedte, hoogte);
            } else {
                g.setColor(zwart);
                g.fillRect(x, y, breedte, hoogte);

            }
            x += breedte;
        }
    }
}


