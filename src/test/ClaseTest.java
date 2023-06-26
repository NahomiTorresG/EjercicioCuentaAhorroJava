package test;

import ejercicioCuentaAhorro.CajaAhorro;
import ejercicioCuentaAhorro.PlazoFijo;

public class ClaseTest {

	public static void main(String[] args) {
		
		//Instancia #1 (cuentaAhorro)
		CajaAhorro instancia1 = new CajaAhorro("Felipe Maqueda", 1000.0f); //cuando no quiero plomorfear
			
		//Instancia #2 (PlazoFijo)
		PlazoFijo instancia2 = new PlazoFijo("Jesus Gonzalez", 2500.0f, 12, 5.0);
		
		
		//Mostrar informacion de las cuentas
		instancia1.imprimirDatos(); //titular y cantidad
		System.out.println(); //espacio entre informacion
		instancia2.mostrarInformacion(); //titular, cantidad, plazo, interes
	}
}
