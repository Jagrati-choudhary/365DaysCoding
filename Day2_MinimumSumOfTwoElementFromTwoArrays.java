import java.util.Scanner;
 class MinimumSumOfTwoElementTwoArrays
 {
         public static void main(String[] args)
 {
         Scanner sc = new Scanner(System.in);
         System.out.println("enter the array element");
         int n = sc.nextInt();
         int a[] = new int[n];
          int b[]=new int[n];
         for(int i=0;i<n;i++)
       {
         System.out.println("a["+i+"]=");
                a[i]=sc.nextInt();
                 b[i]=sc.nextInt();
       }  
         
		int  min =  Integer.MAX_VALUE;;
	    int  min2= Integer.MAX_VALUE;;
	    int ind1=-1;
		for(int i=1; i<n; i++) {
			if(min>a[i]){ 
				min=a[i];
				ind1=i;
			}
		}
			for(int j=0;j<n;j++){
		    if(min2>b[j] && j!=ind1)
		        min2=b[j];
		  
		}
	
		
		int res1  = min + min2;
		int min3= Integer.MAX_VALUE;;
		int min4= Integer.MAX_VALUE;;
	 int	ind2=-1;
		for(int j=0;j<n;j++){
		    if(min3>b[j] ){
		        min3=b[j];
		        ind2=j;
		    }
		   
		  
		}
			for(int j=0;j<n;j++){
		    if(min4>a[j] && j!=ind2)
		        min4=a[j];
		  
		}
		
     	int res2=min3+min4;
    	 if(res1<res2)
           System.out.println(res1);
         else
            System.out.println(res2);
}
}
	
        