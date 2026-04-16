import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Declaração de variáveis
        int agua;

        // Solicitando a entrada do usuário
        System.out.print("Insira a quantidade de água consumida em litros:");
        agua = scanner.nextInt();

        // Verificando
        if (agua == 0) {
            System.out.println("Excelente! Você conseguiu economizar toda a água neste período");
        } 
        else if (agua > 0 && agua <= 500) {
            System.out.println("Bom trabalho! Seu consumo está dentro de um nível consciente, continue assim.");
        }  
        else if (agua > 500 && agua <= 2000) {
            System.out.println("Atenção! O consumo de água está alto. Procure maneiras de reduzir o desperdício.");
        }  
        else if (agua > 2000) {
            System.out.println("Alerta crítico! O consumo de água é excessivo. Medidas urgentes de economia devem ser tomadas.");
        } else {
        }

        scanner.close();
    }
}
