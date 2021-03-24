package md.tekwill.homework2003;

 import java.util.Scanner;

public class Temperatura {
    public static void main(String[] args) {

        double convertor;

        Scanner scan = new Scanner(System.in);
        System.out.println("Fahrenherit:");

        double celsius =scan.nextDouble();
        convertor = (celsius - 32 ) / 1.8;
        System.out.println("Celsius:"+convertor);



    }

}