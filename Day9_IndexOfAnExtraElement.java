import java.util.*;
class IndexOfAnExtraElement
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
               System.out.print("b[" + i + "]=");
               b[i] = sc.nextInt();
             
            }
               int i;
              for( i=0;i<n-1;i++){
              if(a[i]!=b[i]){
               System.out.println(i);
                 break;
            }
        }
               System.out.println(n-1);
}
}
