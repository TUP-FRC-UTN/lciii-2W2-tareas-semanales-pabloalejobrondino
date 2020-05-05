package veterinaria;

public class Cliente {

    private int idCliente;
    private String nombre;
    private int antiguedad;
    private Mascota atributoMascota;

    //getter y setter

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getAntiguedad() {
        return antiguedad;
    }

    public void setAntiguedad(int antiguedad) {
        this.antiguedad = antiguedad;
    }

    public Mascota getAtributoMascota() {
        return atributoMascota;
    }

    public void setAtributoMascota(Mascota atributoMascota) {
        this.atributoMascota = atributoMascota;
    }
    
    //constructores

    public Cliente(int idCliente, String nombre, int antiguedad, Mascota atributoMascota) {
        this.idCliente = idCliente;
        this.nombre = nombre;
        this.antiguedad = antiguedad;
        this.atributoMascota = atributoMascota;
    }

    public Cliente() {
    }
    //tostring

    @Override
    public String toString() {
        return "Cliente{" + "idCliente: " + idCliente + ", Nombre: " + nombre + ", antiguedad: " + antiguedad + " " + atributoMascota + '}';
    }
    
}