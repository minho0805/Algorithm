import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String c = sc.nextLine();

        if (c.equals("NLCS")) {
            System.out.println("North London Collegiate School");
        }
        else if (c.equals("BHA")) {
            System.out.println("Branksome Hall Asia");
        }
        else if (c.equals("KIS")) {
            System.out.println("Korea International School");
        }
        else if (c.equals("SJA")) {
            System.out.println("St. Johnsbury Academy");
        }

    }
}