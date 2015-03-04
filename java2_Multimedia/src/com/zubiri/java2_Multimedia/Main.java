package com.zubiri.java2_Multimedia;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int opcion, opcion2;

		do{
			Scanner sc = new Scanner(System.in);
			
			System.out.println("*******************************");
			System.out.println("*Menu:                        *");
			System.out.println("*******************************");
			System.out.println("Llenar multiteca--------------1");
			System.out.println("Buscar obra-------------------2");
			System.out.println("Mostrar multiteca-------------3");
			System.out.println("Salir-------------------------0");
			System.out.println("*******************************");
			
			opcion = sc.nextInt();
			
			switch (opcion) {
			case 1:
				System.out.println("Cuantas obras?: ");
				opcion2 = sc.nextInt();
				while (opcion2 != 0) {
					Multiteca.addObra(sc);
					opcion2--;
				}
				break;
			case 2:
				Multiteca.buscarObraPatron(sc);
				break;
			case 3:
				Multiteca.formattedMultiteca();
				break;
			default:
				if (opcion == 0) {
					break;
				}else{
					System.err.println("Eso no es una opción!!!");
				break;
				}
			}
		}while(opcion != 0);
	}
}
