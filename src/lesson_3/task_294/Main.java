package lesson_3.task_294;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

import static java.lang.Math.min;

public class Main {
    void solve(Scanner in, PrintWriter out) {
        int n_bolts = in.nextInt();
        int pr_bolts = in.nextInt();
        int cost_bolt = in.nextInt();
        int n_nuts = in.nextInt();
        int pr_nuts = in.nextInt();
        int cost_nut = in.nextInt();
        int all = n_bolts * cost_bolt + n_nuts * cost_nut;
        int cur_bolts = n_bolts - n_bolts / 100 * pr_bolts;
        int cur_nuts = n_nuts - n_nuts / 100 * pr_nuts;
        int cur_pair = min(cur_bolts, cur_nuts);
        int current = cur_pair * (cost_bolt + cost_nut);

        out.println(all - current);
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
