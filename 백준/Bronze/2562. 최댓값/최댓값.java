import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[9];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        int maxnum = arr[0];
        int idx=0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]>maxnum){
                maxnum = arr[i];
            }
        }
        for(int j=0;j<arr.length;j++){
            if(arr[j]==maxnum){
                idx = j;
            }
        }
        System.out.println(maxnum);
        System.out.println(idx+1);


    }
}