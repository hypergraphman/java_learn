package lesson_3.task_685;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Main {
    void solve(Scanner in, PrintWriter out) {
        int cost1 = in.nextInt();
        int cost2 = in.nextInt();
        int cost3 = in.nextInt();
        int v1 = in.nextInt();
        int v2 = in.nextInt();
        int v3 = in.nextInt();
        int maxCost = Math.max(Math.max(cost1, cost2), cost3);
        int minCost = Math.min(Math.min(cost1, cost2), cost3);
        int midCost = cost1 + cost2 + cost3 - maxCost - minCost;
        int maxV = Math.max(Math.max(v1, v2), v3);
        int minV = Math.min(Math.min(v1, v2), v3);
        int midV = v1 + v2 + v3 - maxV - minV;

        out.println(maxCost * maxV + minCost * minV + midCost * midV);
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
