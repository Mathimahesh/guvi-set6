import java.util.*;
public class MyClass {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int rem=0;
        String val = "";
        while(n>0){
            rem = n%10;
            val+=rem;
            n = n/10;
        }
        for(int i=val.length()-1;i>=0;i--)
        System.out.print(val.charAt(i)+" ");
    }
}
