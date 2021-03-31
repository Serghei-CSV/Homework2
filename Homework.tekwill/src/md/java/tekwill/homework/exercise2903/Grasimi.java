package md.java.tekwill.homework.exercise2903;

import java.util.Scanner;

public class Grasimi {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Fat: ");
        int GetFat = scan.nextInt();
        System.out.print("Calories: ");
        double GetCalories = scan.nextDouble();
        double CaloriesForFat;
        CaloriesForFat = GetFat * 9 * GetCalories;
        System.out.println("Calories for fat: " +CaloriesForFat);
        double ProcentOfCalories;
        ProcentOfCalories = CaloriesForFat / GetFat;
        System.out.println("Procent of calories: "+ ProcentOfCalories);
        if (ProcentOfCalories<30)
            System.out.println("This food are low in fat:");

    }
}
