import java.util.Scanner;

public class Main {
public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);

    int opcao = 0;
    // Recebendo numeros 
    
    while (opcao != 3) {
        System.out.println("===Escolha uma opcao:====");
        System.out.println("1. Opcao 1");
        System.out.println("2. Opcao 2");
        System.out.println("3. Encerrar o programa");
            opcao = scanner.nextInt(); 
            
    switch (opcao) {
        case 1:
            System.out.println("Voce escolheu a opcao 1");
            break;
        case 2:
            System.out.println("Voce escolheu a opcao 2");
            break;
        case 3:
            System.out.println("Voce encerrou o programa");
            break;
        default:
            System.out.println("Opção inválida. Por favor, escolha novamente.");
        }
    } 
        scanner.close();
    }
}