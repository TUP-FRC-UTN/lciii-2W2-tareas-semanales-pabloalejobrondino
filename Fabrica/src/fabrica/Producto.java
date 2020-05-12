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

                break;
            }

        }
        return esta;
    }
    //Desarrolle en la clase producto un método que retorne un vector con todos 
    //los materiales que tengan un valor unitario menor a un parámetro.

    public Material[] menorValor(double valorComparacion) {
        Material[] materialesVaratos = new Material[arrayMateriales.length];
        int proximaPosicion = 0;
        for (int i = 0; i < arrayMateriales.length; i++) {
            if (arrayMateriales[i] != null && arrayMateriales[i].getValorUnitario() < valorComparacion) {
                materialesVaratos[proximaPosicion] = arrayMateriales[i];
                proximaPosicion++;
            }
        }
        return materialesVaratos;
    }
    public int [] cantidadXPrecio()
     {
         int [] cantidadesXPrecio = new int [4];
         
         for (int i = 0; i < arrayMateriales.length; i++) {
             if(arrayMateriales[i] != null)
             {
                 if(arrayMateriales[i].getValorUnitario() > 0 &&  arrayMateriales[i].getValorUnitario() <= 10)
                     cantidadesXPrecio[0]++;
                 else if(arrayMateriales[i].getValorUnitario() > 10 &&  arrayMateriales[i].getValorUnitario() <= 20)
                     cantidadesXPrecio[1]++;
                 else if(arrayMateriales[i].getValorUnitario() > 20 &&  arrayMateriales[i].getValorUnitario() <= 30)
                     cantidadesXPrecio[2]++;
                 else 
                     cantidadesXPrecio[3]++;
             }
             
         }
         
         return cantidadesXPrecio;
     }

//    public int[] materialXPrecio() {
//        int materialXPrecio[] = new int[4];
//
//        for (int i = 0; i < materialXPrecio.length; i++) {
//            if (arrayMateriales[i] != null) {
//                if (arrayMateriales[i].getValorUnitario() > 0 && arrayMateriales[i].getValorUnitario() <= 10) {
//                    materialXPrecio[0]++;
//                } else if (arrayMateriales[i].getValorUnitario() > 10 && arrayMateriales[i].getValorUnitario() <= 20) {
//                    materialXPrecio[1]++;
//                } else if (arrayMateriales[i].getValorUnitario() > 20 && arrayMateriales[i].getValorUnitario() <= 30) {
//                    materialXPrecio[2]++;
//                }
//                if (arrayMateriales[i] != null && arrayMateriales[i].getValorUnitario() > 30) {
//                    materialXPrecio[3]++;
//                }
//            }
//        }
//        return materialXPrecio;
//    }
}
