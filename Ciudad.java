package tokio.school;

import java.util.HashSet;
import java.util.Set;

public class Ciudad {

    private String nombre;
    private String provincia;
    private int habitantes;

    Set<Ciudad> ciudades;

    public Ciudad(String nombre, String provincia, int habitantes) {
        this.nombre = nombre;
        this.provincia = provincia;
        this.habitantes = habitantes;
        ciudades = new HashSet<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getProvincia() {
        return provincia;
    }

    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }

    public int getHabitantes() {

        return habitantes;
    }

    public void setHabitantes(int habitantes) {
        this.habitantes = habitantes;
    }

    @Override
    public String toString() {
        return "Ciudad :" +
                "nombre = " + nombre + " \n "+
                "provincia =" + provincia + " \n " +
                "habitantes =" + habitantes +" \n " +
                "___________________________" +" \n ";
    }

    public Set<Ciudad> getCiudades() {
        return ciudades;
    }

    public void setCiudades(Set<Ciudad> ciudades) {
        this.ciudades = ciudades;
    }
}
