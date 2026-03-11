package data;

import Logica.Operador;
import java.util.HashMap;


public class ModeloDatos {
	HashMap<String, Operador> mapaOperario;
	
	public ModeloDatos() {
		mapaOperario=new HashMap<String, Operador>();
	}
	public void registrarOperador(Operador ope) {
		if(!mapaOperario.containsKey(ope.getDocumento())) {
			
			mapaOperario.put(ope.getDocumento(), ope);
			System.out.println("Registro exitoso");
			
		}else {
			System.out.println("Operador Existente");
			
		}
		
		
		
		
	}
	
	public void consultarOperadorPorDocumento(String documento) {
		if(mapaOperario.containsKey(documento)) {
			System.out.println(mapaOperario.get(documento));			
		}else {
			System.out.println("El operador no existe");
		}
		
		
		
	}
	
	public void consultarOperadorLista() {
		
	}
	public void actualizarOperador() {
		
	}



}
