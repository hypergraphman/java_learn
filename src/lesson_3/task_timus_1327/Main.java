package lesson_3.task_timus_1327;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

import static java.lang.Math.max;

public class Main {
    void solve(Scanner in, PrintWriter out) {
        int a = in.nextInt();
        int b = in.nextInt();

        out.println((b - a + 1) / 2 + 1 - ((a * b + 1) % 2));
    }

    void run() {
        try (
                Scanner in = new Scanner(System.in);
                PrintWriter out = new PrintWriter(System.out)
//                Scanner in = new Scanner(new FileReader("INPUT.TXT"));
//                PrintWriter out = new PrintWriter(new FileWriter("OUTPUT.TXT"))
        )
        {
            solve(in, out);
        }
//        catch (IOException e) {
//            throw new Error(e);
//        }
    }

    public static void main(String[] args) {
        new Main().run();
    }
}
