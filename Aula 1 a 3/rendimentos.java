import java.util.Scanner;

public class Main{
	public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Declaracao de variaveis
	 float deposito, rendimento, valorf;
	 int periodo;
	// Recebendo numeros 
	
	 System.out.print("Digite o valor depositado na poupanca:");
	 deposito = scanner.nextFloat();
	 System.out.print("Digite o periodo em meses que o dinheiro esta depositado:");
	 periodo = scanner.nextInt();
	 
	 
	 // Operacionando
	 rendimento = (deposito * 0.7f * periodo);
	 valorf = (deposito * periodo * 1.7f);
	 
	 
	 // Declaracao da resolucao
	 	 System.out.printf("O valor depositado foi de: R$ %.2f%n", deposito);
	 	 System.out.printf("Durante o periodo de " + periodo + " meses " + "rendeu um total de: R$ %.2f%n", rendimento);
         System.out.printf("Ao total voce tem: R$ %.2f%n", valorf);
        scanner.close();
    }
}