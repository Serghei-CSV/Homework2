package md.java.tekwill.homework.exercise0204;

import java.util.Scanner;

public class Speed {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Give me the speed: ");
        int milseH = scan.nextInt();
        System.out.println("Give me the time: ");
        int hour = scan.nextInt();
        int speed;
        System.out.println("Hour\tDistance Traveled\n"+"-------------------------");
        for (int i = 1; i <=hour ; i++){
            speed = milseH * i;
            System.out.println(i + "\t\t\t\t" + speed);
        }
    }
}
