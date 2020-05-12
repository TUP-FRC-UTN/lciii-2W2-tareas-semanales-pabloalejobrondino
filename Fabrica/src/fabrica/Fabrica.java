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
        System.out.println("1- agregar materiales al producto, " + contadorRegistros + " registros disponibles");
        System.out.println("2- costo total del producto " + descripcionProducto);
        System.out.println("3- X codigo pertenese o no al producto");
        System.out.println("4- materiales con valor menor a X");
        System.out.println("5- materiales por rango de precio");
        System.out.println("0-salir");

        opcion = sc.nextInt();
        sc.nextLine();//agarrar enter

        while (opcion != 0) {
            switch (opcion) {
                case 1:
                    if (contadorRegistros == 0) {
                        System.out.println("no se pueden agregar mas materiales, quedan " + contadorRegistros + " registros");
                    } else {
                        String descripcionMaterial;
                        int codigo;
                        double valorUnitario;
                        System.out.println("ingrese nombre del material");
                        descripcionMaterial = sc.nextLine();
                        System.out.println("ingrese codigo del material");
                        codigo = sc.nextInt();
                        System.out.println("ingrese valor unitario del material");
                        valorUnitario = sc.nextDouble();
                        Material m = new Material(descripcionMaterial, codigo, valorUnitario);
                        p.agregraMaterial(m);
                        contadorRegistros--;
                    }

                    break;
                case 2:

                    if (contadorRegistros != tamanio) {
                        System.out.println("el costos total del producto " + descripcionProducto + " es $" + p.costoTotal());
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
                            System.out.println(p.esta(codigoMat) + ", el material forma parte del producto");
                        } else {
                            System.out.println(p.esta(codigoMat) + ", el material NO forma parte del producto");
                        }
                    } else {
                        System.out.println("primero registre un material");
                    }

                    break;
                case 4:
                    if (contadorRegistros != tamanio) {
                        System.out.println("ingrese un valor para comparar");
                        double valorComparacion = sc.nextDouble();
                        Material[] Materiales = p.menorValor(valorComparacion);

                        System.out.println("los materiales con precio menor a " + valorComparacion + " son:");
                        for (int i = 0; i < Materiales.length; i++) {
                            if (Materiales[i] != null) {
                                System.out.println(Materiales[i].toString());

                            }

                        }

                    } else {
                        System.out.println("primero registre un material");
                    }
                    break;
                case 5:
                    if (contadorRegistros != tamanio) {
                         int [] contadores = p.cantidadXPrecio();
        System.out.println("Los materiales con valor unitario entre 0 y 10 son : " + contadores[0]);
        System.out.println("Los materiales con valor unitario entre 10 y 20 son : " + contadores[1]);
        System.out.println("Los materiales con valor unitario entre 20 y 30 son : " + contadores[2]);
        System.out.println("Los materiales con valor unitario mayor a 30 son : " + contadores[3]);
//                        int[] contadores = new int[4];
//                        contadores = p.materialXPrecio();
//                        System.out.println("entre 0 y 10 " + contadores[0]);
//                        System.out.println("entre 10 y 20 " + contadores[1]);
//                        System.out.println("entre 20 y 30 " + contadores[2]);
//                        System.out.println("mas de 30 " + contadores[3]);
                    } else {
                        System.out.println("primero registre un material");
                    }
                    break;
                default:
                    throw new AssertionError();
            }
            System.out.println("");
            System.out.println("****MENU OPCIONES****");
            System.out.println("1- agregar materiales al producto, " + contadorRegistros + " registros disponibles");
            System.out.println("2- costo total del producto " + descripcionProducto);
            System.out.println("3- x codigo pertenese o no al producto");
            System.out.println("4- materiales con valor menor a X");
            System.out.println("5- materiales por rango de precio");
            System.out.println("0-salir");

            opcion = sc.nextInt();
            sc.nextLine();
        }
        System.out.println("adios..");
    }

}
