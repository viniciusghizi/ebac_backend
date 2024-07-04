import java.util.ArrayList;
import java.util.Scanner;
import java.util.stream.Stream;

import model.Pessoa;

public class Colecao {
    public static void main(String[] args) {
        int funcao;
        String nome="";
        ArrayList<Pessoa> pessoas = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        Pessoa p1 = new Pessoa();
        do {
            System.out.println("---------------------------------------");
            System.out.println("1 - Para cadastrar uma pessoa do Sexo Masculino");
            System.out.println("2 - Para cadastrar uma pessoa do Sexo Feminino");
            System.out.println("3 - Listar pessoas do Sexo Masculino");           
            System.out.println("4 - Listar pessoas do Sexo Masculino");
            System.out.println("0 - Sair");
            System.out.println("---------------------------------------");
            funcao = sc.nextInt();

            if (funcao == 1 || funcao == 2) {
                System.out.println("Digite um nome para a pessoa");
                nome = sc.next();
            }
            switch (funcao) {
                case 1:
                    System.out.println("Cadastrando a pessoa do Sexo Masculino: ");
                    p1 = cadastrar(nome, "masculino");
                    System.out.println("O nome da pessoa é " + p1.getNome() + " e o sexo: " + p1.getSexo());
                    pessoas.add(p1);
                    break;
                case 2:
                    System.out.println("Cadastrando a pessoa do Sexo Feminino: "); 
                    p1 = cadastrar(nome, "feminino");
                    System.out.println("O nome da pessoa é " + p1.getNome() + " e o sexo: " + p1.getSexo());
                    pessoas.add(p1);
                    break;
                case 3:
                    System.out.println("As pessoas do sexo Masculino são: "); 
                    for (int i = 0; i < pessoas.size(); i++) {
                        if ( pessoas.get(i).getSexo().equals("masculino") ) {
                            System.out.println(pessoas.get(i).getNome());
                        }
                    }
                    break;
                case 4:
                    System.out.println("As pessoas do sexo Feminino são: ");                    
                    for (int i = 0; i < pessoas.size(); i++) {
                        if ( pessoas.get(i).getSexo().equals("feminino") ) {
                            System.out.println(pessoas.get(i).getNome());
                        }
                    }
                    break;
                case 0:
                    System.exit(1);
                    break;
                default:
                    System.out.println("Função invalida.");
                    break;
            }
        } while (funcao != 0);
    }

    public static Pessoa cadastrar(String nome,String sexo) {
        Pessoa p = new Pessoa();
        p.setNome(nome);
        if (sexo.equalsIgnoreCase("masculino")) {
            p.setSexo(sexo);
        } else {
            p.setSexo(sexo);
        }
        return p;
    }
}
