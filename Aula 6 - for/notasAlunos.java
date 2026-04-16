import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Cria o objeto Scanner para leitura de dados
        Scanner scanner = new Scanner(System.in);
    
            int i;
            float nota1, nota2,media;


            for (i = 1; i <= 3; i++ ) {
                System.out.println("Notas do aluno " + i); 
                System.out.print("Digite a primeira nota: ");
            nota1 = scanner.nextInt();
                System.out.print("Digite a segunda nota: ");
            nota2 = scanner.nextInt();
        
            media = (nota1 + nota2) / 2;
               System.out.println("A media do aluno " + i + " foi:" + media );
            }

            // Fecha o scanner
        scanner.close();
    }
}