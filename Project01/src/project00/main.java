package project00;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        //Exercicio 1
        //int n;
        //System.out.println("Digite um numero: ");
        //n = read.nextInt();
        //if (n % 2 == 0)
        //    System.out.printf("O numero %d é PAR", n);
        //else
        //    System.out.printf("O numero %d é IMPAR", n);

        //Exercicio 2
        //pessoa Pessoa = new pessoa();
        //System.out.println("Digite seu nome:");
        //Pessoa.setName(read.nextLine());
        //System.out.println("Digite sua idade:");
        //Pessoa.setIdade(read.nextInt());
        //System.out.printf("Olá: %s, você tem %d anos.\n", Pessoa.getName(), Pessoa.getIdade());

        //Exercicio 3

        double nota1;
        double nota2;
        double media;

        System.out.println("Digite a primeira nota: ");
        nota1 = read.nextDouble();
        System.out.println("Digite a segunda nota: ");
        nota2 = read.nextDouble();
        media = (nota1 + nota2) / 2;
        System.out.printf("A Média das 2 notas é: %.1f", media);
    }
}
