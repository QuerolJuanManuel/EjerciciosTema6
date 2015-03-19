package ejercicio_6;

import java.util.Scanner;

public class Ejercicio6 {
	private static alumnos listaAlumnos[];
	static int pos;
	
	public static void crearAlumno(int pos){ //Crea un alumno con datos introducidos por teclado.
		String nom;
		int edad;
		String curso;
		float nota;
		listaAlumnos=new alumnos [pos];
		Scanner teclado=new Scanner(System.in);
		if (pos<30){
			for(int i=0;i<pos;i++){
			System.out.println("Introduce el apellido y nombre del alumno "+(i+1)+" Formato apellido_nombre");
			nom=teclado.next();
			System.out.println("Introduce la edad del alumno "+(i+1));
			edad=teclado.nextInt();
			System.out.println("Introduce el curso del alumno "+(i+1));
			curso=teclado.next();
			System.out.println("Introduce la nota del alumno "+(i+1));
			nota=teclado.nextFloat();
			listaAlumnos[i]=new alumnos(nom,edad,curso,nota);
			}
		}else{
			System.out.println("No se puede introducir mas de 30 alumnos");
		}	
	}

	public static void mostrar(){  //muestra por pantalla el vector de listaAlumnos
		for(int f=0;f<listaAlumnos.length;f++){
			System.out.println(listaAlumnos[f]+" ");
		}
		System.out.println();
	}
	
    public static void ordenarBurbuja() { //ordena el vector por orden alfabetico del nombre.
    	alumnos aux;
        for(int j=0;j<listaAlumnos.length-1;j++) {
            for(int i=0;i<listaAlumnos.length-1-j;i++) {
                if (listaAlumnos[i].getNombre().compareTo(listaAlumnos[i+1].getNombre())>0) {
                    aux=listaAlumnos[i];
                    listaAlumnos[i]=listaAlumnos[i+1];
                    listaAlumnos[i+1]=aux;
                }
            }
        }
    }
	
    public static float mediaNotaAlumnos(){ //metodo que saca la nota media de todos los alumnos.
    	float media=0;
    	for(int i=0;i<listaAlumnos.length;i++){
    		media=media+listaAlumnos[i].getNota();
    	}
    	return media=media/listaAlumnos.length;
    }
    
    public static String alumnoMayor(){ //devuelve un string con los datos del alumno mas mayor.
    	alumnos mayorAlumnos=null;
    	int mayor=0;
		for(int i=0;i<listaAlumnos.length;i++){
		if (listaAlumnos[i].getEdad() > mayor){
			mayor =listaAlumnos[i].getEdad();
			mayorAlumnos=listaAlumnos[i];
			}
		} 
		return mayorAlumnos.toString();
    }
    
	public static void main(String[] args) {
		int b;
		Scanner teclado=new Scanner(System.in);
		System.out.println("Cuantos alumnos quieres crear: (como maximo 30)");
		int a=teclado.nextInt();
		crearAlumno(a);
		do {
			System.out.println("MENU");
			System.out.println("1-Mostrar alumnos introducidos");
			System.out.println("2-Mostrar nota media");
			System.out.println("3-Mostrar los datos del alumno mas mayor");
			System.out.println("4-Mostrar alumnos ordenados alfabeticamente");
			System.out.println("5-Salir");
			b=teclado.nextInt();
				if(b==1){
					System.out.println("La lista de alumnos es: ");
					mostrar();
				}else if(b==2){
					System.out.println("La nota media es: "+mediaNotaAlumnos());
				}else if(b==3){
					System.out.println("El alumno de mayor edad es: "+alumnoMayor());		
				}else if(b==4){
					ordenarBurbuja();
					System.out.println("La lista de alumnos ordenada alfabeticamente es: ");
					mostrar();
				}else if(b>5){
					System.out.println("Introduce un valor del menu");
				}
			}while (b!=5);	
		teclado.close();
	}
}
