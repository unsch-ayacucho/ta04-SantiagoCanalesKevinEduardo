/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ta04_kevin_santiago;
import javax.swing.JOptionPane;
/**
 *
 * @author USER
 */

public class Ejercicio002 {
    public static void main(String[] args) {
        //declaro mi matriz de tipo entero
        int listaNumeros[][];
        //declaro la variable numero como entero
        int numero;
        //Instancio mi matriz
        listaNumeros= new int[4][5];
        //Agrego valor a mi matriz con los for
        for (int i=0;i<4;i++){
            for (int j =0;j<5;j++){
                numero=Integer.parseInt(JOptionPane.showInputDialog(null, "ingrese numero que ira en la posicion"
                        + ": "+i+"x"+j));   
                listaNumeros[i][j]=numero;
            }
        }
        //Reccoro mi lista
        for (int j =0;j<4;j++) {
            //Declaro la variable sum como entero y la inicializo dandole el valor de 0
            //Al estar dentro de un for sum se volvera cero en cada iteracion del primer for
            //pero en el segundo for sumara todos los valores que hay en la primera fila de la matriz
            int sum=0;
            for (int z=0;z<5;z++){
                    System.out.print(listaNumeros[j][z]+"\t\t");
                    sum+=listaNumeros[j][z];
            }
            System.out.print("Σfla"+j+"="+sum);
            System.out.println("");
           
        }
        System.out.print("Σclm1\t\t"+"Σclm2\t\t"+"Σclm3\t\t"+"Σclm4\t\t"+"Σclm5\t\t" );
        System.out.println("");
        //El primero for me permitira imprimir 5 veces y me recorrera la lista 
        //en forma invertida haciendo las filas columnas y viceversa
        for (int i=0;i<5;i++){
            //Declaro e inicializo la variable entera sum2 que tendra la misma funcion que sum
            int sum2=0;
            //Recorro la lista de forma invertida
            for (int y=0;y<4;y++){
                sum2+=listaNumeros[y][i];
            }
            System.out.print(sum2+"\t\t");
        }
    }
}
