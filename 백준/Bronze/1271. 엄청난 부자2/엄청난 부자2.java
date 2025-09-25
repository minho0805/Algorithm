import java.util.*;
import java.math.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        BigInteger n = sc.nextBigInteger(); // 가진 돈
        BigInteger m = sc.nextBigInteger(); // 생명체 수

        System.out.println(n.divide(m));    // 몫
        System.out.println(n.remainder(m)); // 나머지
    }
}