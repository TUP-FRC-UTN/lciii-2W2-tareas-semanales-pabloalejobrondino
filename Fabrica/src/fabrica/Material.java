package fabrica;

public class Material {

    private String descripcionMaterial;
    private int codigo;
    private double valorUnitario;
    
    //getters y setters
    public String getDescripcionMaterial() {
        return descripcionMaterial;
    }

    public void setDescripcionMaterial(String descripcion) {
        this.descripcionMaterial = descripcion;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public double getValorUnitario() {
        return valorUnitario;
    }

    public void setValorUnitario(double valorUnitario) {
        this.valorUnitario = valorUnitario;
    }
    //constructores

    //con parametros
    public Material(String descripcion, int codigo, double valorUnitario) {
        this.descripcionMaterial = descripcion;
        this.codigo = codigo;
        this.valorUnitario = valorUnitario;
    }
    //sin parametros

    public Material() {
    }
    
    //metodo tostring

    @Override
    public String toString() {
        return "descripcion = " + this.getDescripcionMaterial() + ", codigo = " + codigo + ", valor Unitario = " + valorUnitario ;
    }
    
    

}
