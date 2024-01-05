

                                import java.util.Scanner;
                                class Day1_FightingTheDrakness {
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
                                              int max=0;
                                                for(int i=0;i<n;i++){
                                                   if(arr[i]>max)
                                                       max=arr[i];
                                                 }
                                             System.out.println(max);
                                        }
                                     }