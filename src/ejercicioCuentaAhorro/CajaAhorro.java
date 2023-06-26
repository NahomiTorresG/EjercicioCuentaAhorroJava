package ejercicioCuentaAhorro;

public class CajaAhorro extends Cuenta {

	//2.- Metodo constructor (heredar datos desde el constructor)
	
	public CajaAhorro(String titular, float cantidad) {
		super(titular, cantidad);
		
	}//cajaAhorro

	
	
	
	public void imprimirDatos() {
			System.out.println("Titular: " + titular);
			System.out.println("Cantidad: " + cantidad);
	}//imprimirDatos



	//toString
	@Override
	public String toString() {
		return "CajaAhorro [titular=" + titular + ", cantidad=" + cantidad + "]";
	}//toString
	
	
}//cajaAhorro
