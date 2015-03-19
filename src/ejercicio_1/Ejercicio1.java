package ejercicio_1;

public class Ejercicio1 {
	private static int  [] desordenado;
	private static int  [] ordenado;
	final static int pos=100;
	
	public static int getAleatorio(){
		return (int)(Math.random()*100);
	}
	public static void mostrarDesordenado(){
		for(int f=0;f<desordenado.length;f++)
			System.out.print(desordenado [f]+" ");
	}
	public static void mostrarOrdenado(){
		for(int f=0;f<ordenado.length;f++)
			System.out.print(ordenado [f]+" ");
	}
	public static void insercion ( ) {
		int aux;
		int j;
		for (int i=1; i<=ordenado.length-1; i++) {
			aux = ordenado[i];
			for (j=i-1; j>=0 && ordenado[j]>aux; j--){
				ordenado[j+1] = ordenado[j];
				ordenado[j] = aux;
			}
		}
	}
	public static void crearVector(){
		desordenado=new int [pos];
		ordenado=new int [pos];
		for(int f=0;f<pos;f++){
			desordenado[f] = getAleatorio();
		}
		ordenado = desordenado;
	}
	public static void main(String[] args) {
		
		crearVector();
		System.out.println("Vector aleatorio ");
		mostrarDesordenado();
		System.out.println("\n\nVector ordenado por el metodo de insercion ");
		insercion();
		mostrarOrdenado();
	}
}
