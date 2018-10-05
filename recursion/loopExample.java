//loopExample.java

public class loopExample {

  public static long factorial(int num) {
    if (num >= 2) {
      return num * factorial(num-1);
    }
    else {
      return 1;
    }
  }

  public static void main(String[] args) {

    System.out.println(factorial(27));

    //Example #2
    int sum = 0;
    int x = 4;
    int y = 8;
    for (int i = x; i <= y; i++) {
      sum = sum +i;
    }
    System.out.println(sum);

    //Example #5
    x = 18;
    long product = 1;
    for (int i = 1; i <= x; i++) {
      product = product * i;
    }
    System.out.println(product);







  }
}
