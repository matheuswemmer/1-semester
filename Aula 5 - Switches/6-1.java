import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Declaracao de variaveis
	 char produto;
	 
	// Recebendo numeros 
	 System.out.print("Digite a letra da classificacao indicativa :");
	 produto = scanner.next().toUpperCase().charAt(0); 
	 
	// verificando
	switch (produto) {
	   case 'A':
	        System.out.print("Filme para maiores de 18 anos");
	        break;
	   case 'E':
	        System.out.print("Filme para maiores de 20 anos");
	        break;
	   case 'I':
	       System.out.print("Filme para crianças de 0 a 6 anos");
            break;
        case 'O':
	       System.out.print("Filme para crianças de 7 a 14 anos");
            break;
        case 'U':
	       System.out.print("Filme para jovens de 15 a 17 anos");
            break;
       default:
            System.out.print("Digite uma letra de classificacao indicativa valida");
            break;
	}
        scanner.close();
    }
}