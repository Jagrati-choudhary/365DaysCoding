import java.util.*;
class SegregateEvenAndOddNumbers
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
           Arrays.sort(arr);
        int[] res = new int[n];
        int k=0;
        for(int i=0;i<n;i++){
            
            if(arr[i] % 2==0){
                res[k] = arr[i];
                k++;
            }
            
        }
          for(int i=0;i<n;i++){
           
            if(arr[i] % 2!=0){
                res[k] = arr[i];
                k++;
            }
            
        }
        
        
        for(int i=0;i<n;i++){
             arr[i] = res[i];
            System.out.print(arr[i]+ " ");
       }
    }
   
}        