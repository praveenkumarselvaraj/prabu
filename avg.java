import java.util.*;
class avg
{
    public static void main(String arv[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        int sum=0;
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
         for(int i=0;i<n;i++)
        {
            sum+=a[i];
        }
        sum=sum/n;
        System.out.print(sum);
    }
}
