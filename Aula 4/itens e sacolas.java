import java.util.Scanner;

public class Main {
	public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Declaracao de variaveis
	 int item1, item2;
	
	// Recebendo numeros 
	 System.out.print("Digite a quantidade do item 1:");
	 item1 = scanner.nextInt();
	 
	 System.out.print("Digite a quantidade do item 2:");
	 item2 = scanner.nextInt();
	 
	 // Operacionado
    if (item1 > 10 || item2 > 10 ) {	 
	 System.out.printf("Voce precisa de duas sacolas");
    }
    else {
        System.out.printf("Voce pode ficar com 1 sacola so");
    }
        scanner.close();
    }
}
