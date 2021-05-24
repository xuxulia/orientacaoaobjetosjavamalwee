package br.com.senai;

public class ProgramaPrincipal {
	public static void main(String[] args) {
		
		
		Pessoa pessoa1 = new Pessoa();
		Pessoa pessoa2 = new Pessoa();
		Pessoa pessoa3 = new Pessoa();
		Pessoa pessoa4 = new Pessoa();
		
		//Júlia
		//Alice
		//Gabriel
		//Helena
		
		
		System.out.println("--- PESSOA 1 ---");
		pessoa1.setNome("Júlia");
		pessoa1.setAnoDeNascimento(2004);
		pessoa1.setSexo("Feminino");
		
		System.out.println("-" + pessoa1.getNome());
		System.out.println("-" + pessoa1.getAnoDeNascimento());
		System.out.println("-" + pessoa1.getSexo());
		System.out.println("----------------");
		
		System.out.println("--- PESSOA 2 ---");
		pessoa2.setNome("Alice");
		pessoa2.setAnoDeNascimento(2004);
		pessoa2.setSexo("Feminino");

		
		System.out.println("-" + pessoa2.getNome());
		System.out.println("-" + pessoa2.getAnoDeNascimento());
		System.out.println("-" + pessoa2.getSexo());
		System.out.println("----------------");
		
		System.out.println("--- PESSOA 3 ---");
		pessoa3.setNome("Gabriel");
		pessoa3.setAnoDeNascimento(2002);
		pessoa3.setSexo("Masculino");
		
		System.out.println("-" + pessoa3.getNome());
		System.out.println("-" + pessoa3.getAnoDeNascimento());
		System.out.println("-" + pessoa3.getSexo());
		System.out.println("----------------");
		
		System.out.println("--- PESSOA 4 ---");
		pessoa4.setNome("Helena");
		pessoa4.setAnoDeNascimento(2008);
		pessoa4.setSexo("Feminino");
		
		System.out.println("-" + pessoa4.getNome());
		System.out.println("-" + pessoa4.getAnoDeNascimento());
		System.out.println("-" + pessoa4.getSexo());
		System.out.println("----------------");
		
	}
}
