
public class newNoobs {
// creación de nuevos novatines
	public String nombres;
	public int edad;
	public boolean comecacas;
	
	public newNoobs(String nombres, int edad, boolean comecacas){
	this.nombres = nombres;
	this.edad = edad;
	this.comecacas = comecacas;
	}
	
	public String getNobatin() {
		if (comecacas) {
		return "Hola: " + nombres +" tu edad es: "+ edad + "y comes caca";
		}
		else return "Hola: " + nombres +" tu edad es: "+ edad + " y comes caca pero no lo quieres aceptar";
		
	}
}
