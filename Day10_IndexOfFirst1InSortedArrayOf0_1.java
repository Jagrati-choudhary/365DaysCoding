import java.util.*;
class IndexOfFirst1InSortedArrayOf0_1
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
              
                  for(int i=0;i<n;i++){
                      if(a[i]==1){
                     System.out.println(i);
                         break;
            }
        }
                    System.out.println("-1");
}
}
