package md.java.tekwill.homework.exercise3103;

import java.util.Scanner;
import java.util.SortedMap;

public class PressKey {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Get a key a,b,c,d,e,f,g,h or i: ");
        String alphabetKey = scan.nextLine();

        switch (alphabetKey) {
            case "a":
                System.out.println("You pressed 'a' ");
                break;
            case "b":
                System.out.println("You pressed 'b' ");
                break;
            case "c":
                System.out.println("You pressed 'c' ");
                break;
            case "d":
                System.out.println("You pressed 'd' ");
                break;
            case "e":
                System.out.println("You pressed 'e' ");
                break;
            case "f":
                System.out.println("You pressed 'f' ");
                break;
            case "g":
                System.out.println("You pressed 'g' ");
                break;
            case "h":
                System.out.println("You pressed 'h' ");
                break;
            case "i":
                System.out.println("You pressed 'i' ");
                break;
        }
    }
}
