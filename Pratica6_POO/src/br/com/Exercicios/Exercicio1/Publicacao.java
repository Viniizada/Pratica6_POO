package br.com.Exercicios.Exercicio1;

public class Publicacao {

  private   int dataPublicacao;
  private String textoPublicacao;
  private   String linkMidia;
  public static double contadorPublicacao = 0.0;

    public static double contadorPublicacao() {
        return contadorPublicacao;
    }

    public Publicacao(int dataPublicacao, String textoPublicacao, String linkMidia) {
        this.dataPublicacao = dataPublicacao;
        this.textoPublicacao = textoPublicacao;
        this.linkMidia = linkMidia;
        contadorPublicacao++;
    }


    public void setTextoPublicacao(String textoPublicacao) {
        this.textoPublicacao = textoPublicacao;
    }

    public void setLinkMidia(String linkMidia) {
        this.linkMidia = linkMidia;
    }

    public int getDataPublicacao() {
        return dataPublicacao;
    }

    public String getTextoPublicacao() {
        return textoPublicacao;
    }

    public String getLinkMidia() {
        return linkMidia;
    }

    public static double getContadorPublicacao() {
        return contadorPublicacao;
    }
}
