package ejercicio_3;

import java.util.Scanner;

public class Ejercicio3 {
	private static int vector1[];
	private static int vector2[];
	private static int vectorFinal[];
	
	public static void crearVector1(int pos){
		vector1=new int [pos];
		Scanner teclado=new Scanner(System.in);
		for(int f=0;f<pos;f++){
			System.out.print("Introduce el valor ");
			vector1[f]=teclado.nextInt();
		}
	}
	
	public static void crearVector2(int pos){
		vector2=new int [pos];
		Scanner teclado=new Scanner(System.in);
		for(int f=0;f<pos;f++){
			System.out.print("Introduce el valor ");
			vector2[f]=teclado.nextInt();
		}
	}
	
	public static void mostrar1(){
		for(int f=0;f<vector1.length;f++){
			System.out.print(vector1 [f]+" ");
		}
		System.out.println();
	}
	
	public static void mostrar2(){
		for(int f=0;f<vector2.length;f++){
			System.out.print(vector2 [f]+" ");
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		int pos1;
		int pos2;
		Scanner teclado=new Scanner(System.in);
		System.out.println("Introduce la cantidad de valores que desea para el vector 1");
		pos1=teclado.nextInt();
		crearVector1(pos1);
		mostrar1();
		System.out.println("Introduce la cantidad de valores que desea para el vector 2");
		pos2=teclado.nextInt();
		crearVector2(pos2);
		mostrar2();
		teclado.close();
	}

}
