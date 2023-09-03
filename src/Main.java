import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        double saldo = 2500.0;
        String user = "";

        //BOAS VINDAS
        System.out.println(""" 
                Olá, seja bem-vindo novamente!"
                Digite seu nome completo para começar:
                """);
        user = leitor.nextLine();


        while (true){
            System.out.println("---------------------------------------------");
            System.out.println("Dados inicias do cliente: ");
            System.out.println("Nome: " + user);
            System.out.println("Tipo de conta: corrente");
            System.out.println("Saldo: R$" + saldo);
            System.out.println("---------------------------------------------");

            //MENU DE COMANDO
            System.out.println("""
                    ---------------------------------------------
                    Digite o número correspondente ao que deseja:
                    1- Consultar dados
                    2- Receber valor
                    3- Transferir valor
                    4- Sair\s
                    ----------------------------------------------
                    """);

            //SWITCH
            int numeroDigitado = leitor.nextInt();

            switch (numeroDigitado) {
                case 1 -> {
                    System.out.println("Nome: " + user);
                    System.out.println("Saldo: " + saldo);
                }
                case 2 -> {
                    System.out.println("Digite o valor a receber: ");
                    double valorReceber = leitor.nextDouble();
                    saldo += valorReceber;
                    System.out.println("Saldo atualizado: R$" + saldo);
                }
                case 3 -> {
                    System.out.println("Digite o valor a transferir: ");
                    double valorTransferir = leitor.nextDouble();
                    if(valorTransferir <= saldo) {
                        saldo -= valorTransferir;
                        System.out.println("Saldo atualizado: R$" + saldo);
                    }else{
                        System.out.println("Saldo insuficiente para a transferência.");
                    }
                }
                case 4 -> {
                    System.out.println("Você foi deslogado");
                    leitor.close();
                    System.exit(0);
                }
                default -> System.out.println("Digite um número válido");
            }
        }
    }
}