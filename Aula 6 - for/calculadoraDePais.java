import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Cria o objeto Scanner para leitura de dados
        Scanner scanner = new Scanner(System.in);
    
            int i,filhos,deUmaTres,comQuatroOuMais,semFilhos;

                deUmaTres= 0;
                comQuatroOuMais= 0;
                semFilhos = 0;
                
            for (i = 1; i <= 5; i++ ) {
                System.out.println("Digite quantos filhos voce tem"); 
            filhos = scanner.nextInt();
                if (filhos <=3 && filhos > 0) {
                    deUmaTres++; 
                }
                else if (filhos >=4) {
                    comQuatroOuMais ++;
                }
                else {
                    semFilhos++;
                }
            }
               System.out.println("Pessoas que possuem de um a tres filhos: " + deUmaTres);
               System.out.println("Pessoas que possuem de um a tres filhos: " + comQuatroOuMais);
               System.out.println("Pessoas que  nao possuem filhos: " + semFilhos);


            // Fecha o scanner
        scanner.close();
    }
}