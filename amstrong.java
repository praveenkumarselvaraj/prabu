import java.util.*;
import java.math.*;
class amstrong
{
    public static void main(String arv[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int n2=n;
        int rem,sum=0;
        String s=String.valueOf(n);
        int l=s.length();
        while(n>0)
        {
            rem=n%10;
            sum+=Math.pow(rem,l);
            n=n/10;
        }
        if(n2==sum)
        {
            System.out.print("yes");
        }
        else
        System.out.print("no");
    }
}
