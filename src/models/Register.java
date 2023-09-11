package models;

import com.sun.tools.javac.Main;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;

public class Register extends Users{
    //Constructor
    public Register(String nome, int senha) {
        super(nome, senha);
    }

    public static void RegisterAccount(){
        Scanner scanner = new Scanner(System.in);
        List<Users> accounts = new ArrayList<>();


        System.out.println("""
               | Para fazer o cadastro
               | Digite as informações a seguir: 
               """);

        //Nome e senha
        System.out.println("| Digite seu nome: ");
        String name = scanner.nextLine();

        System.out.println("| Digite sua senha: ");
        int senha = scanner.nextInt();

        // adicionando na lista
        Users newAccount = new Users(name, senha);
        accounts.add(newAccount);

        System.out.println("Conta criada com sucesso!");

        scanner.close();
    }
}
