import java.util.Scanner;
public class ReverseNumber {
    public static int reverse(int n) {
        int rev = 0;
        int last = 0;
        while (n != 0) {
            last = n % 10;
            rev = rev * 10 + last;
            n = n / 10;
        }
        return rev;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = scan.nextInt();
        int result = reverse(n);
        System.out.println("Reversed Number: " + result);
    }
}
