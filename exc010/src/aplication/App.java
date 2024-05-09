package aplication;

import java.util.Locale;
import entities.Product;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        int op = 8, quantity = 0;

        Product product;
        product = new Product();

        System.out.print("Digite o nome do produto: ");
        product.name = sc.next();
        System.out.printf("Digite o preco do %s: ", x.name);
        product.price = sc.nextDouble();
        System.out.printf("Digite a quantidade de %s: ", x.name);
        product.quantity = sc.nextInt();

        
        while (op != 0) {
            System.out.printf("\n\tProduto: %s\n\tPreco: R$%.2f\n\tQuantidade: %d\n\tValor total em estoque: R$%.2f", product.name, product.price, product.quantity, product.totalValueInStock());
            System.out.println("\n\nDigite...\n (1) Adicionar produtos.\n (2) Remover produtos.\n (0) Fechar programa.");

            op = sc.nextInt();

            switch (op) {
                case 0:
                    op = 0;
                    break;

                case 1:
                    System.out.print("Digite a quantidade que deseja adicionar: ");
                    quantity = sc.nextInt();
                    product.addProduct(quantity);
                    break;

                case 2:
                    System.out.print("Digite a quantidade que deseja remover: ");
                    quantity = sc.nextInt();
                    product.removeProduct(quantity);
                    break;

                default:
                    System.out.println("Opcao INVALIDA!!");
                    break;
            }
        }

        sc.close();
    }
}
