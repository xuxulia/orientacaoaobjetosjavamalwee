package br.com.senai;

public class ProgramaPrincipal2 {

	public static void main(String[] args) {

		
		Carro carro1 = new Carro();
		Carro carro2 = new Carro();
		Carro carro3 = new Carro();
		Carro carro4 = new Carro();
		Carro carro5 = new Carro();

		
		System.out.println("--- CARRO 1 ---");
		carro1.setMarca("BMW");
		carro1.setModelo("PXT");
		carro1.setAno(2004);
		carro1.setQndPorta(4);
		
		System.out.println("-" + carro1.getMarca());
		System.out.println("-" + carro1.getModelo());
		System.out.println("-" + carro1.getAno());
		System.out.println("-" + carro1.getQndPorta());
		System.out.println("----------------");
		
		System.out.println("--- CARRO 2 ---");
		carro2.setMarca("HONDA");
		carro2.setModelo("FIT");
		carro2.setAno(2015);
		carro2.setQndPorta(4);
		
		System.out.println("-" + carro2.getMarca());
		System.out.println("-" + carro2.getModelo());
		System.out.println("-" + carro2.getAno());
		System.out.println("-" + carro2.getQndPorta());
		System.out.println("----------------");
		
		System.out.println("--- CARRO 3 ---");
		carro3.setMarca("FIAT");
		carro3.setModelo("UNO");
		carro3.setAno(1996);
		carro3.setQndPorta(2);
		
		System.out.println("-" + carro3.getMarca());
		System.out.println("-" + carro3.getModelo());
		System.out.println("-" + carro3.getAno());
		System.out.println("-" + carro3.getQndPorta());
		System.out.println("----------------");
		
		
		System.out.println("--- CARRO 4 ---");
		carro4.setMarca("CHEVROLET");
		carro4.setModelo("CRUZE");
		carro4.setAno(2021);
		carro4.setQndPorta(4);
		
		System.out.println("-" + carro4.getMarca());
		System.out.println("-" + carro4.getModelo());
		System.out.println("-" + carro4.getAno());
		System.out.println("-" + carro4.getQndPorta());
		System.out.println("----------------");
		
		System.out.println("--- CARRO 5 ---");
		carro5.setMarca("CITROEN");
		carro5.setModelo("C3");
		carro5.setAno(2011);
		carro5.setQndPorta(4);
		
		System.out.println("-" + carro5.getMarca());
		System.out.println("-" + carro5.getModelo());
		System.out.println("-" + carro5.getAno());
		System.out.println("-" + carro5.getQndPorta());
		System.out.println("----------------");
		
	}

}
