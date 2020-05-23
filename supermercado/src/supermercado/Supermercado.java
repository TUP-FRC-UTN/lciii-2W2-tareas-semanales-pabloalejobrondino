package supermercado;

import java.time.LocalDate;
import java.util.Scanner;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Supermercado {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int cantidad;
        boolean decicion = false;
        String respuesta;
        LocalDate fecha = LocalDate.now();
        System.out.println("***Registro de ofertas***");
        System.out.println("ingrese catindad de ofertas");
        cantidad = sc.nextInt();
        System.out.println("las ofertas entran en vigencia el dia " + fecha);
        Folleto f = new Folleto(fecha, cantidad);
        int contador = cantidad;

        int opcion;
        System.out.println("***MENU***");
        System.out.println("1- agrega un producto a las ofertas, " + contador + " registros disponibles");
        System.out.println("2- cantidad de articulos con mas de 5 dias  en oferta");
        System.out.println("3- cantidad total de articulos a la venta");
        System.out.println("4- Cantidad de artículos ofrecidos con un descuento superior a $20");
        System.out.println("5- total a recaudar si se vende todo el stock de un producto");
        opcion = sc.nextInt();

        while (opcion != 0) {

            switch (opcion) {
                case 1:
                    if (contador != 0) {
                        int numProducto;
                        String nombreProducto;
                        double precioRegular;
                        double precioOferta;
                        int cantidadDiasDeOferta;
                        int stock;
                        System.out.println("ingrese numero de producto");
                        numProducto = sc.nextInt();
                        sc.nextLine();
                        System.out.println("ingrese el nombre del producto");
                        nombreProducto = sc.nextLine();
                        System.out.println("precio regular");
                        precioRegular = sc.nextDouble();
                        System.out.println("precio de oferta");
                        precioOferta = sc.nextDouble();
                        System.out.println("cantidad de dias en oferta");
                        cantidadDiasDeOferta = sc.nextInt();
                        System.out.println("cantidad de productos en stock");
                        stock = sc.nextInt();
                        Oferta o = new Oferta(numProducto, nombreProducto, precioRegular, precioOferta, cantidadDiasDeOferta, stock);
                        f.agregarOferta(o);
                        contador--;
                    } else {
                        System.out.println("ya no quedan registros disponibles");
                    }
                    break;
                case 2:
                    if(contador!=cantidad){
                        System.out.println("existen "+f.cantidadOfertas()+" productos con mas de 5 dias en oferta");
                    }
                    else{
                        System.out.println("aun no se registraron ofertas");
                    }
                    break;
                case 3:
                     if(contador!=cantidad){
                        System.out.println("existen "+f.cantidadStok()+" productos a la venta en oferta");
                    }
                    else{
                        System.out.println("aun no se registraron ofertas");
                    }
                    break;
                case 4:
                     if(contador!=cantidad){
                        System.out.println("existen "+f.cantidadPrecio()+" productos con descuento superior a $20");
                    }
                    else{
                        System.out.println("aun no se registraron ofertas");
                    }
                    break;
                case 5:
                     if(contador!=cantidad){
                         int numero;
                        System.out.println("ingrese numero de producto");
                        numero=sc.nextInt();
                         System.out.println("en caso de vender el 100% del stock del producto se recaudarian "+f.totalRecaudado(numero));
                    }
                    else{
                        System.out.println("aun no se registraron ofertas");
                    }
                    break;
                default:
                    throw new AssertionError();
            }
            System.out.println("***MENU***");
            System.out.println("1- agrega un producto a las ofertas, " + contador + " registros disponibles");
            System.out.println("2- cantidad de articulos con mas de 5 dias  en oferta");
            System.out.println("3- cantidad total de articulos a la venta");
            System.out.println("4- Cantidad de artículos ofrecidos con un descuento superior a $20");
            System.out.println("5- total a recaudar si se vende todo el stock de un producto");
            System.out.println("0-salir");
            opcion = sc.nextInt();
        }
    }

}
