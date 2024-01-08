import java.util.*;
class CountSquare
{
            public static void main(String[] args)
    {
            Scanner sc = new Scanner(System.in);
            System.out.println("enter a number");
            int n = sc.nextInt();
             int count =0;
        for(int i=1;i<n;i++){
            if(i*i<n){
                count++;
            }
            else {
                break;
            }
        }
         System.out.println(count);
}
}