import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {

        /*
        Questão: Soma de Ímpares
        Implemente um programa que some os números ímpares até n (especificado
        pelo usuário) usando um loop for.
        * */

        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe um número de repetição: ");
        int numero = scanner.nextInt();

        //for(DECLARACAO; CONDICAO; INCREMENTO)
        int soma = 0;

        for (int i = 1; i <= numero; i++) {

            if (i % 2 != 0) {
                System.out.println("Número ímpar: " + i);
                soma += i; // soma = soma + i;
            }

        }

        System.out.println("A soma dos números ímpares até " + numero + " é: " + soma);
    }


}