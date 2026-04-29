/*Sample Input

2
0 2 10
5 3 5
Sample Output

2 6 14 30 62 126 254 510 1022 2046
8 14 26 50 98 */
import java.util.*;

public class JavaLoopsII {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int q = sc.nextInt(); // number of queries

        while (q-- > 0) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int n = sc.nextInt();

            int sum = a;
            int term = 1; // represents 2^i

            for (int i = 0; i < n; i++) {
                sum += term * b;
                System.out.print(sum + " ");
                term *= 2; // next power of 2
            }
            System.out.println();
        }

        sc.close();
    }
}