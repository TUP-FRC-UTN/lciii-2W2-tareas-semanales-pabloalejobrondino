package veterinaria;

import java.util.Scanner;

public class Veterinaria {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int tam;//para tamaño del arreglo

        System.out.println("que cantidad de clientes va a registrar? ");
        tam = sc.nextInt();

        Cliente arrayClientes[] = new Cliente[tam];//arreglo de objetos clientes (contiene un objeto mascota tmb)

        for (int i = 0; i < arrayClientes.length; i++) {
            int idcliente;
            System.out.println("Ingrese NUMERO de cliente " + (i + 1));
            idcliente = sc.nextInt();
            sc.nextLine();
            String nombreCliente;
            System.out.println("Ingrese NOMBRE del cliente " + (i + 1));
            nombreCliente = sc.nextLine();
            int antiguedad;
            System.out.println("Ingrese la ANTIGUEDAD del cliente " + (i + 1));
            antiguedad = sc.nextInt();
            sc.nextLine();
            String nombreMas;
            System.out.println("Ingrese NOMBRE DE LA MASCOTA del cliente " + (i + 1));
            nombreMas = sc.nextLine();
            int edadMas;
            System.out.println("Ingres EDAD DE LA MASCOTA del cliente " + (i + 1));
            edadMas = sc.nextInt();

            Mascota m = new Mascota(nombreMas, edadMas); //primero crear la mascota que tiene el cliente
            arrayClientes[i] = new Cliente(idcliente, nombreCliente, antiguedad, m);//despues se crea el clinete
        }

        System.out.println("que desea hacer?");
        System.out.println("");
        System.out.println("1- ver cantidad de clientes.");
        System.out.println("2- ver promedio de edad de mascotas.");
        System.out.println("3- cantidad de clientes con antiguedad mayor a 5 años");
        System.out.println("4- ver todos los clientes con sus mascotas");
        System.out.println("0 - finalizar programa");
        int var = sc.nextInt();

        while (var != 0) {

            switch (var) {
                case 1://Mostrar la cantidad de clientes. seria lo mismo que el tamaño del arreglo (tam)

                    int contador = 0;
                    for (int i = 0; i < arrayClientes.length; i++) {
                        if (arrayClientes[i] != null) {
                            contador++;
                        }
                    }
                    System.out.println("cantidad de clientes: " + contador);
                    break;

                case 2://Mostrar el promedio de edad de las mascotas.

                    int acuedad = 0;
                    int contadorMascotas = 0;
                    for (int i = 0; i < arrayClientes.length; i++) {
                        if (arrayClientes[i] != null) {
                            acuedad += arrayClientes[i].getAtributoMascota().getEdadM();
                        }
                        contadorMascotas++;

                    }
                    System.out.println("promedio edad mascotas: " + (double) acuedad / contadorMascotas+" años.");
                    break;

                case 3://Informar cuántos clientes tienen una antigüedad mayor igual a 5 años.

                    int contadorClienteMasDe5 = 0;
                    for (int i = 0; i < arrayClientes.length; i++) {
                        if (arrayClientes[i] != null && arrayClientes[i].getAntiguedad() > 5) {
                            contadorClienteMasDe5++;
                        }
                    }

                    System.out.println("la veterinaria tiene " + contadorClienteMasDe5 + " clinte(s) con mas de 5 años de antiguedad");
                    break;

                case 4://mostrar todos los clientes con su mascota

                    for (int i = 0; i < arrayClientes.length; i++) {
                        System.out.println(arrayClientes[i].toString());

                    }
                    break;
                default:
                    System.out.println("Opcion no valida");
                    break;

            }
            System.out.println("");
            System.out.println("que desea hacer?");
            System.out.println("1- ver cantidad de clientes.");
            System.out.println("2- ver promedio de edad de mascotas.");
            System.out.println("3- cantidad de clientes con antiguedad mayor a 5 años");
            System.out.println("4- ver todos los clientes con sus mascotas");
            System.out.println("0 - finalizar programa");
            var = sc.nextInt();
        }

    }

}
