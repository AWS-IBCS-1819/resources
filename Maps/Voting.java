//Voting.java by Mr. Considine

import java.io.*;
import java.util.*;


public class Voting {

public static void main(String[] args) {

  System.out.println("Welcome to the ______ Teacher Awards!");
  System.out.println("The ballots have been cast and the results are in!\n\n ====================== \n");

  HashMap<String, Integer> votes = new HashMap<String, Integer>();


  try {
    File file = new File("votes.txt");
    Scanner fr = new Scanner(file);

    while (fr.hasNext()){
      String temp = fr.next();
      if (temp == null) {
        break;
      }
      else {
        if (votes.containsKey(temp)) {
          votes.replace(temp, votes.get(temp) + 1);
        }
        else {
          votes.put(temp, 1);
        }
      }
    }

    System.out.println(votes);
  }
  catch (FileNotFoundException e) {
    e.printStackTrace();
  }
}


}
