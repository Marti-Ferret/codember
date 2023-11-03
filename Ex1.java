import java.sql.Array;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        String missatge = "murcielago leon jirafa cebra elefante rinoceronte hipopotamo ardilla mapache zorro lobo oso puma jaguar tigre leopardo gato perro caballo vaca toro cerdo oveja cabra gallina pato ganso pavo paloma halcon aguila buho colibri canario loro tucan pinguino flamenco tigre jaguar leopardo oso lobo zorro mapache ardilla elefante rinoceronte hipopotamo cebra jirafa leon murcielago cabra oveja cerdo toro vaca caballo perro gato leopardo tigre jaguar oso lobo zorro mapache ardilla hipopotamo rinoceronte elefante jirafa leon murcielago pavo ganso pato gallina cabra oveja cerdo toro vaca caballo perro gato leopardo tigre jaguar oso lobo zorro mapache ardilla hipopotamo rinoceronte elefante jirafa leon murcielago buho aguila halcon paloma pavo ganso pato gallina cabra oveja cerdo toro vaca caballo perro gato leopardo tigre jaguar oso lobo zorro mapache ardilla hipopotamo rinoceronte elefante jirafa leon murcielago colibri buho aguila halcon paloma pavo ganso pato gallina cabra oveja cerdo toro vaca caballo perro gato leopardo tigre jaguar oso lobo zorro mapache ardilla hipopotamo rinoceronte elefante jirafa leon murcielago tucan loro canario colibri buho aguila halcon paloma pavo ganso pato gallina cabra oveja cerdo toro vaca caballo perro gato leopardo tigre jaguar oso lobo zorro mapache ardilla hipopotamo rinoceronte elefante jirafa leon murcielago flamenco pinguino tucan loro canario colibri buho aguila halcon paloma pavo ganso pato gallina cabra oveja cerdo toro vaca caballo perro gato leopardo tigre jaguar oso lobo zorro mapache ardilla hipopotamo rinoceronte elefante jirafa leon murcielago jaguar oso lobo zorro mapache ardilla cebra elefante rinoceronte hipopotamo leon jirafa murcielago caballo vaca toro cerdo oveja cabra gallina pato ganso pavo paloma halcon aguila buho colibri canario loro tucan pinguino flamenco jaguar oso lobo zorro mapache ardilla cebra elefante rinoceronte hipopotamo leon jirafa murcielago caballo vaca toro cerdo oveja cabra gallina pato ganso pavo paloma halcon aguila buho colibri canario loro tucan pinguino flamenco murcielago leon jirafa cebra elefante rinoceronte hipopotamo ardilla mapache zorro lobo oso puma jaguar tigre leopardo gato perro caballo vaca toro cerdo oveja cabra gallina pato ganso pavo paloma halcon aguila buho colibri canario loro tucan pinguino flamenco oso lobo zorro mapache ardilla hipopotamo rinoceronte elefante jirafa leon murcielago cabra oveja cerdo toro vaca caballo perro gato leopardo tigre jaguar oso lobo zorro mapache ardilla cebra elefante rinoceronte hipopotamo jirafa leon murcielago pavo ganso pato gallina cabra oveja cerdo toro vaca caballo perro gato buho aguila halcon paloma colibri canario loro tucan pinguino flamenco jaguar oso lobo zorro mapache ardilla hipopotamo rinoceronte elefante jirafa leon murcielago cabra oveja cerdo toro vaca caballo perro gato buho aguila halcon paloma colibri canario loro tucan pinguino flamenco jaguar oso lobo zorro mapache ardilla hipopotamo rinoceronte elefante jirafa leon murcielago cabra oveja cerdo toro vaca caballo perro gato buho aguila halcon";


        ArrayList<String> paraulesOrdenades = new ArrayList<>();
        HashMap<String, Integer> primeraAparicio = new HashMap<>();
        String missatgeMinuscules = missatge.toLowerCase();
        String[] paraules = missatgeMinuscules.split(" ");


        for (int i=0 ; i<paraules.length; i++){
            String paraula = paraules[i];
            if(!primeraAparicio.containsKey(paraula)){
                paraulesOrdenades.add(paraula);
                primeraAparicio.put(paraula,1);

            }
        }
        for (int i = 0; i < paraulesOrdenades.size(); i++) {
            for (int j = i + 1; j < paraulesOrdenades.size(); j++) {
                String palabra1 = (String) paraulesOrdenades.get(i);
                String palabra2 = (String) paraulesOrdenades.get(j);
                if (primeraAparicio.get(palabra1) > primeraAparicio.get(palabra2)) {
                    paraulesOrdenades.set(i, palabra2);
                    paraulesOrdenades.set(j, palabra1);
                }
            }
        }

        HashMap<String, Integer> totalParaules = new HashMap<>();
        for(String paraula : paraules){
            totalParaules.put(paraula , totalParaules.getOrDefault(paraula,0) +1);
        }

        String resultat = "";
        for (String paraula : paraulesOrdenades) {
            resultat += paraula + totalParaules.get(paraula);
        }
        System.out.println(resultat);
    }
}
