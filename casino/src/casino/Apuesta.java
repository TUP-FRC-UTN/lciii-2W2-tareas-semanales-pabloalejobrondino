
package casino;


public class Apuesta {
    private int numeroJugado;
    private double monto;
    private int numeroGanador;

    public int getNumeroJugado() {
        return numeroJugado;
    }

    public void setNumeroJugado(int numeroJugado) {
        this.numeroJugado = numeroJugado;
    }

    public double getMonto() {
        return monto;
    }

    public void setMonto(double monto) {
        this.monto = monto;
    }

    public int getNumeroGanador() {
        return numeroGanador;
    }

    public void setNumeroGanador(int numeroGanador) {
        this.numeroGanador = numeroGanador;
    }

    public Apuesta(int numeroJugado, double monto, int numeroGanador) {
        this.numeroJugado = numeroJugado;
        this.monto = monto;
        this.numeroGanador = numeroGanador;
    }
    
}
