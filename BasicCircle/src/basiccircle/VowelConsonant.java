
package basiccircle;
import java.util.Scanner;

public class VowelConsonant {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        char ch;
        System.out.print("Enter character:");
        ch=input.next().charAt(0);
        if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u')
        {
            System.out.println("The character is vowel");
        }
        
            else{
                    System.out.println("The character is consonant");
                    }
        
        
    } 
}
