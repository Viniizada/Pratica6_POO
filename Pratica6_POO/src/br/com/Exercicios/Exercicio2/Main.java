package br.com.Exercicios.Exercicio2;

public class Main {
    public static void main(String[] args){
        Funcionario[] funcionarios = new Funcionario[5];

        funcionarios[0] = new Funcionario("João", "joao@email", "(11) 1111-1111)",
                "RH", 2500.0, "01/01/2020", "123456789",true);
        funcionarios[1] = new Funcionario("Maria", "maria@email", "(22) 2222-2222",
                "Vendas", 3000.0, "02/02/2020", "987654321",true);
        funcionarios[2] = new Funcionario("José", "jose@email", "(33) 3333-3333",
                "Financeiro", 3500.0, "03/03/2020", "456789123",true);
        funcionarios[3] = new Funcionario("Ana", "ana@email", "(44) 4444-4444",
                "TI", 4000.0, "04/04/2020", "789123456",true);
        funcionarios[4] = new Funcionario("Pedro", "pedro@email", "(55) 5555-5555",
                "Marketing", 4500.0, "05/05/2020", "321654987",true);

        for (int i = 0; i < funcionarios.length; i++) {
            funcionarios[i].mostrarDados();
            System.out.println();
        }

        Empresa empresa = new Empresa("Minha Empresa","00.000.000/0001-00",5);

        for (int i = 0; i < funcionarios.length; i++) {
            empresa.contratar(funcionarios[i]);
        }

        empresa.mostrarFuncionarios();
    }
}

