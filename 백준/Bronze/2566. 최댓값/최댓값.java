import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);



        int [][] arr = new int[9][9];


        for(int i = 0; i <9; i++){
            for(int j = 0; j < 9; j++){
                arr[i][j] = sc.nextInt();
            }
        }
        int max = arr[0][0];
        int a=1;
        int b=1;
        for(int k = 0; k < 9; k++){
            for(int f = 0; f < 9; f++){
                if(max < arr[k][f]){
                    max = arr[k][f];
                    a = k+1;
                    b = f+1;
                }
            }

        }
        System.out.println(max);
        System.out.print(a+" "+b);



    }
}