public class Demo {
    public static void main(String[] args) {
        String s = "iamamanpandey";
        System.out.println(s.substring(0, 6));
        System.out.println("Welcome to Java Programming.");
        System.out.println(countDistinct("abbbccd", 7));
    }

    public static int countDistinct(String s, int len) {
        int count = 1;
        for (int i = 1; i < len; i++) {
            if (s.charAt(i) != s.charAt(i - 1))
                count++;
        }
        return count;
    }
}