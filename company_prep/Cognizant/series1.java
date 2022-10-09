import java.util.Scanner;

public class series1{
    public static void series(int a, int b, int n){
        int sum = 0;
        for(int i = 0; i < n; i++) {
            sum = a;
            for(int j = 0; j <= i; j++)
                sum += Math.pow(2, j)*b;    
            System.out.print(sum + " ");
        }
        System.out.println();
    }

    public static void main(String args[]){
        int t, a, b, n;
        Scanner sc = new Scanner(System.in);
        t = sc.nextInt();
        
        // getting the values of a,b,n for t times
        for(int i = 1; i <= t; i++){
            a = sc.nextInt();
            b = sc.nextInt();
            n = sc.nextInt();

            // printing the series
            series(a, b, n);
        }
    }
}