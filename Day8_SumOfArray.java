import java.util.*;
class SumOfArray
{
        public static void main(String args[])
{

        Scanner sc = new Scanner(System.in);
        System.out.print("Emter the size of array: ");
        int n = sc.nextInt();
	int[] a = new int[n];
	       for (int i = 0; i < n; i++)
            {
	       System.out.print("a[" + i + "]=");
	       a[i] = sc.nextInt();
             
            }
               int sum=0;
        for(int i=0;i<n;i++){
            sum = sum + a[i];
            }
           System.out.println(sum);
}
}