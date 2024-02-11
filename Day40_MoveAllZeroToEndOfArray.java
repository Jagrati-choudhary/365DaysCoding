import java.util.*;
class MoveAllZeroToEndOfArray
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
       int b=0;
        for(int i=0;i<n;i++)
        {
            if(arr[i]!=0)
            {
                int x=arr[i];
                arr[i]=0;
                arr[b]=x;
                b++;
            }
        }
           for(int j=0;j<n;j++){
              System.out.println(arr[j]);
            }
}
}