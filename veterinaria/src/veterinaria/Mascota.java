package veterinaria;

public class Mascota {

    private String nombreM;
    private int EdadM;

    //getter y setter
    public String getNombreM() {
        return nombreM;
    }

    public void setNombreM(String nombreM) {
        this.nombreM = nombreM;
    }

    public int getEdadM() {
        return EdadM;
    }

    public void setEdadM(int EdadM) {
        this.EdadM = EdadM;
    }
    //constructores

    public Mascota(String nombreM, int EdadM) {
        this.nombreM = nombreM;
        this.EdadM = EdadM;
    }
    public Mascota(){
        
    }
    //tostring

    @Override
    public String toString() {
        return "Mascota{" + "nombre Mascota =" + nombreM + ", Edad Mascota =" + EdadM + '}';
    }

}
