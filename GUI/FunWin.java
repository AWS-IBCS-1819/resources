import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

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
        Gradebook g;
        JComboBox<String> dropdown;
        String myChoice;

        public FunWin(String title) {


                super(title);
                setLayout(null);
                setBackground(Color.cyan);
                addWindowListener(this);

                //Create Gradebook
                g = new Gradebook("grades.txt");

                b = new Button("Thing 1");
                add(b);
                b2 = new Button("Invisible?");
                add(b2);
                add(text);
                text.setBounds(50,300,150,30);
                //gg = new CheckboxGroup();
                //za = new Checkbox("pizza", gg, false);
                //sta = new Checkbox("pasta", gg, false);
                //gna = new Checkbox("lasagna", gg, false);
                //add(za);
                //add(sta);
                //add(gna);

                String[] options = {"Pizza", "Pasta", "Lasagna"};
                dropdown = new JComboBox<String>(options);
                dropdown.setBounds(200,200,130,200);
                add(dropdown);
                dropdown.addActionListener(this);

                b.setBackground(Color.red);
                Color c = new Color(2,7,80);
                b2.setBackground(c);
                b.setForeground(c);
                b2.setForeground(Color.green);
                b.addActionListener(this);
                myChoice = "";
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

            if (e.getSource() == dropdown) {
              //System.out.println(dropdown.getSelectedItem().getClass());
              myChoice = dropdown.getSelectedItem().toString();
            }
            /*numClicks++;
            if (za.getState()) {
              choice = "pizza";
            }
            else if (sta.getState()) {
              choice = "pasta";
            }
            else {
              choice = "lasagna";
            }*/
            text.setText("You are ordering " + myChoice);
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
