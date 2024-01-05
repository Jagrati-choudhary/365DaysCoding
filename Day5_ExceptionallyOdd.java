                               import java.util.Scanner;
                               class ExceptionllyOdd {
                                   public static void main(String[] args) {
                                       Scanner sc = new Scanner(System.in);
                                       System.out.println("enter the array element");
                                       int n = sc.nextInt();
                                       int arr[] = new int[n];
                                          for(int i=0;i<n;i++)
                                         {
                                           System.out.println("arr["+i+"]=");
                                            arr[i]=sc.nextInt();
                                         }
                                             int []a=new int[10000];
                                              for(int i=0;i<n;i++)
                                                a[arr[i]] +=1;
                                              for(int j=0;j<10000;j++){
                                             if(a[j]%2!=0){
                                             System.out.println(j);
                                                 break;
                                             }
                                         }
                                     }
                                 }