package md.java.tekwill.homework.exercise2003;

import java.util.Scanner;

public class Temperatura {
    public static void main(String[] args) {

        double convertor;

        Scanner scan = new Scanner(System.in);
        System.out.println("Fahrenheit:");

        double celsius =scan.nextDouble();
        convertor = (celsius - 32 ) / 1.8;
        System.out.println("Rezultatul:"+convertor);



    }

}