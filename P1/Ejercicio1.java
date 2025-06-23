import java.util.*;
import java.util.stream.*;

public class Ejercicio1{
    public static void main(String[] args){
        HashSet<String> coleccion = new HashSet<>();
        Stream<String> stream;

        coleccion.add("Hello");
        coleccion.add("Hello");
        coleccion.add("Bye");
        coleccion.add("World");
        System.out.println("Coleccion original: " + coleccion);
        
        stream = coleccion.stream()
            .filter(s -> s.contains("y"))
            .map(s -> new StringBuilder(s).reverse().toString());

        System.out.print("Coleccion filtrada y volteada: ");
        stream.forEach(s -> System.out.println(s));
    }

}
