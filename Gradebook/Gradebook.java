/* Gradebook.java by Mr. Considine
This class holds all of the information for Gradebook
which reads a gradebook file and calculates certain
values for the teacher. Then it gives output based
off user feedback.
*/

import java.io.*;
import java.util.*;

public class Gradebook {

  public static void main(String[] args) {
    StringBuilder classN = new StringBuilder();
    StringBuilder sNames = new StringBuilder();
    StringBuilder empt = new StringBuilder();
    StringBuilder grd = new StringBuilder();

    try {
      File file = new File("grades.txt");
      Scanner fRead = new Scanner(file);

      for (int i = 0; i < 5; i++) {
        classN.append(fRead.next() + " ");
      }

      while (fRead.hasNext()) { //checks to see if our file is empty
        sNames.append(fRead.next() + " ");
        sNames.append(fRead.next() + "\n");
        empt.append(fRead.next());
        grd.append(fRead.next());
        //count++;
      }
    }
    catch (FileNotFoundException e) {
      e.printStackTrace();
    }

    int count = 0;
    Double top = 0.0;
    Double low = 100.0;
    Double sum = 0.0;

    int numA = 0;
    int numB = 0;
    int numC = 0;
    int numD = 0;
    int numF = 0;

    for (int i = 0; i < grd.length(); i = i+5) {
      count++;
      Double temp = Double.parseDouble(grd.substring(i, i+4));
      sum = sum + temp;

      if (temp > top) {
        top = temp;
      }
      if (temp < low) {
        low = temp;
      }
      if (temp >= 90.0) {
        numA++;
      }
      else if (temp >= 80.0) {
        numB++;
      }
      else if (temp >= 70.0) {
        numC++;
      }
      else if (temp >= 60) {
        numD++;
      }
      else {
        numF++;
      }
    }

    Double avg = sum/count;
    while (true) {
      System.out.println("What would you like to know about the class?");
      System.out.println("1) Mean Grade\n2) Grade Spread\n3) Top Grade\n" +
      "4) Lowest Grade\n5) Class Subject and Teacher\n6) Student Roster\n" +
      "7) Exit");
      Scanner userIn = new Scanner(System.in);
      String response = userIn.next();

      if (response.equals("1")) {
        System.out.println("The mean grade is: " + Double.toString(avg) + "%");
      }
      else if (response.equals("3")) {
        System.out.println("The highest grade is: " + Double.toString(top) + "%");
      }
      else if (response.equals("4")) {
        System.out.println("The lowest grade is: " + Double.toString(low) + "%");
      }
      else if (response.equals("2")) {
        System.out.println("The grade spread is:\n" + Integer.toString(numA) + " A's");
        System.out.println(Integer.toString(numB) + " B's");
        System.out.println(Integer.toString(numC) + " C's");
        System.out.println(Integer.toString(numD) + " D's");
        System.out.println(Integer.toString(numF) + " F's");
      }
      else if (response.equals("5")) {
        System.out.println("Here is the class subject and teacher: \n");
        System.out.println(classN);
      }
      else if (response.equals("6")) {
        System.out.println("Here is the class roster: \n");
        System.out.println(sNames);
      }
      else if (response.equals("7")) {
        break;
      }
      else {
        System.out.println("Please try again with input that matches a number between 1 and 6");
      }
      System.out.println("\n===========******===========\n");
    }
  }
}
