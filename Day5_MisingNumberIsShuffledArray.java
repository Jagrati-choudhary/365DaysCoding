import java.util.*;
class MisingNumberIsShuffledArray
{
        public static void main(String args[])
{

        Scanner sc = new Scanner(System.in);
        System.out.print("Emter the size of array: ");
        int n = sc.nextInt();
	int[] a = new int[n];
	int[] b = new int[n];
        

	       for (int i = 0; i < n; i++)
            {
	       System.out.print("a[" + i + "]=");
	       a[i] = sc.nextInt();
               b[i]=sc.nextInt();
            }
               int s=0;
               for(int i=0;i<n;i++)
           {
                   s=s+a[i]; 
         
                   s=s-b[i];
         
           }
     
               System.out.println(s);
}
}