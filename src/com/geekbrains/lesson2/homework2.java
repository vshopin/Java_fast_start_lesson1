package com.geekbrains.lesson2;

import java.util.Scanner;

public class homework2 {
    public static void main(String[] args) {
        System.out.println("Введите операцию:");
        System.out.println("1. Сложение");
        System.out.println("2. Вычитание");
        System.out.println("3. Умножение");
        System.out.println("4. Умножение");
        Scanner scanner = new Scanner(System.in);
        int operation = scanner.nextInt();
        System.out.println("Введите первое число");
        int a = scanner.nextInt();
        System.out.println("Введите второе число");
        int b = scanner.nextInt();
        int result = 0;
            if (operation == 1) {
                result = a + b;
            } else if (operation == 2) {
                result = a - b;
            } else if (operation == 3) {
                result = a * b;
            } else if (operation == 4) {
                if (b == 0) {
                    System.out.println("Деление на ноль!");
                } else {
                    result = a / b;
                }
            }
        System.out.println("Результат = " + result);
    }
}
