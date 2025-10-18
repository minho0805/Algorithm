import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();

        int[] arr = new int[N]; // 기본 0으로 초기화

        for (int z = 0; z < M; z++) {
            int i = sc.nextInt(); // 1-based
            int j = sc.nextInt(); // 1-based
            int k = sc.nextInt();

            Arrays.fill(arr, i - 1, j, k);
        }
        StringBuilder sb = new StringBuilder();
        for (int idx = 0; idx < N; idx++) {
            if (idx > 0) sb.append(' ');
            sb.append(arr[idx]);
        }
        System.out.println(sb);
    }
}