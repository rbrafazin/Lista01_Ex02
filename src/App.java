import java.util.Scanner;

public class App {

    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número: ");
        double n = sc.nextDouble();

        System.out.print("O número informado foi " + n);

        sc.close();

    }

}
