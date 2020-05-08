package equipojugadores;

import java.util.Scanner;

public class EquipoJugadores {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String nombreEquipo;
        int cantidadJugadores;
        int contador = 0;
        int opcion = 0;

        System.out.println("***CREAR NUEVO EQUIPO***");
        System.out.println("Ingrese Nombre del Equipo:");
        nombreEquipo = sc.nextLine();
        System.out.println("Ingrese cantidad de jugadores del equipo:");
        cantidadJugadores = sc.nextInt();
        Equipo e = new Equipo(nombreEquipo, cantidadJugadores);

        System.out.println("Equipo " + nombreEquipo + " creado.");

        System.out.println("");
        contador = cantidadJugadores;

        System.out.println("****MENU****");
        System.out.println("1- Agregar jugador, " + contador + " registros disponibles");
        System.out.println("2- cantidad de jugadores con menos de 10 partidos");
        System.out.println("3- Jugador con mas partidos jugados");
        System.out.println("4- promedio estado fisico del equipo");
        System.out.println("5-estado fisico de un jugador");
        opcion = sc.nextInt();
        sc.nextLine();

      


        
        while (opcion != 0) {

            switch (opcion) {
                case 1:
                    if (contador == 0) {
                        System.out.println("registros agotados, ¡no se pueden registrar mas jugadores!");
                    } else {
                        String nombreJugador;
                        int posicion;
                        int numCamiseta;
                        int cantPartidosJugados;
                        int PorcentajeEstadoF;
                        System.out.println("Nombre del jugador:");
                        nombreJugador = sc.nextLine();
                        System.out.println("Posicion: (1: arquero, 2: defensor, 3: mediocampo, 4: delantero)");
                        posicion = sc.nextInt();
                        System.out.println("Numero de camiseta:");
                        numCamiseta = sc.nextInt();
                        System.out.println("cantidad de partidos jugados:");
                        cantPartidosJugados = sc.nextInt();
                        System.out.println("porcentaje estado fisico:");
                        PorcentajeEstadoF = sc.nextInt();
                        sc.nextLine();
                        Jugador j = new Jugador(nombreJugador, posicion, numCamiseta, cantPartidosJugados, PorcentajeEstadoF);
                        e.agregarJugador(j);
                        contador--;
                    }
                    break;
                case 2:
                    if (contador != cantidadJugadores) {
                        System.out.println("existen " + e.cantidadJugadoresMenosDe10() + " jugadores con menos de 10 partidos jugados");
                    } else {
                        System.out.println("¡aun no se registro ningun jugador!, para registrar ingrese opcion 1");
                    }
                    break;
                case 3:
                    if (contador != cantidadJugadores) {
                        System.out.println("el jugador con mas partidos jugados es: " + e.jugadorMasPartidos());
                    } else {
                        System.out.println("¡aun no se registro ningun jugador!, para registrar ingrese opcion 1");
                    }
                    break;
                case 4:
                    if (contador != cantidadJugadores) {
                        System.out.println("el promedio de estado fisico del equipo es " + e.promedioestadoFisico());
                    } else {
                        System.out.println("¡aun no se registro ningun jugador!, para registrar ingrese opcion 1");
                    }

                    break;
                case 5:
                    if (contador != cantidadJugadores) {
                        System.out.println("ingrese numeor de camiseta del jugador");
                        int numero;
                        numero = sc.nextInt();
                        System.out.println("el estado fisico del jugador de la camiseta numero: " + numero + " es " + e.estadofisicoJugador(numero) + "%");
                    } else {
                        System.out.println("¡aun no se registro ningun jugador!, para registrar ingrese opcion 1");
                    }
                    break;
                default:
                    System.out.println("opcion no valida, intente nuevamente");
            }
            System.out.println("****MENU****");
            System.out.println("1- Agregar jugador, " + contador + " registros disponibles");
            System.out.println("2- cantidad de jugadores con menos de 10 partidos");
            System.out.println("3- Jugador con mas partidos jugados");
            System.out.println("4- promedio estado fisico del equipo");
            System.out.println("5-estado fisico de un jugador");
            opcion = sc.nextInt();
            sc.nextLine();
        }
         
    }

   

}
