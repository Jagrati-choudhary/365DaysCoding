import java.util.*;
class CountTheZeros
{ 
      public static void main(String[] args)
  {
      Scanner sc = new Scanner(System.in);
      System.out.println("Enetr the size of array");
      int n= sc.nextInt();
      int arr[]= new int [n];
      for(int i=0;i<n;i++)
   {
      System.out.println("arr["+i+"]=" );
       arr[i] = sc.nextInt();
   }  
        int count=0;
        for(int i=0;i<n;i++){
            if(arr[i]==0){
                count++;
            }
        }
        System.out.println( count);
    }
}