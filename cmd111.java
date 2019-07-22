import java.util.*;
class cmd111{ 
    
    public static void main(String args[]) 
    { 
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        int count=0;
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)=='1'||s.charAt(i)=='0')
             count++;
            else
             count=0;
        }
        if(count==s.length())
         System.out.print("yes");
         else
         System.out.print("no");
    } 
} 
