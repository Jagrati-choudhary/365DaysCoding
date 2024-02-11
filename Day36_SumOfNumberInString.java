import java.util.*;
class SumOfNumberInString
{
    public static void main(String[] args)
{
    Scanner sc=new Scanner(System.in);
    System.out.println("enter the String");
    String str = sc.nextLine();
    int sum=0;
    int num=0;
    for(int i=0; i<str.length(); i++){
    if(str.charAt(i) >= '0' && str.charAt(i) <= '9'){   
        num=num*10 + str.charAt(i) - '0';   
    }
      else {   
              sum=sum+num;
               num=0;
            }
        }
        System.out.println( sum+num);
  }
}
       