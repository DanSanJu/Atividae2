import java.util.Random;
import java.util.Random;

public class Exercicio_2 {
public static void main(String[] args) {
	
	int [] x = new int[10];
	
	preencher(x);
	imprimir(x);
	
}


public static void preencher(int x[]) {
	Random gerador = new Random();
	
	
	for(int i = 0; i < x.length; i++) {
		
		x[i] = gerador.nextInt(0, 100);
	}
	
	
	
}

public static void imprimir(int x[]) {
	
	for(int i = 0; i < x.length; i++) {
		
		System.out.println(x[i] + "\t");
		
	}
	
	
	
}

public static void ordenar() {
	
	
	
	
	
	
	
}

public static void pesquisar() {
	
	
	
	
	
	
}




























}
