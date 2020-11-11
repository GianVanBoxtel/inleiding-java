package h14;

import java.awt.*;
import java.applet.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Hoofdstuk14PraktijkOpdracht extends Applet {

    public String gameOver;
    public int NumbersOfDoom = 23;
    public boolean turn = true;
    public int turnPlayer, turnComp;
    public Image image;
    public TextField inputHere;
    public Button input;
    public int inputNumber;

    public void init() {
        inputHere = new TextField("", 5);
        inputHere.addActionListener(new TurnListener());
        add(inputHere);
        input = new Button("End turn");
        input.addActionListener(new TurnListener());
        add(input);

    }
    public void paint(Graphics g) {
        if (!turn) {
            turn = true;
            g.setColor(Color.BLACK);
            g.drawString("Choose a number between 1 and 3", 40, 80);
            if (inputNumber > 3) {
                g.setColor(Color.RED);
                g.drawString("ERROR Choose a number between 1 and 3", 40, 80);
                g.setColor(Color.BLACK);
            }
            if (inputNumber < 1) {
                g.setColor(Color.red);
                g.drawString("Choose a number between 1 and 3", 40, 80);
                g.setColor(Color.black);
            }
        }
        if (NumbersOfDoom > 0) {
            int x = 50;
            int y = 100;

            for (int i = 0; i < NumbersOfDoom; i++) {
                g.drawImage(image, x, y, 20, 20, this);
                x += 50;
                if (i % 4 == 3) {
                    x = 50;
                    y += 50;
                }
            }
            g.drawString("Computer's last turn:  " + turnComp, 200, 70);
        } else {
            g.drawString(gameOver, 100, 100);
        }
    }


    private int compOptions() {
        int END = 0;

        double r;
        int r2;

        r = Math.random();
        r2 = (int) (r * 3 + 1);
        int c;

        c = NumbersOfDoom % 4;

        if (c == 0) {
            END = 3;
        }

        if (c == 1) {
            END = r2;
        }

        if (c == 2) {
            END = 1;
        }

        if (c == 3) {
            END = 2;
        }
        return END;
    }

    public class TurnListener implements ActionListener {

        public void actionPerformed(ActionEvent e) {
            String inputGiven = inputHere.getText();
            inputNumber = Integer.parseInt(inputGiven);
            if (inputNumber < 4 && inputNumber > 0) {

                turnPlayer = inputNumber;
                NumbersOfDoom -= turnPlayer;
                if (NumbersOfDoom < 1) {
                    gameOver = "GAME OVER, you have lost!";
                } else {

                    turnComp = compOptions();
                    NumbersOfDoom -= turnComp;
                    if (NumbersOfDoom < 0) {
                        gameOver = "GAME OVER, you have won!";
                    }

                }
            } else {
                turn = false;
            }
            repaint();
        }
    }
}
