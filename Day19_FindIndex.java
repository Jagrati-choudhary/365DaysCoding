import java.util.*;
class FindIndex
{
            public static void main(String[] args)
    {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enetr a size of array");
            int N = sc.nextInt();
            int a[]=new int[N];
            for(int i=0;i<N;i++)
          {
            System.out.println("a["+i+"] = " );
             a[i] = sc.nextInt();

          }
        int res[] = {-1,-1};
       int key = sc.nextInt();
       for(int i =0;i<N;i++){
           if(a[i] == key)
           {
               res[0] = i;
               break;
           }
       }
       int j;
       for( j =N-1;j>=0;j--){
           if(a[j]==key){
               res[1] = j;
               break;
           }
       }
       System.out.println(res[j]);
    }
}