package set;

import java.util.HashSet;
import java.util.Set;

public class EjemploHashSetBuscarDuplicado {
    public static void main(String[] args) {

        String[] peces = {"Corvina", "Lenguado", "Dorado", "Corvina"};

        Set<String> unicos = new HashSet();

        for (String p : peces) {
            if(!unicos.add(p)){
                System.out.println("Elemento Duplicado: " + p);
            }
        }

        System.out.println(unicos.size() + " elementos no duplicados" + unicos);
    }
}
