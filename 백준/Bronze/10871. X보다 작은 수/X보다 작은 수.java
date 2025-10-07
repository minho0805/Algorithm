import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int count = sc.nextInt();
        int num = sc.nextInt();
        int[] arr = new int[count];
        for (int i = 0; i < count; i++) {
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i < count; i++) {
            if (arr[i] < num) {
                System.out.print(arr[i] + " ");
            }
        }


    }
}