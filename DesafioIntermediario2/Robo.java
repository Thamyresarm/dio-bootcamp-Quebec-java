// Abaixo segue um exemplo de código que você pode ou não utilizar

import java.util.*;
 
public class Program
{
public static void main(String[] args)
 
{
        String movimentos = new Scanner(System.in).nextLine();
 
        var x = 0;
        var y = 0;

      for (int i = 0; i < movimentos.length(); i++)
        {
            char ch = movimentos.charAt(i);
            if (ch == 'W')
            {
                    x++;
            }
                if (ch == 'S')
                {
                    x--;
                }
                if (ch == 'D')
                {
                    y++;
                }
                if (ch == 'A')
                {
                    y--;
                }
        }
 
            if (x == 0 && y == 0)
            {
                System.out.print("true");
            }
            else
            {
                System.out.print("false");
            }
 
}
}