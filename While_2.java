import java.util.Scanner;

public class While_2 {

    public static void main(String[] args) {
        System.out.print("Введите число которое нужно возвести в степень");
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        System.out.print("Введите степень в которую нужно возвести число");
        int n = sc.nextInt();

        int result = 1;
        int i = 1;
        while (i <= n) {
            result = result * x;
            i++;
        }

        System.out.println(result);
        sc.close();
    }

}