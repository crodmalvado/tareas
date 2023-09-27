/**
 * 
 */
package ejercicio1;

/**
 * 
 */
public class ejercicio9 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
scanner scanner = new Scanner (System.in);
double iva =21d;
System.out.println( "Introduce la base imponible de la factura");
double baseImp = scanner.nextDouble();
double precio = baseImp + baseImp * iva / 100;
System.out.println("el precio");

	}

}
