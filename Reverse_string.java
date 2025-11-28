import java.util.*;

public class Reverse{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String reversed = "";
        for(int i = s.length() - 1; i >= 0; i--){
            reversed += s.charAt(i);
        }
        System.out.println("Reversed String = "+ reversed);
    }
}

#Approach 2

import java.util.*;

public class Reverse{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        StringBuilder sb = new StringBuilder(s);
        String reversed = sb.reverse().toString();
        System.out.println(reversed);
}
}
