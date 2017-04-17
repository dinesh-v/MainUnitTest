import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        Scanner in = new Scanner(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        Solution solution = new Solution();
        solution.solve(in, out);
        out.close();
    }

    static class Solution {
        void solve(Scanner in, PrintWriter out) {
            int T = Integer.parseInt(in.nextLine());
            for (int i = 0; i < T; i++) {
                String[] firstDish = in.nextLine().split(" ");
                String secondDish = in.nextLine();
                int similar = 0;
                for (String currentItem : firstDish) {
                    if (secondDish.contains(currentItem)) {
                        ++similar;
                    }
                }
                if (similar >= 2) {
                    out.println("similar");
                } else {
                    out.println("dissimilar");
                }
            }
        }
    }
}


