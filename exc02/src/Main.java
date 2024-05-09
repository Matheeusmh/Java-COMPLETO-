import java.util.Scanner;
import java.util.Locale;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int hours, number;
        double price, salary;

        Locale.setDefault(Locale.US);

        System.out.print("Digite o numero do funcionario: ");
        number = sc.nextInt();
        System.out.printf("Digite as horas trabalhadas do funcionario %d: ", number);
        hours = sc.nextInt();
        System.out.print("Digite o valor da hora desse funcionario: U$");
        price = sc.nextDouble();

        salary = ((double) hours) * price;

        System.out.printf("\nNumber: %d\n", number);
        System.out.printf("Salary: %.2f\n", salary);


        sc.close();
    }
}