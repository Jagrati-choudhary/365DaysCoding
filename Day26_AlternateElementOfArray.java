 import java.util.Scanner;
 class AlternateArrayElement 
 {
       public static void main(String[] args)
        {
             Scanner sc = new Scanner(System.in);
             System.out.println("enter the array element");
             int n = sc.nextInt();
             int a[] = new int[n];
             for(int i=0;i<n;i++)
               {
                   System.out.println("a["+i+"]=");
                    a[i]=sc.nextInt();
               }
                   for(int j=0;j<n;j++)
                   {
                       if(j%2==0)
                    {
                        System.out.println(a[j]+" ");
                   }
               }
 
        }
 }
                                  