package java3;

import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("何人分の情報を入力しますか：");
    int number = scanner.nextInt();
    for(int i = 0; i < number; i++){
      System.out.println(i + 1 + "人目");

      System.out.println("名前：");
      String firstName = scanner.next();

      System.out.println("名字：");
      String lastName = scanner.next();

      System.out.println("年齢：");
      int age = scanner.nextInt();

      System.out.println("身長(m)：");
      double height = scanner.nextDouble();

      System.out.println("体重(kg)：");
      double weight = scanner.nextDouble();



      Person.printData(firstName, lastName, age, height, weight);
    }

  }


}

