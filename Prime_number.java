#Approach 1
  
import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int count = 0;
        for(int i = 1; i <= num; i++){
            if(num % i == 0){
                count += 1;
            }
        }
        if(count == 2){
            System.out.println("PRIME");
        }
        else{
            System.out.println("NOT PRIME");
        }
    }
}

#Approach 2 
import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if(isPrime(num)){
            System.out.println("PRIME");
        }
        else{
            System.out.println("NOT PRIME");
        }
    }
    
    static boolean isPrime(int n){
        if(n <= 1) return false;
        if(n == 2) return true;
        if(n % 2 == 0) return false;
        
        for(int i = 3; i * i <= n; i += 2){
            if(n % i == 0) return false;
    }
    return true;
}
}
