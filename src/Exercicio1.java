import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {

        /*
        * Questão: Tabuada de Mul0plicação
        Implemente um programa que solicite ao usuário um número inteiro e, em
        seguida, use um loop for para exibir a tabuada de mul:plicação desse número
        de 1 a 10
        * */

        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe um número inteiro: ");
        int numero = scanner.nextInt();

        //for(DECLARACAO; CONDICAO; INCREMENTO)

        tabuada(numero);
    }

    private static void tabuada(int numero) {
        for (int i = 1; i <= 10; i++) {
            int resultado = numero * i;
            System.out.println(numero + " x " + i + " = " + resultado);
        }
    }
}