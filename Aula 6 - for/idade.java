import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Cria o objeto Scanner para leitura de dados
        Scanner scanner = new Scanner(System.in);
    
            int i, idade, maior, menor;


                System.out.println("Digite sua idade"); 
            idade = scanner.nextInt();
            
                maior = idade;
                menor = idade;
                

            for (i = 1; i <= 4; i++ ) {
                System.out.println("Digite sua idade"); 
            idade = scanner.nextInt();
                if ( idade > maior) {
                    maior = idade; 
                }
                if (idade < menor) {
                    menor = idade;
                }
            }
               System.out.println("A maior idade: " + maior);
               System.out.println("A menor idade e: " + menor);

            // Fecha o scanner
        scanner.close();
    }
}