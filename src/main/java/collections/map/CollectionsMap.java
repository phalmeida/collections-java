package collections.map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class CollectionsMap {
	
	public void execute() {

		Map<Integer, String> meses = new HashMap<>();
		meses.put(1, "Janeiro");
		meses.put(2, "Fevereiro");
		meses.put(3, "Março");
		meses.put(12, "Dezembro");
		
		System.out.println(meses);
		
		String n1 = meses.get(1);
		System.out.println(n1);
		
		System.out.println(meses.containsKey(1));
		
		Set<Integer> numeros = meses.keySet();
		
		for (Integer numero : numeros) {
			System.out.println(numero);
		}
		
		Collection<String> nomes = meses.values();
		
		for (String nome : nomes) {
			System.out.println(nome);
		}
		
		Set<Map.Entry<Integer, String>> entries =  meses.entrySet();
		
		for (Map.Entry<Integer, String> entry : entries) {
			System.out.println(entry.getKey()+ " : " + entry.getValue());
		}
	}

}
