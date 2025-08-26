public class Main {
    public static void main(String[] args) {
        String str1 = "ABAB";
        String str2 = "AB";

        int length = GCD(str1, str2);
        if (length == 0) {
            System.out.println("");
        } else {
            System.out.println(str1.substring(0, length));
        }
    }

    public static int GCD(String s1, String s2) {
        if (!(s1 + s2).equals(s2 + s1)) {
            return 0; // Return 0 if no common divisor string exists
        }

        int a = s1.length(); // 6
        int b = s2.length(); // 3

        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}
