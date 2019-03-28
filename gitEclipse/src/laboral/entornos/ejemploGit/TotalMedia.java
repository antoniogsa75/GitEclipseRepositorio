package laboral.entornos.ejemploGit;
/**
 * Esta clase pide n�meros enteros y calcula la suma total y 
 * la media de los n�meros introducidos por teclado.
 * 
 * @author DAWEB - Entornos
 * @version 1.0
 */

public class TotalMedia
{
    
    /**
     * M�todo principal.
     */
    public static void main (String [] args) {
    
        int num;
        int total = 0;
        int cuantos = 0;
        double media;
        
        do {
            System.out.print (" Introduce un n�mero (0 para acabar): ");
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
    