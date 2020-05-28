package lesson_3.task_3;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Main {
    void solve(Scanner in, PrintWriter out) {
        long n = in.nextLong();

        out.println(n * n);
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
