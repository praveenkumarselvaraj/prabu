import java.util.*;
class vowcon
{
    public static void main(String arv[])
    {
       Scanner sc=new Scanner(System.in);
      char ch = sc.next().charAt(0);
      if(ch == 'a'|| ch == 'e'|| ch == 'i' ||ch == 'o' ||ch == 'u'|| ch == 'A'|| ch == 'E'|| ch == 'I'|| ch == 'O'|| ch == 'U'){
         System.out.println("Vowel");
      }else if(Character.isLetter(ch)){
         System.out.println("Consonant");
      }
      else
      System.out.print("invalid");
    }
}
