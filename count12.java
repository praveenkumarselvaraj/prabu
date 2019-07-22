import java.util.*;
class count12
{
    public static void main(String arv[])
    {
       Scanner sc=new Scanner(System.in);
       int n=sc.nextInt();
       int count=0,rem;
        while(n>0)
        {
            rem=n%10;
            n/=10;
            count++;
        }
       System.out.print(count);
    }
}


