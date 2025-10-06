import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char c = sc.nextLine().charAt(0);
        if (c == 'M') {
            System.out.println("MatKor");
        }
        else if (c == 'W') {
            System.out.println("WiCys");
        }
        else if (c == 'C') {
            System.out.println("CyKor");
        }
        else if (c == 'A') {
            System.out.println("AlKor");
        }
        else if (c == '$') {
            System.out.println("$clear");
        }
    }
}