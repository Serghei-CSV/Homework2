package md.java.tekwill.homework.exercise0204;

import java.util.Scanner;

public class SumAllIntegers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter two numbers :");
        int var = scan.nextInt();
        int var2 = scan.nextInt();
        int cif = 0;
        for (int numb = var; numb <= var2; numb++){
            cif += numb;
            System.out.println(numb);
        }
        System.out.println("Product:" +cif);
    }
}
