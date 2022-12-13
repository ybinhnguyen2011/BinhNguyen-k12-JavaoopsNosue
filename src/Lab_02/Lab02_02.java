package Lab_02;

import java.util.Scanner;

public class Lab02_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please input number: ");
        int myNum = scanner.nextInt();

        if (myNum%2 ==0){
            System.out.print("It is even number!");
        } else {
            System.out.print("It is odd number!");

        }
    }
}

