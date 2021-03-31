package md.java.tekwill.homework.exercise2903;

import java.util.Scanner;

public class SpeedOfSound {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a medium(\"air\", \"water\", \"steel\"):");
        String user = scan.nextLine();
        System.out.println("Enter the distance: ");
        float distance = scan.nextFloat();
        float time = scan.nextFloat();

        if (user.equalsIgnoreCase("air")){
            time = distance / 1100;}
        if (user.equalsIgnoreCase("water")){
            time = distance / 4900;}
        if (user.equalsIgnoreCase("steel")){
            time = distance / 16400;}
        if (time>0) {
            System.out.println("The time soud needs to travel in " + user + "is : " + time);
        }else{
            System.out.println("Error");


        }

    }
}
