import java.util.*;
class AverageInStream
{
            public static void main(String[] args)
    {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enetr a size of array");
            int n = sc.nextInt();
            int arr[]=new int[n];
            for(int i=0;i<n;i++)
          {
            System.out.println("arr["+i+"] = " );
             arr[i] = sc.nextInt();

          }
            float []avg = new float[n];
        float sum =0.0f;
        for(int i=0;i<n;i++){
            sum = (sum + arr[i]);
            avg[i]=sum/(i+1);
        }
        for(int i=0;i<n;i++)
        {
          System.out.println(avg[i]);
        }
     }
}