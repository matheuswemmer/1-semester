import java.util.Scanner;

public class Main {
	public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Declaracao de variaveis
	
	// Recebendo numeros 
	 System.out.println("Calculadora de Pedreiro");   
	 System.out.print("Digite o tamanho do muro que será construido:");
	    int muro = scanner.nextInt();
	   if (muro > 500) {
	     	System.out.printf("Muro acima da quantidade de metros quadrados");
	 }
	 else {
	 System.out.print("Digite o valor da hora trabalhada do pedreiro:");
	   float vhora = scanner.nextFloat();
	   
	 float total = vhora * muro;
	 	 System.out.printf("O valor total da construção será: %.2f", total);
	 }
        scanner.close();
    }
}

//Receba a quantidade de metros quadrados do muro (caso o muro seja maior que 500m output  “Muro acima da quantidade de metros quadrados"
//Receba a quantidade de metros quadrados do muro  - Receba o valor da mão de obra - Multiplique - Devolva