package md.java.tekwill.homework.exercise2603;

import java.util.Scanner;

public class Note {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Choose a letter: ");
        String name = scanner.nextLine();

        if (name.contains("A"))
            System.out.println("The numeric value for grade A is 4");
        else if (name.contains("B"))
            System.out.println("The numeric value for grade B is 3");
        else if (name.contains("C"))
            System.out.println("The numeric value for grade C is 2");
        else if (name.contains("D"))
            System.out.println("The numeric value for grade D is 1");
        else if (name.contains("E"))
            System.out.println("The numeric value for grade E is 0");
        else
            System.out.println(name + " " + " is an invalid grade");


    }
}
