
package basiccircle;
import java.util.Scanner;

public class FbonacciSeries {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int n;
        System.out.print("How many number:");
        n=input.nextInt();
        int first=0;
        int second=1;
        int fibo;
        System.out.print(first+" "+second);
        for(int i=3;i<=n;i++){
            fibo=first+second;
            System.out.print(fibo);
            first=second;
            
            second=fibo;
        }
    }
}
