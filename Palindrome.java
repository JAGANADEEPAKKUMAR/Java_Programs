import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if(isPalindrome(num)){
            System.out.println("PALINDROME");
        }
        else{
                System.out.println("NOT A PALINDROME");
        }
    }
    public static boolean isPalindrome(int n){
        int temp = n;
        int rem,rev = 0;
        while(n > 0){
            rem = n % 10;
            rev = rev * 10 + rem;
            n = n / 10;
        }
        return temp == rev;
    }
}
