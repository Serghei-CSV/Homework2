package md.java.tekwill.homework.exercise3103;

import java.util.Scanner;

public class SmartHouse {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("1.Bathroom\n" +
                "2.Alarm\n" +
                "3.Heating in the house \n" +
                "4.Music\n" +
                "5.Main door\n" +
                "Choose on of this :");

        int binar = scan.nextInt();
        switch (binar) {
            case (1) -> {
                System.out.println("You are in Bathroom. Choose 0 or 1!");
                int option = scan.nextInt();
                if (option > 0)
                    System.out.println("You torn on the light in Bathroom ");
                else
                    System.out.println("You torn off the light in Bathroom ");
                break;
            }
            case (2) -> {
                System.out.println("You want to sound the Alarm. Choose 0 or 1!");
                int option1 = scan.nextInt();
                if (option1 > 0)
                    System.out.println("You set of the Alarm ");
                else
                    System.out.println("You turned off the Alarm");
                break;
            }
            case (3) -> {
                System.out.println("You want to start Heating the house. Choose 0 or 1!");
                int option2 = scan.nextInt();
                if (option2 > 0)
                    System.out.println("You started Heating the house ");
                else
                    System.out.println("You turned off Heating the house ");
                break;
            }
            case (4) -> {
                System.out.println("You want to listen to music. Choose 0 or 1!");
                int option3 = scan.nextInt();
                if (option3 > 0)
                    System.out.println("You turned on the music ");
                else
                    System.out.println("You turned off the music ");
                break;
            }
            case (5) -> {
                System.out.println("Don't wait for guest anymore? Close the Main door. Choose 0 or 1!");
                int option4 = scan.nextInt();
                if (option4 > 0)
                    System.out.println("You closed the Main door");
                else
                    System.out.println("You opened the Main door ");
                break;

            }


        }
    }
}
