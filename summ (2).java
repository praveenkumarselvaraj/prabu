import java.util.*;
class summ
{
    public static void main(String arv[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        //int n1=sc.nextInt();
        int rem,sum=0;
        while(n>0)
        {
            rem=n%10;
            sum+=rem;
            n/=10;
        }
        System.out.print(sum);
    }
}

