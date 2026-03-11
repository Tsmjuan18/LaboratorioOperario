package data;

import Logica.Operador;
import java.util.HashMap;


public class ModeloDatos {
	HashMap<String, Operador> mapaOperario;
	
	public ModeloDatos() {
		mapaOperario=new HashMap<String, Operador>();
	}
	
	
	
	public String registrarOperador(Operador ope) {
		if(!mapaOperario.containsKey(ope.getDocumento())) {
			
			mapaOperario.put(ope.getDocumento(), ope);
			return "Registro exitoso";
			
		}else {
			return "Operador Existente";
			
		}
		
		
		
	}
	
	public Operador consultarOperadorPorDocumento(String documento) {

	    Operador operaTemporal = null;

	    if (mapaOperario.containsKey(documento)) {
	        operaTemporal = mapaOperario.get(documento);
	    }

	    return operaTemporal;
	}
	
	public void consultarOperadorLista() {
		System.out.println("Lista operadores: ");
		System.out.println(mapaOperario);
	}
	



}
