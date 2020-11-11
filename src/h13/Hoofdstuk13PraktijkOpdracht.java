package h13;

import java.awt.*;
import java.applet.*;
public class Hoofdstuk13PraktijkOpdracht extends Applet {
    public void init() {

    }

    public void paint(Graphics g) {
        for (int eersteloop = 0; eersteloop < 6; eersteloop++) {
            for (int tweedeloop = 0; tweedeloop < 3; tweedeloop++) {
                tekenBoom(g, eersteloop * 80 + 20 * (tweedeloop % 2), (tweedeloop + 5) * 40);
            }
        }
    }
    public void tekenBoom(Graphics g, int x, int y) {
        g.setColor(new Color(51,15,0));
        g.fillRect(x, y, 20,40);
        g.setColor(new Color(15,50,5));
        g.fillOval(x - 20, y - 30, 60,40);
    }
}
