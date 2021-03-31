package md.java.tekwill.homework.exercise3103;

import  java.util.Scanner;

public class ZileDeLuni {
    public static void main(String[] args){
     Scanner scan = new Scanner (System.in);
        System.out.println("Give a number to mouth: ");
        int mouth = scan.nextInt();

        switch (mouth){
            case (1):
            case (3):
            case (5):
            case (7):
            case (9):
            case (11):
                System.out.println("Mouths with 31 days");
                break;
            case (4):
            case (6):
            case (8):
            case (10):
            case (12):
                System.out.println("Mouths with 30 days");
                break;
            case (2):
                System.out.println("Mouths with 28 or 29 days");
                break;

        }
    }
}
