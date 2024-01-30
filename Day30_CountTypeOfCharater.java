import java.util.*;
class CountTypeOfCharater
{
            public static void main(String[] args)
    {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enetr a size of array");
            String s = sc.nextLine();
             int arr[]={0,0,0,0};
        char a[] =s.toCharArray();
        for(int i=0;i<s.length();i++){
            if(a[i]>='A' && a[i]<='Z'){
                arr[0]++;
            }
            else if(a[i]>='a' && a[i]<='z'){
                arr[1]++;
            }
            else if(a[i]>='0' && a[i]<='9'){
                arr[2]++;
            }
            else {
                arr[3]++;
            }
        }
        for(int i=0;i<arr.length;i++){
       System.out.println( arr[i]);
        }
      }
}
