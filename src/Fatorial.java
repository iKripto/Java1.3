public class Fatorial {
    public long calcular(int n) {
        if (n < 0) {
            System.out.println("O numero nao pode ser menor que zero!");
            return 0;
        }
        if (n == 0 || n == 1) {
            return 1;
        }
        return n * calcular(n - 1);
    }
}