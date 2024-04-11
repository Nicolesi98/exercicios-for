import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {

        /*
         Questão: Triângulo de Asteriscos
        Crie um programa que use um loop for para desenhar um triângulo de asteriscos
        (*), onde a base do triângulo tenha 10 asteriscos.
        Ex:
        *
        **
        ***
        ****
        *****
        * */


        //for(DECLARACAO; CONDICAO; INCREMENTO)


        for (int i = 1; i <= 10; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

}