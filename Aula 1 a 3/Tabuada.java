import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Declaracao de variaveis
	 int num1;
	 
	// Recebendo numeros 
	 System.out.print("Escreva o número que voce gostaria de saber a tabuada:");
	 num1 = scanner.nextInt();

	 // Declaracao da resolucao
	 System.out.println("Tabuada do numero " + num1);

	 System.out.println(num1 + " x 1 = " + (num1 * 1));
	 System.out.println(num1 + " x 2 = " + (num1 * 2));
	 System.out.println(num1 + " x 3 = " + (num1 * 3));
	 System.out.println(num1 + " x 4 = " + (num1 * 4));
	 System.out.println(num1 + " x 5 = " + (num1 * 5));
	 System.out.println(num1 + " x 6 = " + (num1 * 6));
	 System.out.println(num1 + " x 7 = " + (num1 * 7));
	 System.out.println(num1 + " x 8 = " + (num1 * 8));
	 System.out.println(num1 + " x 9 = " + (num1 * 9));
	 System.out.println(num1 + " x 10 = " + (num1 * 10));

        scanner.close();
    }
}
