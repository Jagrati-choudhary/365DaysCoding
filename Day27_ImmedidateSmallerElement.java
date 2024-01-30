import java.util.*;
class ImmedidateSmallerElement
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
            for(int i=0;i<n-1;i++){
            if( arr[i] > arr[i+1]){
                arr[i]=arr[i+1];
            }
            else 
            {
                arr[i] = -1;
            }
           
        }
           arr[n-1]=-1;
        for(int i=0;i<n;i++){
            arr[i]=arr[i];
        }
         for(int i=0;i<n;i++){
           System.out.println(arr[i]);
       }
    }
}