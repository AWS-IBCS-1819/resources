//Compressing.java by Mr. Considine

import java.io.*;
import java.util.*;


public class Compressing {

public static void main(String[] args) {

  System.out.println("Welcome to the TextCompressor5000!");
  System.out.println("You are compressing \"test1.txt\"!\n\n ====================== \n");

  StringBuilder sb = new StringBuilder();

  try {
    File file = new File("test1.txt");
    Scanner fr = new Scanner(file);

    while (fr.hasNext()){
      String temp = fr.next();
      if (temp == null) {
        break;
      }
      else {
        sb.append(temp);
        sb.append("_");
      }
    }

    //System.out.println("your file:\n" + sb);
  }
  catch (FileNotFoundException e) {
    e.printStackTrace();
  }

  int x = 3;

  HashMap<Integer, String> comps = new HashMap<Integer, String>();
  ArrayList<Integer> keys = new ArrayList<Integer>();
  String temp = "";
  int count = 0;
  String next = "";
  for (int i = 0; i < sb.length() - x; i++) {
    count = 0;
    next = sb.substring(i, i+x);
    //System.out.println("next: " + next);
    for (int k = i; k < sb.length() - x; k++) {
      temp = sb.substring(k, k+x);
      //System.out.println("temp: " + temp);
      if (temp.equals(next)) {
        count++;
      }
    }
    //System.out.println(count);
    if (count > 2) {
      comps.put(i, next);
      keys.add(i);
    }
  }
  //System.out.println("Keys");
  //for (int i = 0; i < keys.size(); i++) {
  //  System.out.println(keys.get(i));
  //}

  String example = sb.toString();

  for (int i = 0; i < keys.size(); i++) {
    //System.out.println("substring: " + sb.substring(i, i+2));
    //System.out.println("replace with " + keys.get(i).toString());
    example = example.replaceAll(sb.substring(i, i+x), keys.get(i).toString());
  }
  System.out.println("Original:\n" + sb.toString());
  System.out.println("Compressed:\n" + example);
  try {
    BufferedWriter writer = new BufferedWriter(new FileWriter("testOutput.txt"));
    writer.write(example);
    writer.close();
  }
  catch (IOException e) {
    e.printStackTrace();
  }
}


}
