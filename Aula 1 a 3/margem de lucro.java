import java.util.Scanner;

public class Main{
	public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Declaracao de variaveis
	 float custo,margem,vfinal;
	// Recebendo numeros 
	
	 System.out.print("Digite o valor de custo:");
	 custo = scanner.nextFloat();
	 System.out.print("Digite a margem de lucro esperada:");
	 margem = scanner.nextFloat();
	 
	 
	 // Operacionando
	 vfinal = ((margem/100)*custo + custo);
	 
	 // Declaracao da resolucao
	 	 System.out.printf("O valor de venda final deve ser: R$ %.2f%n", vfinal);
        scanner.close();
    }
}