import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc =  new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        for(int i = 0; i < n; i++){
            a[i] = sc.nextInt();
        }
        System.out.println(second_Max(a));
    }
    public static int second_Max(int a[]){
        int max = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;
        for(int num:a){
            if(num > max){
                second = max;
                max = num;
            }
            else if(num > second && num != max){
                second = num;
            }
        }
        return second;
    }
}
