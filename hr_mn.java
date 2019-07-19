import java.util.*;
public class hr_mn {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int n1=0,n2=0;
         n1=n/60;
         n2=n%60;
         System.out.print(n1+" "+n2);
    }
}
