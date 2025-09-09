import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();       // 1) N
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {  // 2) N개 숫자
            arr[i] = sc.nextInt();
        }

        int v = sc.nextInt();       // 3) 찾을 값 V (마지막에 읽기)

        int count = 0;
        for (int x : arr) {
            if (x == v) count++;
        }

        System.out.println(count);
        sc.close();
    }
}