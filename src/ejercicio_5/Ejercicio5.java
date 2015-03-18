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
		for (int i=1; i<=pos-1; i++) {
			aux = vector[i];
			for (j=i-1; j>=0 && vector[j]>aux; j--){
				vector[j+1] = vector[j];
				vector[j] = aux;
			}
		}
	}
	
	public static void crearVector(){
		vector=new int [pos];
		for(int f=0;f<pos;f++)
			vector[f]=getAleatorio();
	}
	
	public static void mostrarNoEstan(){
		int j=0;
		System.out.println();
		System.out.print("Los valores que no estan son:");
		for (int i=1;i<pos;i++){
			for(j=0;j<pos;j++){
				if(i==vector[j]){
					break;
				}
			}
			if(j==pos){
				System.out.print(i+" ");
			}
		}
	}
	
	public static void main(String[] args) {
		crearVector();
		insercion();
		mostrar();
		mostrarNoEstan();
	}
}
