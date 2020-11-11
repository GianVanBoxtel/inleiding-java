package h14;

import java.awt.*;
import java.applet.*;
import java.util.Random;

public class Hoofdstuk14Opdracht1 extends Applet {
    private String[] kleuren = {"Ruiten ", "Harten ", "Schoppen ", "Klaveren "};
    private String[] kaarten = {"tien", "twee", "drie", "vier", "vijf", "zes", "zeven", "acht", "negen", "boer", "vrouw", "heer", "aas"};
    private String[] deck = new String[52];
    private String[] speler = new String[13];
    private double r;
    private int worp;

    public void init() {
        randomiser();
    }

    public void randomiser() {
        r = Math.random();
        worp = (int) (r * 6 + 1);
    }

    public void paint(Graphics g) {
        deckMaken();
        deelKaart();
        g.drawString("" + deelEnkeleKaart(), 100,100);
    }

    public void deckMaken() {
        int index = 0;
        for (int i = 0; i < kleuren.length; i++) {
            String kleur = kleuren[i];
            for (int j = 0; j < kaarten.length; j++) {
                String kaart = kaarten[j];
                deck[index] = kleur + kaart;
                index++;
            }
        }
        for (int k = 0; k < 13;  k++) {
            speler[k] = deelKaart();
        }
    }

    private String deelKaart() {
        int random = new Random().nextInt(deck.length);
        String kaart = deck[random];
        String[] hulplijst = new String[deck.length - 1];
        int hulpindex = 0;
        for (int i = 0; i < deck.length; i++) {
            if (i != random) {
                hulplijst[hulpindex] = deck[i];
                hulpindex++;
            }
        }
        deck = hulplijst;
        return kaart;
    }

    public String deelEnkeleKaart() {
        return speler[new Random().nextInt(worp)];
    }
}
