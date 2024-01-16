import java.util.*;
class LargestProduct
{
            public static void main(String[] args)
    {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enetr a size of array");
            int n = sc.nextInt();
            int A[]=new int[n];
            for(int i=0;i<n;i++)
           {
               System.out.println("A["+i+"] =");
                 A[i]=sc.nextInt();
          }
               int k= sc.nextInt();
             int product = 1;
                  int product1 = 1;
                  int j;
                   for(int i=0;i<n-k+1;i++){
                      j = i;
                    while(j < i+k){
                       product1 *= A[j];   
                              j++;
                    }
                      if(product < product1){
                       product = product1;
               }
                        product1 = 1;
            }
                      System.out.println(product);
     }
}
                       