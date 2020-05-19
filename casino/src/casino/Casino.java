package casino;

import java.util.Scanner;

public class Casino {

    public static void main(String[] args) {

        System.out.println("***SISTEMA REGISTRO DE APUESTAS***");
        Scanner sc = new Scanner(System.in);
        String nombre;
        int cantidad;
        System.out.println("ingrese nombre del jugador");
        nombre = sc.nextLine();
        System.out.println("ingrese cantidad de apuestas del jugador " + nombre);
        cantidad = sc.nextInt();
        Jugador j = new Jugador(nombre, cantidad);
        int contadorApuestas = cantidad;

        int opcion = 0;

        System.out.println("****MENU****");
        System.out.println("1-agregar apuesta " + contadorApuestas + " registros disponibles");
        System.out.println("2- cantidad de apuestas ganadas");
        System.out.println("3-cuantas veces salio X numero");
        System.out.println("4-total ganado");
        System.out.println("5- total apostado a numeros pares");
        System.out.println("0-salir");
        opcion = sc.nextInt();

        while (opcion != 0) {
            switch (opcion) {
                case 1:
                    if (contadorApuestas != 0) {
                        int numeroJugado;
                        double monto;
                        int numeroGanador;
                        System.out.println("numero jugado");
                        numeroJugado = sc.nextInt();
                        System.out.println("ingrese monto de la apuesta");
                        monto = sc.nextDouble();
                        System.out.println("ingrese numero ganador");
                        numeroGanador = sc.nextInt();
                        Apuesta a = new Apuesta(numeroJugado, monto, numeroGanador);
                        j.nuevaApuesta(a);
                        contadorApuestas--;
                    } else {
                        System.out.println("ya no quedan registros disponibles");
                    }
                    break;
                case 2:
                    if (contadorApuestas != cantidad) {
                        System.out.println("cantidad apuestas ganadas: " + j.cantidadGanadas());
                    } else {
                        System.out.println("primero registre una apuesta");
                    }
                    break;
                case 3:
                    int numero;
                    if (contadorApuestas != cantidad) {
                        System.out.println("ingrese numero");
                        numero = sc.nextInt();
                        System.out.println("el numero " + numero + " salio ganador " + j.cantidadSalidas(numero) + " veces");
                    } else {
                        System.out.println("primero registre una apuesta");
                    }
                    break;
                case 4:
                    System.out.println("el total ganado en "+contadorApuestas+" jugadas es: "+j.ganancias());
                    break;
                case 5:
                     if (contadorApuestas != cantidad) {
                         System.out.println("el total apostado a numero pares es "+j.sumaPares());
                     }
                     else{
                         System.out.println("primero registre una apuesta");
                     }
                     break;
                default:
                    System.out.println("opcion incorrecta");
            }
            System.out.println("****MENU****");
            System.out.println("1-agregar apuesta " + contadorApuestas + " registros disponibles");
            System.out.println("2- cantidad de apuestas ganadas");
            System.out.println("3-cuantas veces salio X numero");
            System.out.println("4-total ganado");
            System.out.println("5-total apostado a numeros pares");
            System.out.println("0-salir");
            opcion = sc.nextInt();
        }
        System.out.println("ADIOS..");
    }

}
