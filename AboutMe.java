// AboutMe.java by Mr. Considine
// 9/10/18

import java.util.*;

public class AboutMe{

  public String name; // creation of the static var
  public static String hairColor;
  public static Integer age;

  public AboutMe() {
    name = "Mr. Considine"; // assign the name to the static var
    hairColor = "Blonde";
    age = 35;
  }

  public void changeName(String newName) {
    name = newName;
  }

  public static void main(String[] args) {

    AboutMe mrC = new AboutMe(); // call constructor method
    AboutMe notMrC = new AboutMe(); // construct different about me

    System.out.println("names:");
    System.out.println("mrC: " + mrC.name);
    System.out.println("notMrC: " + notMrC.name);

    System.out.println("-- change --\n");
    notMrC.changeName("Ezekiel");

    System.out.println("names:");
    System.out.println("mrC: " + mrC.name);
    System.out.println("notMrC: " + notMrC.name);

    System.out.println("Welcome to a bit about ME."
    + " What would you like to know?:\n(name)\n(hair color)\n(age)\n"
    + "(change name)");
    Scanner newIn = new Scanner(System.in);

    String userIn = newIn.next();
    if (userIn.equals("name")){
      System.out.println("Hello my name is " + mrC.name);
    }
    else if (userIn.equals("change")){
      // add prompt to select the name change
      mrC.changeName("Ezekiel");
      System.out.println("Hello my name is " + mrC.name);
    }

    newIn.close();
    

  }

}
