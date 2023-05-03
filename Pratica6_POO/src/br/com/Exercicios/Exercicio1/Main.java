package br.com.Exercicios.Exercicio1;
import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {

    int dataCriacao = Integer.parseInt(JOptionPane.showInputDialog("Digite a data de criacão: "));
    String nomeUsuario = JOptionPane.showInputDialog("Digite o nome de usuário: ");
    int dataNascimento = Integer.parseInt(JOptionPane.showInputDialog("Digite a data de nascimento: "));
    String senha = JOptionPane.showInputDialog("Digite a senha: ");

    RedeSocial redeSocial = new RedeSocial(dataCriacao,nomeUsuario,dataNascimento,senha);

    int dataPublicacao = Integer.parseInt(JOptionPane.showInputDialog("Digite a data de publicão: "));
    String textoPulicacao = JOptionPane.showInputDialog("Digite o texto para pulicação: ");
    String linkMidia = JOptionPane.showInputDialog("cole o link de midia: ");

    Publicacao publi1 = new Publicacao(dataPublicacao,textoPulicacao,linkMidia);

        int dataPublicacao2 = Integer.parseInt(JOptionPane.showInputDialog("Digite a data de publicão: "));
        String textoPulicacao2 = JOptionPane.showInputDialog("Digite o texto para pulicação: ");
        String linkMidia2 = JOptionPane.showInputDialog("cole o link de midia: ");

        Publicacao publi2 = new Publicacao(dataPublicacao2,textoPulicacao2,linkMidia2);

        redeSocial.inserePublicacaoes(publi1);
        redeSocial.inserePublicacaoes(publi2);
        redeSocial.imprimePublicacoes();


    }
}