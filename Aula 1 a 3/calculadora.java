import java.util.Scanner;
public class calculadora {
	public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Declaracao de variaveis
	 Float num1, num2;
	 Int soma, sub, multiplicacao;
	 
	// Recebendo numeros 
	 System.out.print("Escreva um número:");
	 num1 = scanner.nextFloat();
	 System.out.print("Escreva outro número:");
	 num2 = scanner.nextFloat();
	 
	 //somando
	 soma = num1 + num2;
	 // subtraindo
	 sub = (num1 - num2);
	 // multiplicando
	 multiplicacao = num1 * num2;
	 
	 // Declaracao da resolucao
	 System.out.printf("Soma dos dois numeros e igual a ", soma);
	 System.out.printf("A subtracao do numero 1 pelo numero 2 e igual a ", sub);
	 System.out.printf("A multiplicacao dos dois numeros e igual a ", multiplicacao);
        scanner.close();
    }
}
