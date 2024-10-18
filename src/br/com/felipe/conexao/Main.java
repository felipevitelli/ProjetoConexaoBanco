package br.com.felipe.conexao;

public class Main {
    public static void main(String[] args) {
        br.com.felipe.conexão.Conexao conexao1 = br.com.felipe.conexão.Conexao.getInstance();
        conexao1.acao();

        br.com.felipe.conexão.Conexao conexao2 = br.com.felipe.conexão.Conexao.getInstance();
        conexao2.Conexao.getInstance();

        System.out.println(conexao1==conexao2);


    }
}