import java.util.*;
class space
{
    public static void main(String arv[])
    {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        s=s.replaceAll(" ","");
        int l=s.length();
        System.out.print(l);
    }
}
