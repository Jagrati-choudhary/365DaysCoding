import java.util.*;
class GoodOrBadString
{
    public static void main(String[] args)
{
    Scanner sc=new Scanner(System.in);
    System.out.println("enter the String");
    String S = sc.nextLine();
    int vol = 0;
    int cons = 0;
    for (int i = 0; i < S.length(); i++) {
    char c = S.charAt(i);
    if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' )
    {
           vol++;
           cons = 0;
    } else if (c == '?') 
    {
           vol++;
           cons++;
    } else
    {
          cons++;
          vol = 0;
    }
      if (vol == 6 || cons == 4)
    {
            System.out.println("Bad");
            }
        }
      System.out.println("Good");
  }
}