import java.util.*;
class Sample
{
            public static void main(String[] args)
    {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enetr a Array"); 
             int n=sc.nextInt();
            int a[][]=new int [n][n];
            int b[]= new int[n];
              int sum=0;
       for(int i=0;i<n;i++)
       {
         System.out.println("Enetr the array element");
         a[i][i] = sc.nextInt();
         b[i]=sc.nextInt();
       }
        for(int i=0;i<n;i++){
            sum = sum + a[i][i];
        }
        int max=0;
        for(int i=0;i<n;i++){
            if(b[i]>max){
                max=b[i];
           
        } 
        }
       System.out.println( new ArrayList<Integer>(Arrays.asList(sum, max)));
     }
}