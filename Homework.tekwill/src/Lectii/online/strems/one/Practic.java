package Lectii.online.strems.one;

import java.util.Scanner;

public class Practic {
    public static void main(String[] args) {
        System.out.println("Please enter your name:");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        System.out.println("Hello:"+name);
        System.out.println("How are you:"+ name + "?");
        String answer = scanner.nextLine();

        if (answer.contains("fine"))
            System.out.println("Fine! It means you can continue with your Java lessons for a little bit longer!");
        else if (answer.contains("great"))
            System.out.println("Great! It means you can continue with your Java lessons another moth!");
        else if (answer.contains("bad"))
            System.out.println("Ouch! That's not good! You must replenish your batteries befor continuing with this cours.");
        else
            System.out.println("Oopsy daisy! I don't know how to react to this. ");
    }
}
