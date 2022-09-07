// Abaixo segue um exemplo de código que você pode ou não utilizar:

import java.util.Scanner; 

public class App {
    
public static void main(String[] args){ 
    Scanner leitor = new Scanner(System.in); 

//    System.out.println("Digite o valor de T");
 int t = leitor.nextInt(); 

    for(int i = 0 ; i < 1000;){
        for(int j = 0; j < t ;j++){
            if(2 <= t && t <= 50 && i < 1000){
                System.out.println("N[" + i + "] = "+ j);
                i++;
            }
        }
    }

}
}