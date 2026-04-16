import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Declaracao de variaveis
	 char produto;
	 
	// Recebendo numeros 
	 System.out.print("Digite qual o produto escolhido:");
	 produto = scanner.next().toUpperCase().charAt(0); 
	 
	// verificando
	switch (produto) {
	   case 'A':
	        System.out.print("Produto com 10% de desconto,");
	        break;
	   case 'B':
	        System.out.print("Produto com 20% de desconto");
	        break;
	   case 'C':
	       System.out.print("Produto com 30% de desconto");
            break;
       default:
            System.out.print("Digite um produto valido");
            break;
	}
        scanner.close();
    }
}