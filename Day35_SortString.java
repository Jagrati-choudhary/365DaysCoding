import java.util.*;
class SortString
{
   public static void main(String[] args)
 {
   
    Scanner sc = new Scanner(System.in);
    int t = sc.nextInt();
    while(t!=0){
    String s = sc.next();
    char arr[]=s.toCharArray();
    Arrays.sort(arr);
    for(int i=0;i<arr.length;i++)
   {
    System.out.print(arr[i]);
   }
        
     System.out.println(); 
        t--;
    }
  }
}