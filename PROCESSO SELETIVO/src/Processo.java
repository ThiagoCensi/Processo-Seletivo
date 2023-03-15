import java.util.Locale;
import java.util.Scanner;

public class Processo {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int prox = 0, atual = 0, ant = 1;	
		System.out.print("Digite o Valor inteiro para saber se � da sequ�ncia de Fibonacci: ");
		int valor = sc.nextInt();
		

		while(prox <= valor){
		    prox = atual + ant;
			ant = atual;
			atual = prox;
		}
		
		if (ant == valor) {
			System.out.println("Valor: " + valor + " � da sequ�ncia de Fibonacci");
		}
		else {
			System.out.println("Valor n�o faz parte da da sequ�ncia de Fibonacci ");
		}
		
	sc.close();
}
}