package lesson_3.task_21;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Main {
    void solve(Scanner in, PrintWriter out) {
        int w1 = in.nextInt();
        int w2 = in.nextInt();
        int w3 = in.nextInt();
        int maxw = Math.max(Math.max(w1, w2), w3);
        int minw = Math.min(Math.min(w1, w2), w3);

        out.println(maxw - minw);
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
