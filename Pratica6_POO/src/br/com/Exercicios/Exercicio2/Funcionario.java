package br.com.Exercicios.Exercicio2;

public class Funcionario extends Pessoa {

    private String departamento;
    private double salario;
    private String dataEntrada;
    private String RG;
    private boolean ativo;

    public Funcionario(String nome, String email, String telefone, String departamento, double salario, String dataEntrada,
                       String RG, boolean ativo) {
        super(nome, email, telefone);
        this.departamento = departamento;
        this.salario = salario;
        this.dataEntrada = dataEntrada;
        this.RG = RG;
        this.ativo = true;
    }
    public void bonificar(double valor){
        this.salario += valor;

    }
    public void demitir(){
        this.ativo = false;
    }
    public void mostrarDados(){
        System.out.println("Nome: " + getNome());
        System.out.println("Email: " + getEmail());
        System.out.println("Telefone: " + getTelefone());
        System.out.println("Departamento: " + getDepartamento());
        System.out.println("Salario: " + getSalario());
        System.out.println("Data de entrada no banco: " +getDataEntrada());
        System.out.println("RG: " + getRG());
        System.out.println("Ativo: " + getAtivo());
    }

    public String getDepartamento() {
        return departamento;
    }

    public boolean getAtivo() {
        return ativo;
    }

    public void setAtivo(boolean ativo) {
        this.ativo = ativo;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(int salario) {
        this.salario = salario;
    }

    public String getDataEntrada() {
        return dataEntrada;
    }

    public void setDataEntrada(String dataEntrada) {
        this.dataEntrada = dataEntrada;
    }

    public String getRG() {
        return RG;
    }

    public void setRG(String RG) {
        this.RG = RG;
    }
}
