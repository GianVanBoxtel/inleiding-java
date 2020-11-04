package h06;

import java.awt.*;
import java.applet.*;

public class Hoofdstuk6Opdracht2 extends Applet {
    int seconden;
    int minuten;
    int secondenineenuur;
    int uur;
    int dag;
    int jaar;
    int secondenineendag;
    int secondenineenjaar;


    public void init() {
        //Aantal seconden in een uur
        seconden = 60;
        minuten = 60;
        secondenineenuur = seconden * minuten;
        //Aantal seconden in een dag
        uur = 24;
        secondenineendag = secondenineenuur * uur;
        //Aantal seconden in een jaar
        dag = 365;
        secondenineenjaar = secondenineendag * dag;

    }

    
    public void paint(Graphics g) {
        //Uitkomst van aantal seconden in een uur
        g.drawString("Er zitten zoveel seconden in een uur:" + secondenineenuur,20,20);
        //Uitkomst van aantal seconden in een dag
        g.drawString("Er zitten zoveel seconden in een dag:" + secondenineendag,20,40);
        //Uitkomst van aantal seconden in een jaar
        g.drawString("Er zitten zoveel seconden in een jaar:" + secondenineenjaar,20,60);
    }
}
