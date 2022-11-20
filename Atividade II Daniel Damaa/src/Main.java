import java.util.Scanner;

public class Main {
public static void main(String[] args) {
	
	Scanner teclado = new Scanner(System.in);	
	Util util = new Util();
	util.criar();
	
	int controle = 0;
	String x;
	
	do {
	
		System.out.println("1. Cadastrar produto");
		System.out.println("2. Pesquisar produto");
		System.out.println("3. Listar produto");
		System.out.println("4. Deletar produto");
		System.out.println("5. Finalizar");
		System.out.println("Escolha a ação: ");
		controle = teclado.nextInt();
		
		if(controle == 1) {
		
			util.preencher();
		}else if (controle == 2) {
			
			util.pesquisar();
		}else if(controle == 3) {
			
			util.listar();
		}else if(controle == 4) {
			
			util.deletar();
		}
		
	}while(controle != 5);
	
	
}
}
