import java.awt.*;
import java.awt.event.*;

public class FunWin extends Frame implements WindowListener,ActionListener {
        TextField text = new TextField(40);
        Button b;
        Button b2;
        Checkbox za;
        Checkbox sta;
        Checkbox gna;
        CheckboxGroup gg;
        private int numClicks = 0;
        private String choice = "";

        public FunWin(String title) {

                super(title);
                setLayout(new FlowLayout());
                setBackground(Color.cyan);
                addWindowListener(this);
                b = new Button("Thing 1");
                add(b);
                b2 = new Button("Invisible?");
                add(b2);
                add(text);
                gg = new CheckboxGroup();
                za = new Checkbox("pizza", gg, false);
                sta = new Checkbox("pasta", gg, false);
                gna = new Checkbox("lasagna", gg, false);
                add(za);
                add(sta);
                add(gna);
                b.setBackground(Color.red);
                Color c = new Color(2,7,80);
                b2.setBackground(c);
                b.setForeground(c);
                b2.setForeground(Color.green);
                b.addActionListener(this);
                b2.addActionListener(new ActionListener() {
                  public void actionPerformed(ActionEvent e) {
                    numClicks--;
                    text.setText("Button Clicked " + numClicks + " times");
                  }
                });
        }

        public static void main(String[] args) {
                FunWin myWindow = new FunWin("Buttons Examples");
                myWindow.setSize(400,400);
                myWindow.setVisible(true);
        }

        public void actionPerformed(ActionEvent e) {
            numClicks++;
            if (za.getState()) {
              choice = "pizza";
            }
            else if (sta.getState()) {
              choice = "pasta";
            }
            else {
              choice = "lasagna";
            }
            text.setText("You are ordering " + numClicks + " of " + choice);
        }


        public void windowClosing(WindowEvent e) {
                dispose();
                System.exit(0);
        }

        public void windowOpened(WindowEvent e) {}
        public void windowActivated(WindowEvent e) {}
        public void windowIconified(WindowEvent e) {}
        public void windowDeiconified(WindowEvent e) {}
        public void windowDeactivated(WindowEvent e) {}
        public void windowClosed(WindowEvent e) {}

}
