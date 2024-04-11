import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {

        /*
        Questão: Números Primos
        Implemente um programa que encontre e exiba os números primos até n
        (especificado pelo usuário) usando um loop for
        * */

        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe um número de repetição: ");
        int numero = scanner.nextInt();

        //for(DECLARACAO; CONDICAO; INCREMENTO)


        for (int i = 1; i <= numero; i++) {
            if (isPrime(i)) {
                System.out.println("Número primo: " + i);
            }
        }
    }

    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }


}