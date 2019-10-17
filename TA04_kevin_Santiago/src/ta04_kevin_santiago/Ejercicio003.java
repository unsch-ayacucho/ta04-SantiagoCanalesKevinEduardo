package ta04_kevin_santiago;
import javax.swing.JOptionPane;
public class Ejercicio003 {
    public static void main(String[] args) {
        String[] listaNumeros={"8","7","6","5","4","3","2","1"};
        String[] listaLetras={"a","b","c","d","e","f","g","h"};
        String _listaIndices[][];
        String _posicion;
        int aux1 = 0,aux2 = 0;
        _posicion=JOptionPane.showInputDialog(null, "ingrese la posicion de su alfil");
        _listaIndices=new String[8][8];
        for (int j=0;j<_listaIndices.length;j++){
            for (int i =0;i<_listaIndices.length;i++){
                _listaIndices[j][i]= listaLetras[j]+listaNumeros[i];
                if (_listaIndices[j][i].equals(_posicion)){
                    aux1=j;
                    aux2=i;
                }else{
                    System.out.println("dato no valido");
                    break;
                }
            }
        }
        System.out.println("posiciones a las cuales se puede mover el alfil :");
        int a,b,c,d,e,f;
        a=aux1;
        b=aux2;
        c=aux1;
        d=aux2;
        e=aux1;
        f=aux2;
        while((aux1<7 && aux1>=0 )&& (aux2<7 && aux1>=0)){
            aux1++;
            aux2++;
            System.out.print(_listaIndices[aux1][aux2]+" ");
        }
        while((a>0 && a<=7) &&( b>0 &&b<=7)){
            a--;
            b--;
            System.out.print(_listaIndices[a][b]+" ");
        }   
        while((c>0&&c<=7) && (d<7 &&d>=0)){
            c--;
            d++;
            System.out.print(_listaIndices[c][d]+" ");
        }   
        while((e<7&&e>=0) && (f>0&&f<=7)){
            e++;
            f--;
            System.out.print(_listaIndices[e][f]+" ");
        }
        System.out.println("");
    }  
}
        
    
