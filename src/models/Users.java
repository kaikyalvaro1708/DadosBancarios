package models;

public class Users {
    private String name;
    private int senha;

    //Constructor
    public Users(String name, int senha) {
        this.name = name;
        this.senha = senha;
    }

    public String getName() {
        return name;
    }

    public int getSenha() {
        return senha;
    }
}
