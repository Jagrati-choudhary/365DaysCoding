import java.util.*;
class MultipleLeftAndRightArraySum
{
            public static void main(String[] args)
    {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enetr a number");
            int n= sc.nextInt();
            int arr[]=new int[n];
             for(int i=0;i<n;i++)
            {
             System.out.println("enter the array element");
              arr[i]=sc.nextInt();
            }
              int x = n/2;
        int leftsum = 0;
        int rightsum = 0;
      for(int i=0;i<n;i++){
            if(i<x){
            leftsum=leftsum + arr[i] ;
        }
        else {
            rightsum = rightsum + arr[i];
        }
      }
      int mul=leftsum * rightsum ;
     System.out.println(mul);
}
}
        