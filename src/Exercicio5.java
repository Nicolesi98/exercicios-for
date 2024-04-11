import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args) {

        /*
        Questão: Impressão de Padrão Numérico
        Crie um programa que recebendo um número de linhas do usuário, imprimirá
        um padrão numérico como o seguinte:
        1
        22
        333
        4444
        55555
        * */

        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe um número de repetição: ");
        int numero = scanner.nextInt();


        //for(DECLARACAO; CONDICAO; INCREMENTO)


        for (int i = 1; i <= numero; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(i);
            }
            System.out.println();
        }
    }

}