
package equipojugadores;


public class Equipo {
    String nombreEquipo;
    Jugador arrayjugadores[];

    public String getNombreEquipo() {
        return nombreEquipo;
    }

    public void setNombreEquipo(String nombreEquipo) {
        this.nombreEquipo = nombreEquipo;
    }

    public Equipo(String nombreEquipo, int cantidadJugadores) {
        this.nombreEquipo = nombreEquipo;
        arrayjugadores=new Jugador[cantidadJugadores];
    }
    
    public void agregarJugador(Jugador j){
        for (int i = 0; i < arrayjugadores.length; i++) {
            if(arrayjugadores[i]==null){
                arrayjugadores[i]=j;
                break;
            }
        }
    }
    public int cantidadJugadoresMenosDe10(){
        int contadorjugadores=0;
        for (int i = 0; i < arrayjugadores.length; i++) {
            if (arrayjugadores[i]!=null) {
                if (arrayjugadores[i].getCantPartidosJugados()<10) {
                    contadorjugadores++;
                }
            }
            
        }
        return contadorjugadores;
    }
    public String jugadorMasPartidos(){
       String auxiliar=arrayjugadores[0].getNombreJugador();
         int cantidad=0;
        for (int i = 0; i < arrayjugadores.length; i++) {
            if (arrayjugadores[i]!=null && arrayjugadores[i].getCantPartidosJugados()> arrayjugadores[0].getCantPartidosJugados() ) {
              auxiliar=arrayjugadores[i].getNombreJugador();
                 
                }
            }
         return auxiliar;
        }
    public double promedioestadoFisico(){
        double promedioEstado=0;
        int contador=0;
        int acu=0;
        for (int i = 0; i < arrayjugadores.length; i++) {
            if (arrayjugadores[i]!=null) {
                acu+= arrayjugadores[i].getPorcentajeEstadoF();
                contador++;
            }
            promedioEstado=(double)acu/contador;
            
        }
        return promedioEstado;
    }
    public int estadofisicoJugador(int numero){
       
        int estado=0;
        for (int i = 0; i < arrayjugadores.length; i++) {
            if (arrayjugadores[i].getNumCamiseta()==numero) {
                estado=arrayjugadores[i].getPorcentajeEstadoF();
                break;
            }
            
        }
        return estado;
    }
    
    
    }
    

