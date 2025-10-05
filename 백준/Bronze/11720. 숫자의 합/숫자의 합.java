import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();
        String num = sc.next(); 
        int answer = 0;

        for (int i = 0; i < count; i++) {
            answer += num.charAt(i) - '0'; 
        }

        System.out.println(answer);
    }
}