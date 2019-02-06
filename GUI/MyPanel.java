public class MyPanel extends JPanel
			implements ActionListener {
		  public void actionPerformed(ActionEvent e){
		    // reaction to button click goes here
		    Listener lis = new MyPanel();
        button.addActionListener(lis); // button is the event detector;
        //Generally... <eventDetector>.add<EventType>Listener(<listenerObject>);


        Color color = getBackground();  // color will be set
	      Object source = e.getSource();
        if (source == redButton) {
          color = Color.red;
        }
        else if (source == blueButton) {
          color = Color.blue;
        }
        setBackground(color);
        repaint();  // when do we need this??

        String com = e.getActionCommand();
	      if (com.equals("RED")) {
          System.out.println("red");
        }; // "RED" is the label of redButton
        else if (com.equals("BLUE")) {
          System.out.println("blue");
        };

        //redButton.setActionCommand("RED ACTION");

		  } // actionPerformed
		} // class MyPanel
    public static void main(String[] args) {
	    JFrame f = new MyFrame("My Hello World Frame");
	    f.show();
	  } //main

class ButtonPanel extends JPanel {
    	  // members:
        private JButton redButton;
    	  private JButton blueButton;
    	  // constructors:
    	  public ButtonPanel() {

    	    // create buttons
    	    redButton = new JButton("RED");
          // If gif file had... redButton = new JButton(new ImageIcon("RED.gif");
    	    blueButton = new JButton("BLUE");

    	    // add buttons to current panel
    	    add(redButton);  // add button to current panel
    	    add(blueButton); // add button to current panel

    	    // register the current panel as listener for the buttons
    	    redButton.addActionListener(this);
    	    blueButton.addActionListener(this);

    	  } // ButtonPanel constructor
} // ButtonPanel class
