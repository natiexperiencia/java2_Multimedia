package com.zubiri.java2_Multimedia;

import java.util.Scanner;

public class Disco extends Obra {
	
	//Atributos
	private String discografia;
	private int nCanciones;
	
	//Constructor
	public Disco(String titulo, Artista autor, int anoEdicion, String discografia, int nCanciones){
		super(titulo, autor, anoEdicion);
		this.discografia = discografia;
		this.nCanciones = nCanciones;
	}
	
	//Canstructor 2
	public Disco(Scanner sc){
		super(sc);
		System.out.println("Introduce el nombre de la discografía: ");
		this.setDiscografia(sc.next());
		System.out.println("Introduce el número de canciones: ");
		this.setnCanciones(sc.nextInt());
	}
	
	//Getters y Setters
	public String getDiscografia() {
		return discografia;
	}

	public void setDiscografia(String discografia) {
		this.discografia = discografia;
	}

	public int getnCanciones() {
		return nCanciones;
	}

	public void setnCanciones(int nCanciones) {
		this.nCanciones = nCanciones;
	}
}
