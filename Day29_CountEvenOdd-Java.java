import java.util.*;
class CountEvenOdd
{
            public static void main(String[] args)
    {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enetr a size of array");
            int n = sc.nextInt();
            int a[]=new int[n];
            for(int i=0;i<n;i++)
          {
            System.out.println("a["+i+"] = " );
             a[i] = sc.nextInt();
          }
             int count=0;
        int count1=0;
        for(int i=0;i<n;i++){
            if(a[i]%2!=0){
                count++;
            }
            else{
                count1++;
            }
        }
        System.out.print(count+" "+count1);
   }
}