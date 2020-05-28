package lesson_3.task_263;

import java.io.*;
import java.util.*;

public class Main {
    void solve(Scanner in, PrintWriter out) {
        int n = in.nextInt();
        int i = in.nextInt();
        int j = in.nextInt();
        int n1 = Math.min(i, j);
        int n2 = Math.max(i, j);

        out.println(Math.min(n2 - n1 - 1, n1 + n - n2 - 1));
    }

    void run() {
        try (
//                Scanner in = new Scanner(System.in);
//                PrintWriter out = new PrintWriter(System.out)
                Scanner in = new Scanner(new FileReader("INPUT.TXT"));
                PrintWriter out = new PrintWriter(new FileWriter("OUTPUT.TXT"))
        )
        {
            solve(in, out);
        } catch (IOException e) {
            throw new Error(e);
        }
    }

    public static void main(String[] args) {
        new Main().run();
    }
}
