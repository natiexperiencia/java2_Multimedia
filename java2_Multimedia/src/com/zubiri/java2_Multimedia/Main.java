package com.zubiri.java2_Multimedia;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int opcion, opcion2;

		do{
			Scanner sc = new Scanner(System.in);
			
			System.out.println("*******************************");
			System.out.println("*Menu:                         *");
			System.out.println("*******************************");
			System.out.println("Llenar multiteca--------------1");
			System.out.println("Buscar obra-------------------2");
			
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
				System.out.println(Multiteca.formattedMultiteca());
				break;
			default:
				break;
			}
		}while(opcion != 0);

	}

}
