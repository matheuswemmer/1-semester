import java.util.Scanner;

public class Main {
public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);

    int senhaCorreta = 1234, tentativa = 0;
    // Recebendo numeros 
    
    do {
        System.out.println("===Chute uma senha de 4 digitos:====");
            tentativa = scanner.nextInt(); 
            
        if (senhaCorreta != tentativa) {
            System.out.println("Continue tentando");
        }
        else {
            System.out.println("Parabens");
        }
    } while (senhaCorreta != tentativa);
            
        scanner.close();
    }
}