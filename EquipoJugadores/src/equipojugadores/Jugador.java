
package equipojugadores;


public class Jugador {
   private String nombreJugador;
   private int posicion;
   private int numCamiseta;
   private int cantPartidosJugados;
   private int PorcentajeEstadoF;

    public String getNombreJugador() {
        return nombreJugador;
    }

    public void setNombreJugador(String nombreJugador) {
        this.nombreJugador = nombreJugador;
    }

    public int getPosicion() {
        return posicion;
    }

    public void setPosicion(int posicion) {
        this.posicion = posicion;
    }

    public int getNumCamiseta() {
        return numCamiseta;
    }

    public void setNumCamiseta(int numCamiseta) {
        this.numCamiseta = numCamiseta;
    }

    public int getCantPartidosJugados() {
        return cantPartidosJugados;
    }

    public void setCantPartidosJugados(int cantPartidosJugados) {
        this.cantPartidosJugados = cantPartidosJugados;
    }

    public int getPorcentajeEstadoF() {
        return PorcentajeEstadoF;
    }

    public void setPorcentajeEstadoF(int PorcentajeEstadoF) {
        this.PorcentajeEstadoF = PorcentajeEstadoF;
    }

    public Jugador(String nombreJugador, int posicion, int numCamiseta, int cantPartidosJugados, int PorcentajeEstadoF) {
        this.nombreJugador = nombreJugador;
        this.posicion = posicion;
        this.numCamiseta = numCamiseta;
        this.cantPartidosJugados = cantPartidosJugados;
        this.PorcentajeEstadoF = PorcentajeEstadoF;
    }
    
    
}
