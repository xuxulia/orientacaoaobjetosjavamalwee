package br.com.senai.menu;

import java.util.Scanner;

public class Menu {
	

	Scanner tec = new Scanner(System.in);
	
	public void listarMenu() {
		System.out.println("\n---------------- MENU ----------------");
		System.out.println("1) PESSOA");
		System.out.println("2) PRODUTO");
		System.out.println("3) VENDA");
		System.out.println("9) SAIR");
		System.out.println("----------------------------------------");
	}
	public int leOpcao() {
		System.out.print("> ");
		return tec.nextInt();
}
}


