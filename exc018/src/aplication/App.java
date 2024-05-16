/* A dona de um pensionato possui dez quartos para alugar para estudantes,
sendo esses quartos identificados pelos números 0 a 9.
Fazer um programa que inicie com todos os dez quartos vazios, e depois
leia uma quantidade N representando o número de estudantes que vão
alugar quartos (N pode ser de 1 a 10). Em seguida, registre o aluguel dos
N estudantes. Para cada registro de aluguel, informar o nome e email do
estudante, bem como qual dos quartos ele escolheu (de 0 a 9). Suponha
que seja escolhido um quarto vago. Ao final, seu programa deve imprimir
um relatório de todas ocupações do pensionato, por ordem de quarto,
conforme exemplo. */
package aplication;

import java.util.Scanner;
import entities.Quarto;

public class App {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int quantidadeQuartos;

        System.out.print("Digite quantos quartos deseja alugar: ");
        quantidadeQuartos = sc.nextInt();
        Quarto[] quartos = new Quarto[quantidadeQuartos];
        sc.nextLine();
        System.out.println();

        for (int i = 0; i < quartos.length; i++) {
            System.out.println("Aluguel #" + i + ":");
            System.out.print("Nome: ");
            String nomeHospede = sc.nextLine();
            System.out.print("Email: ");
            String email = sc.nextLine();
            System.out.print("Numero do quarto: ");
            int numQuarto = sc.nextInt();
            sc.nextLine();
            while(verificarDisponibilidade(i, numQuarto, quartos) == 1) {
                System.out.println("Esse quarto ja foi reservado!!Digite novamente...");
                System.out.print("Numero do quarto: ");
                numQuarto = sc.nextInt();
                sc.nextLine();
            }

            System.out.println();

            quartos[i] = new Quarto(numQuarto, email, nomeHospede);
        }

        System.out.print("\t__Quartos ocupados__\n");
        for (int i = 0; i < quartos.length; i++) {
            System.out.println(quartos[i]);
        }

        sc.close();
    }

    public static int verificarDisponibilidade(int posicaoAtual, int numQuarto, Quarto[] quartos) {
        for(int i = 0; i < posicaoAtual; i++) {
            if(quartos[i].getNumQuarto() == numQuarto)
            {
                return 1;
            }
        }
        return 0;
    }
}
