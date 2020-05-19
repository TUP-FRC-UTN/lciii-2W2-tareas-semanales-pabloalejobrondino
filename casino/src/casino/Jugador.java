package casino;

public class Jugador {

    private String nombre;
    private Apuesta[] apuestas;

    public Jugador(String nombre, int cantidad) {
        this.nombre = nombre;
        this.apuestas = new Apuesta[cantidad];
    }

    public void nuevaApuesta(Apuesta nueva) {
        for (int i = 0; i < apuestas.length; i++) {
            if (apuestas[i] == null) {
                apuestas[i] = nueva;
                break;
            }

        }
    }

    public int cantidadGanadas() {
        int contador = 0;
        for (int i = 0; i < apuestas.length; i++) {
            if (apuestas[i] != null) {
                if (apuestas[i].getNumeroJugado() == apuestas[i].getNumeroGanador()) {
                    contador++;
                }
            }

        }
        return contador;
    }

    public int cantidadSalidas(int numero) {
        int contador = 0;
        for (int i = 0; i < apuestas.length; i++) {
            if (apuestas[i] != null) {
                if (apuestas[i].getNumeroGanador() == numero) {
                    contador++;
                }
            }

        }
        return contador;
    }

    public double ganancias() {
        double acu = 0;
        for (int i = 0; i < apuestas.length; i++) {
            if (apuestas[i] != null) {
                if (apuestas[i].getNumeroGanador() == apuestas[i].getNumeroJugado()) {
                    acu += apuestas[i].getMonto() * 36;
                }
            } else if (apuestas[i].getNumeroGanador() != apuestas[i].getNumeroJugado()) {
                acu -= apuestas[i].getMonto();
            }

        }
        return acu;
    }

    public double sumaPares() {
        double acu = 0;
        for (int i = 0; i < apuestas.length; i++) {
            if (apuestas[i] != null) {
                if (apuestas[i].getNumeroJugado() % 2 == 0) {
                    acu += apuestas[i].getMonto();
                }
            }
            
        }
        return acu;
    }
}
