import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        long cpf;
        int totalPessoas = 0;
        float somaValores = 0;
        float somaCriancas = 0;

        while (true) {

            System.out.print("\nPessoa (CPF) ou 0 para sair: ");
            cpf = scanner.nextLong();

            if (cpf == 0) {
                break; // encerra a pesquisa
            }

            System.out.print("Crianças: ");
            int criancas = scanner.nextInt();

            System.out.print("Valor máximo por criança: ");
            float valor = scanner.nextFloat();

            totalPessoas++;

            // acumula total de crianças e total dos valores máximos
            somaCriancas += criancas;
            somaValores += valor;
        }

        // cálculo da média por criança
        float media = 0;
        if (somaCriancas > 0) {
            media = somaValores;
        }

        System.out.println("\n=== RESULTADOS ===");
        System.out.println("Total de pessoas entrevistadas: " + totalPessoas);
        System.out.println("Valor médio que será gasto por criança: R$ " + media);

        scanner.close();
    }
}
