import java.util.Scanner;

public class StrGCD {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
		String s1 = sc.nextLine();
        String s2 = sc.nextLine();
        System.out.println(gcdStr(s1, s2)); 
		//System.out.println(gcd(6, 4)); 
    }

    private static String gcdStr(String s1, String s2) {
        String res = "";
        int len = Math.min(s1.length(), s2.length());

        for (int i = 0; i < len; i++) {
            if (s1.charAt(i) != s2.charAt(i))
                break;
            res += s1.charAt(i);
        }
		int lenGcd = gcd(s1.length(), s2.length());
        return res.substring(0, Math.min(lenGcd, res.length()));
    }
    
    public static int gcd(int a, int b) {
    	int divisor = a>b ? b : a;
    	int dividend = a>b ? a : b;
    	int rem = dividend%divisor;
    	
    	while(rem > 0) {
			dividend = divisor;
			divisor = rem;			
			rem = dividend%divisor;
    	}
    	return divisor;
    }
}
