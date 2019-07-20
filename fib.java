import java.util.*;
class fib{ 
    
    public static void main(String args[]) 
    { 
        Scanner sc=new Scanner(System.in);
        int a = sc.nextInt(); 
        int n1=1,n2=1,n3;
        for(int i=1;i<=a;i++)
        {
           System.out.print(n1+" ");
           n3=n1+n2;
           n1=n2;
           n2=n3;
        }
    } 
} 

