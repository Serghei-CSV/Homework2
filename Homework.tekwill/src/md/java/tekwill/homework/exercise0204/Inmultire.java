package md.java.tekwill.homework.exercise0204;

import java.util.Scanner;

public class Inmultire {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Give a number: ");
        int var = scan.nextInt();
        System.out.println("Give a range: ");
        int var1 = scan.nextInt();
        for (int i = 1; i <= var1 ; i++){
            System.out.println(var + "x" + i + "=" +(var * i));
        }

    }
}
