import java.util.Scanner;

public class Exercicio6 {
    public static void main(String[] args) {

        /*
        Questão: Calculadora de Juros Compostos
        Implemente um programa que recebe três valores: Valor inicial (C), número de
        anos (t) que o valor ficará guardado e qual o rendimento por ano (i). Monte um
        programa que u:lizando o loop for serve como uma calculadora de juros
        compostos, para apontar qual o valor total após os anos indicados. Siga a
        equação abaixo:
        M = C * Math.pow((1 + i), t)
        * */

        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe o valor inicial: ");
        double valorInicial = scanner.nextDouble();

        System.out.println("Informe o número de anos: ");
        int numeroAnos = scanner.nextInt();

        System.out.println("Informe o rendimento por ano: ");
        double rendimento = scanner.nextDouble();


        //for(DECLARACAO; CONDICAO; INCREMENTO)
        int somaJuros = 0;

        for (int t = 1; t <= numeroAnos; t++) {
            somaJuros += valorInicial * Math.pow((1 + rendimento), t);
        }

        System.out.println("O valor total após " + numeroAnos + " anos é: R$" + somaJuros);
    }

}