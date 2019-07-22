import java.util.*;
import java.math.*;
class odev
{
    public static void main(String arv[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int n1=sc.nextInt();
        int n2=Math.abs(n-n1);
        if(n2%2==0)
        {
        System.out.print("even");
        }
        else
         System.out.print("odd");
    }
}



