package ejercicioCuentaAhorro;

public class PlazoFijo extends Cuenta {

	//1.- Atributos
	
	public int plazo;
	public double interes;
	
	
	
	//2.- Metodos para calcular importe del interes
	public PlazoFijo(String titular, float cantidad, int plazo, double interes) {
		super(titular, cantidad);
		this.plazo = plazo;
		this.interes = interes;
	}//metodo
	
	
	
	//Metodo obtener importe de interes
	public double obtenerImporteInteres() {
		return cantidad*(interes/100);
	}//obtener importe interes
	
	
	
	//Metodo para mostrarInformacion
	public void mostrarInformacion() {
		System.out.println("Informaxión de la cuenta Plazo Fijo: ");
		imprimirDatos();//Metodo imprimir datos desde la clase cuenta
		System.out.println("Plazo: " + plazo);
		System.out.println("Interés: " + interes);
		System.out.println("Total de interés: " + obtenerImporteInteres());
	}
	
}//PlazoFijo
