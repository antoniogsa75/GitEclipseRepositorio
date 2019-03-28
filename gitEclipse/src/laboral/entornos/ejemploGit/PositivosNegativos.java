package laboral.entornos.ejemploGit;

/**
 * Esta clase cuenta cu�ntos n�meros positivos y negativos hay en una 
 * serie de n�meros que se introducen por teclado.
 * 
 * @author DAWEB - Entornos
 * @version 1.0
 */

public class PositivosNegativos
{
    
    /**
     * M�todo principal.
     */
    public static void main (String [] args) {
    
        int num;
        int positivos = 0;
        int negativos = 0;
        
        do {
            System.out.print (" Introduce un n�mero (0 para terminar): ");
            num = MyInput.readInt();
            if (num < 0 ) negativos++;
            else if (num > 0) positivos++;
        } while (num != 0);
        System.out.println (" Hay "+ positivos + " n�meros positivos y " + negativos + " n�meros negativos ");
           
    }
}
    