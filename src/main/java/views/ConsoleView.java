package views;

import model.CanCalculate;
import model.CanCalculateFactory;
import model.ICanCalculateFactory;

import java.util.Scanner;

public class ConsoleView {
    private final Scanner scanner = new Scanner(System.in);

    private final ICanCalculateFactory iCanCalculateFactory;

    public ConsoleView(ICanCalculateFactory iCanCalculateFactory) {
        this.iCanCalculateFactory = iCanCalculateFactory;
    }

    public void run() {
        System.out.println("Калькулятор комплексных чисел.");
        CanCalculate canCalculate = iCanCalculateFactory.create(getArgument());
        while (true) {
            System.out.print("Операция (+,*,/,=) : ");
            String input = scanner.nextLine().toLowerCase();
            switch (input) {
                case "+":
                    canCalculate.sum(getArgument());
                    break;
                case "*":
                    canCalculate.multiply(getArgument());
                    break;
                case "/":
                    canCalculate.divide(getArgument());
                    break;
                case "=":
                    System.out.println("Результат: " + canCalculate.result());
                    System.out.print("Продолжить y/n: ");
                    String nextCircle = scanner.nextLine().toLowerCase();
                    if (nextCircle.equals("n")) {
                        return;
                    } else {
                        canCalculate = iCanCalculateFactory.create(getArgument());
                    }
                    break;
                default:
                    System.out.println(input + " - операция не поддерживается");
            }
        }
    }

    private int getArgument() {
        System.out.print("Введите число: ");
        String input = scanner.nextLine();
        while (!input.matches("^[\\d]+$")) {
            System.out.print(input + " - не число, введите число: ");
            input = scanner.nextLine();
        }
        return Integer.parseInt(input);
    }
}
