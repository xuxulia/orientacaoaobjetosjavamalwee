package br.com.senai.pessoa;

import java.util.List;
import java.util.Scanner;

public class PessoaController {

	private Scanner tec;

	public PessoaController() {
		tec = new Scanner(System.in);

	}

	public int leOpcao() {
		System.out.print("> ");
		return tec.nextInt();
	}

	public void menu() {
		System.out.println("\n--------------MENU--------------");
		System.out.println("1) CADASTRAR PESSOA");
		System.out.println("2) LISTAR PESSOAS CADASTRADAS");
		System.out.println("3) CADASTRAR PRODUTOS");
		System.out.println("4) LISTAR PRODUTOS CADASTRADOS");
		System.out.println("5) EDITAR PRODUTO");
		System.out.println("6) EXCLUIR PRODUTO");
		System.out.println("7) EDITAR PESSOAS CADASTRADAS");
		System.out.println("8) EXCLUIR PESSOA");
		System.out.println("9) SAIR DO SISTEMA");
		System.out.println("-------------------------------");
	}

	public Pessoa cadastrarPessoa() {
		Pessoa pessoa = new Pessoa();
		System.out.println("---CADASTRAR PESSOA---");

		System.out.print("Informe o nome: ");
		tec.nextLine();
		pessoa.setNome(tec.nextLine().toUpperCase());

		System.out.print("Informe o ano de nascimento: ");
		pessoa.setAnoDeNascimento(tec.nextInt());

		System.out.print("Informe a sua altura: ");
		pessoa.setAltura(tec.nextDouble());
		
		System.out.print("Informe o país: ");
		tec.nextLine();
		pessoa.setNomeDoPais(tec.nextLine().toUpperCase());
		
		System.out.print("Informe a sigla do país: ");
		pessoa.setSiglaPais(tec.nextLine().toUpperCase());
		
		System.out.print("Informe o estado: ");
		pessoa.setNomeDoEstado(tec.nextLine().toString());
		
		System.out.print("Informe a sigla do estado: ");
		pessoa.setSiglaEstado(tec.nextLine().toUpperCase());
		
		System.out.print("Informe a cidade: ");
		pessoa.setNomeDaCidade(tec.nextLine().toUpperCase());
		
		
		System.out.print("Informe o nome do bairro: ");
		pessoa.setBairro(tec.nextLine().toUpperCase());
		
		System.out.print("Informe o nome da rua: ");
		pessoa.setNomedaRua(tec.nextLine().toUpperCase());
		
		System.out.print("Informe o complemento: ");
		pessoa.setComplemento(tec.nextLine().toUpperCase());
		
		System.out.print("Informe o número: ");

		pessoa.setNumero(tec.nextInt());
		
		
		return pessoa;
		
	}

	public List<Pessoa> listarPessoas(List<Pessoa> pessoas) {
		if(pessoas.isEmpty()) {
			System.out.println("Não possui pessoas cadastradas!");
			return null;
		}
		System.out.println("--------------------------------------------------------------------PESSOAS CADASTRADAS-------------------------------------------------------------------");

		System.out.printf("| %2s | %13s | %4s | %5s | %5s | %12s | %20s | %16s | %12s | %14s | %13s | %6s |\n","ID", "Nome", "Ano", "Idade", "Altura", "País", 
				 "Estado", "Cidade", "Bairro", "Rua", "Complemento", "Número");

		for (int i = 0; i < pessoas.size(); i++) {
			System.out.printf("| %2d | %13s | %4d | %5d | %6.2f | %5s - %3s | %5s - %3s | %16s | %12s | %14s | %13s | %6d | \n", 
					i + 1,
					pessoas.get(i).getNome(),
					pessoas.get(i).getAnoDeNascimento(), 
					pessoas.get(i).getIdade(), 
					pessoas.get(i).getAltura(),
					pessoas.get(i).getNomeDoPais(),
					pessoas.get(i).getSiglaPais(),
					pessoas.get(i).getNomeDoEstado(),
					pessoas.get(i).getSiglaEstado(),
					pessoas.get(i).getNomeDaCidade(),
					pessoas.get(i).getBairro(),
					pessoas.get(i).getNomedaRua(),
					pessoas.get(i).getComplemento(),
					pessoas.get(i).getNumero());
					
		}

		return pessoas;
	
	}
	
	public List<Pessoa> editarPessoas(List<Pessoa> pessoas) {
		
		Pessoa pessoa = new Pessoa();
		listarPessoas(pessoas);
		
		if(pessoas.isEmpty()) {
			return null;
		}
		
		System.out.print("Informe o Id de pessoa para editar: ");
		int idPessoa = tec.nextInt() - 1;
		
		System.out.println("1) NOME DA PESSOA");
		System.out.println("2) ANO DE NASCIMENTO");
		System.out.println("3) ALTURA");
		System.out.println("4) PAÍS");
		System.out.println("5) SIGLA DO PAÍS");
		System.out.println("6) ESTADO");
		System.out.println("7) SIGLA DO ESTADO");
		System.out.println("8) CIDADE");
		System.out.println("9) BAIRRO");
		System.out.println("10) NOME DA RUA");
		System.out.println("11) COMPLEMENTO");
		System.out.println("12) NÚMERO DA CASA");

		System.out.print("Informe o campo para ser editado: ");
		int opcao = tec.nextInt();
		
		switch(opcao) {
		
		case 1: 
			System.out.println("---------EDITAR NOME DA PESSOA---------");
			System.out.println("Informe o novo nome da pessoa: ");
			pessoa.setNome(tec.next());
			
			pessoa.setAnoDeNascimento(pessoas.get(idPessoa).getAnoDeNascimento());
			pessoa.setAltura(pessoas.get(idPessoa).getAltura());
			pessoa.setNomeDoPais(pessoas.get(idPessoa).getNomeDoPais());
			pessoa.setSiglaPais(pessoas.get(idPessoa).getSiglaPais());
			pessoa.setNomeDoEstado(pessoas.get(idPessoa).getNomeDoEstado());
			pessoa.setSiglaEstado(pessoas.get(idPessoa).getSiglaEstado());
			pessoa.setNomeDaCidade(pessoas.get(idPessoa).getNomeDaCidade());
			pessoa.setBairro(pessoas.get(idPessoa).getBairro());
			pessoa.setNomedaRua(pessoas.get(idPessoa).getNomedaRua());
			pessoa.setComplemento(pessoas.get(idPessoa).getComplemento());
			pessoa.setNumero(pessoas.get(idPessoa).getNumero());
			
			pessoas.set(idPessoa, pessoa);
			
			break;
			
		case 2:
			System.out.println("---------EDITAR ANO DE NASCIMENTO---------");
			
			System.out.print("Informe o novo ano: ");
			pessoa.setAnoDeNascimento(tec.nextInt());
			
			pessoa.setNome(pessoas.get(idPessoa).getNome());
			pessoa.setAltura(pessoas.get(idPessoa).getAltura());
			pessoa.setNomeDoPais(pessoas.get(idPessoa).getNomeDoPais());
			pessoa.setSiglaPais(pessoas.get(idPessoa).getSiglaPais());
			pessoa.setNomeDoEstado(pessoas.get(idPessoa).getNomeDoEstado());
			pessoa.setSiglaEstado(pessoas.get(idPessoa).getSiglaEstado());
			pessoa.setNomeDaCidade(pessoas.get(idPessoa).getNomeDaCidade());
			pessoa.setBairro(pessoas.get(idPessoa).getBairro());
			pessoa.setNomedaRua(pessoas.get(idPessoa).getNomedaRua());
			pessoa.setComplemento(pessoas.get(idPessoa).getComplemento());
			pessoa.setNumero(pessoas.get(idPessoa).getNumero());
			
			pessoas.set(idPessoa, pessoa);
			
			break;
			
		case 3:
			System.out.println("---------EDITAR A ALTURA---------");
			
			System.out.print("Informe o nova altura: ");
			pessoa.setAltura(tec.nextDouble());
			
			pessoa.setNome(pessoas.get(idPessoa).getNome());
			pessoa.setAnoDeNascimento(pessoas.get(idPessoa).getAnoDeNascimento());
			pessoa.setNomeDoPais(pessoas.get(idPessoa).getNomeDoPais());
			pessoa.setSiglaPais(pessoas.get(idPessoa).getSiglaPais());
			pessoa.setNomeDoEstado(pessoas.get(idPessoa).getNomeDoEstado());
			pessoa.setSiglaEstado(pessoas.get(idPessoa).getSiglaEstado());
			pessoa.setNomeDaCidade(pessoas.get(idPessoa).getNomeDaCidade());
			pessoa.setBairro(pessoas.get(idPessoa).getBairro());
			pessoa.setNomedaRua(pessoas.get(idPessoa).getNomedaRua());
			pessoa.setComplemento(pessoas.get(idPessoa).getComplemento());
			pessoa.setNumero(pessoas.get(idPessoa).getNumero());
			
			pessoas.set(idPessoa, pessoa);
			
			break;
			
		case 4:
			System.out.println("---------EDITAR O PAÍS---------");
			
			System.out.print("Informe o novo país: ");
			pessoa.setNomeDoPais(tec.next());
			
			pessoa.setNome(pessoas.get(idPessoa).getNome());
			pessoa.setAnoDeNascimento(pessoas.get(idPessoa).getAnoDeNascimento());
			pessoa.setAltura(pessoas.get(idPessoa).getAltura());
			pessoa.setSiglaPais(pessoas.get(idPessoa).getSiglaPais());
			pessoa.setNomeDoEstado(pessoas.get(idPessoa).getNomeDoEstado());
			pessoa.setSiglaEstado(pessoas.get(idPessoa).getSiglaEstado());
			pessoa.setNomeDaCidade(pessoas.get(idPessoa).getNomeDaCidade());
			pessoa.setBairro(pessoas.get(idPessoa).getBairro());
			pessoa.setNomedaRua(pessoas.get(idPessoa).getNomedaRua());
			pessoa.setComplemento(pessoas.get(idPessoa).getComplemento());
			pessoa.setNumero(pessoas.get(idPessoa).getNumero());
			
			pessoas.set(idPessoa, pessoa);
			
			break;
			
		case 5:

			System.out.println("---------EDITAR SIGLA DO PAÍS---------");
			
			System.out.println("Informe a nova sigla: ");
			pessoa.setSiglaPais(tec.next());
			
			pessoa.setNome(pessoas.get(idPessoa).getNome());
			pessoa.setAnoDeNascimento(pessoas.get(idPessoa).getAnoDeNascimento());
			pessoa.setAltura(pessoas.get(idPessoa).getAltura());
			pessoa.setNomeDoPais(pessoas.get(idPessoa).getNomeDoPais());
			pessoa.setNomeDoEstado(pessoas.get(idPessoa).getNomeDoEstado());
			pessoa.setSiglaEstado(pessoas.get(idPessoa).getSiglaEstado());
			pessoa.setNomeDaCidade(pessoas.get(idPessoa).getNomeDaCidade());
			pessoa.setBairro(pessoas.get(idPessoa).getBairro());
			pessoa.setNomedaRua(pessoas.get(idPessoa).getNomedaRua());
			pessoa.setComplemento(pessoas.get(idPessoa).getComplemento());
			pessoa.setNumero(pessoas.get(idPessoa).getNumero());
			
			pessoas.set(idPessoa, pessoa);
			
			break;
			
		case 6:
			
			System.out.println("---------EDITAR DO ESTADO---------");
			
			System.out.println("Informe o novo estado: ");
			pessoa.setNomeDoEstado(tec.next());
			
			pessoa.setNome(pessoas.get(idPessoa).getNome());
			pessoa.setAnoDeNascimento(pessoas.get(idPessoa).getAnoDeNascimento());
			pessoa.setAltura(pessoas.get(idPessoa).getAltura());
			pessoa.setNomeDoPais(pessoas.get(idPessoa).getNomeDoPais());
			pessoa.setSiglaPais(pessoas.get(idPessoa).getSiglaPais());
			pessoa.setSiglaEstado(pessoas.get(idPessoa).getSiglaEstado());
			pessoa.setNomeDaCidade(pessoas.get(idPessoa).getNomeDaCidade());
			pessoa.setBairro(pessoas.get(idPessoa).getBairro());
			pessoa.setNomedaRua(pessoas.get(idPessoa).getNomedaRua());
			pessoa.setComplemento(pessoas.get(idPessoa).getComplemento());
			pessoa.setNumero(pessoas.get(idPessoa).getNumero());
			
			pessoas.set(idPessoa, pessoa);
			
			break;
		case 7:
			
			System.out.println("---------EDITAR SIGLA DO ESTADO---------");
			
			System.out.println("Informe a nova sigla do estado: ");
			pessoa.setNomeDoEstado(tec.next());
			
			pessoa.setNome(pessoas.get(idPessoa).getNome());
			pessoa.setAnoDeNascimento(pessoas.get(idPessoa).getAnoDeNascimento());
			pessoa.setAltura(pessoas.get(idPessoa).getAltura());
			pessoa.setNomeDoPais(pessoas.get(idPessoa).getNomeDoPais());
			pessoa.setSiglaPais(pessoas.get(idPessoa).getSiglaPais());
			pessoa.setSiglaEstado(pessoas.get(idPessoa).getSiglaEstado());
			pessoa.setNomeDaCidade(pessoas.get(idPessoa).getNomeDaCidade());
			pessoa.setBairro(pessoas.get(idPessoa).getBairro());
			pessoa.setNomedaRua(pessoas.get(idPessoa).getNomedaRua());
			pessoa.setComplemento(pessoas.get(idPessoa).getComplemento());
			pessoa.setNumero(pessoas.get(idPessoa).getNumero());
			
			pessoas.set(idPessoa, pessoa);
			
			break;
			
		default:
			System.out.println("Opção Inválida!");
		}
		
		return pessoas; 
	}

}
