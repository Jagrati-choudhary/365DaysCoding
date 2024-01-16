import java.util.*;
class ProfessorAndParties
{
            public static void main(String[] args)
    {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enetr a size of array");
            int n = sc.nextInt();
            int a[]=new int[n];
            for(int i=0;i<n;i++)
           {
               System.out.println("a["+i+"] =");
                 a[i]=sc.nextInt();
           }
            
          Arrays.sort(a);
          String str = "GIRLS";
          for(int i=0;i<n-1;i++){
            if(a[i] == a[i+1]){
               str = "BOYS";
            }
        }
            System.out.println(str);
    }
}
            