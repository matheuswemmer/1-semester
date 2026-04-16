import java.util.Scanner;

public class Main {
	public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Declaracao de variaveis
	 int idade, peso;
	
	// Recebendo numeros 
	 System.out.print("Digite o seu peso:");
	 peso = scanner.nextInt();
	 
	 System.out.print("Digite a sua idade:");
	 idade = scanner.nextInt();
	 
	 // Operacionado
    if (idade > 18 && peso > 70 ) {	 
	 System.out.printf("Voce esta acima do peso");
    }
    else {
        System.out.printf("Peso normal para a idade");
    }
        scanner.close();
    }
}
