import java.util.*;
class Aray{ 
    
    public static void main(String args[]) 
    { 
        Scanner sc=new Scanner(System.in);
        //int a = sc.nextInt(); 
        int a[]=new int[args.length];
        for(int i=0;i<args.length;i++)
        {
            a[i]= Integer.valueOf(args[i]);
        }
        Arrays.sort(a);
        int l=args.length;
        
        System.out.print(a[l-1]);
    } 
} 

