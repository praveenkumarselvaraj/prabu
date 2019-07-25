import java.util.*; 
public class Lexi {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
    	
        String n1 =sc.nextLine();
        String ss="";
        char a[]=new char[n1.length()];
        for(int i=0;i<n1.length();i++)
        {
            a[i]=n1.charAt(i);
        }
        Arrays.sort(a);
        for(int i=0;i<n1.length();i++)
        {
            ss+=String.valueOf(a[i]);
           
        }
         System.out.print(ss);
    }

}

