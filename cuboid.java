import java.util.*; 
public class cuboid {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
    	 int n =sc.nextInt();
        int n1 =sc.nextInt();
         int n2 =sc.nextInt();
         int t=(2*((n*n1)+(n1*n2)+(n2*n)));
         int v=n*n1*n2;
         System.out.print(t+" "+v);
    }

}

