package ejercicio_4;

public class Ejercicio4 {
	private static int  [] vector;
	final static int pos=100;
	
	public static int getAleatorio(){ //Genera numeros aleatorios desde el 10 al 80.
		return (int)(Math.random()*70+10);
	}

	public static void mostrar(){ //muestra el vector por pantalla
		for(int f=0;f<vector.length;f++)
			System.out.print(vector [f]+" ");
	}
	
	public static void insercion ( ) { //ordena el vector por el metodo de insercion
		int aux;
		int j;
		for (int i=1; i<=vector.length-1; i++) {
			aux = vector[i];
			for (j=i-1; j>=0 && vector[j]>aux; j--){
				vector[j+1] = vector[j];
				vector[j] = aux;
			}
		}
	}
	
	public static int media(){ //Saca la media de los valores del vector.
		int media=0;
		for (int i=0; i<vector.length; i++) { 
			media = media + vector[i];
			}
			return media = media /vector.length;
	}
	
	public static int menor(){ //Recorre el vector y saca el numero menor.
		int menor=100;
		for(int i=0;i<vector.length;i++){
			if(vector[i] < menor){
			menor = vector[i];
			}
		}
		return menor;
	}
	
	public static int mayor(){ //Recorre el vector y saca el numero mayor.
		int mayor=0;
		for(int i=0;i<vector.length;i++){
		if (vector[i] > mayor){
			mayor = vector[i];
			}
		} 
		return mayor;
	}
	
	public static void crearVector(){ //Crea el vector
		vector=new int [pos];
		for(int f=0;f<vector.length;f++)
			vector[f]=getAleatorio();	
	}
	
	public static int mostrarRepetido(){ //metodo que muestra el num que mas se repite
		int aux=0;
		int rep=0;
		int  cuenta=0;
		for(int i=1;i<vector.length;i++){
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
