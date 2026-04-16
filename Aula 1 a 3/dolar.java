import java.util.Scanner;

public class Main{
	public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Declaracao de variaveis
	 float cotdol, dol, reais;
	 
	// Recebendo numeros 
	 System.out.print("Digite a cotacao do dolar mais recente:");
	 cotdol = scanner.nextFloat();
	 System.out.print("Digite quantos dolares voce tem:");
	 dol = scanner.nextFloat();
	 
	 
	 // Operacionando
	 reais = (dol * cotdol);
	 
	 // Declaracao da resolucao
	 System.out.printf(" Voce tem: R$ %.2f%n", reais);
        scanner.close();
    }
}