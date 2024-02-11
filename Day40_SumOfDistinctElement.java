import java.util.*;
class SumOfDistinctElement
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
       HashSet<Integer> set = new HashSet<>();
            for(int i=0;i<n;i++){
                set.add(arr[i]);
            }
        int sum =0;
         for(int num:set) {
         sum +=num;
     }
        System.out.println( sum);
   }
}
