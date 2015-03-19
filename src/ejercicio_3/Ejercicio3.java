package ejercicio_3;

import java.util.Scanner;

public class Ejercicio3 {
	private static int vector1[];
	private static int vector2[];
	private static int vectorFinal[];
	
	/*metodo para crear el vector 1 con atributo de entrada para
	 * el tamaño del vector e introduccion de los valores por teclado
	 */
	public static void crearVector1(int pos){
		vector1=new int [pos];
		Scanner teclado=new Scanner(System.in);
		for(int f=0;f<pos;f++){
			System.out.print("Introduce el valor ");
			vector1[f]=teclado.nextInt();
		}
	}
	
	/*metodo para crear el vector 2 con atributo de entrada para
	 * el tamaño del vector e introduccion de los valores por teclado
	 */
	public static void crearVector2(int pos){
		vector2=new int [pos];
		Scanner teclado=new Scanner(System.in);
		for(int f=0;f<pos;f++){
			System.out.print("Introduce el valor ");
			vector2[f]=teclado.nextInt();
		}
	}
	
	/*El metodo hace un bucle para sacar por pantalla
	 * todos los valores del vector1
	 */
	public static void mostrar1(){
		for(int f=0;f<vector1.length;f++){
			System.out.print(vector1 [f]+" ");
		}
		System.out.println();
	}
	
	/*El metodo hace un bucle para sacar por pantalla
	 * todos los valores del vector2
	 */
	public static void mostrar2(){
		for(int f=0;f<vector2.length;f++){
			System.out.print(vector2 [f]+" ");
		}
		System.out.println();
	}
	
	/*metodo que copia el vector 1 y el vector 2 dentro del mismo vectorFinal
	 * 
	 */
	public static void copiarDosVectores(){
		vectorFinal=new int [vector1.length+vector2.length];
		System.arraycopy(vector1, 0, vectorFinal, 0, vector1.length);
		System.arraycopy(vector2, 0, vectorFinal, vector1.length, vector2.length);
	}
	
	/*El metodo hace un bucle para sacar por pantalla
	 * todos los valores del vectorFinal
	 */
	public static void mostrarFinal(){
		for(int f=0;f<vectorFinal.length;f++){
			System.out.print(vectorFinal [f]+" ");
		}
		System.out.println();
	}
	
	/*metodo que ardena el vectorFinal de forma ascendente
	 * 
	 */
	public static void ordenacionAscendente(){
		int minimo, aux;
		for (int i=0; i<vectorFinal.length; i++) {
			minimo = i;
			for (int j=i+1; j<vectorFinal.length; j++)
				if (vectorFinal[j] < vectorFinal[minimo])
					minimo = j;
			aux =vectorFinal[minimo];
			vectorFinal[minimo]=vectorFinal[i];
			vectorFinal[i]=aux;
		}
	}
	
	public static void main(String[] args){
		int pos1;
		int pos2;
		Scanner teclado=new Scanner(System.in);
		System.out.println("Introduce la cantidad de valores que desea para el vector 1");
		pos1=teclado.nextInt();
		crearVector1(pos1);
		System.out.println("El vector 1 es: ");
		mostrar1();
		System.out.println("Introduce la cantidad de valores que desea para el vector 2");
		pos2=teclado.nextInt();
		crearVector2(pos2);
		System.out.println("El vector 2 es:");
		mostrar2();
		copiarDosVectores();
		System.out.println("La union de los dos vectores es:");
		mostrarFinal();
		ordenacionAscendente();
		System.out.println("El vector final ordenad de forma ascendente es:");
		mostrarFinal();
		teclado.close();
	}

}
