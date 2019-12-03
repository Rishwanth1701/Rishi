public class P217 {
    public static void main(String[] args) {
        int n = 1234, r = 0;
        while(n != 0) {
            int digit = n % 10;
            r = r * 10 + digit;
            n/= 10;
        }
        System.out.println("Reversed Number: " + r);
    }
}