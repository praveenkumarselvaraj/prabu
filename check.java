import java.util.*;
import java.math.*;
class check
{
    public static void main(String arv[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int n1=sc.nextInt();
        int ar[]=new int[n];
        int c=0;
        for(int i=0;i<n;i++)
        {
            ar[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++)
        {
            if(ar[i]==n1)
            {
               c++;
            }
            
        }
        if(c>0)
        System.out.print("yes");
        else
             System.out.print("no");
    }
}

