package h12;

import java.awt.*;
import java.applet.*;

public class Hoofdstuk12Opdracht2 extends Applet {
    Button[] buttons = new Button[25];

    public void init() {
        for (int i = 0; i < buttons.length; i++) {
            buttons[i] = new Button("Knop nummer " + (i + 1));
            add(buttons[i]);
        }

    }
}
