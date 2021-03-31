package md.java.tekwill.homework.exercise2903;

import java.util.Scanner;

public class Abonament {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please choose pakage(A,B or C): ");
        String userPackage = scan.nextLine();
        System.out.println("How long have you been using the internet: ");
        float userHour = scan.nextFloat();
        float billPrice = 0;

        if (userHour > 0){
            if(userPackage.equalsIgnoreCase("A")) {
                billPrice = userHour <= 10
                        ? 9.95F
                        : 9.95F + ((userHour - 10) * 2);
            }else if (userHour > 0){
                if (userPackage.equalsIgnoreCase("B")) {
                    billPrice = userHour <= 20
                            ? 13.95F
                            : 13.95F + ((userHour - 20) * 1);
                }else if (userPackage.equalsIgnoreCase("C")) {
                    billPrice = 19.95F;
                }
                }
            if (billPrice > 0){
                System.out.println("Total charges "+ userPackage + "is:" + billPrice );
            }
        }


    }
}
