/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package calculator;

/**
 *
 * @author IT_Abdullah
 */
import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("=== Calculator Java ===");
        System.out.print("Enter FIrst Number : ");
        double num1 = scanner.nextDouble();
        
        System.out.print("Enter the operation: (+, -, *, /): ");
        char operator = scanner.next().charAt(0);
        
        System.out.print("Enter Second Number: ");
        double num2 = scanner.nextDouble();
        
        double result;

        switch (operator) {
            case '+': result = num1 + num2; break;
            case '-': result = num1 - num2; break;
            case '*': result = num1 * num2; break;
            case '/': 
                if (num2 == 0) {
                    System.out.println("Error : Cannot be devided by Zero");
                    return;
                }
                result = num1 / num2; 
                break;
            default:
                System.out.println("Invalid Calculating");
                return;
        }

        System.out.println("النتيجة: " + result);
        scanner.close();
    }
}
