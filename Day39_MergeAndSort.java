import java.util.*;
class MergeAndSort
{ 
      public static void main(String[] args)
  {
      Scanner sc = new Scanner(System.in);
      System.out.println("Enetr the size of array");
      int n= sc.nextInt();
      int m= sc.nextInt();
      int a[]= new int [n];
      int b[]= new int [m];
      int answer[] = new int [n+m];
      for(int i=0;i<n;i++)
   {
      System.out.println("a["+i+"]=" );
       a[i] = sc.nextInt();
   }

       for(int i=0;i<m;i++)
   {
      System.out.println("b["+i+"]=" );
       b[i] = sc.nextInt();
   }
     
        HashSet<Integer> set = new HashSet<>();
        for(int i=0; i<n; i++) {
            set.add(a[i]);
        }
        for(int i=0; i<m; i++) {
            set.add(b[i]);
        }
        
        int i=0;
        for(int e : set) {
          answer[i] = e; 
          i++;
        }  
         for(int j=0;j<set.size();j++){
       System.out.println( answer[j]);
}
   }
}