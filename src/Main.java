import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите ваши данные:");
        Double num1 = sc.nextDouble();
        Double num2 = sc.nextDouble();

        Singleton result = new Singleton().getInstance();

        System.out.println(result.Calculator(num1,num2));
    }
}