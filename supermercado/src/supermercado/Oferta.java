
package supermercado;

public class Oferta {
    private int numProducto;
    private String nombreProducto;
    private double precioRegular;
    private double precioOferta;
    private int cantidadDiasDeOferta;
    private int stock;

    public int getNumProducto() {
        return numProducto;
    }

    public void setNumProducto(int numProducto) {
        this.numProducto = numProducto;
    }

    public String getNombreProducto() {
        return nombreProducto;
    }

    public void setNombreProducto(String nombreProducto) {
        this.nombreProducto = nombreProducto;
    }

    public double getPrecioRegular() {
        return precioRegular;
    }

    public void setPrecioRegular(double precioRegular) {
        this.precioRegular = precioRegular;
    }

    public double getPrecioOferta() {
        return precioOferta;
    }

    public void setPrecioOferta(double precioOferta) {
        this.precioOferta = precioOferta;
    }

    public int getCantidadDiasDeOferta() {
        return cantidadDiasDeOferta;
    }

    public void setCantidadDiasDeOferta(int cantidadDiasDeOferta) {
        this.cantidadDiasDeOferta = cantidadDiasDeOferta;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public Oferta(int numProducto, String nombreProducto, double precioRegular, double precioOferta, int cantidadDiasDeOferta, int stock) {
        this.numProducto = numProducto;
        this.nombreProducto = nombreProducto;
        this.precioRegular = precioRegular;
        this.precioOferta = precioOferta;
        this.cantidadDiasDeOferta = cantidadDiasDeOferta;
        this.stock = stock;
    }
    
    
}
