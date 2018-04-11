/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaaceptaelreto191;

import java.util.Scanner;

/**
 *
 * @author Usuario 1 DAM
 */
public class JavaAceptaElReto191 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int casos = sc.nextInt(); //Numero de casos de comprobacion metido por el usuario
        int compartimentos ; //Numero de compartimentos que tiene el acuario
        int capacidad ; //Capacidad del mayor compartimento
        int diferenciaLitros; //Diferencia de litros de dos compatimentos adyacentes
        int litros; //total de litros que tenemos
       

        // Pedimos al usuario que no de los datos y los guardamos
       

        for (int i = 0; i < casos; i++) {
            compartimentos = sc.nextInt();//Guardamos los datos metidos por teclado    
            capacidad = sc.nextInt(); //Guardamos los datos metidos por teclado
            diferenciaLitros = sc.nextInt();//Guardamos los datos metidos por teclado
            litros = capacidad;
            capacidad = capacidad - diferenciaLitros;// calculamos la capacidad

            for (int v = 0; v < compartimentos - 1; v++) {
                litros = litros + capacidad;
                capacidad = capacidad - diferenciaLitros;
            }
            
System.out.println(litros);
        }
        
    }
}
