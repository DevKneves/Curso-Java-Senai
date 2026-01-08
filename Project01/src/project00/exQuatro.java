package project00;
import java.util.Scanner;

// Exercicio dia 07/01/2026

public class exQuatro {
    static public void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite seu nome: ");
        String name = sc.nextLine();
        System.out.print("Digite sua data de nascimento (DD/MM/AAAA): ");
        String datanasc = sc.nextLine();

        int anonasc = Integer.parseInt(datanasc.substring(6, 10));
        int idade = 2026 - anonasc;
        System.out.printf("Olá, %s. Sua idade é: %d\n", name, idade);
    }
}
