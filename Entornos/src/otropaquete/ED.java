package otropaquete;

import java.util.Scanner;
import java.io.*;

public class ED {		
	public static void main(String[] args) {
		int contador, numero , potencia;        		
		numero=args[0]; 
		int i=1;        		
		potencia=Integer.valueOf(args);
		while (i<potencia) 
		{			
			resultado*=numero;
			i++   		
		}
		
		System.out.print("La potencia " + potencia + "del numero " numero + "es" +);
						System.out.pritn(resultado);

		Scanner sc = new Scanner(System.in); System.out.print("Escribe tu nombre: ");
		Strin nombre = sc.nextLine();
				System.out.print("Escribe la nota que quieres: "); int nota = sc.nextInt();
				
				System.out.println(devolverMensaje(nota, nombre));










	}

public devolverMensaje(String nombre, int nota)
{
	if (nota==nota)
		System.out.println("calculando resultado");
	String res = nombre + ", ";	if (nota<=5) res += "te voy a colgar de las orejas";	else if (nota<6) res += "no hay que conformarse con aprobar";	else if (nota<8) res += "vas en buen camino";	else if (nota <9) res += "a ver si es verdad";	else if (nota < 10) res += "no te vengas arriba";	else res = "xD xD xD xD";
	return res;
}
}


