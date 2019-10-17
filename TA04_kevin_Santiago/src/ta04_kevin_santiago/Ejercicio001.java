/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ta04_kevin_santiago;
/**
 *
 * @author USER
 */
public class Ejercicio001 {
    public static void main(String[] args) {
        //Declaro la variable numero como entero 
        //n me serivira para crear numeros aletorios de 0 -1000 
        int numero;
        double n=1001;
        //Declaro mi matriz de tipo entero
        int matriz[][];
        //Indico las filas y columnas que tendra mi matriz
        matriz=new int[6][10];
        //Con estos for ingreso numeros aleatorios a mi matriz
        for (int i=0;i<6 ;i++){
            for (int x=0;x<10 ;x++){
                numero = (int) (Math.random() *n) ;
                matriz[i][x]=numero;
                System.out.println("en el indice: "+i+"x"+x+"="+matriz[i][x]);
            }
        }
        //declaro la variable max como entero y lo inicializo igualandolo a 
        //lo mismo sucede con indicei e indicej
        int max=0;
        int indicei = 0,indicej = 0;
        //gracias a los for reccoro los elementos de mi matriz 
        for (int z=0;z<6 ;z++){
            for (int k=0;k<10 ;k++){
                //Gracias a este if logro hallar al numero maximo dentro de mi matriz
                //e indico en que posicion esta mi elemento 
                if (matriz[z][k] > max) {
                    max = matriz[z][k] ;
                    indicei=z;
                    indicej=k;
                }
            }
        }
        //imprimo donde esta el indice del numero maximo que hay en mi matriz
        System.out.println("El numero maximo "+max+" esta en la posicion :"+indicei+"x"+indicej);
    }
}
