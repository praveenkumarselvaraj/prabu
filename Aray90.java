import java.util.*;
class Aray90{ 
    
    public static void main(String args[]) 
    { 
        Scanner sc=new Scanner(System.in);
        int n = sc.nextInt(); 
        int a[]=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]= sc.nextInt();
        }
        Arrays.sort(a);
        //int l=args.length;
        
        System.out.print(a[1]);
    } 
} 


