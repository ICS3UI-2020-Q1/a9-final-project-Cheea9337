import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Main implements Runnable, ActionListener{

  // Class Variables  

  // create an array for the creation of the buttons
  JButton[] spots;

  // create an array for the cards
  String[] cards;

  // create a label to give the user instructions
  JLabel instructions;

  // Method to assemble our GUI
  public void run(){
    // Creats a JFrame that is 800 pixels by 600 pixels, and closes when you click on the X
    JFrame frame = new JFrame("Title");
    // Makes the X button close the program
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    // makes the windows 800 pixel wide by 600 pixels tall
    frame.setSize(800,600);
    // shows the window
    frame.setVisible(true);
 
    // create a main panel to have a grid of buttons
    JPanel mainPanel = new JPanel();
    mainPanel.setLayout(new BorderLayout());

    // create and add instruction text
    instructions = new JLabel();
    mainPanel.add(instructions, BorderLayout.PAGE_START);

    // create the panel to layout the buttons 
    JPanel grid = new JPanel();
    grid.setLayout(new GridLayout(4,3));

    // create an array with 12 spots for the buttons 
    spots = new JButton[12];

    // create a for loop to create the buttons and add them to the panel 
    for(int i = 0; i < spots.length; i++){
      // create buttons with no text 
      spots[i] = new JButton("");
      // add action listener 
      spots[i].addActionListener(this);
      // set action command to the number
      String spotNum = String.valueOf(i);
      spots[i].setActionCommand(spotNum);

      // create the fisher yates shuffle
      function shuffle(array) {
      var copy = [], n = spots.length, i;

      // While there remain elements to shuffle…
      while (n) {

      // Pick a remaining element…
      i = Math.floor(Math.random() * array.length);

      // If not already shuffled, move it to the new array.
      if (i in array) {
      copy.push(array[i]);
      delete array[i];
      n--;
    }
  }

    return copy;
}

      // add to the panel 
      grid.add(spots[i]);
    }

    // add button grid to panel
    mainPanel.add(grid, BorderLayout.CENTER);

    // add panel to frame
    frame.add(mainPanel);

    cards = new String[12];



  }

  // method called when a button is pressed
  public void actionPerformed(ActionEvent e){
    // get the command from the action
    String command = e.getActionCommand();

  }

  // Main method to start our program
  public static void main(String[] args){
    // Creates an instance of our program
    Main gui = new Main();
    // Lets the computer know to start it in the event thread
    SwingUtilities.invokeLater(gui);
  }
}
