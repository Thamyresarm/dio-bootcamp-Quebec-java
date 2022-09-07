// Abaixo segue um exemplo de código que você pode ou não utilizar

import java.util.*;
 
public class Program
{
    public static void main(String[] args)
    {
        //System.out.println("Digite um numero inteiro");
        int num = Integer.parseInt(new Scanner(System.in).nextLine());
        var step = 0;

        while (num > 0)
        {
            if ((num & 1) == 1)
            {
                step++;
            }
            num /= 2;
            step++;
        }

	    System.out.println(step - 1);
    }
}