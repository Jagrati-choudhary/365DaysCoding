import java.util.*;
class MultiplicationTable
{
            public static void main(String[] args)
    {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enetr a number");
            int n = sc.nextInt();
            ArrayList<Integer> tab= new ArrayList<Integer>();
            for(int i=1;i<=10;i++){
            tab.add(n*i);
        }
        System.out.println(tab);
    }
}