package br.com.Exercicios.Exercicio3;
import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {
        ArrayList<Artigo> artigos = new ArrayList<>();
        artigos.add(new Artigo("Título do Artigo 1", "Resumo do Artigo 1", "Autor 1"));
        artigos.add(new Artigo("Título do Artigo 2", "Resumo do Artigo 2", "Autor 2"));
        artigos.add(new Artigo("Título do Artigo 3", "Resumo do Artigo 3", "Autor 3"));
        artigos.add(new Artigo("Título do Artigo 4", "Resumo do Artigo 4", "Autor 4"));
        artigos.add(new Artigo("Título do Artigo 5", "Resumo do Artigo 5", "Autor 5"));
        artigos.add(new Artigo("Título do Artigo 6", "Resumo do Artigo 6", "Autor 6"));
        artigos.add(new Artigo("Título do Artigo 7", "Resumo do Artigo 7", "Autor 7"));
        artigos.add(new Artigo("Título do Artigo 8", "Resumo do Artigo 8", "Autor 8"));
        artigos.add(new Artigo("Título do Artigo 9", "Resumo do Artigo 9", "Autor 9"));
        artigos.add(new Artigo("Título do Artigo 10", "Resumo do Artigo 10", "Autor 10"));

        Edicao edicao = new Edicao(1, 1, "01/05/2023", 1000);


        for (Artigo artigo : artigos) {
            edicao.adicionaArtigo(artigo);
        }

        RevistaCientifica revista = new RevistaCientifica("Revista Científica", 1234567890, "Mensal");


        revista.adicionaEdicao(edicao);
    }

}

