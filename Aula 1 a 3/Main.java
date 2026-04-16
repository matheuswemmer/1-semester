import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Declaracao de variaveis
	 float distkm, gasto, consum;
	 
	// Recebendo numeros 
	 System.out.print("Escreva a distancia percorrida em Km:");
	 distkm = scanner.nextFloat();
    System.out.print("Escreva o total de combustivel gasto em litros:");
	 gasto = scanner.nextFloat();
	 
	 // 
	 
	 consum = (distkm/gasto);
	 
	 // Verificando o numero
	 if(consum >= 10 ) {
	     System.out.println ("Economico");
	 } 
	 else {
            System.out.println("Troque");
	 }
        scanner.close();
    }
}
