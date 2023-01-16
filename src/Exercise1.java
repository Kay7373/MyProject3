import java.util.Scanner;

public class Exercise1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите первое число: ");
        double num1 = sc.nextDouble();

        System.out.println("Введите второе число: ");
        double num2 = sc.nextDouble();

        if (Math.abs(num1) > Math.abs(num2)) {
            double rez = num1 / 2;
            System.out.println("Первое число деленное на два: "+rez);
        }
        else {
            System.out.println("Второе число больше первого по абсолютной величине");
        }
    }
}
