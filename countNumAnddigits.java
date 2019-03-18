import java.util.*;
public class MyClass {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int count1 = 0,count2 = 0;
        for(int i=0;i<s.length();i++){
            if(Character.isLetter(s.charAt(i))) count1++;
            if(Character.isDigit(s.charAt(i)))  count2++;
        }
        if(count1!=0 && count2!=0) System.out.println("yes");
            else System.out.println("no");
        
    }
}
