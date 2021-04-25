import java.util.Scanner;
import calculator.rmi.OperationsRMIServer;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        Scanner sc = new Scanner(System.in);
        var x = sc.next();
        System.out.println(x);
        OperationsRMIServer cl = new OperationsRMIServer();
        System.out.println(cl.add(12, 32));
        sc.close();
    }
}
