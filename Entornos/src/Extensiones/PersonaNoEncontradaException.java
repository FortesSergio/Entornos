package Extensiones;

public class PersonaNoEncontradaException extends Exception {
	String nombre;
	@Override
	public String getMessage(){
		return nombre +"no es un usuario del sistema";
	}
}
