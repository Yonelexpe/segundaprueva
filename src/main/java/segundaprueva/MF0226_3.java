package segundaprueva;

import java.util.Scanner;
public class MF0226_3 {
	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {

		
		menu();
		
	
		
		
	}//main
	
	/**
	 * muestra las opciones que tienes el menú
	 * @return
	 */
	private static int menu() {
		int opcion = 0;
		boolean flat = true;
		
		System.out.println("----------------------------------------------------");
		System.out.println("-----   APP GESTION CLASE        -------------------");
		System.out.println("----------------------------------------------------");
		System.out.println(" 1 - cursos ordenados cronológicamente");
		System.out.println(" 2 - curso con reseñas de los usuarios");
		System.out.println(" 3 - listar últimos 5 cursos");
		System.out.println(" 4 - listar últimos 5 usuarios creados ");
		System.out.println(" 5 _ Curso con más reseñas");
		System.out.println("----------------------------------------------------");
		System.out.println(" 0 - Salir");
		System.out.println("----------------------------------------------------");
		
		do {
			opcion = Integer.parseInt( sc.nextLine());
			
			if (opcion < 0 || opcion > 5 ) {
				System.out.println("error:introduce un valor valido");
			} else {
				flat= false;
				System.out.println("marchando");
			}
			
			
		} while (flat);
	 	
		
		
		
		return opcion;
		
		
		
	}
	
}//class
