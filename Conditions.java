// Conditions.java by Mr. Considine
// 9/14/18

import java.util.*;
import java.io.*;

public class Conditions {

  public static void main(String[] args) {

    StringBuilder myStr = new StringBuilder();
    int count = 0;
    try {
      File odyssey = new File("Odyssey.txt");
      Scanner sc = new Scanner(odyssey);


      while (sc.hasNext()) { //checks to see if our file is empty
        myStr.append(sc.next() + " ");
        count++;
      }
    }
    catch (FileNotFoundException e) {
      e.printStackTrace();
    }

    System.out.println(myStr);

    int numO = 0;
    for (int i = 0; i < count - 7; i++) {
      if (myStr.substring(i, i + 7).equals("Odysseus")) {
        numO++;
      }
    }
    System.out.println("Number of 'Odysseus' in The Odyssey: " + Integer.toString(numO));

  }
}
