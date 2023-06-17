package views;

import model.calculator.CanCalculate;
import model.ComplexNumber;
import model.calculator.ICanCalculateFactory;

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
            System.out.print("Операция (+,*,-,/,=) : ");
            String input = scanner.nextLine().toLowerCase();
            switch (input) {
                case "+":
                    canCalculate.sum(getArgument());
                    break;
                case "*":
                    canCalculate.multiply(getArgument());
                    break;
                case "-":
                    canCalculate.subtract(getArgument());
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

    private ComplexNumber getArgument() {
        System.out.print("Введите комплексное число: ");
        String input = scanner.nextLine();
        while (!input.matches("^[\\d]+\\+[\\d]+[i]$")) {
            System.out.print(input + " - не комплексное число, введите комплексное число: ");
            input = scanner.nextLine();
        }
        String[] arrayStr = input.split("\\+");
        String a = arrayStr[0];
        String b = arrayStr[1].split("[i]")[0];
        return new ComplexNumber(Integer.parseInt(a), Integer.parseInt(b));
    }
}
