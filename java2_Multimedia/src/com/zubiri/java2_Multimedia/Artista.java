package com.zubiri.java2_Multimedia;

import java.util.Scanner;

public class Artista {
	
	//Atributos
	private String nombre;
	private int anoNacimiento;
	
	//Constructor 1
	public Artista(){}
	//Constructor 2
	public Artista(String nom, int anoNaci){
		this.nombre = nom;
		this.anoNacimiento = anoNaci;
	}
	//Constructor 3
	public Artista(Scanner sc){
		System.out.println("Introduce el nombre del artista: ");
		this.setNombre(sc.next());
		System.out.println("Introduce el año de nacimiento: ");
		this.setAnoNacimiento(sc.nextInt());
	}
	
	//Método que devuelve String con atributos de Artista formateados
	public String formattedArtista(){
		String artista =
				"\nNombre:\t" + this.getNombre() +"\n"
				+ "Año de nacimiento:\t" + this.getAnoNacimiento();
		
		return artista;
	}
	
	public String getNombre() {
		return this.nombre;
	}
	public void setNombre(String nom) {
		this.nombre = nom;
	}
	public int getAnoNacimiento() {
		return this.anoNacimiento;
	}
	public void setAnoNacimiento(int anoNaci) {
		this.anoNacimiento = anoNaci;
	}
}
