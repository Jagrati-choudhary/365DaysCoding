import java.util.*;
class MiddleOfThree
{
            public static void main(String[] args)
    {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enetr a value");
            int A = sc.nextInt();
             int B= sc.nextInt();
             int C = sc.nextInt();
           
             int max=Integer.MIN_VALUE;
           int min=Integer.MAX_VALUE;
           int[] arr;
           arr=new int[3];
           arr[0]=A;
           arr[1]=B;
           arr[2]=C;
        for(int i=0;i<3;i++)
        {
            if(arr[i]>max)
                max=arr[i];
        }
        for(int i=0;i<3;i++)
        {
            if(arr[i]<min)
                min=arr[i];
        }
        for(int i=0;i<3;i++)
        {
            if(arr[i]!=max && arr[i]!=min)
            {
               System.out.println( arr[i]);
            }
        }
       System.out.println("0");
    }
}