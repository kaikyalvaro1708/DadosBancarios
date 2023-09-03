import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        String user = leitor.nextLine();
        double saldo = 2500.0;

        System.out.println("Olá, seja bem-vindo novamente!");
        System.out.println("Digite seu nome completo para começar: ");

        System.out.println("****************");
        System.out.println("Dados inicias do cliente: ");

        System.out.println("Nome: " + user);
        System.out.println("Tipo de conta: corrente");
        System.out.println("Saldo inicial: R$" + saldo);
        System.out.println("****************");

        //OPERACOES
        System.out.println("""
                ---------------------------------------------
                Digite o número correspondente ao que deseja:
                1- Consultar dados
                2- Receber valor
                3- Transferir valor
                4- Sair 
                ----------------------------------------------
                """);

        //SWITCH
        int numeroDigitado = leitor.nextInt();

        switch(numeroDigitado){
            case 1:
                System.out.println(user);
                System.out.println(saldo);
                break;
            case 2:
                System.out.println("Digite o valor a receber: ");
                double valorReceber = leitor.nextDouble();
                double saldoAtualizado = saldo +  valorReceber;
                System.out.println(saldoAtualizado);
                break;
            case 3:
                System.out.println("Digite o valor a transferir: ");
                double valorTransferir = leitor.nextDouble();
                double novoSaldo = saldo +  valorTransferir;
                System.out.println(novoSaldo);
                break;
            case 4:
                System.out.println("Você foi deslogado");
                break;
            default:
                System.out.println("Digite um número válido");
        }

    }
}