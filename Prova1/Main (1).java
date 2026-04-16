import java.util.Scanner;

public class Main {
	public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);

	int quant;
	float vuni, valdesconto, vfinal,total;
	String percentual;
// Recebendo numeros 
	 System.out.printf("=====UpStore====%n");   
	 System.out.print("Digite a quantidade de livros comprados:");
	    quant = scanner.nextInt();                  //toUpperCase() - deixa em maiusculo //scanner.next().charAt(0) lê a primeira letra de uma string 
	 System.out.print("Digite o valor unitário do livro vendido:");
	    vuni = scanner.nextFloat();
	    
	    total = vuni * quant;
	    
	 // Operacionando 
	  if (quant < 3){
	      valdesconto = 0;
	      percentual = "0%";
	      vfinal = total;
	      System.out.printf("Quantidade de livros comprados: %2d%n",quant);
	       System.out.printf("Valor total sem desconto: %2f%n",total);
	       System.out.println("Percentual de desconto aplicado:" + percentual);
	       System.out.printf("Valor do desconto: %2f%n",valdesconto);
	       System.out.printf("Valor final: %2f%n",vfinal);
	  }   
	  else if (quant == 3 || quant == 4 || quant == 5) {
	      vfinal = total - (total * 0.05f);
	      percentual = "5%";
	      valdesconto = total * 0.05f;
	      System.out.printf("Quantidade de livros comprados: %2d%n",quant);
	       System.out.printf("Valor total sem desconto: %2f%n",total);
	       System.out.println("Percentual de desconto aplicado:" + percentual);
	       System.out.printf("Valor do desconto: %2f%n",valdesconto);
	       System.out.printf("Valor final: %2f%n",vfinal);
	  }
	  else if (quant > 5 && quant <= 10) {
	      vfinal = total - (total * 0.10f);
	      percentual = "10%";
	      valdesconto = total * 0.10f;
	      System.out.printf("Quantidade de livros comprados: %2d%n",quant);
	       System.out.printf("Valor total sem desconto: %2f%n",total);
	       System.out.println("Percentual de desconto aplicado:" + percentual);
	       System.out.printf("Valor do desconto: %2f%n",valdesconto);
	       System.out.printf("Valor final: %2f%n",vfinal);
	  }
	  else if (quant > 10) {
	      vfinal = total - (total * 0.15f);
	      percentual = "15%";
	      valdesconto = total * 0.15f;
	      System.out.printf("Quantidade de livros comprados: %2d%n",quant);
	       System.out.printf("Valor total sem desconto: %2f%n",total);
	       System.out.println("Percentual de desconto aplicado:" + percentual);
	       System.out.printf("Valor do desconto: %2f%n",valdesconto);
	       System.out.printf("Valor final: %2f%n",vfinal);
	  }
	 else {
	    System.out.printf("Houve um erro. Tente novamente");

	 }
	       
            scanner.close();
    }
}
