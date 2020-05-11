package fabrica;

import java.util.Scanner;

public class Fabrica {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("---regitro de nuevo  producto----");
        int tamanio;
        String descripcionProducto;
        System.out.println("ingrese descripcion del producto ");
        descripcionProducto = sc.nextLine();
        System.out.println("ingrese cantidad de materiales del producto");
        tamanio = sc.nextInt();
        Producto p = new Producto(descripcionProducto, tamanio);
        
        int contadorRegistros;
        int opcion = 0;
        contadorRegistros = tamanio;
        
        System.out.println("****MENU OPCIONES****");
        System.out.println("1- agregar materiales al producto, "+contadorRegistros+" registros disponibles" );
        System.out.println("2- costo total del producto " + descripcionProducto);
        System.out.println("3- x codigo pertenese o no al producto");
     
        opcion = sc.nextInt();
        sc.nextLine();//agarrar enter
        
        while (opcion != 0) {
            switch (opcion) {
                case 1:
                    if (contadorRegistros==0) {
                        System.out.println("no se pueden agregar mas materiales, quedan "+contadorRegistros+" registros");
                    }
                    else{
                    String descripcionMaterial;
                    int codigo;
                    double valorUnitario;
                    System.out.println("ingrese nombre del material");
                    descripcionMaterial = sc.nextLine();
                    System.out.println("ingrese codigo del material");
                    codigo = sc.nextInt();
                    System.out.println("ingrese valor unitario del material");
                    valorUnitario = sc.nextDouble();
                    Material m = new Material(descripcionProducto, codigo, valorUnitario);
                    p.agregraMaterial(m);
                    contadorRegistros--;
                    }
                    break;
                case 2:
                   
                    if (contadorRegistros != tamanio) {
                        System.out.println("el costos total del producto " + descripcionProducto + " es " + p.costoTotal());
                    } else {
                        System.out.println("primero registre un material");
                    }
                    break;
                case 3:
                    if (contadorRegistros != tamanio) {
                    int codigoMat;
                    System.out.println("ingrese codigo del material");
                    codigoMat = sc.nextInt();
                    if (p.esta(codigoMat)) {
                        System.out.println(p.esta(codigoMat)+", el material forma parte del producto");
                    }
                    else{
                        System.out.println(p.esta(codigoMat)+", el material NO forma parte del producto");
                    }
                    }
                    else{
                        System.out.println("primero registre un material");
                    }
                    break;
               
                default:
                    throw new AssertionError();
            }
            System.out.println("");
            System.out.println("****MENU OPCIONES****");
             System.out.println("1- agregar materiales al producto, "+contadorRegistros+" registros disponibles" );
            System.out.println("2- costo total del producto " + descripcionProducto);
            System.out.println("3- x codigo pertenese o no al producto");
          
            opcion = sc.nextInt();
            sc.nextLine();
        }

    }

}
