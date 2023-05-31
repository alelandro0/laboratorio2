package flecha;

import java.util.HashMap;
import java.util.Map;

public class Principal {
Flechas flecha1, flecha2, flecha3;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Principal miPrincipla= new Principal();

	}
    public Principal() {
    	HashMap<Integer, Flechas>map= new HashMap<>();
    	System.out.println("flecha 1");
    	flecha1= new Flechas();
    	flecha1.ConstrurFlechas();
    	flecha1.imprimirEspacios();
    	map.put(flecha1.longitud, flecha1);
    	System.out.println("flecha 2");
    	flecha2= new Flechas();
    	flecha2.longitud=34;
    	flecha2.color="rojo";
    	flecha2.ConstrurFlechas();
    	flecha2.imprimirEspacios();
    	map.put(flecha2.longitud, flecha2);
    	System.out.println("flecha 3");
    	flecha3= new Flechas();
    	flecha3.longitud=11;
    	flecha3.ConstrurFlechas();
    	flecha3.imprimirEspacios();
    	map.put(flecha3.longitud, flecha3);
    	for (Map.Entry<Integer, Flechas> entry : map.entrySet()) {
    		System.out.println();
    		System.out.println("**ESTO ES HASHMAP**");
			Integer key = entry.getKey();
			Flechas val = entry.getValue();
			System.out.println("longitud\n"+key +"\n"+val.toString());
			
			
		}
    }

}
