package ejercicio_1;

public class Ejercicio1 {
	private static int  [] desordenado;
	final static int pos=100;
	public static int getAleatorio(){
		return (int)(Math.random()*100);
	}
	public static void mostrar(){
		for(int f=0;f<desordenado.length;f++)
			System.out.print(desordenado [f]+" ");
	}
	public static void insercion ( ) {
		int aux;
		int j;
		for (int i=1; i<=99; i++) {
			aux = desordenado[i];
			for (j=i-1; j>=0 && desordenado[j]>aux; j--){
				desordenado[j+1] = desordenado[j];
				desordenado[j] = aux;
			}
		}
	}
	public static void main(String[] args) {
		desordenado=new int [pos];
		for(int f=0;f<pos;f++)
			desordenado[f]=getAleatorio();
		System.out.println("Vector aleatorio ");
		mostrar();
		System.out.println("\n\nVector ordenado por el metodo de insercion ");
		insercion();
		mostrar();
	}
}
