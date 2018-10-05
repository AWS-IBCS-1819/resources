/* Reverse.java by Mr. Considine
This program holds all of the data and methods
for reversing a string in java, both by
recursion and with a while loop
10/3/18*/

public class Reverse {


  public static String reverse(String str) {
    if (str.length() == 1) {
      return str;
    }
    else {
      return Character.toString(str.charAt(str.length() -1)) +
      reverse(str.substring(0, str.length() - 1));
    }
  }

  public static void main(String[] args) {

    StringBuilder strB = new StringBuilder("hello");
    String strA = "hello";

    StringBuilder result = new StringBuilder();
    String res = reverse(strA);
    System.out.println(res);


    //while loop example
    while
    (strB.length() >= 1) {
      result.append(strB.charAt(strB.length() - 1));
      strB.deleteCharAt(strB.length() - 1);
    }
    //System.out.println(result);
  }

}
