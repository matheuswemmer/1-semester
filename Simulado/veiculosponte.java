import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Declaracao de variaveis
	 int carros, camin, motos;
	 
	// Recebendo numeros 
	 System.out.print("Escreva a quantidade de caminhões que passaram no dia:");
	 camin = scanner.nextInt();
    System.out.print("Escreva a quantidade de carros que passaram no dia:");
	 carros = scanner.nextInt();
	   System.out.print("Escreva a quantidade de motos que passaram no dia:");
	 motos = scanner.nextInt(); 
	 
	 // 
	 
	 // Verificando o numero
	 if(camin >= 50 && carros >= 20 ) {
	     System.out.println ("O limite máximo de peso foi atingido, ponte precisa avaliação");
	 } 
	 if (motos < 100) {
	     System.out.println ("Ponte pode receber mais motos");
	 }
	 else {
	 }
        scanner.close();
    }
}
