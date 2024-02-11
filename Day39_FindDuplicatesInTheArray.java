import java.util.*;
class  FindDuplicatesInTheArray
{ 
      public static void main(String[] args)
  {
      Scanner sc = new Scanner(System.in);
      System.out.println("Enetr the size of array");
      int n= sc.nextInt();
      int arr[]= new int [n];
      for(int i=0;i<n;i++)
   {
      System.out.println("arr["+i+"]=" );
       arr[i] = sc.nextInt();
   }

       ArrayList<Integer> list = new ArrayList<>();
		Arrays.sort(arr);

		int index = 0;

		for (int i = 0; i < n - 1; i++) {
			if (!list.isEmpty()) {
				if (arr[i] == arr[i + 1] && list.get(index) != arr[i]) {
					i = i + 1;
					list.add(arr[i]);
					index++;
				}
			} else {
				if (arr[i] == arr[i + 1]) {
					i = i + 1;
					list.add(arr[i]);
				}
			}
		}

		if(list.isEmpty()) {
			list.add(-1);
		}
		 System.out.println(list);
    }
}
 