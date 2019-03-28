package laboral.entornos.ejemploGit;

/**
 * Esta clase cuenta cuántos números positivos y negativos hay en una 
 * serie de números que se introducen por teclado.
 * 
 * @author DAWEB - Entornos
 * @version 1.0
 */

public class PositivosNegativos
{
    
    /**
     * Método principal.
     */
    public static void main (String [] args) {
    
        int num;
        int positivos = 0;
        int negativos = 0;
        
        do {
            System.out.print (" Introduce un número (0 para terminar): ");
            num = MyInput.readInt();
            if (num < 0 ) negativos++;
            else if (num > 0) positivos++;
        } while (num != 0);
        System.out.println (" Hay "+ positivos + " números positivos y " + negativos + " números negativos ");
           
    }
}
    