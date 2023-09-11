import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double saldo = 2500.0;
        String user = "";

        System.out.println("""
                | Olá, seja bem-vindo
                | Digite 1, caso já tenha uma conta conosco
                | Digite 0, caso ainda não tenha uma conta
                | 
                """);

        int numberChoose = scanner.nextInt();

        if (numberChoose == 1) {
            Logged.AccountLogged();
        } else if (numberChoose == 0) {
            Register.RegisterAccount();
        } else {
            System.out.println("Tente novamente");
        }
    }

}