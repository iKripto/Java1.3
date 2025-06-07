import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Fatorial fatorial = new Fatorial();

        System.out.print("Digite um número inteiro nao negativo");
        int numero = scanner.nextInt();

        if (numero < 0) {
            System.out.println("Numero negativo nao permitido");
        } else {
            long resultado = fatorial.calcular(numero);
            System.out.println("Fatorial de " + numero + " e: " + resultado);
        }

        scanner.close();
    }
}
