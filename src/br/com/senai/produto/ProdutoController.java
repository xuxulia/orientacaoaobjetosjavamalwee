package br.com.senai.produto;

import java.util.List;
import java.util.Scanner;

public class ProdutoController {
	
	private Scanner tec;

	public ProdutoController() {
		tec = new Scanner(System.in);
	}
	
		public Produto cadastrarProduto() {
			Produto produto = new Produto();

			System.out.println("----------CADASTRAR PRODUTO----------");

			System.out.print("Informe o nome do produto: ");
			produto.setNomeDoProduto(tec.next().toUpperCase());

			System.out.print("Informe o valor unitario do produto: ");
			produto.setValorUnitarioDoProduto(tec.nextDouble());

			System.out.print("Informe a quantidade do produto: ");
			produto.setQuantidadeDoProduto(tec.nextInt());
			produto.setValorTotalDoProduto(produto.getQuantidadeDoProduto()*produto.getValorUnitarioDoProduto());
	
			return produto;
	}
	
		public List<Produto> listarProdutos(List<Produto> produtos) {
			
			if(produtos.isEmpty()) {
				System.out.println("N�o possui produtos cadastrados!");
				return null;
			}
			System.out.println("----------------------------------PRODUTOS CADASTRADOS---------------------------------");
			
			System.out.printf("| %2s | %18s | %18s | %20s | %18s |\n", "ID" , "Nome", "Valor unit�rio", "Quantidade", "Valor total");

			for (int i = 0; i < produtos.size(); i++) {
				System.out.printf("| %2d | %18s | %18.2f | %20d | %18.2f | \n",
						i + 1,
						produtos.get(i).getNomeDoProduto(),
						produtos.get(i).getValorUnitarioDoProduto(), 
						produtos.get(i).getQuantidadeDoProduto(), 
						produtos.get(i).getValorTotalDoProduto());
		}
			return produtos;
	}
		public List<Produto> editarProduto(List<Produto> produtos) {
			
			Produto produto = new Produto();
			listarProdutos(produtos);
			
			if(produtos.isEmpty()) {
				return null;
			}
			
			System.out.println("Informe o Id do produto para editar: ");
			int idProduto = tec.nextInt() - 1;
			
			System.out.println("1) NOME DO PRODUTO");
			System.out.println("2) QUANTIDADE DO PRODUTO");
			System.out.println("3) VALOR UNIT�RIO DO PRODUTO");
			System.out.print("Informe o campo para ser editado: ");
			int opcao = tec.nextInt();
			switch(opcao) {
			case 1: 
				System.out.println("---------EDITAR NOME DO PRODUTO---------");
				System.out.println("Informe o novo nome do produto: ");
				produto.setNomeDoProduto(tec.next());
				produto.setQuantidadeDoProduto(produtos.get(idProduto).getQuantidadeDoProduto());
				produto.setValorTotalDoProduto(produtos.get(idProduto).getValorTotalDoProduto());
				produto.setValorUnitarioDoProduto(produtos.get(idProduto).getValorUnitarioDoProduto());
				
				produtos.set(idProduto, produto);
				
				produto.setValorTotalDoProduto(produto.getQuantidadeDoProduto() * produto.getValorUnitarioDoProduto());
				
				break;
				
			case 2:
				System.out.println("---------EDITAR QUANTIDADE DE PRODUTO---------");
				System.out.println("Informe a nova quantidade do produto: ");
				produto.setQuantidadeDoProduto(tec.nextInt());
				
				produto.setNomeDoProduto(produtos.get(idProduto).getNomeDoProduto());
				produto.setValorTotalDoProduto(produtos.get(idProduto).getValorTotalDoProduto());
				produto.setValorUnitarioDoProduto(produtos.get(idProduto).getValorUnitarioDoProduto());
				produto.setValorTotalDoProduto(produto.getQuantidadeDoProduto()*produto.getValorUnitarioDoProduto());
				
				produtos.set(idProduto, produto);
				
				break;
				
			case 3:
				System.out.println("---------EDITAR O VALOR UNIT�RIO DO PRODUTO---------");
				System.out.println("Informe um novo valor unit�rio: ");
				produto.setValorUnitarioDoProduto(tec.nextDouble());
				
				produto.setNomeDoProduto(produtos.get(idProduto).getNomeDoProduto());
				produto.setQuantidadeDoProduto(produtos.get(idProduto).getQuantidadeDoProduto());
				produto.setValorTotalDoProduto(produtos.get(idProduto).getValorTotalDoProduto());
				
				produtos.set(idProduto, produto);
				
				produto.setValorTotalDoProduto(produto.getQuantidadeDoProduto() * produto.getValorUnitarioDoProduto());
				
				break;
				
			default:
				System.out.println("Op��o Inv�lida!");
			}
			
			return produtos; 
		}

		public void excluirProduto(List<Produto>produtos) {
			listarProdutos(produtos);
			
			if(produtos.isEmpty()) {
				return;
			}
			
			System.out.println("----------EXCLUIR PRODUTO----------");
			System.out.print("informe o ID do produto para excluir: ");
			int idProduto = tec.nextInt() - 1;
			
			if(produtos.size() <= idProduto) {
				System.out.println("Produto n�o cadastrado!");
				return;
			}
			
			produtos.remove(idProduto);
			
			
		}
		
		public List<Produto> menuProduto(List<Produto> produtos) {
			
			Produto produto = new Produto();
			listarProdutos(produtos);
			
			if(produtos.isEmpty()) {
				return null;
			}
			
			System.out.println("Informe o Id do produto para editar: ");
			int idProduto = tec.nextInt() - 1;
			
			System.out.println("1) NOME DO PRODUTO");
			System.out.println("2) QUANTIDADE DO PRODUTO");
			System.out.println("3) VALOR UNIT�RIO DO PRODUTO");
			System.out.print("Informe o campo para ser editado: ");
			int opcao = tec.nextInt();
			switch(opcao) {
			case 1: 
		
			}
			return produtos;	
		}
}
