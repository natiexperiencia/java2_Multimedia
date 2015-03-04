package com.zubiri.java2_Multimedia;

import java.util.Scanner;

public class Artista {
	
	//Atributos
	private static String nombre;
	private static int anoNacimiento;
	
	//Constructor 1
	public Artista(){}
	//Constructor 2
	public Artista(String nom, int anoNaci){
		nombre = nom;
		anoNacimiento = anoNaci;
	}
	//Constructor 3
	public Artista(Scanner sc){
		System.out.println("Introduce el nombre del artista: ");
		setNombre(sc.next());
		System.out.println("Introduce el año de nacimiento: ");
		setAnoNacimiento(sc.nextInt());
	}
	
	//Método que devuelve String con atributos de Artista formateados
	static public String formattedArtista(){
		String artista =
				"\nNombre:\t" + Artista.getNombre() +"\n"
				+ "Año de nacimiento:\t" + Artista.getAnoNacimiento();
		
		return artista;
	}
	
	public static String getNombre() {
		return nombre;
	}
	public void setNombre(String nom) {
		nombre = nom;
	}
	public static int getAnoNacimiento() {
		return anoNacimiento;
	}
	public static void setAnoNacimiento(int anoNaci) {
		anoNacimiento = anoNaci;
	}
}
