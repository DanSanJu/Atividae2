	
import static javax.swing.JOptionPane.*;

import java.util.Random;
import java.util.Scanner;

import static java.lang.Integer.parseInt;

import static java.lang.Double.parseDouble;

public class Util {

	Produto[] produto = new Produto[10];
	
public void criar() {
	
	for(int i = 0; i < produto.length; i++) {
		
		produto[i] = new Produto();
			
	}
}
	
public void preencher(){	
	Scanner teclado = new Scanner(System.in);
	
	int controle = 0;
	
	System.out.println("-------------------------------");	
	
	for(int i = 0; i < produto.length; i++) {
		
		produto[i] = new Produto();	
		
		if(produto[i].nome.equals("")) {
		System.out.print("insira o nome do produto " + (i + 1) + ": " );
		produto[i].nome = teclado.nextLine();	
		System.out.print("insira o preço unitario do produto: ");
		produto[i].preço = teclado.nextDouble();	
		System.out.print("insira a quantidade do produto " );
		produto[i].quantidade = teclado.nextInt();	
		System.out.println("--------------------------------------");
		teclado.nextLine();
		
		}else {
			System.out.println("Produto ja cadastrado");
		}
		
		System.out.println("Digite 1 para cadastrar outro produto e 2 para retornar ao menu");
		controle = teclado.nextInt();
		
		if(controle == 2) {
			break;
		}
		
		teclado.nextLine();
	}
	
}

public void pesquisar() {
	Scanner teclado = new Scanner(System.in);
	
	String nome;
	
  System.out.println("Insira o nome do produto a ser pesquisado: ");
  nome = teclado.nextLine();
  
  System.out.println("-------------------------------");
	
for(int i = 0; i < produto.length; i++) {
	
		if(produto[i].nome.equalsIgnoreCase(nome)) {
			
			System.out.println("Produto: " + produto[i].nome);
			System.out.println("Preço unitario: " + produto[i].preço);
			System.out.println("Quantidade em estoque: " + produto[i].quantidade);
			System.out.println("-------------------------------");
			
			return;
		}
	}
	
	if(!produto[9].nome.equals(nome)) {
		
		System.out.println("Produto não encontrado");
		System.out.println("-------------------------------");
	}
}

public void listar() {
	
	int x = 0;
	
	System.out.println("-------------------------------");
	
	for(int i = 0; i < produto.length; i++) {
		
		if(!produto[i].nome.equals("")) {
		System.out.println("Produto: " + produto[i].nome);
		System.out.println("Preço unitario: " + produto[i].preço);
		System.out.println("Quantidade em estoque: " + produto[i].quantidade);
		System.out.println("-------------------------------");
	}else {
		x++;
	}
		} System.out.println("Existe mais " + x + " espaços para novos produtos");
	
		System.out.println("-------------------------------");
}

public void deletar() {
	Scanner teclado = new Scanner(System.in);
	
	String nome;
	
	System.out.println("Insira o nome do produto a ser deletato");
	nome = teclado.nextLine();
	
	for(int i = 0; i < produto.length; i++) {
		
		if(produto[i].nome.equals(nome)) {
			
			produto[i].nome = "";
			produto[i].preço = 0;
			produto[i].quantidade = 0;
			
			System.out.println("Produto " + nome + " deletado!");
		}
		
		
	}
}


























}