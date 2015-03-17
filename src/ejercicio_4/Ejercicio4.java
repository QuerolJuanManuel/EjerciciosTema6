package ejercicio_4;

public class Ejercicio4 {
	private static int  [] vector;
	final static int pos=100;
	
	public static int getAleatorio(){ //Genera numeros aleatorios desde el 10 al 80.
		return (int)(Math.random()*70+10);
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
	
	public static int media(){ //Saca la media de los valores del vector.
		int media=0;
		for (int i=0; i<pos; i++) { 
			media = media + vector[i];
			}
			return media = media / pos;
	}
	
	public static int menor(){ //Recorre el vector y saca el numero menor.
		int menor=100;
		for(int i=0;i<pos;i++){
			if(vector[i] < menor){
			menor = vector[i];
			}
		}
		return menor;
	}
	
	public static int mayor(){ //Recorre el vector y saca el numero mayor.
		int mayor=0;
		for(int i=0;i<pos;i++){
		if (vector[i] > mayor){
			mayor = vector[i];
			}
		} 
		return mayor;
	}
	
	public static void crearVector(){
		vector=new int [pos];
		for(int f=0;f<pos;f++)
			vector[f]=getAleatorio();	
	}
	
	public static int mostrarRepetido(){
		int aux=0;
		int rep=0;
		int  cuenta=0;
		for(int i=1;i<pos;i++){
			if(vector [i] == vector[i-1]){
				aux++;
			}else{
				if(aux >cuenta){
					cuenta=aux;
					rep=vector[i-1];
				}
				aux=0;
			}
		}
		return rep;
	}
	
	public static void main(String[] args) {
		crearVector();
		insercion();
		mostrar();
		System.out.println(" ");
		System.out.println("El valor menor es "+menor());
		System.out.println("El valor mayor es "+mayor());
		System.out.println("La media de los valores es "+ media());
		System.out.println("El valor que mas se repite es "+mostrarRepetido());
	}
}
