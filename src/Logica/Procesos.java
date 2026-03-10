package Logica;
/*De un operario se conoce su sueldo y los años de antigüedad. Se pide crear un programa que lea los datos de entrada e
informe:
Si el sueldo es inferior a 500 y su antigüedad es igual o superior a 10 años, otorgarle un aumento del 20%, mostrar el
sueldo a pagar.
Si el sueldo es inferior a 500 pero su antigüedad es menor a 10 años, otorgarle un aumento de 5%.
Si el sueldo es mayor o igual a 500 mostrar el sueldo en pantalla sin cambios.*/

public class Procesos {
	
	public void calcularSueldoNuevo(Operador operador) {
		double porcentaje = 0;
		if(operador.getSueldo() < 500 && operador.getAntiguedad() >= 10) {
			porcentaje=0.2;				
			
			
		}
		else if(operador.getSueldo() < 500 && operador.getAntiguedad() < 10) {
			
			 porcentaje= 0.05;			
			
			
		}
		else if(operador.getSueldo() >= 500) {
			porcentaje=0;
			
						
			
		}
		
		operador.setSueldoNuevo(operador.getSueldo()+(operador.getSueldo()*porcentaje));
		operador.setAumento(porcentaje*100);
		
		
	}

}
