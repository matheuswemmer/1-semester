import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Cria o objeto Scanner para leitura de dados
        Scanner scanner = new Scanner(System.in);
    
            int i, resultado, numero;
            
            System.out.print("Digite um número para ver sua tabuada: ");
        numero = scanner.nextInt();
        
        // Exibe a tabuada do número
        System.out.println("Tabuada de " + numero + ":");
            for (i = 0; i <= 10; i++) {
                resultado = numero * i;
        System.out.println(numero + " x " + i + " = " + resultado);
            }
            
            // Fecha o scanner
        scanner.close();
    }
}