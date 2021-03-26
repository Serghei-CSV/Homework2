package md.java.tekwill.homework.exercise2603;

import java.util.Scanner;


public class Number {
    public static void main(String[] args) {
        System.out.print("Plese enter your name:");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        System.out.println("Hello:"+name );
        System.out.println("Choose a number "+name+": 35/-35");
        String answer = scanner.nextLine();


        if (answer.equals("35"))
            System.out.println("Your number is: Positive");
        else if (answer.equals("-35"))
            System.out.println("Your nomber is: Negative");

    }
}
