//practice code

import java.util.*;

public class Practice{

  public static void one(){
    System.out.println("Guess what the output for the code will be!");
    System.out.println("\nint x = 17;\nint y = 2;\nif (y > 2){\n    x = 3;\n}\nSystem.out.println(x + y);\n");
    Scanner n = new Scanner(System.in);
    String u = n.next();
    int x = 17;
    int y = 2;
    if (y > 2){
      x = 3;
    }
    System.out.println(x + y);
  }
  public static void two(){
    System.out.println("Guess what the output for the code will be!");
    System.out.println("\nint x = 4;\nx = x + 2;\nif (x > 5){\n    x = 1;\n}\nSystem.out.println(x);\n");
    Scanner n = new Scanner(System.in);
    String u = n.next();
    int x = 4;
    x = x + 2;
    if (x > 5){
      x = 1;
    }
    System.out.println(x);

  }
  public static void three(){
    System.out.println("Guess what the output for the code will be!");
    System.out.println("\nint x = 4;\nString[] s = new String[x];\ns[2] = \"hi\";\nfor (int i = 0; i < s.length; i++){\n    System.out.println(s[i]);\n}\n");
    Scanner n = new Scanner(System.in);
    String u = n.next();
    int x = 4;
    String[] s = new String[x];
    s[2] = "hi";
    for (int i = 0; i < s.length; i++){
      System.out.println(s[i]);
    }
  }
  public static void four(){
    System.out.println("Guess what the output for the code will be!");
    System.out.println("\nint x = 4;\nint[] s = new int[x];\nx = x - 1;\nfor (int i = 0; i < s.length; i++){\n    s[i] = x + 1;\n    System.out.println(s[x - i]);\n}\n");
    Scanner n = new Scanner(System.in);
    String u = n.next();
    int x = 4;
    int[] s = new int[x];
    x = x - 1;
    for (int i = 0; i < s.length; i++){
      s[i] = x + 1;
      System.out.println(s[x - i]);
    }
  }
  public static void five(){
    System.out.println("Guess what the output for the code will be!");
    System.out.println("\nBoolean foo = true;\nBoolean bar = false;\nif (foo){\n    if (bar){\n        System.out.println(\"foobar\");\n    }\n    System.out.println(\"bar\");\n}\nelse{System.out.println(\"foo\");}\nSystem.out.println(\"barfoo\");\n");
    Scanner n = new Scanner(System.in);
    String u = n.next();
    Boolean foo = true;
    Boolean bar = false;
    if (foo){
      if (bar){
        System.out.println("foobar");
      }
      System.out.println("bar");
    }
    else{System.out.println("foo");}
    System.out.println("barfoo");
  }
  public static void six(){
    System.out.println("Guess what the output for the code will be!");
    System.out.println("\nint x = 4;\nArrayList<Integer> ar = new ArrayList<Integer>();\nfor (int i = 0; i < 6; i++){\n    ar.add(x*i);\n}\nSystem.out.print(ar.get(4) - ar.get(1));\n");
    Scanner n = new Scanner(System.in);
    String u = n.next();
    int x = 4;
    ArrayList<Integer> ar = new ArrayList<Integer>();
    for (int i = 0; i < 6; i++){
      ar.add(x*i);
    }
    System.out.print(ar.get(4) - ar.get(1));
  }
  public static void seven(){
    System.out.println("Guess what the output for the code will be!");
    System.out.println("\nString s = \"777\";\nString a = \"12345\";\nSystem.out.println(s.charAt(0) + s.charAt(1) + s.charAt(2));\nSystem.out.println(\"Lucky \" + s.concat(a.substring(2,4)));\n");
    Scanner n = new Scanner(System.in);
    String u = n.next();
    String s = "777";
    String a = "12345";
    System.out.println(s.charAt(0) + s.charAt(1) + s.charAt(2));
    System.out.println("Lucky " + s.concat(a.substring(2,4)));
  }
  public static void eight(){
    System.out.println("Guess what the output for the code will be!");
    System.out.println("\nString s = \"great\";\nString a = \"trees\";\nfor (int i = 0; i < 5; i++){\n    if (s.charAt(i) == a.charAt(4-i)){\n        System.out.println(s.substring(i,i+1));\n    }\n}\n");
    Scanner n = new Scanner(System.in);
    String u = n.next();
    String s = "great";
    String a = "trees";
    for (int i = 0; i < 5; i++){
      if (s.charAt(i) == a.charAt(4-i)){
        System.out.println(s.substring(i,i+1));
      }
    }
  }
  public static void nine(){
    System.out.println("Guess what the output for the code will be!");
    System.out.println("\nint count = 10;\nwhile (count - 5 > 1){\n    System.out.println(count / 2);\n    count = count - 1;\n}\n");
    Scanner n = new Scanner(System.in);
    String u = n.next();
    int count = 10;
    while (count - 5 > 1){
      System.out.println(count / 2);
      count = count - 1;
    }
  }
  public static void ten(){
    System.out.println("Guess what the output for the code will be!");
    System.out.println("\nint x = 5;\nint y = 3;\nwhile (true){\n    if (x*y >= 150){\n        break;\n    }\n    System.out.println(x + y);\n    x = x + y;\n}");
    Scanner n = new Scanner(System.in);
    String u = n.next();
    int x = 5;
    int y = 3;
    while (true){
      if (x*y >= 150){
        break;
      }
      System.out.println(x + y);
      x = x + y;
    }
  }





  public static void main(String[] args) {
    System.out.println("Pick a number from 1 - 10");
    Scanner newIn = new Scanner(System.in);
    String y = newIn.next();
    int x = Integer.parseInt(y);

    if (x == 1){
      one();
    }
    if (x == 2){
      two();
    }
    if (x == 3){
      three();
    }
    if (x == 4){
      four();
    }
    if (x == 5){
      five();
    }
    if (x == 6){
      six();
    }
    if (x == 7){
      seven();
    }
    if (x == 8){
      eight();
    }
    if (x == 9){
      nine();
    }
    if (x == 10){
      ten();
    }


  }

}
