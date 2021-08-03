import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int number;
        int number1;
        int result;
        char chr;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Выберайте что будем сделать: (+, -, *, /): ");
        chr = scanner.next().charAt(0);

        System.out.println("Пишите первое число: ");
        number = scanner.nextInt();

        System.out.println("Пишите второе число: ");
        number1 = scanner.nextInt();

        if (chr == '+') {
            result = number + number1;
            System.out.println("Результат: " + result);
        } else if (chr == '-') {
            result = number - number1;
            System.out.println("Результат: " + result);
        } else if (chr == '*') {
            result = number * number1;
            System.out.println("Результат: " + result);
        } else if (chr == '/') {
            result = number / number1;
            System.out.println("Результат: " + result);
        }else{
            System.out.println("Error(:");
        }
    }
}
