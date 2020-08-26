package collections.map;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class CollectionList {

	public void execute() {
		List<String> listaMercado = new ArrayList<String>();
		listaMercado.add("Macarao");
		listaMercado.add("Feijao");
		listaMercado.add("Ovo");
		listaMercado.add("Sal");
		
		Collections.sort(listaMercado);
		
		System.out.println(listaMercado);
		
		for(int i = 0; i < listaMercado.size(); i++) {
			System.out.println(listaMercado.get(i));
		}
		
		listaMercado.remove(0);
		System.out.println(listaMercado);
		
		listaMercado.remove("Ovo");
		System.out.println(listaMercado);
		
		System.out.println(listaMercado.contains("Sal"));
		System.out.println(listaMercado.contains("Farinha"));
		
		int posiSal = listaMercado.indexOf("Sal");
		System.out.println(posiSal);
				
	}
}