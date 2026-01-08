package project00;
import java.util.Scanner;

//EXERCICIO 02 - Acrescentar a estrutura para validar se é número é inteiro e maior que zero
public class validarInteiro {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um numero inteiro: ");
        if (sc.hasNextInt()) {
            int nbr = sc.nextInt();
            if (nbr > 0)
                System.out.printf("O numero: %d é maior que 0\n", nbr);
            else
                System.out.printf("O numero: %d é menor ou igual a 0\n", nbr);
        }
        else
            System.out.println("O valor inserido não é um caracter numerico");
        sc.close();
    }
}
