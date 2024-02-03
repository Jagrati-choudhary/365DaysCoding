import java.util.*;
class UnionOfTwoArray
{
       public static void main(String args[])
   {

          Scanner sc = new Scanner(System.in);
		System.out.print("Emter the value: ");
		int n = sc.nextInt();
         int m = sc.nextInt();
         int a[]=new int [n];
         int b[]=new int [m];
          for(int i=0;i<n;i++){
          System.out.println("a["+i+"]=" );
           a[i] = sc.nextInt();
         }
           for(int i=0;i<m;i++){
          System.out.println("b["+i+"]=" );
           b[i] = sc.nextInt();
         }
          HashSet<Integer> set = new HashSet<>();
        
        for(int i=0; i<n; i++){
            set.add(a[i]);
        }
        
        for(int i=0; i<m; i++){
            set.add(b[i]);
        }
        
        System.out.println(set.size());
    }
}