// Abaixo segue um exemplo de código que você pode ou não utilizar:

import java.io.IOException;
import java.util.Scanner;

public class Problem {
	
  public static void main(String[] args) throws IOException {

     Scanner leitor = new Scanner(System.in);
     double total = 0d;

     for(int i = 0; i < 2; i++){

      //System.out.println( (i + 1) + "° Produto");

      int cod1 = leitor.nextInt();
      int n1 = leitor.nextInt();
      double valor1 = leitor.nextDouble();

      total += (n1 * valor1);

     }

     System.out.println(String.format("VALOR A PAGAR: R$ %.2f", total));   
    }
	
}