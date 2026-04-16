import java.util.Scanner;

public class Main{
	public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Declaracao de variaveis
	 float gcelsius, gfahrenheit;
	 
	// Recebendo numeros 
	 System.out.print("Digite a temperatura que voce deseja converter em graus celsius:");
	 gcelsius = scanner.nextFloat();
	 
	 // Operacionando
	 gfahrenheit = ((9 * gcelsius + 160)/5);
	 
	 // Declaracao da resolucao
	 System.out.printf(" Temperatura convertida" + gfahrenheit);
        scanner.close();
    }
}