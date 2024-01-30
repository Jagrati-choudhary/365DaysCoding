import java.util.*;
class RearrangeArrayAlternate
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
          
          if(n==1) 
          System.out.println(n);
        List<Integer> list=new ArrayList<>();
        
        int i=0,j=n-1;
        while(i<=j)
        {
            list.add(arr[j]);
            list.add(arr[i]);
            i++;
            j--;
        }
        int index=0;
        for(i=0;i<n;i++)
        {
            arr[index]=list.get(i);
            index++;
        }
          for(int k=0;k<n;k++){
         System.out.println(arr[k]);
         }
     }
}