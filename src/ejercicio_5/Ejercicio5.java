package ejercicio_5;

public class Ejercicio5 {

	private static int  [] vector;
	final static int pos=100;
	
	public static int getAleatorio(){
		return (int)(Math.random()*100+1);
	}

	public static void mostrar(){
		for(int f=0;f<vector.length;f++)
			System.out.print(vector [f]+" ");
	}
	
	public static void insercion ( ) {
		int aux;
		int j;
		for (int i=1; i<=99; i++) {
			aux = vector[i];
			for (j=i-1; j>=0 && vector[j]>aux; j--){
				vector[j+1] = vector[j];
				vector[j] = aux;
			}
		}
	}
	
	public static void main(String[] args) {
		vector=new int [pos];
		for(int f=0;f<pos;f++)
			vector[f]=getAleatorio();
		insercion();
		mostrar();
	}
}
