import java.util.Scanner;
public class Reversestring{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String A=sc.nextLine().trim();
        String B=new
        StringBuilder(A).reverse().toString();
        if(A.equals(B))
        {
        System.out.println("Yes");
        }
        else
        {
        System.out.println("No");
        }
    }
}
