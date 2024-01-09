import java.util.*;
class BinarySearch
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
              int k=sc.nextInt();
             for(int i=0;i<n;i++){
            if(a[i]==k){
               System.out.println(i);
            }
          
        }
              System.out.println("-1");
}
}
       