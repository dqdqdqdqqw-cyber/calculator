package org.example;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

public class Main {
    static void main() {

        Scanner sc = new Scanner(System.in);
        System.out.print("Введите первое число-> ");
        int firstNumber = sc.nextInt();
        System.out.print("Введите второе число-> ");
        int secondNumber = sc.nextInt();
        System.out.print("Выберите операцию (+, -, *. /) -> ");
        sc.nextLine();
        String oper = sc.nextLine();

        switch (oper) {

            case "+":
                System.out.println(firstNumber + secondNumber);
                break;
            case "-":
                System.out.println(firstNumber - secondNumber);
                break;
            case "/":
                System.out.println(firstNumber / secondNumber);
                break;
            case "*":
                System.out.println(firstNumber * secondNumber);
                break;
            default:
                System.out.println("Error");
        }
    }
}

