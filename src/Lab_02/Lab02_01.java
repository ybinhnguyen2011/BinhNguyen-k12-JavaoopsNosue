package Lab_02;

import java.util.Scanner;

public class Lab02_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please input your weight (kg): ");
        float yourWeight = scanner.nextFloat();
        System.out.print("Please input your height (m): ");
        float yourHeight = scanner.nextFloat();
        float BMI = yourWeight / (yourHeight * 2);

        if (BMI <= 18.5f) {
            System.out.println("You are underweight");
        } else if (BMI < 24.9f) {
            System.out.println("You are normal weight");
        } else if (BMI < 29.9f) {
            System.out.println("You are Overweight");
        } else {
            System.out.println("You are Obesity");
        }
    }

}






