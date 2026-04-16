import java.util.Scanner;

public class Main{
	public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Declaracao de variaveis
	 float km, consumo, media;
	 
	// Recebendo numeros 
	 System.out.print("Digite a distancia percorrida em kilometros:");
	 km = scanner.nextFloat();
     System.out.print("Digite a quantidade de combustivel consumido em litros:");
	 consumo = scanner.nextInt();
	 
	 // Operacionando
	 media = (km/consumo);
	 
	 // Declaracao da resolucao
	 System.out.printf("O consumo medio foi: %.2f%n ", media);
	 	 System.out.printf(" A distancia percorrida: %.2f%n", km);

	 System.out.printf("Com um consumo total de: %.2f%n ", media);

        scanner.close();
    }
}