import java.util.*;
class Vow1
{
    public static void main(String arv[])
    {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
         s=s.toUpperCase();
        int sum=0;
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)=='A'||s.charAt(i)=='E'||s.charAt(i)=='I'||s.charAt(i)=='O'||s.charAt(i)=='U')
            {
               sum++;
            }
        }
        if(sum>0)
        System.out.println("yes");
        else
        System.out.println("no");
    }
}

