import java.util.Scanner;


public class concat12 {
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k =sc.nextInt();
		int s=1;
for(int i=1;i<=k;i++){
	s = s * n;
}
System.out.println(s);
}
}
