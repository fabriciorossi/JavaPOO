import java.util.Scanner;

public class RaizQuadrada {

    public static double sqrt(double n, double epsilon) {
        if (n < 0) {
            throw new IllegalArgumentException("O número deve ser positivo");
        }
        
        double x0 = n / 2.0; // Chute inicial
        double x1 = (x0 + n / x0) / 2.0;

        while (diferencaModulo(x1, x0) >= epsilon) {
            x0 = x1;
            x1 = (x0 + n / x0) / 2.0;
        }

        return x1;
    }

    public static double diferencaModulo(double a, double b) {
        return a > b ? a - b : b - a;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Qual o valor de n: ");
        double n = scanner.nextDouble();

        System.out.print("Qual o valor de epsilon: ");
        double epsilon = scanner.nextDouble();

        double result = sqrt(n, epsilon);
        System.out.println("Raiz quadrada de " + n + " com precisão de " + epsilon + " é igual a: " + result);

        scanner.close();
    }
}
