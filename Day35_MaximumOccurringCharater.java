import java.util.*;
class MaximumOccurringCharater
{
    public static void main(String[] args)
  {
       Scanner sc= new Scanner(System.in);
       System.out.println("enter the String");
       String line = sc.nextLine();
       int count[] = new int [26];
        for(int i=0;i<line.length();i++){
            count[line.charAt(i)-97]++;
        }
        int max =0;
        int maxindex=-1;
        for(int i=0;i<26;i++){
        if(count[i]>max){
        max=count[i];
        maxindex=i;
        }
        }
       System.out.println( (char)(maxindex+97));
   }
}