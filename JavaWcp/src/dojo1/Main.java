package dojo1;

import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("名前：");
    String firstName = scanner.next();

    System.out.println("名字：");
    String lastName = scanner.next();

    String name = firstName + " " + lastName;


    System.out.println("名前は" + name + "です。");
  }
}