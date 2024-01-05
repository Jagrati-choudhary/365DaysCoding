  import java.util.*;
              class SearchAnElementArray{
             public static void main(String args[])
             {

              Scanner sc = new Scanner(System.in);
		System.out.print("Emter the size of array: ");
		int n = sc.nextInt();
		int[] arr = new int[n];
		int[] a = new int[n];

		for (int i = 0; i < n; i++) {
			System.out.print("arr[" + i + "]=");
			arr[i] = sc.nextInt();
		}
                
                        int i;
                       int X=sc.nextInt();
                      for(i=0;i<n;i++){
                       if(arr[i]==X){
                       System.out.println(i);
                     
                    }
                            
             }
                      System.out.println("-1");
                      
 
}
}
        
    