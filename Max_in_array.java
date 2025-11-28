import java.util.*;

public class Largest{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        int Max = 0;
        for(int i = 0;i < n; i++){
            a[i] = sc.nextInt();
            if(Max < a[i]){
                Max = a[i];
            }
        }
        System.out.println(Max);
    }
}
