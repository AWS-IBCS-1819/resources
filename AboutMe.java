// AboutMe.java by Mr. Considine
// 9/10/18

import java.util.*;

public class AboutMe{

  public static String name; // creation of the static var
  public static String hairColor;
  public static Integer age;

  public AboutMe() {
    name = "Mr. Considine"; // assign the name to the static var
    hairColor = "Blonde";
    age = 35;
  }

  public static void main(String[] args) {

    AboutMe mrC = new AboutMe(); // call constructor method
    System.out.println("Hello my name is " + mrC.name);

  }

}
