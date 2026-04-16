import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Declaracao de variaveis
	 int numero;
	 
	// Recebendo numeros 
	 System.out.print("Digite um número de 1 a 7:");
	 numero = scanner.nextInt();
	 
	// verificando
	switch (numero) {
	   case 1:
	        System.out.print("Domingo");
	        break;
	   case 2:
	        System.out.print("Segunda-feira");
	        break;
	   case 3:
	        System.out.print("Terca-feira");
	        break;
	   case 4:
	        System.out.print("Quarta-feira");
	        break;
	   case 5:
	       System.out.print("Quinta-feira");
	        break;
	   case 6:
	       System.out.print("Sexta-feira");
	        break;
	   case 7:
	       System.out.print("Sabado");
	        break;
       default:
            System.out.print("Número inválido, digite um número de 1 a 7.");
            break;
	}
        scanner.close();
    }
}