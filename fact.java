import java.util.*;
import java.math.*;
class fact
{
    public static void main(String arv[])
    {
        //int n=153;
        for(int i=1;i<500;i++)
        {
            int sum=0,n1,res;
            n1=i;
           int temp=n1;
           String s=String.valueOf(n1);
           int n2=s.length();
            while(n1>0)
            {
                res=n1%10;
                sum+=Math.pow(res,n2);
                n1=n1/10;
                //System.out.println(sum);
            }
            if(sum==temp)
            {
                System.out.println(temp);
            }
        }
        
    }
}

