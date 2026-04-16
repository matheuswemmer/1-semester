import java.util.Scanner;

public class chuvarada {
	public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Declaracao de variaveis
	 float chuv1,chuv2,chuv3,chuv4,chuv5,media;
	
	 
	// Recebendo numeros 
	 System.out.print("Escreva em mm a quantidade de chuva do dia 1:");
	 chuv1 = scanner.nextFloat();
	 System.out.print("Escreva em mm a quantidade de chuva do dia 2:");
	 chuv2 = scanner.nextFloat();
	 System.out.print("Escreva em mm a quantidade de chuva do dia 3:");
	 chuv3 = scanner.nextFloat();
	 System.out.print("Escreva em mm a quantidade de chuva do dia 4:");
	 chuv4 = scanner.nextFloat();
	 System.out.print("Escreva em mm a quantidade de chuva do dia 5:");
	 chuv5 = scanner.nextFloat();  
	 
	 // Operacionado
	 media = ((chuv1+chuv2+chuv3+chuv4+chuv5)/5);
	 
	 // Declaracao da resolucao
	 System.out.printf("A media de chuva desta semana foi %.2f%n", media);
        scanner.close();
    }
}
