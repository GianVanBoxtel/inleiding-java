package h10;

import java.awt.*;
import java.applet.*;
import java.awt.event.*;
public class Hoofdstuk10Opdracht4 extends Applet {

        TextField tekst1;
        TextField tekst2;
        Label label;
        String tekst,s,dagen, jaars;
        int maand, jaar, schrikkel, schrikkelfalse;

        public void init()
        {
            Vaklisten vl = new Vaklisten();
            tekst1 = new TextField("maand",20);
            tekst2 = new TextField("jaar",20);
            label = new Label("Typ een getal");
            tekst1.addActionListener(vl);
            tekst2.addActionListener(vl);
            add (label);
            add (tekst1);
            add (tekst2);
        }
        public void paint(Graphics g)
        {
            g.drawString("de maand heet: "+ tekst, 40, 100);
            g.drawString("de maand heeft "+dagen+" dagen",40, 120);

        }
        class Vaklisten implements ActionListener
        {
            public void actionPerformed(ActionEvent e)
            {
                s = tekst1.getText();
                jaars = tekst2.getText();
                maand = Integer.parseInt(s);
                jaar = Integer.parseInt(jaars);
                schrikkel = jaar%4;
                schrikkelfalse = jaar%400;
                switch(maand)
                {
                    case 1:
                        tekst = "Januari";
                        dagen = "31";
                        break;
                    case 2:
                        tekst = "Februari";
                        if (schrikkel == 0 &&!( schrikkelfalse == 0)){
                            dagen = "29";
                        }
                        else
                        {
                            dagen = "28";
                        }

                        break;
                    case 3:
                        tekst = "Maart";
                        dagen = "31";
                        break;
                    case 4:
                        tekst = "April";
                        dagen = "30";
                        break;
                    case 5:
                        tekst = "Mei";
                        dagen = "31";
                        break;
                    case 6:
                        tekst = "Juni";
                        dagen = "30";
                        break;
                    case 7:
                        tekst = "Juli";
                        dagen = "31";
                        break;
                    case 8:
                        tekst = "Augustus";
                        dagen = "31";
                        break;
                    case 9:
                        tekst = "September";
                        dagen = "30";
                        break;
                    case 10:
                        tekst = "Oktober";
                        dagen = "31";
                        break;
                    case 11:
                        tekst = "November";
                        dagen = "30";
                        break;
                    case 12:
                        tekst = "December";
                        dagen = "31";
                        break;
                    default:
                        tekst = "Dit is geen maand...!";
                        break;

                }
                repaint();
            }
        }
}
