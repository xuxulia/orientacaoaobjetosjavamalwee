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
		System.out.println("\n-------MENU-------");
		System.out.println("1) CADASTRAR PESSOA");
		System.out.println("2) LISTAR PESSOAS CADASTRADAS");
		System.out.println("3) CADASTRAR PRODUTOS");
		System.out.println("4) LISTAR PRODUTOS CADASTRADOS");
		System.out.println("9) SAIR DO SISTEMA");
		System.out.println("-----------------------");
	}

	public Pessoa cadastrarPessoa() {
		Pessoa pessoa = new Pessoa();
		System.out.println("---CADASTRAR PESSOA---");

		System.out.print("Informe o nome: ");
		tec.nextLine();
		pessoa.setNome(tec.nextLine());

		System.out.print("Informe o ano de nascimento: ");
		pessoa.setAnoDeNascimento(tec.nextInt());

		System.out.print("Informe a sua altura: ");
		pessoa.setAltura(tec.nextDouble());
		
		System.out.print("Informe o país: ");
		tec.nextLine();
		pessoa.setNomeDoPais(tec.nextLine());
		
		System.out.print("Informe a sigla do país: ");
		pessoa.setSiglaPais(tec.nextLine());
		
		System.out.print("Informe o estado: ");
		pessoa.setNomeDoEstado(tec.nextLine());
		
		System.out.print("Informe a sigla do estado: ");
		pessoa.setSiglaEstado(tec.nextLine());
		
		System.out.print("Informe a cidade: ");
		pessoa.setNomeDaCidade(tec.nextLine());
		
		
		System.out.print("Informe o nome do bairro: ");
		pessoa.setBairro(tec.nextLine());
		
		System.out.print("Informe o nome da rua: ");
		pessoa.setNomedaRua(tec.nextLine());
		
		System.out.print("Informe o complemento: ");
		pessoa.setComplemento(tec.nextLine());
		
		System.out.print("Informe o número: ");

		pessoa.setNumero(tec.nextInt());
		
		
		return pessoa;
		
	}

	public List<Pessoa> listarPessoas(List<Pessoa> pessoas) {
		System.out.println("--------------------------------------------------------------------PESSOAS CADASTRADAS-------------------------------------------------------------------");

		System.out.printf("| %13s | %4s | %5s | %5s | %12s | %20s | %16s | %12s | %14s | %13s | %6s |\n", "Nome", "Ano", "Idade", "Altura", "País", 
				 "Estado", "Cidade", "Bairro", "Rua", "Complemento", "Número");

		for (int i = 0; i < pessoas.size(); i++) {
			System.out.printf("| %13s | %4d | %5d | %6.2f | %5s - %3s | %5s - %3s | %16s | %12s | %14s | %13s | %6d | \n", 
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
	
	
	public Pessoa cadastrar() {
		Pessoa pessoa = new Pessoa();
		pessoa.setAltura(1.62);
		pessoa.setAnoDeNascimento(2004);
		pessoa.setBairro("Rio Cerro");
		pessoa.setComplemento("Casa");
		pessoa.setNome("Júlia");
		pessoa.setNomeDaCidade("Jaraguá Do Sul");
		pessoa.setNomedaRua("Heinz Roeder");
		pessoa.setNomeDoEstado("Santa Catarina");
		pessoa.setNomeDoPais("Brasil");
		pessoa.setNumero(70);
		pessoa.setSiglaEstado("SC");
		pessoa.setSiglaPais("BR");
		
		return pessoa;
	}
}
