import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double p,t,r;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Calculator that calculates simple interest");
        System.out.print("Enter the principal amount:    p = "); p = Double.parseDouble(scanner.nextLine()); System.out.println();
        System.out.print("Enter the duration (in years): t = "); t = Double.parseDouble(scanner.nextLine()); System.out.println();
        System.out.print("Enter the interest rate:       r = "); r = Double.parseDouble(scanner.nextLine()); System.out.println();
        scanner.close();

        System.out.println("Simple interest: si =  "+calculator(p,t,r));

    }

    public static double calculator(double p, double t, double r){
        double si;
        si=p*t*r;
        return si;
    }
}
