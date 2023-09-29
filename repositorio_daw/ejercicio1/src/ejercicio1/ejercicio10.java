/**
 * 
 */
package ejercicio1;

/**
 * 
 */
public class ejercicio10 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double  num = Math.random()*100;
		String msg = (num >= 0 && num < 20) ? "El número está entre 0 y 20, 20 no incluido"
		             :"El numero NO está entre 0 y 20, 20 no incluido";
		msg = (num >= 20 && num <= 50) ? "El número está entre 20 y 50, ambos incluidos"
		             :"El número NO está entre 20 y 50, ambos incluidos";
		msg = (num >= 0 && num <= 25 || num >= 75 && num <= 100) ? "El número está entre 0 y 25, ambos incluidos o entre 75 y 100, ambos incluidos"
				     :"El número NO está entre 0 y 25, ambos incluidos o entre 75 y 100, ambos incluidos";			

	}

}
