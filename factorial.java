import java.util.*;
import java.math.*;
class factorial
{
    public static void main(String arv[])
    {
        Scanner sc=new Scanner(System.in);
        int n1=sc.nextInt();
        int fact=1;
        for(int i=1;i<=n1;i++)
        {
            fact=fact*i;
        }
        System.out.print(fact);
    }
}

