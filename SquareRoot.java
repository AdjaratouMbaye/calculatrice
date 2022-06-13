import java.util.Scanner;

public class SquareRoot {
    public static void main(String []args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter x ");

        int x = scan.nextInt();

        double r = x * x;
        System.out.println("le resultat de la racine carree est " + r);
    }
}
