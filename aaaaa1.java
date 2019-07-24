import java.io.*; 
import java.util.*; 
class  aaaaa1{ 
    static boolean is_isogram(String str) 
    { 
        str = str.toLowerCase(); 
        int len = str.length(); 
        char arr[] = str.toCharArray(); 
        Arrays.sort(arr); 
        for (int i = 0; i < len - 1; i++) { 
            if (arr[i] == arr[i + 1]) 
                return false; 
        } 
        return true; 
    } 
    public static void main(String[] args) 
    { 
        Scanner sc=new Scanner(System.in);
        String str1 = sc.nextLine(); 
        if(is_isogram(str1))
         System.out.print("Yes");
         else
         System.out.print("No");
    }
}
  
