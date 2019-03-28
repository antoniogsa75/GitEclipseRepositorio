package laboral.entornos.ejemploGit;
/**
 * Esta clase pide números enteros y calcula la suma total y 
 * la media de los números introducidos por teclado.
 * 
 * @author DAWEB - Entornos
 * @version 1.0
 */

public class TotalMedia
{
    
    /**
     * Método principal.
     */
    public static void main (String [] args) {
    
        int num;
        int total = 0;
        int cuantos = 0;
        double media;
        
        do {
            System.out.print (" Introduce un número (0 para acabar): ");
            num = MyInput.readInt();
            if (num != 0 ) {
                total += num;
                cuantos++;
            }    
        } while (num != 0);
        media = (double) total /cuantos;
        System.out.println ( " Total: "+ cuantos + " Media: "+ media);
   }
}
    