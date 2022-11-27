public class ThreeNumbers {
    public static int maxSum(int A, int B, int C) {
    // code here
    int M = 0, xor = 0, i = 31;
    M = Math.max(A,Math.max(B, C));
    for(;i>=0 && (M& (1<<i))==0; i--);
    for(i=0; i--) {
    if(calc(A, B, C, i)<=1) { xor |= 1<<i;
    }
    }
    int ans = (A^xor)+(B^xor)+(C^xor);
    return ans;

    public static int calc(int A, int B, int C, int i) {
    int a = (A& (1<<i))>0 ? 1 : 0;
    int b
    int c =
    (B& (1<<i))>0 ? 1 : 0;
    (C& (1<<i))>0 ? 1 : 0;
    int t= a+b+c;
    return t;
    }
}