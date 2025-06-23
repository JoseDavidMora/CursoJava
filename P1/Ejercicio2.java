import java.util.*;
import java.util.stream.*;

public class Ejercicio2{
    public static void main(String[] args){
        String str = "Hello world, I am a developer";
        int len = str.length();
        System.out.println("Iterando la cadena:");
        for(int i = 0; i < len; i++){
            System.out.print(str.charAt(i) + "|");
        }
    }

}
