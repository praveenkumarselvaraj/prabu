import java.util.*;
class num
{
    public static void main(String arv[])
    {
       Scanner sc=new Scanner(System.in);
       int n=sc.nextInt();
        int a[]=new int[n];
       int sum=0;
          int k=sc.nextInt();
       for(int i=0;i<n;i++)
       {
           a[i]=sc.nextInt();
       }
    
       for(int i=0;i<k;i++)
       {
           sum=sum+a[i];
       }
       System.out.print(sum);
    }
}

