import java.util.Scanner;

public class Plotting {
    public int StreetPlannig(int input1) {
        int x[] = new int[100]
        x[0] = 0;
        x[1] = 1;
        x[2] = 1;
        int y[] = new int[100];
        y[0] = 0;
        y[1] = 1;
        y[2] = 2;
        for (int i = 3; i <= input1; i++) {
            x[i] += y[i - 1];
            y[i] += x[i - 1] + y[i - 1];
        }
        int result = x[input1] + y[input1];
        return result * result;
    }

    public static void main(String[] args) {
        int n;
        Plotting p = new Plotting();
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        System.out.println(p.StreetPlannig(n));
    }
}