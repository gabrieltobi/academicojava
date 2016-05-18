import java.util.Scanner;

public class Interface
{
    ListaDePessoas listaPessoas = new ListaDePessoas();
    private int opcaoMenu = -1;

    public int Menu() {
        Scanner sc = new Scanner(System.in);

        System.out.println("\n------------------Menu------------------");
        System.out.println("Incluir uma pessoa:");
        System.out.println("  1 -Incluir aluno");
        System.out.println("  2 -Incluir funcionario");
        System.out.println("  3 -Incluir professor");
        System.out.println("4 - Pesquisar pessoas por curso");
        System.out.println("0 - Sair");
        System.out.println("----------------------------------------");

        return sc.nextInt();
    }   

    public void incluir(int tipoPessoa) {
        Scanner sc = new Scanner(System.in);
        String nome = "";
        String curso = "";
        int idade = 0;
        Pessoa p = new Pessoa("", 0, "");

        System.out.print("\nInforme o nome da pessoa: ");
        nome = sc.nextLine();
        System.out.print("Informe a idade da pessoa: ");
        idade = sc.nextInt();
        sc.nextLine(); //Desbugar scanner
        System.out.print("Informe o curso da pessoa: ");
        curso = sc.nextLine();

        if (tipoPessoa == 1) {
            p = new Aluno(nome, idade, curso);
        } else if(tipoPessoa == 2) {
            p = new Funcionario(nome, idade, curso);
        } else {
            p = new Professor(nome, idade, curso);
        }

        listaPessoas.incluirPessoa(p);
        System.out.println("\nPessoa incluída");
    }

    public void consultaPorCurso() {
        Scanner sc = new Scanner(System.in);
        String curso = "";

        System.out.print("\nInforme o curso pelo qual deseja filtrar: ");
        curso = sc.nextLine();

        ListaDePessoas ldp = listaPessoas.pessoasDoCurso(curso);
        int quantidade = ldp.quantidade();
        if (quantidade > 0) {
            System.out.println("\nPessoas encontradas:");
            for (int i = 0; i < quantidade; i ++) {
                System.out.println(" - " + ldp.get(i).getNome());
            }
        } else {
            System.out.println("\nNenhuma pessoa encontrada no curso '" + curso + "'");
        }
    }

    public void Iniciar() {            
        while (opcaoMenu != 0) {
            opcaoMenu = Menu();

            switch (opcaoMenu) {
                case 1:
                incluir(1);
                break;

                case 2:
                incluir(2);
                break;

                case 3:
                incluir(3);
                break;

                case 4:
                consultaPorCurso();
                break;

                case 0:
                System.out.println("\nAté logo.");
                break;

                default:
                System.out.println("\nERRO: Opção Inválida");
                break;
            }
        }
    }
}
