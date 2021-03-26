package md.java.tekwill.homework.exercise2603;

import java.util.Scanner;

public class Biggest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("First number:");
        int firstnumber = scanner.nextInt();

        Scanner scanner1 = new Scanner(System.in);
        System.out.println("Second number:");
        int secondnumber = scanner.nextInt();

        Scanner scanner2 = new Scanner(System.in);
        System.out.println("Third number:");
        int thirdnumber = scanner.nextInt();

        if (firstnumber > secondnumber)
            if (firstnumber > thirdnumber)
                System.out.println("The biggest: "+firstnumber);
            if (secondnumber > firstnumber)
                if (secondnumber > thirdnumber)
                    System.out.println("The biggest: "+secondnumber);
                if (thirdnumber > firstnumber)
                    if (thirdnumber > secondnumber)
                        System.out.println("The biggest: "+thirdnumber);





    }
}
