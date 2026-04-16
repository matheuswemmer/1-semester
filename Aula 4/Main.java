import java.util.Scanner;

public class Main {
	public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Declaracao de variaveis
	 int login, senha;
	
	// Recebendo numeros 
	 System.out.print("Login:");
	 login = scanner.nextInt();
	 
	 System.out.print("Digite a quantidade do item 2:");
	 item2 = scanner.nextInt();
	 
	 // Operacionado
    if (login == 1234 || senha == 555 ) {	 
	 System.out.printf("Voce precisa de duas sacolas");
    }
    else {
        System.out.printf("Voce pode ficar com 1 sacola so");
    }
        scanner.close();
    }
}
