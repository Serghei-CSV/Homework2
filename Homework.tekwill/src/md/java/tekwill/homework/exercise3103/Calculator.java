package md.java.tekwill.homework.exercise3103;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Choose a operation:'+' or '-' or '*' or '/' ");
        String user = scan.nextLine();
        System.out.println("Give a number: ");
        int number = scan.nextInt();
        int number1 = scan.nextInt();
        double result = 0;

        switch (user) {
            case "+":
                result = number + number1;
                System.out.println("The result is: " + result);
                break;
            case "-":
                result = number - number1;
                System.out.println("The result is: " + result);
                break;
            case "*":
                result = number * number1;
                System.out.println("The result is: " + result);
                break;
            case "/":
                result = number / number1;
                System.out.println("The result is: " + result);
                break;
        }

    }


}

