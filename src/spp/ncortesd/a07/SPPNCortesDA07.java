/*IMT
NOHELY CORTÉS
A01410768
 */
package spp.ncortesd.a07;
import java.util.Scanner;
/**
 *
 * @author Nohely
 */
public class SPPNCortesDA07 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int T1;
        String [] telefono = new String[10];
        Scanner kb = new Scanner (System.in);
        for (int i = 0; i < telefono.length; i++){
            System.out.println("Introduce el número telefónico " + i);
            telefono[i] = kb.nextLine();
        }
        System.out.println("Introduzca el número deseado");
        T1 = kb.nextInt();
        if (T1 < telefono.length){
        System.out.println("El numero es " + telefono[T1]);
        } else System.out.println("No encontrado en la lista.");
    }
    
}