import java.util.Arrays;
import java.util.Scanner;

public class Q2 {

    public static void main(String[] args) {
        int[] arr=new int[5];
        Scanner sc= new Scanner(System.in);
        System.out.println("\nEnter 5 numbers\n");
        for (int i = 0; i < 5; i++) {
           arr[i]=sc.nextInt();
        }
        System.out.println("\nBefore sort");
        for (int i = 0; i < 5; i++) {
            System.out.print(arr[i]+" ");
         }
        Arrays.sort(arr);
        System.out.println("\nAfter sort");
        for (int i = 0; i < 5; i++) {
            System.out.print(arr[i]+" ");
         }
         int sum=0;
         for (int i = 0; i < 5; i++) {
            sum=sum+arr[i];
         }
         System.out.println("\nTotal sum ="+23);

    }
}
