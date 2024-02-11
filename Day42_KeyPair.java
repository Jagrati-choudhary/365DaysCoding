import java.util.*;
class KeyPair
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
         int x = sc.nextInt();
           HashSet<Integer> a = new HashSet<Integer>();
        
        for(int i=0; i<n; i++){
            int m = x-arr[i];
            if(a.contains(m)){
                System.out.println("true");
            }else{
                a.add(arr[i]);
            }
        }
        
        System.out.println("false");
   }
}