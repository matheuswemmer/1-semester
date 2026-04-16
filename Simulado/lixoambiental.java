import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Declaração de variáveis
        float quantidadeLixo;

        // Solicitando a entrada do usuário
        System.out.print("Digite a quantidade de lixo jogado na natureza (em kg): ");
        quantidadeLixo = scanner.nextFloat();

        // Verificando o nível de poluição com base na quantidade de lixo
        if (quantidadeLixo == 0) {
            System.out.println("Parabéns! Você está ajudando a manter o meio ambiente limpo.");
        } 
        if (quantidadeLixo > 0 && quantidadeLixo <= 10) {
            System.out.println("Cuidado! A quantidade de lixo pode causar danos ao meio ambiente. Por favor, não jogue lixo na natureza.");
        }  
        if (quantidadeLixo > 10 && quantidadeLixo <= 50) {
            System.out.println("Alerta! A quantidade de lixo está prejudicando o meio ambiente. É importante recolher o lixo e descartá-lo corretamente.");
        }  
        if (quantidadeLixo > 50) {
            System.out.println("Emergência ambiental! A quantidade de lixo é extremamente alta. Medidas drásticas devem ser tomadas para evitar desastres ambientais.");
        } else {
        }

        scanner.close();
    }
}
