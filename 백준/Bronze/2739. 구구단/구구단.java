import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 단 입력받기
        int n = sc.nextInt();

        // 구구단 출력
        for (int i = 1; i < 10; i++) {
            System.out.println(n + " * " + i + " = " + (n * i));
        }

        sc.close();
    }
}