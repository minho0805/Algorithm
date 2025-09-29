import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        Stack<Integer> s = new Stack<>();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        int sum = 0;

        for (int i = 0; i < n; i++) {
            int a = Integer.parseInt(br.readLine());
            if (a == 0) {
                s.pop();
            }
            else {
                s.push(a);
            }
        }
        for (int number : s) {
            sum += number;
        }
        bw.write(String.valueOf(sum));

        bw.flush();
        bw.close();
        br.close();
    }
}