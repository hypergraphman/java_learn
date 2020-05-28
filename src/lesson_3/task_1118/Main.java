package lesson_3.task_1118;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

import static java.lang.Math.max;
import static java.lang.Math.min;

public class Main {
    void solve(Scanner in, PrintWriter out) {
        int h = in.nextInt();
        int a = in.nextInt();
        int b = in.nextInt();
        int d = a - b;

        out.println(max(1, ((h - a) + d - 1) / d + 1));
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
