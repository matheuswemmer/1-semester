import java.util.Scanner;

public class Main{
	public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Declaracao de variaveis
	 float valcelular, valp;
     int qntp;
	
	 
	// Recebendo numeros 
	 System.out.print("Digite o valor do celular:");
	 valcelular = scanner.nextFloat();
     System.out.print("Digite a quantidade de parcelas desejadas:");
	 qntp = scanner.nextInt();
	 
	 // Operacionado
	 valp = (valcelular/qntp);
	 
	 // Declaracao da resolucao
	 System.out.printf("O valor de parcelamento mensal do seu celular sera: %.2f%n", valp);
        scanner.close();
    }
}