package ejercicio_2;
import java.util.*;

public class Ejercicio2 {
	
	/*El metodo esCapicua no funcionava por que el tipo String se tiene que comparar mediante equals y no por ==*/
	
	public static boolean esCapicua(int dato){
		Integer i = new Integer(dato);
		String reverse = new StringBuffer(i.toString()).reverse().toString();
		return i.toString().equals (reverse.toString());
		}
	
	public static void main(String[] args) {
		Scanner teclado=new Scanner(System.in);
		System.out.println("Introduce el numero que quieres comprobar si es capicua");
		int numero=teclado.nextInt();
		teclado.close();
		System.out.println(esCapicua(numero));
	}

}
