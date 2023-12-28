package tokio.school;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Clase5 {
    public static void main(String[] args) {
        List<Ciudad> ciudades = new ArrayList<>();
        ciudades.add(new Ciudad("Madrid", "Madrid", 3334730));
        ciudades.add(new Ciudad("Mostoles", "Madrid", 210309));
        ciudades.add(new Ciudad("Alcala de Henares", "Madrid", 197562));
        ciudades.add(new Ciudad("Fuenlabrada", "Madrid", 3334730));
        ciudades.add(new Ciudad("Leganes", "Madrid", 19114));
        ciudades.add(new Ciudad("Getafe", "Madrid", 185180));
        ciudades.add(new Ciudad("La Hiruela ", "Madrid", 65));
        ciudades.add(new Ciudad("La Acebeda", "Madrid", 68));
        ciudades.add(new Ciudad("Somosierra", "Madrid", 87));
        ciudades.add(new Ciudad("El Atazar", "Madrid", 90));

        System.out.println("¿Cuántas ciudades hay en total?");
        System.out.println(" en total hay una cantidad de " + ciudades.size()+ " cargadas en el sistema.");
        System.out.println("______________________________________________________");
        System.out.println("¿Cuántas ciudades de “Madrid” tienen más de 1.000 habitantes?");
        System.out.println(ciudades.stream().filter(t-> t.getHabitantes() > 1000).collect(Collectors.toList()).size()
                + " ciudades cargadas en el sistema con esa cifra de habitantes. ");
        System.out.println("______________________________________________________");
        System.out.println("¿De que provincias son las ciudades?");
        ciudades.forEach(t-> System.out.println(t.getNombre() +" : "+ t.getProvincia()));
        System.out.println("______________________________________________________");
        System.out.println(" ¿De cuantas provincias diferentes son las ciudades?");
        ciudades.forEach(t-> { if(t.getProvincia() != t.getProvincia())
            System.out.println("las provincias que pertenecen a las ciudades cargadas son : " + t.getProvincia());
        else{
                System.out.println("solo de una provincia, que es : " + t.getProvincia());
            }
        });
        System.out.println("______________________________________________________");
        System.out.println(". ¿Alguna ciudad de Madrid tiene más de 50.000 habitantes? ");
        System.out.println(ciudades.stream().filter(t-> t.getHabitantes() > 50000).collect(Collectors.toList()).size()
                + " ciudades cargadas en el sistema con esa cifra de habitantes. ");

     }
}
