package fabrica;

import java.util.Scanner;

public class Producto {

    private String descripcionProducto;
    private Material arrayMateriales[];

    //getters y setters
    public String getDescripcionProducto() {
        return descripcionProducto;
    }

    public void setDescripcionProducto(String descripcionProducto) {
        this.descripcionProducto = descripcionProducto;
    }

    //    Desarrolle en la clase Producto un constructor que reciba por parámetro
    //    una cantidad de elementos y dimensione el vector de materiales.
    public Producto(String descripcionProducto, int tamanio) {
        this.descripcionProducto = descripcionProducto;
        arrayMateriales = new Material[tamanio];

    }

//    Desarrolle en la clase Producto un método que permita
//    agregar un Material recibido por parámetro al vector.
    public void agregraMaterial(Material m) {
        for (int i = 0; i < arrayMateriales.length; i++) {
            if (arrayMateriales[i] == null) {
                arrayMateriales[i] = m;
                break;
            }

        }
    }

//    Desarrolle en la clase Producto un método que retorne el costo total. 
//    Dicho valor se calcula sumando todos los valores unitarios de los Materiales que componen el Producto.
    public double costoTotal() {
        double acuValor = 0;
        for (int i = 0; i < arrayMateriales.length; i++) {
            if (arrayMateriales[i] != null) {
                acuValor += arrayMateriales[i].getValorUnitario();
            }

        }
        return acuValor;
    }

//    Desarrolle en la clase Producto un método que reciba por parámetro 
//    un código de material y retorne true si dicho material forma parte del Producto
    public boolean esta(int codigo) {
        boolean esta = false;
        for (int i = 0; i < arrayMateriales.length; i++) {
            if (arrayMateriales[i] != null && arrayMateriales[i].getCodigo() == codigo) {
                esta = true;
            }

        }
        return esta;
    }
    //Desarrolle en la clase producto un método que retorne un vector con todos 
    //los materiales que tengan un valor unitario menor a un parámetro.

//    public Material[] menorValor() {
//       
//        return materialeXvalor;
//    }
    
//    public int[] materialXPrecio(){
//        int materialXPrecio[]=new int[4];
//        int contador1=0;
//        int contador2=0;
//        int contador3=0;
//        int contador4=0;
//        
//        for (int i = 0; i < materialXPrecio.length; i++) {
//            if (arrayMateriales[i]!=null && arrayMateriales[i].getValorUnitario()>0 && arrayMateriales[i].getValorUnitario()<=10) {
//                contador1+=contador1;
//            }
//             if (arrayMateriales[i]!=null && arrayMateriales[i].getValorUnitario()>10 && arrayMateriales[i].getValorUnitario()<=20) {
//                contador2+=contador2;
//            }
//              if (arrayMateriales[i]!=null && arrayMateriales[i].getValorUnitario()>20 && arrayMateriales[i].getValorUnitario()<=30) {
//                contador1+=contador3;
//            }
//               if (arrayMateriales[i]!=null && arrayMateriales[i].getValorUnitario()>30 && arrayMateriales[i].getValorUnitario()<=40) {
//                contador1+=contador4;
//            }
//          
//        }
//        materialXPrecio[0]=contador1;
//        materialXPrecio[1]=contador2;
//        materialXPrecio[2]=contador3;
//        materialXPrecio[3]=contador4;
//        
//        System.out.println();
//    }
}
