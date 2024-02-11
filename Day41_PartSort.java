import java.util.*;
class PartSort
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
      int l=sc.nextInt();
      int r= sc.nextInt();
      int temp = 0;
        if(l > r){
            temp = l;
            l = r;
            r = temp;
        }
        Arrays.sort(arr, l, r+1);
          for (int j=0;j<n;j++){
             System.out.println(arr[j]);
      }
   }
}
