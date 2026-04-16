import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        float maiorVariacao = Float.MIN_VALUE; 
        float menorVariacao = Float.MAX_VALUE;
        float p1, p2, p3;
        float PesoFinal;

        int codigoMaiorGanho = 0;
        int codigoMaiorPerda = 0;

        for (int i = 501; i <= 505; i++) {
            System.out.println("\nCachorro " + i);
            System.out.print("Peso no 1º mês: ");
            p1 = scanner.nextFloat();

            System.out.print("Peso no 2º mês: ");
            p2 = scanner.nextFloat();

            System.out.print("Peso no 3º mês: ");
            p3 = scanner.nextFloat();

            PesoFinal = p3 - p1; // ganho ou perda total em 3 meses

            if (PesoFinal > maiorVariacao) {
                maiorVariacao = PesoFinal;
                codigoMaiorGanho = i;
            }

            if (PesoFinal < menorVariacao) {
                menorVariacao = PesoFinal;
                codigoMaiorPerda = i;
            }
        }

        System.out.println("\n=== RESULTADO ===");
        System.out.println("Cão que mais GANHOU peso: " + codigoMaiorGanho);
        System.out.println("Cão que mais PERDEU peso: " + codigoMaiorPerda);

        scanner.close();
    }
}
