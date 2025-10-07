import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[6];
        int[] answer = new int[]{1,1,2,2,2,8};
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != answer[i]) {
                System.out.print(answer[i]-arr[i]+" ");
            }
            else {
                System.out.print(0+" ");
            }
        }


    }
}