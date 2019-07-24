import java.util.*;
import java.math.*;
class mid
{
    public static void main(String arv[])
    {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        String s1="";
        int n=s.length();
        if(n%2==0)
        {
            s1=s.substring(0,(n/2)-1);
            s1+="**"+s.substring((n/2)+1);
            System.out.print(s1);
        }
        else
        {
            s1=s.substring(0,n/2);
            s1+="*"+s.substring((n/2)+1);
             System.out.print(s1);
        }
        
    }  
}


