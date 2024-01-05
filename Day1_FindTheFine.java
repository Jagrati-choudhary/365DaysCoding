 import java.util.Scanner;
class Day1_FindTheFine
 {
         public static void main(String[] args)
 {
         Scanner sc = new Scanner(System.in);
         System.out.println("enter the array element");
         int n = sc.nextInt();
         int car[] = new int[n];
         int fine[] = new int [n];
         for(int i=0;i<n;i++)
       {
         System.out.println("car["+i+"]=");
                car[i]=sc.nextInt();
                fine[i]=sc.nextInt();
       }   
                                        
        int sum=0;
         System.out.println("enetr the date ");
        int date =sc.nextInt();
        for(int i=0; i<n; i++)
         {
            if(date%2==0 && car[i]%2!=0){
                sum+=fine[i];
            }
            else if(date%2!=0 && car[i]%2==0)
            {
              sum+=fine[i];
            }
         }
          System.out.println(sum);
     }
 }