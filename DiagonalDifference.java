/* 3
11 2 4//input    15//output
4 5 6
10 8 -12       */
import java.util.*;
class DiagonalDifference{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[][]=new int[n][n];
        int s1=0;
        int s2=0;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                a[i][j]=sc.nextInt();
            }
        }
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(i==j){
                    s1+=a[i][j];
                }
            }
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(i+j==n-1){
                    s2+=a[i][j];
                }
            }
        }
        if(s1>s2){
            System.out.println(s1=s2);
        }else{
            System.out.println(s2-s1);
        }
    }
}