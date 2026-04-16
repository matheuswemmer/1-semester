import java.util.Scanner;
public class CalculaIdadeAnoAtual
{
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Declaracao de variaveis
	 int anonasc, anoatual, idade;
	 
	// Recebendo numeros 
	 System.out.print (" Escreva seu ano de nascimento:");
	 anonasc = scanner.nextInt();
	 System.out.print (" Escreva o ano atual:");
	 anoatual = scanner.nextInt();
	 
	 // Calculando idade
	 idade = anoatual - anonasc;
	 
	 // Declaracao da resolucao
	 System.out.println("Sua idade e " + idade + " anos");
        scanner.close();
    }
}
