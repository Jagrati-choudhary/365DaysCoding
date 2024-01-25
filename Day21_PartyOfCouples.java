import java.util.*;
class PartyOfCouples
{
            public static void main(String[] args)
    {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enetr a size of array");
            int N = sc.nextInt();
            int arr[]=new int[N];
            for(int i=0;i<N;i++)
          {
            System.out.println("arr["+i+"] = " );
             arr[i] = sc.nextInt();

          }
           Arrays.sort(arr);
            int ans =0;
          for(int i=0;i<N;i++){
            ans = ans ^arr[i];
        }
         System.out.println( ans);
     }
}