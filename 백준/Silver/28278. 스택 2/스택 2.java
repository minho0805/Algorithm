import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        Stack<Integer> s = new Stack<>();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {
            String[] parts = br.readLine().split(" ");
            int a = Integer.parseInt(parts[0]);
            if (a == 1) {
                int b = Integer.parseInt(parts[1]);
                s.push(b);
            }
            else if (a == 2) {
                if (!s.isEmpty()) {
                    bw.write(String.valueOf(s.peek()));
                    s.pop();
                    bw.newLine();
                }
                else {
                    bw.write("-1");
                    bw.newLine();
                }
            }
            else if (a == 3) {
                bw.write(String.valueOf(s.size()));
                bw.newLine();
            }
            else if (a == 4) {
                if (!s.isEmpty()) {
                    bw.write("0");
                    bw.newLine();
                }
                else {
                    bw.write("1");
                    bw.newLine();
                }
            }
            else if (a == 5) {
                if (!s.isEmpty()) {
                    bw.write(String.valueOf(s.peek()));
                    bw.newLine();
                }
                else {
                    bw.write("-1");
                    bw.newLine();
                }
            }

        }

        bw.flush();
        bw.close();
        br.close();
    }
}