package md.tekwill.homework2003;

import java.util.Scanner;

public class Distanta {
    public static void main(String[] args) {
        double convert;

        Scanner metri = new Scanner(System.in);
        System.out.println("Metri:");
        double metru = metri.nextDouble();

        Scanner hour = new Scanner(System.in);
        System.out.println("Hours:");
        int h = hour.nextInt();

        Scanner minute = new Scanner(System.in);
        System.out.println("Minutes:");
        int min = minute.nextInt();

        Scanner second = new Scanner(System.in);
        System.out.println("Seconds:");
        int sec = second.nextInt();

        int sumOfSeconds;

        sumOfSeconds = sec+(min*60)+(h*3600);
        double convertMetriPerSecond;

        convertMetriPerSecond = metru / sumOfSeconds;
        System.out.println("m/s:"+convertMetriPerSecond);

        double convertKmPerHour;
        convertKmPerHour = convertMetriPerSecond * 3.6;
        System.out.println("km/h:"+convertKmPerHour);

        double convertMilesPerHour;
        convertMilesPerHour = convertMetriPerSecond * 2.236936;
        System.out.println("miles/h:"+convertMilesPerHour);



    }

}
