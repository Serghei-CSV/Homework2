package md.java.tekwill.homework.exercise2603;

import java.util.Scanner;

public class Animals{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Choose an animal: ");
        String name = scanner.nextLine();

        if (name.contains("Wolf"))
            System.out.println("Howwwwwww");
        if (name.contains("Sheep"))
            System.out.println("Baaaaaaaa");
        if (name.contains("Cow"))
            System.out.println("Muuuuuuuuuu");
    }
}
