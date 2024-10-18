package br.com.felipe.conexão;

public class Conexao {

    private static Conexao conexao;
    public br.com.felipe.conexão.Conexao Conexao;

    private Conexao(){

        System.out.println("Banco conectado");

    }

    public static Conexao getInstance(){

        if (conexao == null){

            conexao = new Conexao();

        }
        return conexao;
    }

    public void acao(){
        System.out.println("Fazendo select no banco");
    }



}
