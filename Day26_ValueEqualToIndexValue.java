import java.util.*;
class ValueEqualToIndexValue
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
              ArrayList<Integer> list = new ArrayList<>();
        for(int i=0;i<n;i++){
            if((i+1)==arr[i]){
              list.add(i+1);
            }
        }
        System.out.println(list);
     }

}