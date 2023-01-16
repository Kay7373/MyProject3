import java.util.Scanner;

public class Exercise4 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Введите количество элементов массива: ");
        int n = sc.nextInt();
        int [] nums = new int[n];

        for (int i = 0; i < n; i++){
            System.out.println("Введите "+ i + " элемент массива");
            int x = sc.nextInt();
            nums [i] = x;
        }
        System.out.println();
        int l = nums.length;
        System.out.println("Длина массива = "+ l);
        for (int i = 0; i < n; i++){
            System.out.println(i+ "'элемент массива = "+ nums [i]);
        }
    }
}
