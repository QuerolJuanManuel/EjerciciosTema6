package ejercicio_6;

public class alumnos {
	//Atributos
	private String apellidos_nombre;
	private int edad;
	private String curso;
	private float nota;
	
	//Constructor
	alumnos(String apellidos_nombre,int edad,String curso,float nota){
		this.apellidos_nombre=apellidos_nombre;
		this.edad=edad;
		this.curso=curso;
		this.nota=nota;
	}
	
	//Metodos
	public String toString(){ //devuelve como string los datos de la clase del vector
		return "Nombre alumno: "+apellidos_nombre+" Edad: "+edad+" Curso: "+curso+" Nota: "+nota;
	}
	
	public void setAlumno(String apellidos_nombre,int edad,String curso,float nota){
		this.apellidos_nombre=apellidos_nombre;
		this.edad=edad;
		this.curso=curso;
		this.nota=nota;
	}
	
	public String getNombre(){ 
		return apellidos_nombre;
	}
	
	public float getNota(){
		return nota;
	}
	
	public int getEdad(){
		return edad;
	}

}
