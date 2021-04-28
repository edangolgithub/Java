import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        String ch;
        int num;
        do {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter a number");
           num = sc.nextInt();
            boolean prime = true;
            for (int i = 2; i < num - 1; i++) {
                if (num % 2 == 0) {
                    prime = false;
                    break;
                }
            }
            if (prime) {
                System.out.println(num + " is prime number");
            } else {
                System.out.println(num + " is not prime number");
            }

            System.out.println("Do u want to test another number y/n");
           
            ch = sc.next();
        } while (!ch.equals("n"));

    }
}