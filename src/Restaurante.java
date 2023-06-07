import java.util.Scanner;

public class Restaurante {
	 public static void main(String[] args) {
		 
		  	Scanner scanner = new Scanner(System.in);
	        System.out.println("Bem-vindo ao nosso Restaurante!");

	        System.out.print("Digite o nome da comida: ");
	        String comida = scanner.nextLine();
	        
	      	Pedido pedido = new Pedido();
	        pedido.fazerPedido(comida);  

}
}
