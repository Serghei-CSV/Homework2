package md.java.tekwill.homework.exercise0204;

import java.util.Scanner;

public class ZeroStop {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number:");
        int var = scan.nextInt();
        int sum = 0;
        for (int i = 0; var != 0; i++ ){
            sum = var + sum;
            System.out.println("Sum all numbers:" + sum + "\n");
            System.out.println("Give a number:" );
            var = scan.nextInt();


        }
    }
}
