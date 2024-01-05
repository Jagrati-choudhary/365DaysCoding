import java.util.*;
class SearchInsertPositionOfKSortedArray
{
        public static void main(String args[])
{

        Scanner sc = new Scanner(System.in);
        System.out.print("Emter the size of array: ");
        int n = sc.nextInt();
	int[] arr = new int[n];
	

	       for (int i = 0; i < n; i++)
            {
	       System.out.print("arr[" + i + "]=");
	       arr[i] = sc.nextInt();
            }
      
                int pos = -1;
                int k=sc.nextInt();
                for (int i = 0; i < n; i++)
             {
                     if (arr[i] == k) 
                      System.out.println(i);
                     if(arr[i] > k) 
                     {
                        pos = i;
                        break;
                      }
             }
        if (pos == -1) 
       System.out.println(n);
        
       System.out.println(pos);  
}

}