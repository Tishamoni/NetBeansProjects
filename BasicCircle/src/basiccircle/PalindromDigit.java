
package basiccircle;
import java.util.Scanner;
public class PalindromDigit {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int sum=0,r,temp,num;
        System.out.print("Enter any number:");
        num=input.nextInt();
        
        temp=num;
        
        while(temp!=0)
                {
                   r=temp%10 ;
                   sum=sum*10+r;
                   temp=temp/10;
                }
        
    
    if (sum==num){
    System.out.println("palindrom");
}
    else{
     System.out.println("not palindrom");
}
}
}