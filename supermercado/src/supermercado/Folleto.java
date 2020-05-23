
package supermercado;
import java.time.LocalDate;

public class Folleto {
    
    private LocalDate fecha;
    private Oferta[] ofertas;

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public Folleto(LocalDate fecha, int cantidad) {
        this.fecha = fecha;
        this.ofertas = new Oferta[cantidad];
    }
    
    public void agregarOferta(Oferta nueva){
        for (int i = 0; i < ofertas.length; i++) {
            if (ofertas[i]==null) {
                ofertas[i]=nueva;
                break;
            }
            
        }
    }
    public int cantidadOfertas(){
        int contador=0;
        for (int i = 0; i < ofertas.length; i++) {
            if (ofertas[i].getCantidadDiasDeOferta()>5) {
                contador++;
            }
            
        }
        return contador;
    }
    public int cantidadStok(){
        int acu=0;
        for (int i = 0; i < ofertas.length; i++) {
            if (ofertas[i]!= null) {
                acu+=ofertas[i].getStock();
            }
            
        }
        return acu;
    }
    public int cantidadPrecio(){
        int contador=0;
        for (int i = 0; i < ofertas.length; i++) {
            if (ofertas[i]!=null) {
                if ((ofertas[i].getPrecioRegular() - ofertas[i].getPrecioOferta()) > 20) {
                    contador++;
                }
            }
            
        }
        return contador;
    }
    public double totalRecaudado(int numero){
        double acu=0;
        for (int i = 0; i < ofertas.length; i++) {
            if(ofertas[i]!= null){
                if(ofertas[i].getNumProducto()== numero){
                    acu=(ofertas[i].getStock()*ofertas[i].getPrecioOferta());
                }
            }
            
        }
        return acu;
    }

    
    
}
