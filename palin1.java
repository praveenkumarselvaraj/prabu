import java.util.*;
class palin1
{
    public static void main(String arv[])
    {
        Scanner sc=new Scanner(System.in);
        //int n=sc.nextInt();
        String s=sc.next();
        StringBuffer sb=new StringBuffer(s);
        sb.reverse();
        if(s.equals(sb.toString()))
        {
            System.out.print("yes");
        }
        else
        System.out.print("no");
    }
}

