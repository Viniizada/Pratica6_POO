package br.com.Exercicios.Exercicio2;

import java.util.ArrayList;

public class Empresa {

    private String nome;
    private String cnpj ;
    private int qtde_Funcionario ;
    private Funcionario[] funcionarios;

    public Empresa(String nome, String cnpj, int qtde_Funcionario) {
        this.nome = nome;
        this.cnpj = cnpj;
        this.qtde_Funcionario = qtde_Funcionario;
    }
    public void contratar(Funcionario funcionario) {
        if (qtde_Funcionario < 100) {
            funcionarios[qtde_Funcionario] = funcionario;
            qtde_Funcionario++;
        } else {
            System.out.println("Não foi possível contratar o funcionário " + funcionario.getNome()
                    + ". Limite de funcionários atingido.");
        }
    }
    public void mostrarFuncionarios() {
        for (int i = 0; i < qtde_Funcionario; i++) {
            funcionarios[i].mostrarDados();
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public int getQtde_Funcionario() {
        return qtde_Funcionario;
    }

    public void setQtde_Funcionario(int qtde_Funcionario) {
        this.qtde_Funcionario = qtde_Funcionario;
    }

}
