import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();

        for (int i = 0; i < count; i++) {
            String s = sc.next();
            int length = s.length()-1;
            System.out.println(s.charAt(0)+""+s.charAt(length));

        }
    }
}