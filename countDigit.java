import java.util.*;
public class MyClass {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int rem=0;
        int val = 0;
        while(n>0){
            rem = n%10;
            val+=rem;
            n = n/10;
        }
        System.out.print(val);
    }
}
