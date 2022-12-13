package Lab_02;

import java.util.Scanner;

public class Lab02_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please input your weight (kg): ");
        double YourWeight = scanner.nextFloat();
        System.out.print("Please input your height (m): ");
        double YourHeight = scanner.nextFloat();
        double BMI = YourWeight / (YourHeight * 2);

        if (BMI <= 18.5) {
            System.out.println("You are underweight");
        } else if (BMI < 24.9) {
            System.out.println("You are normal weight");
        } else if (BMI < 29.9) {
            System.out.println("You are Overweight");
        } else {
            System.out.println("You are Obesity");
        }
    }

}






