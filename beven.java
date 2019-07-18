import java.util.*;
class beven
{
    public static void main(String arv[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int n1=sc.nextInt();
        for(int i=n+1;i<n1;i++)
        {
            if(i%2==0)
            {
                System.out.print(i+" ");
            }
        }
    }
}

