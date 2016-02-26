package Extensiones;

import java.util.Scanner;

public class RegistroCenso {
	static protected String[] personas;
	static int contador=0;
	
	
	

	public static void main(String[] args) throws PersonaNoEncontradaException {
		personas= new String[2];
		int opcion = 0;
		do{
			try{
				mostrarOpciones();
				opcion=leerOpcion();
				if(opcion==1) registraPersona();
				if(opcion==2) buscaPersona();
			}	catch(ArrayIndexOutOfBoundsException ex){
				System.out.println("Ya está la lista del registro completada");
				System.out.println("¿Desea borrar la lista y empezar de nuevo? (Y/N)");
				borrarLista();
				
				
			}
					
		}while(opcion!=3);
	}
	private static void borrarLista() {
		Scanner sc=new Scanner(System.in);
		String borrado=sc.nextLine();
		if (borrado.compareTo("Y")==0)
			contador=0;
		
	}
	private static void registraPersona() {
		
		String nombre="";
		
			Scanner sc=new Scanner(System.in);
			System.out.println("Introduce el nombre del usuario.");
			nombre=sc.nextLine();
			personas[contador]=nombre;
			System.out.println("Usuario registrado con exito. \n*****************");
			contador++;
		
		
			
		
	}

	private static int leerOpcion() {
		Scanner sc=new Scanner(System.in);
		int opcion=Integer.valueOf(sc.nextLine());
		return opcion;
	}

	private static void mostrarOpciones() {
		System.out.println("Las opciones son:");
		System.out.println("Escribe 1 para registrar un usuario nuevo.");
		System.out.println("Escribe 2 para buscar algún usuario.");
		
	}

	public static void buscaPersona() throws PersonaNoEncontradaException
	{
		try{
			
			System.out.println("¿A quién buscas?");
			Scanner sc=new Scanner(System.in);
			String nombre=sc.nextLine();
			for (int i=0;i<personas.length;i++)
			{
				if(personas[i].compareTo(nombre)==0)
				{
					System.out.println(nombre+" esta registrado en el censo.");
					return;
				}
				
			}
			PersonaNoEncontradaException e=new PersonaNoEncontradaException();
			e.nombre=nombre;
			throw e;
		}catch(NullPointerException ex){
			System.out.println("Usuario no encontrado.");
		}
	}
	
}
