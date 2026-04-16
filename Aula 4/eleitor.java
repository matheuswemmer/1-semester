import java.util.Scanner;

public class Main {
	public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Declaracao de variaveis
	 int idade;
	

	// Recebendo numeros 
	 System.out.print("Digite a sua idade:");
	 idade = scanner.nextInt();
	 
	 // Operacionado
    if (idade <= 16) {	 
	 System.out.printf("Nao eleitor");
    }
    else if (idade >=18 && idade<=65) {	 
	 System.out.printf("Eleitor obrigatorio");
    }
    else { 
        	 System.out.printf("Eleitor facultativo");
}
        scanner.close();
    }
}
