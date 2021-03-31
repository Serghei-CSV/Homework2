package md.java.tekwill.homework.exercise3103;

import java.util.Scanner;

public class ZileDeSaptamina {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Give a number of day (from 1 to 7): ");
        int day = scan.nextInt();

        switch (day) {
            case (1):
                System.out.println("This day is Monday");
                break;
            case (2):
                System.out.println("This day is Tuesday");
                break;
            case (3):
                System.out.println("This day is Wednesday");
                break;
            case (4):
                System.out.println("This day is Thursday");
                break;
            case (5):
                System.out.println("This day is Firday");
                break;
            case (6):
                System.out.println("This day is Saturday");
                break;
            case (7):
                System.out.println("This day is Sunday");
                break;
            default:
                System.out.println("ERROR!!!! Choose from the proposed numbers");
        }
    }
}
