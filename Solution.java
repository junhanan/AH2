import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        int numb;
        int remainder;
        boolean isPrime = true;

        Scanner console = new Scanner(System.in);

        System.out.print("Enter a number: ");
        numb = console.nextInt();

        for(int i=2; i<=numb/2; i++) {
            remainder = numb % i;
            if(remainder == 0) {
                isPrime = false;
                break;
            }
        }  
        System.out.print(isPrime);

    }
}