package lists;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import listEntities.Funcionario;

public class test {

    // Método para verificar se um ID já existe na lista
    public static boolean idExiste(List<Funcionario> funcionarios, int id) {
        for (Funcionario funcionario : funcionarios) {
            if (funcionario.getId() == id) {
                return true; // Retorna true se o ID já existir
            }
        }
        return false; // Retorna false se o ID não for encontrado
    }

    // Método para adicionar um novo funcionário à lista
    public static void adicionarFuncionario(List<Funcionario> funcionarios) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o ID do funcionário: ");
        int id = scanner.nextInt();

        // Verifica se o ID já existe
        if (idExiste(funcionarios, id)) {
            System.out.println("Erro: Um funcionário com esse ID já existe.");
            return; // Sai do método sem adicionar o funcionário
        }

        // Caso o ID não exista, continua a inserção
        System.out.print("Digite o nome do funcionário: ");
        String nome = scanner.next();
        System.out.print("Digite o salário do funcionário: ");
        double salario = scanner.nextDouble();

        Funcionario novoFuncionario = new Funcionario(id, nome, salario);
        funcionarios.add(novoFuncionario);

        System.out.println("Funcionário adicionado com sucesso: " + novoFuncionario);
    }

    public static void main(String[] args) {
        List<Funcionario> funcionarios = new ArrayList<>();

        // Exemplo de inserção com verificação de ID
        adicionarFuncionario(funcionarios); // Primeiro funcionário
        adicionarFuncionario(funcionarios); // Tenta adicionar outro funcionário
        adicionarFuncionario(funcionarios);
        adicionarFuncionario(funcionarios);
        adicionarFuncionario(funcionarios);
    }
}