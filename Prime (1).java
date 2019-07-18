import java.util.*;
class Prime
{
    public static void main(String arv[])
    {
        int count=0;
        Scanner sc=new Scanner(System.in);
       int n=sc.nextInt();
       int n1=sc.nextInt();
        /*for(int i=2;i<num/2;i++)
        {
            if(num%i==0)
            {
                count++;
            }
        }
        if(count==0)
        {
            System.out.print("yes");
        }
        else
        System.out.print("no");*/
        for(int i=n+1;i<n1;i++)
        {
             count=0;
            for(int j=i;j>=1;j--)
            {
                if(i%j==0)
                {
                    count++;
                }
            }
            if(count==2)
            {
                System.out.print(i+" ");
            }
        }
    }
}



