package aplication;

/* Em um banco, para se cadastrar uma conta bancaria, e necessario informar o numero da conta, o nome do
titular da conta, e o valor de depósito inicial que o titular depositou ao abrir a conta. Este valor de depósito
inicial, entretanto, é opcional, ou seja: se o titular não tiver dinheiro a depositar no momento de abrir sua
conta, o depósito inicial não será feito e o saldo inicial da conta será, naturalmente, zero.

Importante: uma vez que uma conta bancária foi aberta, o número da conta nunca poderá ser alterado. Já
o nome do titular pode ser alterado (pois uma pessoa pode mudar de nome por ocasião de casamento, por
exemplo).

Por fim, o saldo da conta não pode ser alterado livremente. É preciso haver um mecanismo para proteger
isso. O saldo só aumenta por meio de depósitos, e só diminui por meio de saques. Para cada saque
realizado, o banco cobra uma taxa de $ 5.00. Nota: a conta pode ficar com saldo negativo se o saldo não for
suficiente para realizar o saque e/ou pagar a taxa.

Você deve fazer um programa que realize o cadastro de uma conta, dando opção para que seja ou não
informado o valor de depósito inicial. Em seguida, realizar um depósito e depois um saque, sempre
mostrando os dados da conta após cada operação. */
import java.util.Scanner;
import java.util.Locale;
import entities.Conta;

public class App {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        double saldoDaConta = 0, movimentoMonetario;
        char opcao;
        int opcao2 = 5;
        
        System.out.print("Insira os dados...\nNumero da conta: ");
        int numeroDaConta = sc.nextInt();
        System.out.print("Nome do proprietario: ");
        sc.nextLine();
        String nomeDoProprietario = sc.nextLine();
        System.out.print("Deseja fazer um deposito inicial? [S/N]: ");
        opcao = sc.next().charAt(0);
        opcao = Character.toUpperCase(opcao);
        
        if(opcao == 'S') {
            System.out.print("Digite a quantia que deseja depositar: ");
            saldoDaConta = sc.nextDouble();
        }

        Conta contas = new Conta(numeroDaConta, nomeDoProprietario, saldoDaConta);

        while(opcao2 != 0)
        {

            System.out.print("\nDigite a opcao desejada...\n [1 - Depositar/ 2 - Sacar/ 0 - Fechar o programa]: ");
            opcao2 = sc.nextInt();

            switch(opcao2) {
                case 0:
                    break;
                case 1:
                    System.out.print("\nDigite o valor que deseja depositar: ");
                    movimentoMonetario = sc.nextDouble();
                    contas.depositar(movimentoMonetario);
                    break;
                case 2:
                    System.out.print("\nDigite o valor que deseja sacar: ");
                    movimentoMonetario = sc.nextDouble();
                    contas.sacar(movimentoMonetario);
                    break;
                default:
                    System.out.print("Opcao INVALIDA!!");
            }
            System.out.println("\n\t__DADOS__");
            System.out.printf(" Numero da conta: %d", contas.getNumeroDaConta());
            System.out.printf("\n Nome do proprietario: %s", contas.getNomeDoProprietario());
            System.out.printf("\n Saldo: R$%.2f\n", contas.getSaldoDaConta());
        }

        sc.close();
    }
}
