package br.com.Exercicios.Exercicio1;

import java.util.ArrayList;

public class RedeSocial {

  private   int dataCriacao;
  private   String nomeUsuario;
  private   int dataNascimento;
  private   String senha;
    ArrayList<Publicacao> publicacoes = new ArrayList<> ();

    public RedeSocial(int dataCriacao, String nomeUsuario, int dataNascimento, String senha) {
        this.dataCriacao = dataCriacao;
        this.nomeUsuario = nomeUsuario;
        this.dataNascimento = dataNascimento;
        this.senha = senha;
    }
    public void inserePublicacaoes(Publicacao publi) {
        publicacoes.add(publi);
    }
    public void imprimePublicacoes(){
        System.out.println("Total de publicações: "+Publicacao.getContadorPublicacao());
        for (Publicacao publi : publicacoes){
            System.out.println("Data de publicação: "+publi.getDataPublicacao());
            System.out.println("Texto de publicação: "+publi.getTextoPublicacao());
        }
    }

    public int getDataCriacao() {
        return dataCriacao;
    }

    public void setDataCriacao(int dataCriacao) {
        this.dataCriacao = dataCriacao;
    }

    public String getNomeUsuario() {
        return nomeUsuario;
    }

    public void setNomeUsuario(String nomeUsuario) {
        this.nomeUsuario = nomeUsuario;
    }

    public int getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(int dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
}
