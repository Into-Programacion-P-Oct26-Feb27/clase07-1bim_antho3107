/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplociclowhile;
import java.util.Locale;
import java.util.Scanner;
/**
 *
 * @author reroes
 */
public class Ejemplo022 {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        int limite;
        int contador = 1;
        int acumulador = 0;
        int multiplicador = 1;
        System.out.println("Ingrese el Límite"); 
        limite = entrada.nextInt(); // 6
        while (contador <= limite){
            
            if (contador%2!=0) {
                multiplicador = multiplicador * contador;
            } else {
                acumulador = acumulador + contador;
            }
            
            contador = contador + 1;
        }
        System.out.printf("Suma total de los pares: %d\n",acumulador);
        System.out.printf("Multiplicacion total "
                + "de los impares: %d\n",multiplicador);
    }
}
/*
Generar un programa que me permita ingresar un limite por teclado y
presentar la suma de todos la suma de los pares y se presente la multiplicacion
de los impares
*/