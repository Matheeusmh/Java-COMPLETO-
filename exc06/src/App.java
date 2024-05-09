/*Fazer um programa que leia o número de um funcionário, seu número de horas trabalhadas, o valor que recebe por 
hora e calcula o salário desse funcionário. A seguir, mostre o número e o salário do funcionário, com duas casas 
decimais. */
import java.util.Scanner;
import java.util.Locale;

public class App {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);
        int hours, number;
        double price, salary;
        
        System.out.print("Digite o numero do funcionario: ");
        number = sc.nextInt();
        System.out.printf("Digite as horas trabalhadas do funcionario %d: ", number);
        hours = sc.nextInt();
        System.out.print("Digite o valor da hora desse funcionario: U$");
        price = sc.nextDouble();
        
        salary = hours * price;
        
        System.out.println("\nNumber: " + number);
        System.out.printf("Salary: %.2f\n", salary);

        sc.close();
    }
}
