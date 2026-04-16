import java.util.Scanner;

public class Main {
	public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
 //6.2) Escreva um algoritmo que receba a quantidade de um produto vendido e o valor unitário do produto. 
 // Calcule o valor total da compra. 
 // Se a compra for paga com cartão de crédito, aplique acrescente 10% no valor total da compra. 
 //Se a compra for paga por pix, dê um desconto de 10% no total da compra. 
 //Se a compra for paga em dinheiro dê um desconto de 20% no total da compra. 
 //Ao final o programa deve mostrar o valor total da compra, o valor do desconto aplicado e o valor total da compra.
        // Declaracao de variaveis
	int quant, mpagamento;
	float vuni, total;
	String mensagem;
// Recebendo numeros 
	 System.out.printf("=====Sistema de Supermercado==== %n Métodos de pagamento %n 1 = Crédito %n 2 = Pix %n 3 = Dinheiro%n");   
	 System.out.print("Digite o método de pagamento:");
	    mpagamento = scanner.nextInt();                  //toUpperCase() - deixa em maiusculo //scanner.next().charAt(0) lê a primeira letra de uma string 
	 System.out.print("Digite a quantidade vendida:");
	    quant = scanner.nextInt();
	 System.out.print("Digite o valor unitário do produto vendido:");
	    vuni = scanner.nextFloat();
// Operacionando 
	  switch (mpagamento) {
	      case 1:
	          total = vuni * 1.1f * quant;
	          mensagem = "O valor total é" + total;
	       break;
	      case 2:
	          total = vuni * 0.9f * quant;
	          mensagem = "O valor total é" + total;
	       break;
	       case 3:
	           total = vuni * 0.8f * quant;
	          mensagem = "O valor total é" + total;
	       break;
	       default:
	          mensagem = "Método de pagamento inválido";
           break;	      
	  }
	       System.out.printf(mensagem);
	        
            scanner.close();
    }
}

