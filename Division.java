import java.util.Scanner;
public class Division {
    public static void main(String []args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter x and y");

        int x = scan.nextInt();
        int y = scan.nextInt();
        double r = x * y;
        System.out.println("le resultat de la division est " + r);
    }
}
