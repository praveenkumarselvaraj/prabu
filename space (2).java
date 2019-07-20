import java.util.*;
class space
{
    public static void main(String arv[])
    {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        int len=s.length();
       String ss=s.replaceAll(" ","");
        int l=ss.length();
        System.out.print(len-l);
    }
}
