import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int i, contador, opcao, total;
        int chaVerde = 0;
        int chaPreto = 0;
        int chaBranco = 0;

        do {
            System.out.println("=== MENU DE OPÇÕES ===");
            System.out.println("1. Chá Verde (R$ 5,00)");
            System.out.println("2. Chá Preto (R$ 6,00)");
            System.out.println("3. Chá Branco (R$ 3,00)");
            System.out.println("9 - Totalizar Dia das Mães");
            opcao = scanner.nextInt();
            
            if (opcao == 1) {
    	        System.out.print("Quantidade de xícaras de Chá Verde:");
                contador = scanner.nextInt();
                chaVerde += contador;
            }

            if (opcao == 2) {
                System.out.print("Quantidade de xícaras de Chá Preto:");
                contador = scanner.nextInt();
                chaPreto += contador;
            }
            if (opcao == 3) {
                System.out.print("Quantidade de xícaras de Chá Branco:");
                contador = scanner.nextInt();
                chaBranco += contador;
            }
            contador = 0;
        } while (opcao != 9);
            System.out.println("===TOTAL DO DIA DAS MÃES===");
            System.out.println("Chá Verde: " + chaVerde + " xícaras" + "= " + "R$" + (chaVerde * 5));
            System.out.println("Chá Preto: " + chaPreto + " xícaras" + "= " + "R$" + (chaPreto * 6));
            System.out.println("Chá Verde: " + chaVerde + " xícaras" + "= " + "R$" + (chaBranco * 3));
            total = (chaVerde *5) + (chaPreto * 6) + (chaBranco * 3);
            System.out.println("TOTAL GERAL DE VENDAS:" + total);
            
        scanner.close();
    }
}
